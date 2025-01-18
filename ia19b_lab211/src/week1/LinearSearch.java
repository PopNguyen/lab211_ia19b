/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class LinearSearch {
    private final int[] array;

    public LinearSearch(int n) {
        this.array = new int[n];
    }

    void add() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = rand.nextInt(10);
        }
    }

    void showArray() {
        System.out.println("The Array: ");
        System.out.println(Arrays.toString(array));
    }

    int search(int number) {
        add();
        showArray();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("Found " + number + " at the index: " + i);
                return 1;
            }
        }
        System.out.println("Not found!!!");
        return 0;
    }
}
