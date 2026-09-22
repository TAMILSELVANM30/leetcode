// Last updated: 9/22/2026, 5:54:02 PM
1class Solution {
2    private static class Info {
3        int[] ways;
4        int whole;
5
6        Info(int k) {
7            ways = new int[k];
8            whole = 1;
9        }
10    }
11
12    private static class SegmentTree {
13        int size;
14        int mod;
15        Info[] tree;
16
17        SegmentTree(int[] nums, int k) {
18            mod = k;
19            size = 1;
20
21            while (size < nums.length) {
22                size <<= 1;
23            }
24
25            tree = new Info[size * 2];
26
27            for (int i = 0; i < tree.length; i++) {
28                tree[i] = new Info(k);
29            }
30
31            for (int i = 0; i < nums.length; i++) {
32                int rem = nums[i] % k;
33
34                tree[size + i].ways[rem] = 1;
35                tree[size + i].whole = rem;
36            }
37
38            for (int i = size - 1; i > 0; i--) {
39                tree[i] = combine(tree[i << 1], tree[i << 1 | 1]);
40            }
41        }
42
43        private Info combine(Info left, Info right) {
44            Info merged = new Info(mod);
45
46            for (int r = 0; r < mod; r++) {
47                merged.ways[r] = left.ways[r];
48            }
49
50            for (int r = 0; r < mod; r++) {
51                if (right.ways[r] == 0) {
52                    continue;
53                }
54
55                int newRem = (left.whole * r) % mod;
56                merged.ways[newRem] += right.ways[r];
57            }
58
59            merged.whole = (left.whole * right.whole) % mod;
60
61            return merged;
62        }
63
64        void update(int index, int value) {
65            int pos = size + index;
66            int rem = value % mod;
67
68            Arrays.fill(tree[pos].ways, 0);
69            tree[pos].ways[rem] = 1;
70            tree[pos].whole = rem;
71
72            pos >>= 1;
73
74            while (pos > 0) {
75                tree[pos] = combine(
76                    tree[pos << 1],
77                    tree[pos << 1 | 1]
78                );
79
80                pos >>= 1;
81            }
82        }
83
84        Info query(int left, int right) {
85            Info leftPart = new Info(mod);
86            Info rightPart = new Info(mod);
87
88            left += size;
89            right += size;
90
91            while (left < right) {
92                if ((left & 1) != 0) {
93                    leftPart = combine(leftPart, tree[left]);
94                    left++;
95                }
96
97                if ((right & 1) != 0) {
98                    right--;
99                    rightPart = combine(tree[right], rightPart);
100                }
101
102                left >>= 1;
103                right >>= 1;
104            }
105
106            return combine(leftPart, rightPart);
107        }
108    }
109
110    public int[] resultArray(int[] nums, int k, int[][] queries) {
111        SegmentTree tree = new SegmentTree(nums, k);
112        int[] answer = new int[queries.length];
113
114        for (int i = 0; i < queries.length; i++) {
115            int index = queries[i][0];
116            int value = queries[i][1];
117            int start = queries[i][2];
118            int x = queries[i][3];
119
120            tree.update(index, value);
121
122            Info result = tree.query(start, nums.length);
123            answer[i] = result.ways[x];
124        }
125
126        return answer;
127    }
128}