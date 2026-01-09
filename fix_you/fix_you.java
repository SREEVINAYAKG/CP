import java.util.*;
public class fix_you{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }

            boolean[][] good = new boolean[n][m];
            good[n - 1][m - 1] = true; // counter cell

            int changes = 0;

            // traverse from bottom-right to top-left
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i == n - 1 && j == m - 1) continue;

                    boolean canRight = (j + 1 < m) && good[i][j + 1];
                    boolean canDown  = (i + 1 < n) && good[i + 1][j];

                    if (grid[i][j] == 'R') {
                        if (canRight) {
                            good[i][j] = true;
                        } else if (canDown) {
                            changes++;
                            good[i][j] = true;
                        }
                    } else { // 'D'
                        if (canDown) {
                            good[i][j] = true;
                        } else if (canRight) {
                            changes++;
                            good[i][j] = true;
                        }
                    }
                }
            }

            System.out.println(changes);
        }
    }
}