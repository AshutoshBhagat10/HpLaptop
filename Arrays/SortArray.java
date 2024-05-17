import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };

        Arrays.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
