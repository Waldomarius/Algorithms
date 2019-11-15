package algorithms.recursion.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialApp {

    private static long number;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number:");
        FactorialAlgorithm factorialAlgorithm = new FactorialAlgorithm();
        number = Long.parseLong(getNumber());
        System.out.print("Result:" + factorialAlgorithm.factorial(number));
    }

    private static String getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
