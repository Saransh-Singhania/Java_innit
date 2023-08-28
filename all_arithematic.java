import java.util.*;
public class all_arithematic {
    public static void main(String arg[]){
        System.out.println("This is a calculator");
        Scanner myop= new Scanner(System.in);
        System.out.println("Enter the operation to be performed");
        char opr= myop.next().charAt(0);
        int a,b,c=0;
        System.out.println("Enter the two number:-");
        a= myop.nextInt();
        b= myop.nextInt();
        if(opr=='+'){
            System.out.println("c=a+b");
        }
        else if(opr=='-'){
            System.out.println("c=a-b");
        }
        else if (opr == '*') {
            c=a*b;
            System.out.println(c);
        }
        else if (opr =='/'){
            System.out.println("c=a/b");
        }
        else{
            System.out.println("Enter correct operator");
        }


    }
}
