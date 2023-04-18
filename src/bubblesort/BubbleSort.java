package bubblesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BubbleSort {
    public static void sort() {
        Scanner s = new Scanner(System.in);
        ArrayList<Element> AL = new ArrayList<>();

        System.out.println("Chooser a number of elements to sort: ");

        int n = s.nextInt(); // Number of elements to be sorted

        //Put random elements in array
        for (int i = 0; i < n; i++) {
            AL.add(new Element(i));
        }
        Collections.shuffle(AL);
        AL.forEach(e -> System.out.print(e.getId() + ", "));

        long start = System.nanoTime();

        int swap = 0;
        Element temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < AL.size()-1; i++) {
                if (AL.get(i).compareTo(AL.get(i + 1)) > 0) {
                    //SWAP
                    swap++;
                    temp = AL.get(i);
                    AL.set(i, AL.get(i + 1));
                    AL.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        long finish = System.nanoTime();
        long finalTime = finish - start;

        System.out.println();
        AL.forEach(e -> System.out.print(e.getId() + ", "));
        long mils = TimeUnit.NANOSECONDS.toMillis(finalTime);
        long seconds = TimeUnit.NANOSECONDS.toSeconds(finalTime);
        long mins = TimeUnit.NANOSECONDS.toMinutes(finalTime);
        long microsecs = TimeUnit.NANOSECONDS.toMicros(finalTime);

        System.out.println("");

        if(microsecs < 999) {
            System.out.println("Elapsed time: "+ microsecs + " microseconds");
        } else if(mils < 999) {
            System.out.println("Elapsed time: "+ mils + " milliseconds");
        } else if(seconds < 59){
            System.out.println("Elapsed time: "+ seconds + " seconds");
        } else if(mins > 1){
            System.out.println("Elapsed time: "+ mins + " minutes");
        }
        System.out.printf("Number of elements sorted:%,8d%n %n", n);
        System.out.println("Number of swaps: " +swap);
    }
    public void run() {
        BubbleSort.sort();
    }
}






