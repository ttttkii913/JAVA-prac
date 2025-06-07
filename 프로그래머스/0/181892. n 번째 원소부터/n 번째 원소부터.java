import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
        // (배열, 시작 인덱스, 마지막 인덱스)
    }
}