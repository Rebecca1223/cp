class Solution {
    public String greatestLetter(String s) {
        HashSet<Integer> seen = new HashSet<Integer>();
        int max = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && seen.contains((s.charAt(i) + 32))) { //if uppercase
                if (s.charAt(i) > max) max = s.charAt(i);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && seen.contains(s.charAt(i) - 32)) { //if lower
                if (s.charAt(i) - 32 > max) max = s.charAt(i) - 32;
            } else {
                seen.add((int)s.charAt(i));
            }
        }
        if (max == ' ') return "";
        return Character.toString((char) max);
    }
}