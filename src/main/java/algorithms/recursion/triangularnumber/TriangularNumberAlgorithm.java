package algorithms.recursion.triangularnumber;

public class TriangularNumberAlgorithm {
    public long triangularNumber(long number) {
        if (number == 1) return 1;
        return number + triangularNumber(number - 1);
    }
}
