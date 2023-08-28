import java.util.Scanner;

public class trii_num_new {
    public static void main(String arg[]){
        Scanner myc= new Scanner(System.in);
        System.out.println("Enter the initial number:-");
        int a;
        System.out.println("Enter the rows in triangle:-");
        int n=myc.nextInt();
        int i=0,j=0;
        for(i=1;i<=n;i++){
            a=1;
            System.out.print("\n");
            for(j=1;j<i+1;j++){

                System.out.print(a);
                a++;

            }
        }
    }

}

