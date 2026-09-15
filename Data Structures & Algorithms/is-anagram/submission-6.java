class Solution {
    public boolean isAnagram(String s, String t) {
    
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
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        for(int i = 0; i < schar.length; i++) {
            if(charFrequencyS.keySet().contains(schar[i])) {
                charFrequencyS.put(schar[i], charFrequencyS.get(schar[i]) + 1);
            } else {
                charFrequencyS.put(schar[i], 1);
            }
        }

        for(int i = 0; i < tchar.length; i++) {
            if(charFrequencyT.keySet().contains(tchar[i])) {
                charFrequencyT.put(tchar[i], charFrequencyT.get(tchar[i]) + 1);
            } else {
                charFrequencyT.put(tchar[i], 1);
            }
        }

        return charFrequencyS.equals(charFrequencyT);

    }
}