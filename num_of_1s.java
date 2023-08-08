public class num_of_1s {
    public static int[] countbits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }

    private static int countOnes(int num) {
        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = countbits(n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
