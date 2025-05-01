import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(Main.class.getResourceAsStream("prime.txt"));
        int t = sc.nextInt();
        int win = 0;
        for (int i = 0; i < t; i++){
            int x = sc.nextInt();
            int count = 0;
            for (int j=1; j<=Math.sqrt(x); j++){
                System.out.println(Math.sqrt(x));
                if (x%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println("Yaayy");
                win++;
            }
            else System.out.println("Sigh");
            
        }
        if (win > t/2) System.out.println("I WIN myself");
        if (win == t/2) System.out.println("I DRAW myself");
        else System.out.println("I LOSE myself");
	}
}
