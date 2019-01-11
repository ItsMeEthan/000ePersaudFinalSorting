package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        int[] testArr2 = {8,6,7,5,3,0,9,10,1,2,3};

        System.out.print("BubbleSort");
        System.out.println("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();


        bubbleSort.BubbleSort(testArr, 11);

        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+ " ");
        System.out.println();



        System.out.println("SelectionSort");
        System.out.println("Before: ");
        for (int num:testArr2)
            System.out.print(num+" ");
        System.out.println();


        selectionSort.SelectionSort(testArr2, 11);

        System.out.print("After: ");
        for (int num:testArr2)
            System.out.print(num+ " ");
        System.out.println();

    }
}
