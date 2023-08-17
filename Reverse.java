package Array;

import java.util.Scanner;

public class Reverse {
   
    public static void reverse(int arr[]){
        int start=0;int end=arr.length-1;
        while(start<end){
            int tem=arr[start];
            arr[start]=arr[end];
            arr[end]=tem;
            start++;
            end--;

        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array that you want to store");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.println("Enter the Element of the Array=");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Reverse Array is ::  ");
            reverse(number);
            for(int i=0;i<number.length;i++){
                System.out.println(number[i]+" ");
            
            }
            sc.close();
    }
    
}
 