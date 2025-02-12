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

    public int[] getArray() {
        return array;
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
        int pivotIdx = partition(start, end);
        if (start < pivotIdx - 1) {
            quickSort(0, pivotIdx - 1);
        }
        if (pivotIdx < end) {
            quickSort(pivotIdx, end);
        }

    }

    int partition(int start, int end) {
        int pivot = array[(start + end) / 2];
        int i = start, j = end;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    int partitionlast(int start, int end) { // 2  6  8  3  4  //  2 3 8 6 4
        int pivot = array[end];
        int i = start - 1;
        int j = start;
        while (j == end) {
            while (array[j] > pivot) {
                j++;
            }
            int temp = array[j];
            array[j] = array[i + 1];
            array[i + 1] = j;
            j++;
            i++;
        }
        int temp = array[end];
        array[end] = array[i + 1];
        array[i + 1] = temp;
        return i + 1;
    }

}
