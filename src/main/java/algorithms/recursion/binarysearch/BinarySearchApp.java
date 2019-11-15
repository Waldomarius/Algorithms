package algorithms.recursion.binarysearch;

public class BinarySearchApp {

    private static final int MASS_INT[] = {1,3,5,6,8,9,12,22,67,69,75,79,99,132,143,154,165,168,190,200};
    public static void main(String[] args) {

        BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm(MASS_INT);
        int index = binarySearchAlgorithm.getIndex(75);
        System.out.println(index);

    }
}
