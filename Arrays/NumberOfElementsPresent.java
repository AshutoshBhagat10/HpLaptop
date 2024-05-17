public class NumberOfElementsPresent {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 3, 4, 5, 89, 89, 5 };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}