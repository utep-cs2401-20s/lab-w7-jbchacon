import java.util.Arrays;


public class SortOfSort {
   public static void SortOfSort(int num []){


        int Counter = 0;
        int pointer1 = 0;
        int pointer2 = num.length - 1;
        int max = 0;
        int temp;
        int index = 0;


        while (pointer1 < pointer2) {
            max = num[pointer1];
            for (int i = pointer1 + 1; i <= pointer2; i++) {
                if (num[i] > max) {
                    max = num[i];
                    index = i;
                }
            }
            if (Counter > 4) {
                Counter = 0;
            
