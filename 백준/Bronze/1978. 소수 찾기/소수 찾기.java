import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(check(num) == true)
                count++;
        }

        System.out.println(count);
    }

    static boolean check(int num) {
        if(num == 1)
            return false;
        
        if(num == 2 || num == 3)
            return true;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}