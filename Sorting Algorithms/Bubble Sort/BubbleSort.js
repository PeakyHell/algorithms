function bubbleSort(array) {
    for (let i = array.length - 1; i > 0; i--) {
        let swapped = false;
        for (let j = 1; j <= i; j++) {
            if (array[j-1] > array[j]) {
                [array[j-1], array[j]] = [array[j], array[j-1]];
                swapped = true;
            }
        }

        if (!swapped) {
            break;
        }
    }
    return array;
}