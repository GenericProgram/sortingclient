import bubblesort.BubbleSort;
import mergesort.msclient;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Bubble Sort\n2. Merge Sort\n3. Insertion Sort\n4. Selection Sort\n5. Super Sort");
        System.out.println("\nChoose a method (1-5): ");
        int myInt = s.nextInt();

        if(myInt > 5 || myInt < 1) {
            do {
                System.out.println("Choose a method (1-5): ");
                myInt = s.nextInt();
            } while(myInt > 5 || myInt < 1);
        }
        switch(myInt){
            case 1:
                BubbleSort bs = new BubbleSort();
                bs.run();
                break;
            case 2:
                msclient ms = new msclient();
                break;
            case 3:
                InsertionSort is = new InsertionSort();
                break;
            case 4:
                SelectionSort ssort = new SelectionSort();
                break;
            case 5:
                SuperSort ssort2 = new SuperSort();
                break;
        }
    }
}
