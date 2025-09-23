import java.util.Scanner;

import NERDBULA.Main;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Main.class.getResourceAsStream("mole.txt"));
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int real = 0;
            int fake = 0;
            for (int j = 0; j < n; j++) {
                String word = sc.next(); 
                if (word.equals("MOLE")) {
                    real++;
                } else {
                    fake++;
                }
                if (real > 2 * fake) {
                    break;
                }
            }
            if (fake == n) { // All fake moles
                System.out.println(0);
            } else { 
                System.out.println(real + fake);
            }
            sc.nextLine();
        }

    }
}