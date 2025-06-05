package src.procedural.sorting;

public class BubbleSort {
    /**
     * inversion
     * <p>
     * 1.
     * int tmp = a
     * a = b
     * b = tmp
     * <p>
     * 2.
     * a = a + b
     * b = a - b
     * a = a - b
     */

    public static int[] bubbleSort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
