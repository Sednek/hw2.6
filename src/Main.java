import homework.Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Homework.oddNums(nums);

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Homework.evenNumsInAscendingOrder(nums2);

        List<String> words = new ArrayList<>(List.of("foo","foo","foo","foo","foo","foo", "bar", "bar", "bar", "bar", "bar", "fee", "ber"));
        Homework.uniqueWords(words);

        List<String> words2 = new ArrayList<>(List.of("foo","foo","foo","foo","foo","foo", "bar", "bar", "bar", "bar", "bar", "fee", "ber", "fee"));
        Homework.numsOfUniqueWords(words2);
    }
}