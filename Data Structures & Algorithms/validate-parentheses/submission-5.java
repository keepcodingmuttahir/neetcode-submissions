class Solution {
    public boolean isValid(String s) {
        if(s.equals(null) || s.length() == 1){
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char p = stack.pop();
                if(p == '(' && c!= ')') return false;
                if(p == '{' && c!= '}') return false;
                if(p == '[' && c!= ']') return false;
            }
        }
        return stack.isEmpty();
    }
}
