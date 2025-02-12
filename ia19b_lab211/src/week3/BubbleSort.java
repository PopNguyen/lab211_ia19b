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
public class BubbleSort {

    private final int[] array;

    public BubbleSort(int n) {
        this.array = new int[n];
    }

    void add() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
    }

    void showArray() {
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(array));
    }

    int[] bubbleSort() {
        boolean check = false;
        for (int i = 0; i < array.length - 1 && !check ; i++) {
            check = true;
            for (int j = 0; j < array.length - i - 1 ; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    check = false;
                }
            }
        }

        return array;
    }

}
