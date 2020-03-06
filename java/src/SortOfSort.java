//import java.util.*;
public class SortOfSort {
    public static void sortOfSort(int nums[]) {

        int Counter = 1;
        int max=0;
        int pointer1 = 0;//keeps track of left
        int pointer2 = nums.length - 1;//keeps track of right
        //if counter is between 1 and 2 swap element to the right and if counter is between 3 and 4  swap element to the left
        while (pointer1 < pointer2) {
            max = maxIndex(pointer1, pointer2, nums);//get max between the pointers
            if (Counter >= 1 && Counter <= 2) {
                int temp = nums[pointer2];
                nums[pointer2] = nums[max]; //swaps
                nums[max] = temp;
                pointer2--;  // decrement the right most array index
                Counter++;
            }
            else if (Counter >= 3 && Counter <= 4) {
                int temp = nums[pointer1];
                nums[pointer1] = nums[max];
                nums[max] = temp;//swaps
                pointer1++;  // increment the left most array index
                Counter++;
            } // if both side swaps are done again reset the counter
            if (Counter > 4)
                Counter = 1;
        }
    }
    //StackOverFlow helper method
    public static int maxIndex(int pointer1, int pointer2, int nums[]) {   // this method returns max elements address between the pointer indexes
        int max = -9999;// gives a max assuming this is'nt the actual max
        int maxIndex = 0;
        for (int i = pointer1; i <= pointer2; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
