/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class QuickSort {

    private final int[] array;

    public QuickSort(int n) {
        this.array = new int[n];
    }

    void add() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
    }

    void showArray() {
        System.out.println(Arrays.toString(array));
    }

    void quickSort(int start, int end) {
        if (start == end) {
            return;
        }
        int pivotIdx = partition(start, end);
        if (start < pivotIdx - 1) {
            quickSort(start, pivotIdx - 1);
        }

        if (pivotIdx < end) {
            quickSort(pivotIdx, end);
        }
    }

    int partition(int start, int end) {
        int pivot = array[(start + end)/2];  //index 2 with length = 5
        int i = start, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                ++i;
            }
            while (array[j] > pivot) {
                --j;
            }
            if (i<=j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
}
