import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,10,20,20,2,5};
        int max = arr[0];
        int min = arr[0];
        Set<Integer> distinct = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        for (int i = 0; i <= arr.length - 1 ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("count: " + arr.length);
        System.out.println("distinct: " + distinct.size());
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
