public class ReverseArray {
    public static void main(String[] args) {

        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
