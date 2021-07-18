import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
         int count = scan.nextInt();

        int[] num = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
        {
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i <= num.length - 1; i++) {
            for (int j = 1; j <= num.length - 1; j++) {
                if (num[i] < num[j]) {
                    if (num[i] + num[j] == 13) {
                        System.out.println(num[i] + " " + num[j]);
                    }
                }
            }
        }
    }
}