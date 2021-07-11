import java.util.*;

public class TimeMap {
    private Map<String, TreeMap<Integer, String>> map;

    /**
     * Initialize your data structure here.
     */
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> treeMap;
        if (map.containsKey(key)) {
            treeMap = map.get(key);
            if (treeMap.containsKey(timestamp)) {
            }
        } else {
            treeMap = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

        }
        treeMap.put(timestamp, value);
        map.put(key, treeMap);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        TreeMap<Integer, String> treeMap = map.get(key);
        if (treeMap.containsKey(timestamp)) {
            return treeMap.get(timestamp);
        }
        Integer floorKey = treeMap.ceilingKey(timestamp);
        return floorKey==null? "":treeMap.get(floorKey);
        /*for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            times = entry.getKey();
            if (entry.getKey() > timestamp) {
                continue;
            } else {
                break;
            }
        }
        return times > timestamp ? "" : treeMap.get(times);
        */
    }
}
