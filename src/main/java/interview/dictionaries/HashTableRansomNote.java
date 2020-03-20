package interview.dictionaries;

import java.util.Hashtable;

public class HashTableRansomNote {
    // Complete the checkMagazine function below.
    static String checkMagazine(String[] magazine, String[] note) {
        boolean isEachWordExist = true;
        Hashtable<String, Integer> stringStringHashtable = new Hashtable<>();
        for (int i = 0; i < magazine.length; i++) {
            stringStringHashtable.put(magazine[i], stringStringHashtable.getOrDefault(magazine[i], 0) + 1);
        }
        for (String s : note) {
            int val = stringStringHashtable.getOrDefault(s, 0);
            if (val == 0) {
                isEachWordExist = false;
                break;
            }
            stringStringHashtable.put(s, val - 1);
        }
        return isEachWordExist ? "YES" : "NO";

    }
}
