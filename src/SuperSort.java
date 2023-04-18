import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.abs;

public class SuperSort {
    public SuperSort() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> AL = new ArrayList();
        System.out.println("Chooser a number of elements to sort: ");

        int n = s.nextInt(); // Number of things to sort;

        long start2 = System.nanoTime();

        //Generate numbers and scramble them
        for(int i = 0; i < n; i++){
            AL.add(i);
        }
        Collections.shuffle(AL);
        System.out.println(AL);

        int MAX = AL.size();
        AL.clear();

        long start = System.nanoTime();
        for(int i = 0; i < MAX; i++){
            AL.add(i);
        }
        long finish = System.nanoTime();

        System.out.println(AL);
        long finalTime = finish - start;
        long finalTime2 = finish-start2;


        long mils = TimeUnit.NANOSECONDS.toMillis(finalTime);
        long seconds = TimeUnit.NANOSECONDS.toSeconds(finalTime);
        long mins = TimeUnit.NANOSECONDS.toMinutes(finalTime);
        long microsecs = TimeUnit.NANOSECONDS.toMicros(finalTime);

        long mils2 = TimeUnit.NANOSECONDS.toMillis(finalTime2);
        long seconds2 = TimeUnit.NANOSECONDS.toSeconds(finalTime2);
        long mins2 = TimeUnit.NANOSECONDS.toMinutes(finalTime2);
        long microsecs2 = TimeUnit.NANOSECONDS.toMicros(finalTime2);

        System.out.println("");

        if(microsecs < 999) {
            System.out.println("Elapsed time: "+ microsecs + " microseconds");
            System.out.println("Elapsed time (with number generation): "+ microsecs2 + " microseconds");
        } else if(mils < 999) {
            System.out.println("Elapsed time: "+ mils + " milliseconds");
            System.out.println("Elapsed time (with number generation): "+ mils2 + " milliseconds");
        } else if(seconds < 59){
            System.out.println("Elapsed time: "+ seconds + " seconds");
            System.out.println("Elapsed time (with number generation): "+ seconds2 + " seconds");
        } else if(mins > 1){
            System.out.println("Elapsed time: "+ mins + " minutes");
            System.out.println("Elapsed time (with number generation): "+ mins2 + " minutes");
        }
        System.out.printf("Number of elements sorted: %,8d%n %n", n);
    }
}