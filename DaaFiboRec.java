public class DaaFiboRec {
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
}



import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Enter numbers: ");
        num = keyboard.nextInt();
        System.out.println("Fibonacci numbers are:");
        for (int i=0; i < num; i++){
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int count) {
        if (count== 0) {
            return 0;
        }
        else if(count == 1) {
            return 1;
        }
        return fibonacci(count-1) + fibonacci(count-2);
    }
}