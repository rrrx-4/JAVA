class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        if (s.length() == 0)
            return true;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(p) == t.charAt(i)) {
                p++;
                if (s.length() == p)
                    break;
            }
        }

        if (p == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}