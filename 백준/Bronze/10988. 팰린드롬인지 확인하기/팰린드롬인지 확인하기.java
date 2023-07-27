import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();

		String s = br.readLine();
		int res = 1;
		for(int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			char b = s.charAt(s.length()-1-i);
			if (a != b)
				res = 0;
		}
		System.out.print(res);
	}
}