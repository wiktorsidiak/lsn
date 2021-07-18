import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines you want in the multidimensional array: ");
        int numbersOfLines = scan.nextInt();
        int numbersOfColumns = 2;
        int[][] lines = new int[numbersOfLines][numbersOfColumns];
        System.out.print("Enter number of a first line: ");
        lines[0][0] = scan.nextInt();
        for (int i = 1; i < numbersOfLines; i++) {
            System.out.print("Enter "  +numbersOfColumns + " numbers seperated by comma: ");
            Scanner sc = new Scanner(System.in);
            String[] line = sc.nextLine().split(",");
            for (int j = 0; j < numbersOfColumns; j++) {
                lines[i][j] = Integer.parseInt(line[j]);

            }
        }

        scan.close();

        int separatedGraphs;
        Set<Integer> firstLines = new HashSet<>();
        Set<Integer> secondLines = new HashSet<>();

        for (int i = 1; i <= lines.length - 1; i++) {
            for (int j = 0; j <= lines[i].length - 1; j++) {
                firstLines.add(lines[i][0]);
                secondLines.add(lines[i][1]);
                }
            }
        firstLines.removeAll(secondLines);
        separatedGraphs = firstLines.size();
        System.out.println(separatedGraphs);
        }
    }


