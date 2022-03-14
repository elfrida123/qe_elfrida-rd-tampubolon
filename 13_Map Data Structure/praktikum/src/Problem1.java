import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        String[] firstString = {"kazuya", "jin", "lee"};
        String[] secondString = {"kazuya", "jin", "lee", "feng"};
        String[] thirdString = {"lee", "jin"};
        String[] fourthString = {"kazuya", "panda"};
        List list = new ArrayList(Arrays.asList(firstString));
        list.addAll(Arrays.asList(secondString));
        list.addAll(Arrays.asList(fourthString));
        String[] result =
                Stream.concat(
                                Stream.of(firstString),
                                Stream.of(secondString))
                        .distinct()
                        .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
        System.out.println("");
        String[] result2 =
                Stream.concat(
                                Stream.of(thirdString),
                                Stream.of(fourthString))
                        .distinct()
                        .toArray(String[]::new);
        System.out.println(Arrays.toString(result2));
    }
}
