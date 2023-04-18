package mergesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class msclient implements Cloneable {
    public msclient() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> unsortedArray = new ArrayList<>();

        System.out.println("Chooser a number of elements to sort: ");

        Integer n = s.nextInt(); // Number of elements to be sorted

        for(int i = 0; i < n; i++){
            unsortedArray.add(i);
        }
        Collections.shuffle(unsortedArray);
        System.out.println(unsortedArray);

        MergeSort ms = new MergeSort(unsortedArray);

        long start = System.nanoTime();
        ms.sortGivenArray();
        long end = System.nanoTime();
        long finalTime = end - start;
        long mils = TimeUnit.NANOSECONDS.toMillis(finalTime);
        long seconds = TimeUnit.NANOSECONDS.toSeconds(finalTime);
        long mins = TimeUnit.NANOSECONDS.toMinutes(finalTime);
        long microsecs = TimeUnit.NANOSECONDS.toMicros(finalTime);

        System.out.println(ms.getSortedArray());

        if(microsecs < 999) {
            System.out.println("Elapsed time: "+ microsecs + " microseconds");
        } else if(mils < 999) {
            System.out.println("Elapsed time: "+ mils + " milliseconds");
        } else if(seconds < 59){
            System.out.println("Elapsed time: "+ seconds + " seconds");
        } else if(mins > 1){
            System.out.println("Elapsed time: "+ mins + " minutes");
        }
        System.out.printf("Number of elements sorted: %,8d%n %n", n);
    }
}