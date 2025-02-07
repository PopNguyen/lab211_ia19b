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
public class BinarySearch {
    private int[] array;
    public BinarySearch(int n){
        this.array = new int[n];
    }
    void add(){
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(10);
        }
    }
    void sort(){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length - i - 1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(array));
    }
    int searchBinary(int x){
        int middleElement = array[array.length/2];
        if(middleElement==x) return array.length/2;
        else if(middleElement > x){
            for(int i = 0;i<array.length/2;i++){
                if(array[i]==x) return i;
            }
        }else if(middleElement < x){
            for(int i = array.length/2 + 1;i<=array.length;i++){
                if(array[i]==x) return i;
            }
        }
        return -1;
    }
}
