import java.util.Stack;

public class S020_ValidParentheses {
    public boolean isValid(String s) {
        char[] ss = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c :ss){
            if(c=='['||c=='('||c=='{'){
                stack.push(c);
            }else if(c==']'||c==')'||c=='}'){
                if(stack.isEmpty())
                    return false;
                else {
                    char temp = stack.pop();
                    if(temp=='('&&c==')')
                        continue;
                    else if(temp=='{'&&c=='}')
                        continue;
                    else if(temp=='['&&c==']')
                        continue;
                    else
                        return false;
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty()?true:false;
    }

//推荐代码
//    public boolean isValid(String s) {
//        if (s.isEmpty()) {
//            return true;
//        }
//        Stack<Character> stack = new Stack<Character>();
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                stack.push(')');
//            } else if (c == '{') {
//                stack.push('}');
//            } else if (c == '[') {
//                stack.push(']');
//            } else if (stack.empty() || c != stack.pop()) {
//                return false;
//            }
//        }
//        return stack.empty();
//    }
    public boolean isValid1(String s) {
        if (s.isEmpty()) {
            return true;
        }

        if ((s.length() & 1) == 1) {
            return false;
        }

        char[] stack = new char[s.length()];
        int pos = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[pos++] = ')';
            } else if (c == '[') {
                stack[pos++] = ']';
            } else if (c == '{') {
                stack[pos++] = '}';
            } else if (pos == 0 || c != stack[--pos]) {
                return false;
            }
        }

        return pos == 0;
    }

    public static void main(String[] args) {
        boolean res = new S020_ValidParentheses().isValid("()");
        System.out.println();
    }
}
