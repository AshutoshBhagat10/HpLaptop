public class PrintDuplicateElements {
    // public static void main(String[] args) {
    // int[] a = new int[] { 5, 1, 5, 7, 9, 45, 4, 45, 4, 1, 5, 1 };
    // boolean[] visited = new boolean[a.length];

    // for (int i = 0; i < a.length; i++) {
    // if (visited[i]) {
    // continue;
    // }

    // for (int j = i + 1; j < a.length; j++) {
    // if (a[i] == a[j] && !visited[j]) {
    // visited[i] = true;

    // }
    // }
    // if (visited[i]) {
    // System.out.println(a[i]);
    // }
    // }
    // }

    public static void main(String[] args) {
        int[] a = new int[] { 5, 1, 5, 7, 9, 45, 4, 45, 4, 1, 5, 1 };
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) {
                continue;
            }

            boolean isDuplicate = false;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && !visited[j]) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }

            if (isDuplicate) {
                System.out.println(a[i]);
                visited[i] = true;
            }
        }
    }

}
