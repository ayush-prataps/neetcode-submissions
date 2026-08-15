class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            int maxFreq = 0;
            int maxElement = 0;

            for (int num : map.keySet()) {
                if (map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    maxElement = num;
                }
            }

            result[i] = maxElement;
            map.remove(maxElement);
        }

        return result;
    }
}
