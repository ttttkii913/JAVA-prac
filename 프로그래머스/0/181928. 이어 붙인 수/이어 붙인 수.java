class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int sum2 = 0;
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                sum = sum * 10 + num;
            } else {
                sum2 = sum2 * 10 + num;
            }
        }
        
        answer = sum + sum2;
        
        return answer;
    }
}