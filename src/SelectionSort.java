import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SelectionSort {
    public SelectionSort() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> AL = new ArrayList();

        System.out.println("Chooser a number of elements to sort: ");
        int n = s.nextInt(); //Number of elements to be sorted

        //Scramble arraylist
        for(int i = 0; i < n; i++){
            AL.add(i);
        }
        Collections.shuffle(AL);
        System.out.println(AL);

        int key;
        int keyIndex;

        long start = System.nanoTime();
        for(int x = 0; x < AL.size(); x++){
            key = AL.get(x);
            keyIndex = x;
            for(int j = x + 1; j<AL.size(); j++) {
                if (key > AL.get(j)) {
                    key = AL.get(j);
                    keyIndex = j;
                }
            }
            if(keyIndex == x);
            else {
                int temp = AL.get(x);
                AL.set(x, AL.get(keyIndex));
                AL.set(keyIndex, temp);
            }
        }
        long finish = System.nanoTime();
        long finalTime = finish - start;

        long mils = TimeUnit.NANOSECONDS.toMillis(finalTime);
        long seconds = TimeUnit.NANOSECONDS.toSeconds(finalTime);
        long mins = TimeUnit.NANOSECONDS.toMinutes(finalTime);
        long microsecs = TimeUnit.NANOSECONDS.toMicros(finalTime);
        System.out.println(AL);
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
    }
}