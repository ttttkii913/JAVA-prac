import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int n = Integer.parseInt(br.readLine());

        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        List<String> sortWord = new ArrayList<>(words);

        sortWord.sort((a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());

        for (String word : sortWord) {
            System.out.println(word);
        }
    }
}
