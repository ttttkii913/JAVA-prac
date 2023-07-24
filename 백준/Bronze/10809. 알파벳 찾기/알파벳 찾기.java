import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder sb = new StringBuilder();

		int[] arr = new int[26]; // 알파벳 배열 선언
		for (int i = 0; i < arr.length; i++)
			arr[i] = -1;

		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (arr[ch - 'a'] == -1)
				arr[ch - 'a'] = i;
		}
		for (int val : arr)
			System.out.print(val + " ");
	}
}