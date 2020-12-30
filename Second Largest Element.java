import java.util.*;
public class SecondLargestNumber { //Class to find second largest element in an array
    void Sort(int array[]) //Creating a function to check the conditions for sorting an array
    {
        int n = array.length;
        for (int loopOnPower = 0; loopOnPower < n-1; loopOnPower++)
            for (int anotherLoopOnPower = 0; anotherLoopOnPower < n-loopOnPower-1; anotherLoopOnPower++)
                if (array[anotherLoopOnPower] > array[anotherLoopOnPower+1]) //Condition to check if previous element is greater than next element
                {
                    //Swapping if condition becomes true without using temporary variable
                    array[anotherLoopOnPower] = array[anotherLoopOnPower] + array[anotherLoopOnPower + 1];
                    array[anotherLoopOnPower + 1] = array[anotherLoopOnPower] - array[anotherLoopOnPower + 1];
                    array[anotherLoopOnPower] = array[anotherLoopOnPower] - array[anotherLoopOnPower + 1];
                }
    }

    public static void main(String args[])
    {
        SecondLargestNumber obj = new SecondLargestNumber(); //Creating an object of class SecondLargestNumber
        int array[] = {6, 3, 2, 12, 26, 16};
        obj.Sort(array); //Calling  function
        System.out.println("Second largest number is "+array[1]); //Printing second largest element in an array
    }
}





















![Second Largest](https://user-images.githubusercontent.com/74056455/103377338-2570c800-4b05-11eb-9c7d-45d68b0a58b2.PNG)
