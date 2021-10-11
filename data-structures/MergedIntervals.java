import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MergedIntervals {

    /*
     * Complete the 'getMergedIntervals' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY intervals as parameter.
     */

    public static List<List<Integer>> getMergedIntervals(List<List<Integer>> intervals) {
        if (intervals.size() <= 1)
        return intervals;
    
        intervals.sort((i1, i2) -> Integer.compare(i1.get(0), i2.get(0)));
        List<List<Integer>> result = new ArrayList<>();
        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);
        
        for (List<Integer> list : intervals) {
            if (list.get(0) <= end) {
                end = Math.max(end, list.get(1));
            } else {
                List<Integer> dummy = new ArrayList<>();
                dummy.add(start);
                dummy.add(end);
                result.add(dummy);
                start = list.get(0);
                end = list.get(1);
            }
        }
        List<Integer> dummy = new ArrayList<>();
        dummy.add(start);
        dummy.add(end);
        result.add(dummy);
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

        int intervalsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int intervalsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> intervals = new ArrayList<>();

        IntStream.range(0, intervalsRows).forEach(i -> {
            try {
                intervals.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<List<Integer>> result = MergedIntervals.getMergedIntervals(intervals);

        result.stream()
            .map(
                r -> r.stream()
                    .map(Object::toString)
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
