import java.util.Scanner;

public class employee_list {
    public static void main(String arg[])
        {
            Scanner myem= new Scanner(System.in);
            System.out.println("Enter the number of sales:-");
            double a,salary=50000,t=0,i=0;
            a = myem.nextInt();
            if( a<=10000){
                i= 0.02 *salary;
                t= salary+i;
                System.out.println("total ij :: "+t);
            }
            else if (10000<a && a<=20000) {
                t=salary+(5/100*salary);
                System.out.println("total iz ::"+t);
            }
            else if (a > 20000){
                t=salary+(7/100*salary);
                System.out.println("total is :: "+t);
            }

        }
    }

