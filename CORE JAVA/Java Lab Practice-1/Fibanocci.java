import java.util.Scanner;
public class Fibanocci{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int num1=0,num2=1;
     for(int i=0;i<n;i++){
     int num3=num1+num2;
     num1=num2;
     num2=num3;
   }
  System.out.println("Fibannocci series:"+num1);
}
}
     

