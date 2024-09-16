import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int sum = 0;

        while (true) {
            if (N <= count + sum) {
                if(count % 2 == 1) {
                    System.out.println((count - (N - sum - 1) + "/" + (N - sum)));
                    break;
                } else {
                    System.out.println((N - sum) + "/" + (count - (N - sum - 1)));
                    break;
                }
            } else {
                sum += count;
                count++;
            }

        }
        br.close();
    }
}