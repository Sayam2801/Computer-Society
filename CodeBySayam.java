import java.util.Scanner;

public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        boolean isPrime=true;
        System.out.print("N=");
        num=sc.nextInt();
        for(int i=2;i<=num/2;++i){
            if(num%i==0){
                 isPrime=false;
                 break;
            }
        }
        if(isPrime==true)
            System.out.print("It is a prime number");
        else
            System.out.print("Not a prime number");
        sc.close();
    }
}