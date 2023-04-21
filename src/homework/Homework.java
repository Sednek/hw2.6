package homework;

import java.util.*;

public class Homework {

    //Task 1
    public static void oddNums(List<Integer> arr) {
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    //Task 2
    public static void evenNumsInAscendingOrder(List<Integer> arr) {
        Collections.sort(arr);
        HashSet<Integer> set = new HashSet<>(arr);
        for (Integer integer : set) {
            if(integer % 2 == 0){
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    //Task 3
    public static void uniqueWords(List<String> words){
        for (String word : words) {
            if(Collections.frequency(words, word) == 1){
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }

    //Task 4
    public static void numsOfUniqueWords(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if(!map.containsKey(word)){
                map.put(word, 0);
            }
            map.replace(word, map.get(word) + 1);
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
