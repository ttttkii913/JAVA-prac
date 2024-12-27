class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = Integer.toString(a) + Integer.toString(b); 
        
        return Math.max(Integer.parseInt(ab), (2 * a * b));
    }
}