package interview.arrays.NewYearsChaos;

import java.util.*;

public class Solution {

    static void minimumBribes(int[] q) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> originalArr = new ArrayList<>();

        int count = 0;
        int length = q.length;

        for (int i = 0; i < length; i++) {
            map.put(i + 1, 0);
            originalArr.add(i + 1);
        }

        for (int i = length - 1; i > 1; i--) {
            Integer first = originalArr.get(i);
            int expectedFirst = q[i];

            if (first == expectedFirst) {
                continue;
            }

            Integer second = originalArr.get(i - 1);
            Integer third = originalArr.get(i - 2);

            int expectedSecond = q[i - 1];
            int expectedThird = q[i - 2];
//  2 3 4
            if (third.equals(expectedThird) && first == expectedSecond && second == expectedFirst && map.get(first) != 2 && map.get(second) != 2) {
                map = updateMapValues(map, first, second);
                originalArr = swapListValues(originalArr, i, i - 1);
                count++;
            } else if (third.equals(expectedFirst) && second.equals(expectedThird) && first.equals(expectedSecond) && map.get(third) == 0 && map.get(first) != 2 && map.get(second) != 2) {
                map = updateMapValues(map, third, second);
                map = updateMapValues(map, third, first);
                originalArr = swapListValues(originalArr, i - 1, i - 2);
                originalArr = swapListValues(originalArr, i, i - 1);
                count += 2;
            } else if (first.equals(expectedThird) && second.equals(expectedSecond) && third.equals(expectedFirst) && map.get(first) == 0 && map.get(third) == 0) {
                map = updateMapValues(map, first, second);
                map = updateMapValues(map, second, third);
                originalArr = swapListValues(originalArr, i, i - 1);
                originalArr = swapListValues(originalArr, i - 1, i - 2);
                count += 2;
            } else if (first.equals(expectedThird) && second.equals(expectedFirst) && third.equals(expectedSecond) && map.get(first) == 0 && map.get(second) != 2 && map.get(third) != 2) {
                map = updateMapValues(map, first, second);
                map = updateMapValues(map, second, third);
                originalArr = swapListValues(originalArr, i, i - 1);
                originalArr = swapListValues(originalArr, i - 1, i - 2);
                count += 2;
            } else {
                System.out.println("Too chaotic");
            }

        }

        System.out.println(count);


    }

    private static Map<Integer, Integer> updateMapValues(Map<Integer, Integer> map, int first, int second) {
        Map<Integer, Integer> updatedMap = new HashMap(map);
        updatedMap.put(first, updatedMap.get(first) + 1);
        updatedMap.put(second, updatedMap.get(second) + 1);
        return updatedMap;
    }

    private static List<Integer> swapListValues(List<Integer> list, int firstIndex, int secondIndex) {
        List<Integer> updatedList = new ArrayList(list);
        Integer temp = updatedList.get(firstIndex);
        updatedList.remove(firstIndex);
        updatedList.add(secondIndex, temp);
        return updatedList;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
