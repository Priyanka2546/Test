import java.util.Scanner;

class EvenOdd
{
public static void main(String args[])
{
System.out.println("Enter the Range");
Scanner sc=new Scanner(System.in);
System.out.println("Even is ");
int i=sc.nextInt();

if(i%2==0)

System.out.println("Even");
else 
System.out.println("Odd");
}

}