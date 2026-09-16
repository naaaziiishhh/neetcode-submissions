class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
    
    //Brute Force. Time O(n log n). Space O(n)
    //     char[] schar = s.toCharArray();
    //     char[] tchar = t.toCharArray();

    //     Arrays.sort(schar);
    //     Arrays.sort(tchar);

    //     String ssorted = new String(schar);
    //     String tsorted = new String(tchar);

    //     return ssorted.equals(tsorted);

    //Optimized. Both space and time O(n + m)
        Hashtable<Character, Integer> charFrequencyS = new Hashtable<>();
        Hashtable<Character, Integer> charFrequencyT = new Hashtable<>();

        for(int i = 0; i < s.length(); i++) {
            charFrequencyS.put(s.charAt(i), charFrequencyS.getOrDefault(s.charAt(i), 0) + 1);

            charFrequencyT.put(t.charAt(i), charFrequencyT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return charFrequencyS.equals(charFrequencyT);

    }
}