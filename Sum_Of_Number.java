package Array;

import java.util.*;

public class Sum_Of_Number {


    public static void Sum(int m[]){
        int sum=0;
        for(int i=0;i<m.length;i++){
            sum+=m[i];}
        System.out.println(sum);
        
    }
    public static void main(String[] args) {
        int marks[]=new int[4];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number=");
        marks[0]=10;
        marks[1]=19;
        marks[2]=12;
        marks[3]=13;
        System.out.println("Phys :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("Math :"+marks[2]);
        System.out.println("Eng :"+marks[3]);
        Sum(marks);
sc.close();
    }
    
}
