package algorithms.recursion.triangularnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangularNumberApp {

    private static long number;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number:");
        TriangularNumberAlgorithm factorialAlgorithm = new TriangularNumberAlgorithm();
        number = Long.parseLong(getNumber());
        System.out.print("Result:" + factorialAlgorithm.triangularNumber(number));
    }

    private static String getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
