public class factorial {
    public static int cal_factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * cal_factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int number = 9;
        int factorial = cal_factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
