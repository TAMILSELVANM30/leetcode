// Last updated: 9/25/2026, 8:44:54 PM
import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {

        int total = classroom.length * classroom[0].length();

        int k = 0;
        int firstidx = -1;
        int secidx = -1;

        int L_count = 0;

        List<int[]> rr = new ArrayList<>();
        List<int[]> Lit = new ArrayList<>();

        while (k < total) {
            int row = k / classroom[0].length();
            int col = k % classroom[0].length();
            k++;

            char ch = classroom[row].charAt(col);

            if (ch == 'S') {
                firstidx = row;
                secidx = col;
            }

            if (ch == 'R') {
                rr.add(new int[]{row, col});
            }

            if (ch == 'L') {
                Lit.add(new int[]{row, col});
                L_count++;
            }
        }

        int rows = classroom.length;
        int cols = classroom[0].length();
        int maskSize = 1 << L_count;

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{
                firstidx,
                secidx,
                energy,
                0,
                0
        });

        boolean[][][][] visited =
                new boolean[rows][cols][energy + 1][maskSize];

        visited[firstidx][secidx][energy][0] = true;

        int[] nr = {-1, 1, 0, 0};
        int[] nc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            int[] a = q.poll();

            int row = a[0];
            int col = a[1];
            int currentEnergy = a[2];
            int mask = a[3];
            int moves = a[4];

            if (mask == (1 << L_count) - 1) {
                return moves;
            }

            int i = 0;

            while (i < 4) {

                int NEWROW = row + nr[i];
                int NEWCOL = col + nc[i];
                i++;

                if (NEWROW >= 0 &&
                    NEWCOL >= 0 &&
                    NEWROW < classroom.length &&
                    NEWCOL < classroom[0].length()) {

                    if (classroom[NEWROW].charAt(NEWCOL) == 'X') {
                        continue;
                    }

                    if (currentEnergy == 0) {
                        continue;
                    }

                    int newenergy = currentEnergy - 1;
                    int newmask = mask;

                    char nextCell = classroom[NEWROW].charAt(NEWCOL);

                    if (nextCell == 'R') {
                        newenergy = energy;
                    }

                    if (nextCell == 'L') {

                        int id = 0;

                        while (id < Lit.size()) {

                            if (Lit.get(id)[0] == NEWROW &&
                                Lit.get(id)[1] == NEWCOL) {

                                newmask = newmask | (1 << id);
                                break;
                            }

                            id++;
                        }
                    }

                    if (!visited[NEWROW][NEWCOL][newenergy][newmask]) {

                        visited[NEWROW][NEWCOL][newenergy][newmask] = true;

                        q.offer(new int[]{
                                NEWROW,
                                NEWCOL,
                                newenergy,
                                newmask,
                                moves + 1
                        });
                    }
                }
            }
        }

        return -1;
    }
}