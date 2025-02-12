/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import static java.lang.System.exit;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test3 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.Menu();
    }

    void Menu() {
        int option;
        while (true) {
            System.out.println("""
                               ================MENU===============
                               1. Bubble Sort 
                               2. Quick Sort
                               3. BinarySearch
                               4. Stack
                               5. Exit
                               Please enter your option: """);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter number of Array: ");
                    BubbleSort bbSort = new BubbleSort(sc.nextInt());
                    bbSort.add();
                    bbSort.showArray();
                    System.out.println("Sorted Array: \n " + Arrays.toString(bbSort.bubbleSort()));
                    break;
                case 2:
                   
                    QuickSort qSort = new QuickSort(Utils.checkInt("Enter number of array: "));
                    qSort.add();
                    System.out.println("Unsorted Array: ");
                    qSort.showArray();
                    System.out.println("Sorted Array: ");
                    qSort.quickSort(0, qSort.getArray().length - 1);
                    qSort.showArray();
                    break;
                case 3:
                    BinarySearch biSearch = new BinarySearch(Utils.checkInt("Enter number of array: "));
                    biSearch.add();
                    biSearch.sort();
                    System.out.println("Enter search value: ");
                    int x = sc.nextInt();
                    System.out.println("Found " + x + " at index: " + biSearch.searchBinary(x));
                    break;
                case 4:
                    MyStack myStack = new MyStack();
                    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    for (int i = 0; i < list.length; i++) {
                        myStack.push(list[i]);
                    }
                    myStack.pop();
                    myStack.pop();
                    for (int i = 0; i < 3; i++) {
                        myStack.get(i);
                    }
                    break;
                case 5:
                    exit(0);
                    break;
            }
        }
    }
}
