package Array;

// Importing util for Scanner class and other utility classes.
import java.util.*;

public class sum_and_max_of_subArray {

    // Decelaring the name of the function.
    public static int subarray(int arr[]) {

        // Initialising the Variable.
        int sum = 0;
        int superMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        // Outer Loop for Changing the block of the Subarray Element.
        for(int i=0 ; i<arr.length ; i++) {
            int start = i;

            // Inner Loop for Changing the line Inside the block.
            for(int j=i ; j<(arr.length) ; j++) {
                int end = j;

                // Inner Loop for Printing subarrays
                for(int k=start ; k<=end ; k++) {
                    System.out.print(arr[k] + " ");

                    // adding the value of subArray to the sum variable.
                    sum = sum + arr[k];

                }
                // printing sum of each line.
                System.out.print(" = " + sum);

                // this conditional block is for finding the max value for each block.
                if(sum>max){
                    max = sum;
                }

                // this conditional block is for finding the max value of all.
                if(sum>superMax){
                    superMax = sum;
                }

                // re-initianilise sum for Calculating next line of sum.
                sum=0;
                System.out.println();
                
            }
            //printing the max sum of a block.
            System.out.print("maximum from above sum is : " + max);

            // re-initialise max variable for the next block of subarray.
            max=Integer.MIN_VALUE;
            System.out.println();
            
        }

        // returning the super max value or subarray.
        return superMax;
    }

    public static void main(String[] args) {
        // Creating object of the scanner class.
        Scanner sc = new Scanner(System.in);

        // taking size of the array at run time.
        System.out.print("Enter the size of an array : ");
        int sizeOfArray = sc.nextInt();
        int marks[] = new int[sizeOfArray];

        System.out.println("Enter the elements in the array : ");
        
        // taking elements of the array at run time.
        for(int Index=0 ; Index<marks.length ; Index++ ) {
            marks[Index] = sc.nextInt();
        }

        // Function Calling and printing the final Maximum value.
        System.out.println("The super maximum value of the Subarray is : " + subarray(marks));

        // clossing object of the scanner class.
        sc.close();
    }
    
}
