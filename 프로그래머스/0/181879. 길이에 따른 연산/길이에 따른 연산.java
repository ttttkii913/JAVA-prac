class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                sum += num_list[i]; 
            } else if (num_list.length <= 10) {
                mul *= num_list[i];
            }
        }
        return (num_list.length >= 11 ? sum : mul);
    }
}