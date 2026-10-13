class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = -nums[i] - nums[j];

                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(
                        nums[i], nums[j], complement
                    );

                    Collections.sort(triplet);
                    output.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(output);
    }
}
