class Solution {

    public String encode(List<String> strs) {
        StringBuilder value = new StringBuilder();
        for(String s : strs){
            value.append(s.length()).append('#').append(s);
        }
        return value.toString();
    }
    //5#hello6#worlds

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int deliminator = str.indexOf('#', i); //1
            int length = Integer.parseInt(str.substring(i, deliminator)); //5

            i = deliminator + 1; //2
            list.add(str.substring(i, i + length));
            i = i + length;
        }
        return list;
    }
}
