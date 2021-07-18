import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        int count;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();

        int[] num = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
        {
            num[i] = scan.nextInt();
        }
        scan.close();

        int max = num[0];
        int min = num[0];
        Set<Integer> distinct = Arrays.stream(num).boxed().collect(Collectors.toSet());

        for (int i = 0; i <= num.length - 1 ; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("count: " + num.length);
        System.out.println("distinct: " + distinct.size());
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
