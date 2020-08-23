import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class S022_GenerateParentheses {
    public List<String> res = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        if (n <= 0)
            return res;
        generate(res, "", n, n, n);
        generate1(new StringBuilder(), n, n);
        return res;
    }

    public void generate(List<String> res, String str, int left, int right, int n) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left < n) {
            generate(res, str + "(", left + 1, right, n);
        }
        if (right < left) {
            generate(res, str + ")", left, right + 1, n);
        }
    }

    public void generate1(StringBuilder str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str.toString());
        } else if (left == 0) {
            generate1(str.append(")"), left, right - 1);
            str.deleteCharAt(str.length() - 1);
        } else if (right == 0) {
            generate1(str.append("("), left - 1, right);
            str.deleteCharAt(str.length() - 1);
        } else {
            if (left < right) {
                generate1(str.append(")"), left, right - 1);
                str.deleteCharAt(str.length() - 1);
            }
            generate1(str.append("("), left - 1, right);
            str.deleteCharAt(str.length() - 1);
        }
    }

    public static void main(String[] args) {
        List<String> list = new S022_GenerateParentheses().generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
