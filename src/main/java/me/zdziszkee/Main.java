package me.zdziszkee;

import me.zdziszkee.tasks.contains.EfficientContains;
import me.zdziszkee.tasks.sorting.ArraySort;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 3, -4, 3, -11, 7};
        ArraySort.sort(array);
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println(EfficientContains.exists(3, array));




    }




}