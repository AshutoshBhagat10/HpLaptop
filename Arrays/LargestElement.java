public class LargestElement {
    public static void main(String[] args) {

        int[] a = new int[] { 7, 5, 8, 45, 51, 4, 52, 65, 3, 4, 216, -5 };
        int max = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
