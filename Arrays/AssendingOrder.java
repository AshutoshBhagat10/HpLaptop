
public class AssendingOrder {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 1, 55, 7, 45, 8, 15 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}