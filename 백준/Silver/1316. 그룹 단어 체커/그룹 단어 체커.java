import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (check(br.readLine()))    // 그룹 문자 메서드 확인하는 메서드 호출
                count++;                // 그룹 문자일시 count++
        }
        br.close();
        System.out.println(count);
    }

    static boolean check(String str) {  // 그룹 문자인지 확인하는 메서드 - true 나오도록
        boolean[] alpha = new boolean[26];
        int prev = -1;

        for (int i = 0; i < str.length(); i++) {
            int pres = str.charAt(i);   // 현재 문자 아스키 코드 저장

            if (prev != pres) { // 이전 문자와 현재 문자가 같지 않다면
                if (alpha[pres - 97] == false) {     // 처음 나온 문자라면 이전 문자를 현재 문자로
                    alpha[pres - 97] = true;
                    prev = pres;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
