package algorithms.recursion.anagrams;

public class AnagramAlgorithm {
    private String word;
    private int size;
    private char[] arrChar;
    private int count = 1;

    AnagramAlgorithm(String word) {
        this.word = word;
        size = word.length();
        arrChar =  word.toCharArray();
    }

    public void runAnagram(){
        doAnagram(size);
    }

    private void doAnagram(int newLength) {
        if (newLength == 1) return;
        for (int i = 0; i < newLength; i++) {
            doAnagram(newLength - 1);
            if (newLength == 2) displayWord();
            rotateWord(newLength);
        }
    }

    private void displayWord() {
        System.out.print(count++ + " : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arrChar[i]);
        }
        System.out.println();
    }

    private void rotateWord(int newLength) {
        int position = size - newLength;
        char temp = arrChar[position];
        int i;
        for (i = position + 1; i < size; i++) {
            arrChar[i - 1] = arrChar[i];
        }
        arrChar[i - 1] = temp;
    }
}
