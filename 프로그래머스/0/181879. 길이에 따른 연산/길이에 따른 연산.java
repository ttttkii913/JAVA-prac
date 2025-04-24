class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
       
        if (num_list.length > 10) {
            for (int num : num_list) {
                sum += num;
            } 
            return sum;
        } else {
            for (int num : num_list) {
                mul *= num;
            }
            return mul;
        }
    }
}