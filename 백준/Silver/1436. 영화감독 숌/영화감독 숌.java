import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while (count != n) {
            num++;
            if (String.valueOf(num).contains("666"))
                count++;
        }
        System.out.println(num);
    }
}
