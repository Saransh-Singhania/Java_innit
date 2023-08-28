
import java.lang.*;
//import java.util.*;
class prime
{
    public static void main(String arg[])
    {
        int a = 2, b=0, i, flag=0;
        for (i = 1; i <= a; i++)
        {
            if (a % i == 0)
            {
                b=b+1;
            }
        }
        if (b==2) {
            System.out.println("iits prime");
        }
        else if(b>2){
            System.out.println("not Prime");
        }
    }
}
