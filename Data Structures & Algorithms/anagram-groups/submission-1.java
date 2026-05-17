class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //sort all strings by making them char arrays
        //create map of all equal arrays
        //create list of strings and add in return list

        Map<String, List<Integer>> map = new HashMap<>(); 
        for( int i = 0 ; i < strs.length ; i++){
            char value[] = strs[i].toCharArray();
            Arrays.sort(value);
            if(map.containsKey(String.valueOf(value))){
                var list = map.get(String.valueOf(value));
                list.add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(String.valueOf(value),list);
            }
        }

        // map contains indexes of each anagram group
        List<List<String>> doubleList = new ArrayList<>();
        map.forEach((key, entry) ->{
            List<String> singleList = new ArrayList<>();
            singleList = entry.stream().map(index -> strs[index]).toList();
            doubleList.add(singleList);
        });
       return doubleList;
    }
}
