// Cordisco company problem

public class Cordisco {

    public static void findOne(int arr[], int n) {
        int[] newArr = new int[arr.length];
        boolean isExecuted = false;

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("Found Number " + n + " at index " + i);
                isExecuted = true;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                n = arr[i];
                break;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            if (isExecuted == false) {
                if (n == newArr[i]) {
                    System.out.println("Could not found. Next biggest element is at index " + i);
                    isExecuted = true;
                    break;
                }
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if (isExecuted == false) {
                System.out.println("Could not found. Out of Range.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 25, 100, 67, 78 };
        int n = 25;

        findOne(arr, n);

    }
}
