public class SumOfAllElements {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 1, 5, 4, 8, 8, 54 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
