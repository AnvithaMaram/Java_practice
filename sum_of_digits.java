public class sum_of_digits {

    public static int SumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + SumOfDigits(number / 10);
        }
    }
    public static void main(String[] args) {
        int number = 3281;
        int sum = SumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

}
