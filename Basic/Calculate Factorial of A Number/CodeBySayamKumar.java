import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,factorial=1;
        System.out.print("N=");
        num=sc.nextInt();
        for(int i=num;i>=1;i--){
            factorial*=i;
        }
        System.out.println("Output:"+factorial);
        sc.close();
    }
}