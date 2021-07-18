public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    if (arr[i] + arr[j] == 13) {
                        System.out.println(arr[i] + " " + arr[j]);
                    }
                }
            }
        }
    }
}