package Array;

import java.util.Scanner;

public class Binary_Search {

 public static int Binary(int array[],int key){
    //declare the start and end 
    int start=0;int end=(array.length)-1;
    while(start<=end){
         int mid=(start+end)/2;
         //comprison
        if(array[mid]==key){
            return mid;
        }
        //Left
        if(array[mid]>key){
            end=mid-1;
        } 
        //Right
        else{
            start=mid+1;
        }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Element that you want to store=");
        int n=sc.nextInt();
        //Declare the array size
        int arr[]=new int[10];
        System.out.println("Enter the Element of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //what a number that you want to search
        System.out.println("Enter the key=");
        int key=sc.nextInt();
        //calling the function
        System.out.println(Binary(arr,key));

    sc.close();

    }
    
}
