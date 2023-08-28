//aggregate 90-100 :A ; 80-89:B ; 70-79:C ; 60-69:D .

import java.util.Scanner;
public class stud_marks_aggre
{
    public static void main(String arg[])
    {
        System.out.println("Enter the marks for each of the five subjects");
        Scanner mym= new Scanner(System.in);
        float s1,s2,s3,s4,s5,a;
        s1= mym.nextFloat();
        s2= mym.nextFloat();
        s3= mym.nextFloat();
        s4= mym.nextFloat();
        s5= mym.nextFloat();

        a=(s1+s2+s3+s4+s5)/5;
        if(a>=90 && a<=100){
            System.out.println("Grade A");
        }
        if(a>=80 && a<=89){
            System.out.println("Grade B");
        }
        if(a>=70 && a<=79){
            System.out.println("Grade C");
        }
        if(a>=60 && a<=69){
            System.out.println("Grade D");
        }



    }
}
