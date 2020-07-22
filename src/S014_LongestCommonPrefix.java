public class S014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        StringBuilder sb = new StringBuilder();
        int index=0;
        while(index<strs[0].length()){
            char c = strs[0].charAt(index);
            for(int i=1;i<strs.length;i++){
                if(index>=strs[i].length() || strs[i].charAt(index)!=c)
                    return sb.toString();
            }
            sb.append(c);
            index++;
        }
        return sb.toString();
    }
}
