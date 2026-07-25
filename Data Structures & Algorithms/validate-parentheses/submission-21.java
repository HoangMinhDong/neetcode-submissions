class Solution {
    public static boolean checkInput(String s) {
        if(s.length()==0) {
            return false;
        }

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != '(' && s.charAt(i) != ')' && s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != '{' && s.charAt(i) != '}') {
                return false;
            }
        }

        return true;
    }

    public static boolean isCloseParentheses(char c) {
       return c == ')' || c == ']' || c == '}';
    }

    public static boolean isOpenParentheses(char c) {
       return c == '(' || c == '[' || c == '{';
    }

    public static boolean matchPair(char x, char y) {
        if(x == '(' && y == ')') {
            return true;
        }

        if(x == '[' && y == ']') {
            return true;
        }

        if(x == '{' && y == '}') {
            return true;
        }

        return false;
    }

    public boolean isValid(String s) {
        if(!checkInput(s)) return false;
        if(!isOpenParentheses(s.charAt(0))) {
            return false;
        }

        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if(isOpenParentheses(s.charAt(i))) {
                st.push(s.charAt(i));
            }
            if(isCloseParentheses(s.charAt(i)) && st.empty()) {
                return false;
            }

            if(isCloseParentheses(s.charAt(i)) && !st.empty()) {
                char c = st.peek();
                if(matchPair(c, s.charAt(i))) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.empty();
    }
}
