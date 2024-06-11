package poly.sort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체화 부분 작성

        int[] nums = new  int [5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort" );
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        if(choice == 1) {
            selectedSort(1);
        } else if(choice == 2) {
            selectedSort(2);
        } else if(choice == 3) {
            selectedSort(3);
        } else {
            System.out.println("값이 잘못되었습니다. 다시 입력하시요.");
        }

        //호출하는 부분 작성2
    }

    private static void selectedSort(int choice){
        if(choice == 1) {
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.ascending("BubbleSort");
            bubbleSort.descending("BubbleSort");
            System.out.println("숫자를 정렬하는 알고리즘 입니다.");
            bubbleSort.description("BubbleSort");
        } else if(choice == 2) {
            HeapSort heapSort = new HeapSort();
            heapSort.ascending("HeapSort");
            heapSort.descending("HeapSort");
            System.out.println("숫자를 정렬하는 알고리즘 입니다.");
            heapSort.description("HeapSort");
        } else if(choice == 3){
            QuickSort quickSort = new QuickSort();
            quickSort.ascending("QuickSort");
            quickSort.descending("QuickSort");
            System.out.println("숫자를 정렬하는 알고리즘 입니다.");
            quickSort.description("QuickSort");
        }

    }
}
