import java.util.Scanner;
public class reverse_string_recursion {
    public static String reverseString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ") ;
        String original = sc.next();
        String reversed = reverseString(original);
        System.out.println("Reversed string is: " + reversed);
    }
}
