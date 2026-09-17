class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : nums) {
            if(map.putIfAbsent(num, 1) != null) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(number);
        }

        int[] topKKeys = new int[k];
        int i = 0;

        for (int j = buckets.length - 1; j >= 0 && i < k; j--) {
            if (buckets[j] != null) {
                for (int num : buckets[j]) {
                    topKKeys[i++] = num;
                    if (i == k)  {
                        break;
                    }
                }
            }
        }

        return topKKeys;
        

    }
}
