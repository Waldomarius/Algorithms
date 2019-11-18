package algorithms.recursion.mergesort;

public class MergeSortAlgorithm {

    private long[] sortArray;

    public MergeSortAlgorithm(long[] array) {
        this.sortArray = array;

    }

    public void sortArray() {
        long[] array = new long[sortArray.length];
        mergeSort(array, 0, sortArray.length - 1);
    }

    private void mergeSort(long[] array, int lowerBound, int upperBound) {

        if (lowerBound == upperBound) {
            return;
        } else {
            int middle = (lowerBound + upperBound) / 2;
            mergeSort(array, lowerBound, middle);
            mergeSort(array, middle + 1, upperBound);

            merge(array, lowerBound, middle + 1, upperBound);
        }

    }

    private void merge(long[] array, int low, int high, int upperBound) {

        int j = 0;
        int lowerBound = low;
        int middle = high - 1;
        int n = upperBound - lowerBound + 1;

        while (low <= middle && high <= upperBound) {
            if (sortArray[low] < sortArray[high]) {
                array[j++] = sortArray[low++];
            } else {
                array[j++] = sortArray[high++];
            }
        }

        while (low <= middle) array[j++] = sortArray[low++];
        while (high <= upperBound) array[j++] = sortArray[high++];

        for (j = 0; j < n; j++) {
            sortArray[lowerBound + j] = array[j];
        }

    }
}
