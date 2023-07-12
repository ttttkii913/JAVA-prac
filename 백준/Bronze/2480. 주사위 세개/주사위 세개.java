import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int res = 0;
		// abc가 같을 때
		if (A == B && B == C)
			res = 10000 + A * 1000;
		// abc가 다 다를 때
		else if (A != B && B != C && A != C) {
			if (A > B && A > C)
				res = A * 100;
			else if (B > A && B > C)
				res = B * 100;
			else if (C > A && C > B)
				res = C * 100;
		} else {
			if (A == B)
				res = 1000 + A * 100;
			else if (A == C)
				res = 1000 + A * 100;
			else if (B == C)
				res = 1000 + B * 100;
		}
		System.out.println(res);
	}
}