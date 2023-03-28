package selectionSort;

import java.util.Arrays;

public class selectionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        System.out.println("mảng trước in:" + Arrays.toString(list));
        selectionSort(list);
        System.out.println("mảng sau khi in: " + Arrays.toString(list));

    }

    public static void selectionSort(int[] list) {
//        int min;
//        for (int i = 0; i < list.length - 1; i++) {
//            min = i;
//            for (int j = i; j < list.length; j++) {
//                if (list[j] < list[min]) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                int temp = list[min];
//                list[min] = list[i];
//                list[i] = temp;
//            }
//            System.out.println("i = " + i + ", arr = " + Arrays.toString(list));
//        }
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }

    }
}
