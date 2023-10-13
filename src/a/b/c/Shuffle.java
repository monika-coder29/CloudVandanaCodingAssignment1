package a.b.c;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7 , 9};
        
        shuffleArray(array);

        // Print the shuffled array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
