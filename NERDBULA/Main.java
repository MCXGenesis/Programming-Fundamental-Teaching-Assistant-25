package NERDBULA;
import java.util.*;


public class Main {
	public static void main(String[] args) {
        task3();
	}

    static void task3() {
    Scanner read = new Scanner(Main.class.getResourceAsStream("nerbula.txt"));
    int t = read.nextInt();
    read.nextLine();

    for (int i = 0; i < t; i++) {
        int start = read.nextInt() - 1;
        int end = read.nextInt() - 1;
        read.nextLine();
        int[][] matrix = new int[12][12];

        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 6; c++) {
                matrix[r][c] = read.nextInt();
            }
        }

        // Propagate reachable nodes using visited array
        int[] visited = new int[6];
        visited[start] = 1;
        boolean changed;

        do {
            changed = false;
            for (int r = 0; r < 6; r++) {
                if (visited[r] == 1) {
                    for (int c = 0; c < 6; c++) {
                        if (matrix[r][c] == 1 && visited[c] == 0) {
                            visited[c] = 1;
                            changed = true;
                        }
                    }
                }
            }
        } while (changed);

        System.out.println(visited[end] == 1 ? "YES" : "NO");
    }
}
}
