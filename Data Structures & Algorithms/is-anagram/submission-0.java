class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sorteds = s.toCharArray();
        char[] sortedt = t.toCharArray();
        Arrays.sort(sorteds);
        Arrays.sort(sortedt);
        if(Arrays.equals(sorteds, sortedt))
        return true;
        else
        return false;
    }
}
