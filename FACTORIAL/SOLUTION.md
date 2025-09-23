One of the solution:
```java
public class Main{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int fact=1;
        do{
            fact=fact*n;
            n--;
        }while(n>0);
        System.out.println(fact);
    }
}
```