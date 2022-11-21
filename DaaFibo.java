import java.util.Scanner;
public class DaaFibo {
    public static void main(String[] args)  {
        int n0=0;
        int n1=1;
        int sum=0;

        System.out.println("Enter number: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Fibonaci series: ");
        for(int i=1;i<=n;i++){
            System.out.print(n0+"  ");
            sum=n0+n1;
            n0=n1;
            n1=sum;
        }
        System.out.println();
    }
}

