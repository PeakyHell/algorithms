# Selection Sort

## Principle

The Selection Sort algorithm is a *sorting algorithm* that sorts an array by repeteadly selecting the smallest element from the unsorted portion and putting it at the correct position.

## Pseudo Code

```
for i = 0 to n-1 :
    min = i
    for j = i+1 to n-1 :
        if array[j] < array[min] :
            min = j
    if min != i :
        swap(array[i], array[min])
return array
```

## Complexity

### Time Complexity

- Best case : $Θ(n^2)$
- Worst case : $Θ(n^2)$
- In all cases : $Θ(n^2)$

### Space Complexity

- In all cases : $Θ(1)$