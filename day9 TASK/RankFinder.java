package datastructures;

import java.util.*;

public class RankFinder {

    public static int findRank(int[] arr, int value) {
        Integer[] sorted = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < sorted.length; i++) {
            if (!rankMap.containsKey(sorted[i])) {
                rankMap.put(sorted[i], rank);
            }
            rank++;
        }

        return rankMap.getOrDefault(value, -1);
    }

    public static void main(String[] args) {
        int[] arr = {50, 20, 30, 40, 50};
        int value = 50;

        int rank = findRank(arr, value);
        System.out.println("The rank of " + value + " is: " + rank);
    }
}
