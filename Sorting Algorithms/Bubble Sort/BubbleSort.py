def bubbleSort(array):
    for i in range(len(array) - 1, 0, -1):
        swapped = False
        for j in range(1, i + 1):
            if (array[j-1] > array[j]):
                array[j-1], array[j] = array[j], array[j-1]
                swapped = True
        
        if not swapped:
            break
    return array