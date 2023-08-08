import java.util.Scanner;

public class gcd {
    public static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }

        return GCD(b, a%b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = GCD(a,b);

        System.out.println("the gcd of " +a+ " and " +b+ " is " +result) ;
    }
}
