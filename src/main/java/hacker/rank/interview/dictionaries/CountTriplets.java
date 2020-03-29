package hacker.rank.interview.dictionaries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        Map<Long, List<Integer>> indexMap = calculateIndexMap(arr);
        Map<Integer, List<Integer>> indexToIndexMap = new HashMap<>();

        for (Long currentVal : indexMap.keySet()) {
            long secVal = currentVal * r;
            long thirdVal = secVal * r;
            List<Integer> firstIndexes = indexMap.get(currentVal);
            List<Integer> secondIndexes = indexMap.get(secVal);
            List<Integer> thirdIndexes = indexMap.get(thirdVal);
            if (secondIndexes == null || thirdIndexes == null) {
                continue;
            }
            for (Integer firstIndex : firstIndexes) {
                List<Integer> filteredSecondIndexes = getIndexesForGivenIndex(indexToIndexMap, secondIndexes, firstIndex);

                for (Integer filteredSecondIndex : filteredSecondIndexes) {
                    List<Integer> filteredThirdIndexes = getIndexesForGivenIndex(indexToIndexMap, thirdIndexes, filteredSecondIndex);
                    count += filteredThirdIndexes.size();
                }
            }
        }

        return count;
    }

    private static List<Integer> getIndexesForGivenIndex(Map<Integer, List<Integer>> indexToIndexMap, List<Integer> thirdIndexes, Integer filteredSecondIndex) {
        List<Integer> thirdIndexesFromMap = indexToIndexMap.get(filteredSecondIndex);
        List<Integer> filteredThirdIndexes;

        if (thirdIndexesFromMap != null) {
            filteredThirdIndexes = thirdIndexesFromMap;
        } else {
            filteredThirdIndexes = thirdIndexes.stream()
                    .filter(thirdIndex -> thirdIndex > filteredSecondIndex)
                    .collect(Collectors.toList());
            indexToIndexMap.put(filteredSecondIndex, filteredThirdIndexes);
        }
        return filteredThirdIndexes;
    }

    private static Map<Long, List<Integer>> calculateIndexMap(List<Long> arr) {
        Map<Long, List<Integer>> map = new HashMap<>();
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            Long val = arr.get(i);
            if (map.containsKey(val)) {
                map.get(val).add(i);
            } else {
                ArrayList<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                map.put(val, indexes);
            }
        }

        return map;
    }
}
