import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boolean[][] arr = new boolean[100][100];
		int n = Integer.parseInt(br.readLine()); // 검정 색종이 수 입력 받기 -> ex)크기가 3인 배열 생성
		int total = 0; // 검은 영역의 넓이 - 검은 영역 한 칸 = 배열 하나 --> 겹치는 부분이 아니면 토탈 카운트++

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) {
						arr[j][k] = true;
						total++;
					}
				}
			}
		}
		System.out.println(total);
	}
}