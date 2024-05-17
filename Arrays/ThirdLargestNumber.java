public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] a = new int[] { 66, 99, 77, 33, 22, 55, 11, 100 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 2; i < a.length;) {
            System.out.println(a[i]);
            break;
        }
    }
}
