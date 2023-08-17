package Array;

import java.util.Scanner;

public class SubArray_Prefix {
    public static void SubArray(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[n.length];

        prefix[0]=n[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                currsum=start==0? prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Array that you want to store");
        int n=sc.nextInt();
        int number[]=new int[n];

        System.out.println("Enter the element of the Array= ");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println();
        SubArray(number); 
        sc.close();


    }
    
}
