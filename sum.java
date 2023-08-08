public class sum {

    public static int sumArray(int[] arr, int i) {
        if (i < 0) {
            return 0;
        }
        
        return arr[i] + sumArray(arr, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 30, 14, 5};
        int sum = sumArray(arr, arr.length - 1);
        System.out.println("Sum: " + sum);
    }
}
