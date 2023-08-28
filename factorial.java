import java.util.Scanner;

public class factorial {
    public static void main(String arg[])
    {
        System.out.println("Enter the  number:-");
    Scanner myn= new Scanner(System.in);
    int a,i=0,c=1,d;
    a = myn.nextInt();

    for (i=2 ; i<=a ; i++){
        c=i*c;

    }
    System.out.println("The fact of the entered number is:"+c);

    }

}
