import java.util.Scanner;

public class char_tri {
    public static void main(String arg[]){
        Scanner myc= new Scanner(System.in);
        System.out.println("Enter the character:-");
        char a= myc.next().charAt(0);
        System.out.println("Enter the rows in triangle:-");
        int n=myc.nextInt();
        int i=0,j=0;
        for(i=1;i<=n;i++){
            System.out.print("\n");
            for(j=1;j<i+1;j++){
                System.out.print(a);
            }
        }
    }

}
