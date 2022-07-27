import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] m1= new int[n];
        for(int i=0;i<m1.length;i++){
            m1[i]= sc.nextInt();
        }
        int m= sc.nextInt();


        int [] m2= new int[m];

        for(int i=0;i<m2.length;i++){
            m2[i]= sc.nextInt();
        }

        int [] m0=new int[m+n];

        for(int i=0;i<m1.length;i++){
            m0[i]=m1[i];
        }
        for(int i= 0;i<m2.length;i++){
            m0[i+m1.length]=m2[i];
        }


        Arrays.sort(m0);

        for(int i=0;i<m0.length;i++){
            if(m0[i]%5==0) System.out.print(m0[i]+" ");
        }
        System.out.println();
        for(int i=0;i<m0.length;i++){
            if(m0[i]%5!=0) System.out.print(m0[i]+" ");
        }
    }
}
