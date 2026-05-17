class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
        // Correct way to update a map value
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    // Correct way to get a sortable list of values
    List<Integer> values = new ArrayList<>(map.values());
    values.sort(Collections.reverseOrder());

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        int targetValue = values.get(i);
        
        // Handling the Optional and finding the key
        int key = map.entrySet().stream()
            .filter(e -> e.getValue() == targetValue)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(-1); 
            
        result[i] = key;
        
        // CRITICAL LOGIC FIX: You must remove the key after finding it 
        // so you don't pick the same key twice if frequencies match!
        map.remove(key); 
    }
    return result;
}
}
