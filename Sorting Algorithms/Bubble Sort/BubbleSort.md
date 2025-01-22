# Bubble Sort

## Principle

The Bubble Sort algorithm is a *sorting algorithm* that sort an array by comparing adjacent elements and swapping them if they're in the wrong order. Its name comes from the fact that the biggest elements travel to the end of the list like a bubble going up in a water column.

## Pseudo Code

for i = n-1 down to 0 :
    swapped = false
    for j = 1 to i :
        if array[j - 1] > array[j] :
            swap(array[j - 1], array[j])
            swapped = true
    if not swapped :
        break
return array

## Complexity

### Time Complexity

Best case : $Θ(n)$
Worst case : $Θ(n^2)$
In all cases : $O(n^2)$

### Space Complexity

In all cases : $Θ(1)$