


# Challenge Summary
Reviewing the pseudocode below, then tracing the algorithm by stepping through the process with the provided sample array. Documenting the explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.

```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```


## Approach & Efficiency
- **Big O**
- Time: O(n^2)
- Space: O(n)




### **Trace Process**

* **Input: [8,4,23,42,16,15]**
    * **Pass 1**: Make the pivot number is the last one (15) and compaire all the elements with it, the lower numbers will be befor it and the upper numbers will be after it. Then the array will become: [8, 4, **15**, 42, 16, 23]

    * **Pass 2**: The numbers before it(15) will be sorted: 4<8 ==> [4, 8, 15, 42, 16, 23]

    * **Pass 3**: Make a pivot number again which will be the last number(23), and again the lower numbers will be moved befor it, abd the greater numbers will be move after it. Then the array will become: [4, 8, 15, 16, **23**, 42]

    * **Pass 4**: Again, the numbers befor it(23) will be sorted, but the sorting will begin from the last pivot which was(15), so it will not touch the numbers befor (5). Then the sorting will begin with: (16). No numbers to compaire so it will be by default sorted and the array will become: [4, 8, 15, 16 , 23, 42]

    * **Pass 5**: We reached to the sorted array which we were aim.
- **OutPut: [4, 8, 15, 16 , 23, 42]**
