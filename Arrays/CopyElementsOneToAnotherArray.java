public class CopyElementsOneToAnotherArray {

    public static void main(String[] args) {
        int[] a = new int[] { 5, 6, 4, 2, 55, 7, 12, 5 };
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }
    }
}