package algorithms.recursion.mergesort;

import java.util.Arrays;

public class MergeSortApp {
    public static void main(String[] args) {

        long[] array = {56, 78, 6, 3, 55, 90, 12, 17, 16, 39};

        Arrays.stream(array).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
        MergeSortAlgorithm sortAlgorithm = new MergeSortAlgorithm(array);
        sortAlgorithm.sortArray();
        Arrays.stream(array).mapToObj(i -> i + " ").forEach(System.out::print);
    }
}
