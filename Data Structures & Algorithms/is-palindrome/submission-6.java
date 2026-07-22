class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if((s.charAt(i)>= 'a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')) {
                builder.append(s.charAt(i));
            }
        }

        s = builder.toString();

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }

        return true;
    }
}
