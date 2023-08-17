package Array;
// import java.util.*;

public class Update {
    public static void update(int m[]){
        for(int i=0;i<m.length;i++)
        {
            m[i]=m[i]+1;
        }

    }
    public static void main(String[] args) {
        int mark[]={10,20,30,40};

        update(mark);
        //print out mark
        for(int i=0; i<mark.length;i++){
            System.out.println(mark[i]+ " ");

        }
        System.out.println();

    }
    
}
