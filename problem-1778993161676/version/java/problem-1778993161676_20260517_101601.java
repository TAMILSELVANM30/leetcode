// Last updated: 5/17/2026, 10:16:01 AM
1import java.util.*;
2import java.util.stream.Collectors;
3class Solution {
4    public boolean isAdjacentDiffAtMostTwo(String s) {  
5                int d;
6                List<Integer>name=s.chars()
7                    .map(Character::getNumericValue)
8                    .boxed()
9                    .collect(Collectors.toList());
10        int le =name.size();
11      for (int i=0;i<le-1;i++){
12          d=Math.abs(name.get(i+1)-name.get(i));    
13        
14        if ( d>2){
15            return false;
16        }
17        }
18         return true;   
19        
20    }
21}