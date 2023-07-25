import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		king = king - Integer.parseInt(st.nextToken());
		queen = queen - Integer.parseInt(st.nextToken());
		rook = rook - Integer.parseInt(st.nextToken());
		bishop = bishop - Integer.parseInt(st.nextToken());
		knight = knight - Integer.parseInt(st.nextToken());
		pawn = pawn - Integer.parseInt(st.nextToken());

		sb.append(king + " ");
		sb.append(queen + " ");
		sb.append(rook + " ");
		sb.append(bishop + " ");
		sb.append(knight + " ");
		sb.append(pawn + " ");

		System.out.println(sb);
	}
}