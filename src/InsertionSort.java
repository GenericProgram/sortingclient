import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.abs;

public class InsertionSort {
    public InsertionSort() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> AL = new ArrayList();

        System.out.println("Chooser a number of elements to sort: ");
        int n = s.nextInt(); // Number of things to sort

        //Generate numbers and scramble them
        for(int i = 0; i < n; i++){
            AL.add(i);
        }
        Collections.shuffle(AL);

        System.out.println(AL);

        long start = System.nanoTime();
        int j;
        int numMoves = 0;
        for(int x = 1;x < AL.size(); x++){
            int key = AL.get(x);
            j=x;
            while((j>0) && (AL.get(j-1) > key)){
                AL.set(j, AL.get(j - 1));
                j--;
                numMoves++;
            }
            AL.set(j, key);
        }
        long finish = System.nanoTime();
        System.out.println(AL);
        numMoves = abs(numMoves);
        long finalTime = finish - start;
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
        System.out.printf("Number of elements sorted: %,8d%n %n", n);
        System.out.println("Number of moves: " + numMoves);
    }
}