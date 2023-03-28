package sapXepNoiBot;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};


    public static void bubbleSort(int[] list) {
        //biến needNextpass  giúp mình biết có cần phải thực hiện tháo tác hoán đổi hay không.
        // nếu không thì thoát khỏi vòng lặp


//        boolean needNextPass = true;
//        for (int i = 1; i < list.length && needNextPass; i++) {
//            needNextPass = false;
//            for (int j = 0; j < list.length - i; j++) {
//                if (list[i] > list[i + 1]) {
//                    int temp = list[i];
//                    list[i] = list[i + 1];
//                    list[i + 1] = temp;
//                    needNextPass = true;
//                }
//            }
//        }

        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1-i; j++) {
                if (list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("List trước sắp xếp: ");

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }

        bubbleSort(list);
        System.out.println("\nList sau sắp xếp: ");

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
