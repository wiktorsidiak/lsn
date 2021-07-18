import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int separatedGraphs = 0;
        int[][] lines = {
                {3},
                {2, 3},
                {1, 2},
                {5, 6}
        };
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


