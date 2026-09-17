class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] frequency = new int[26];
            for (char c : s.toCharArray()) {
                frequency[c - 'a']++;
            }

            String key = Arrays.toString(frequency);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
