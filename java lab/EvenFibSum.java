import java.util.Scanner;

class EvenFibSum
{
public static void main(string[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter range N:");
int N=sc.nextInt();
int a=0, b=1;
int sum=0;
while(a<=N){
    if(a%2==0){
        sum=sum+a;
    }
    int next = a+b;
    a=b;
    b=next;
}
System.out.println("sum of even fib num:"+sum);
}
}