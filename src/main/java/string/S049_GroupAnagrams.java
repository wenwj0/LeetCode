package string;

import java.util.*;

public class S049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<>();
        if (strs==null || strs.length==0)
            return res;
        Map<String,List<String>> map = new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            List list = map.getOrDefault(String.valueOf(str),new ArrayList<String>());
            list.add(strs[i]);
            map.put(String.valueOf(str),list);
        }
        for (Map.Entry<String,List<String>> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
