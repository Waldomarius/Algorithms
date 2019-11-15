package algorithms.recursion.binarysearch;

public class BinarySearchAlgorithm{

    private int mass[];

    public BinarySearchAlgorithm(int mass[]) {
        this.mass = mass;
    }

    public int getIndex(int searchNumber){
        return findElement(searchNumber,0,mass.length);
    }

    /**
     * @param searchNumber  search element of array
     * @param lowerBound    lower border of search interval
     * @param upperBound    upper border of search interval
     * @return method returns INDEX search element
     */
    private int findElement(int searchNumber, int lowerBound, int upperBound) {
        int currentIndex = (upperBound - lowerBound) / 2;

        if (mass[currentIndex] == searchNumber) return currentIndex;
        if (mass[currentIndex] < searchNumber) {
            return findElement(searchNumber,currentIndex+1,upperBound);
        } else {
            return findElement(searchNumber,lowerBound,currentIndex-1);
        }
    }
}
