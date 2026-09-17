class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : nums) {
            if(map.putIfAbsent(num, 1) != null) {
                map.put(num, map.get(num) + 1);
            }
        }

        int[] topKKeys = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();

        return topKKeys;
        

    }
}
