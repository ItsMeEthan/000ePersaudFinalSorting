package com.company;

public class bubbleSort extends utilitySort {
    // A function to implement bubble sort

    public static void BubbleSort(int[] list, int n) {

        int i,j;
        for (i = 0; i < n-1; i++)

            // Last i elements are already in place
            for (j = 0; j < n-i-1; j++)
                if (list[j] > list[j+1])
                    swap(list, j, j+1);

    }

}