public class BubbleSort {

    int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 1; j <= i; j++) {
                if (array[j-1] > array[j]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return array;
    }
}