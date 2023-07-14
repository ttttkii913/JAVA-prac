import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int len = n/4;
		
		for(int i =0; i<len; i++) {
			sb.append("long ");
		}
		sb.append("int");
		System.out.println(sb);
	}
}