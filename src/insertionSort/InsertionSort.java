package insertionSort;

import java.util.Arrays;

public class InsertionSort {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};


    public static void main(String[] args) {
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j+1]=currentElement;
            System.out.println(i+"  :"+ Arrays.toString(list));
        }
    }
}
