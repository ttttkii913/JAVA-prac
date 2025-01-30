import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int mul = 0;
        
        for (int i = 1; i <= 9; i++) {
            mul = n * i;
            System.out.println(n + " * " + i +" = " + mul);
        }
    }
}
