public class FrequencyOfEachElement {
    public static void main(String[] args) {

        int[] a = new int[] { 2, 6, 7, 1, 9, 5, 1, 6, 2, 4, 5, 8, 5 };
        boolean[] isVisited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (isVisited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    isVisited[j] = true;
                }
            }
            System.out.println(a[i] + " : " + count + " times");
        }

    }
}
