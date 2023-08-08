public class reverse_string{
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String actual = "Anvitha";
        String reversed = reverseString(actual);
        System.out.println(reversed); 
    }
}
