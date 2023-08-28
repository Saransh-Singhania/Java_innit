import java.util.Scanner;

public class fibonacci {
    public static void main(String arg[]){
        System.out.println("The max number of values of fibo series:-");
        Scanner myl= new Scanner(System.in);
        int n,a=0,b=1,c,i=0;
        n = myl.nextInt();
        System.out.print(a);
        System.out.println("\n");
        for(i=1;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
