package algorithms.recursion.anagrams;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter a word:");
        String word = getWord();

        AnagramAlgorithm anagramAlgorithm = new AnagramAlgorithm(word);
        anagramAlgorithm.runAnagram();
    }

    private static String getWord() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
