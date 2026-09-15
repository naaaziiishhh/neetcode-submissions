class Solution {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        String ssorted = new String(schar);
        String tsorted = new String(tchar);

        return ssorted.equals(tsorted);
    }
}

// Brute Force. Time O(n log n). Space O(n)