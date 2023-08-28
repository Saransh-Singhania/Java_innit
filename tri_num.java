import java.util.Scanner;
import java.util.Scanner;

public class tri_num {
    public static void main(String arg[]){
        Scanner myc= new Scanner(System.in);
        System.out.println("Enter the initial number:-");
        int a= myc.nextInt();
        System.out.println("Enter the rows in triangle:-");
        int n=myc.nextInt();
        int i=0,j=0;
        for(i=1;i<=n;i++){
            System.out.print("\n");
            a=a+1;
            for(j=1;j<i+1;j++){
                System.out.print(a);
            }
        }
    }

}

