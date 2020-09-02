package string;

public class S028_ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

    public int strStr1(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;
        char[] hs = haystack.toCharArray();
        char[] nd = needle.toCharArray();
        for (int i = 0; i < hs.length; i++) {
            if (hs[i] != nd[0]) {
                continue;
            } else {
                int k = 0;
                for (int j = 0; j < needle.length(); j++, k++) {
                    if (k + i >= haystack.length() || hs[i + k] != nd[j])
                        break;
                }
                if (k == nd.length)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hs = "";
        String nd = "0";
        System.out.println(new S028_ImplementStrStr().strStr(hs, nd));
    }
}
