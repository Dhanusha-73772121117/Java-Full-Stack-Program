import java.util.Scanner;
public class Factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int Factorial=1;
for(int i=1;i<=num;i++){
Factorial*=i;
}
System.out.println("Factorial:"+Factorial);
}
}