import java.util.Scanner;
public class PrimeNumber{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     boolean isPrime=true;
     if(n<=1){
     System.out.println("Not a Prime");}
 else{
     for(int i=2;i<=n/2;i++){
     if(n%i==0){
     isPrime=false;}
       }
    if(isPrime){
   System.out.println("It is a Prime");}
   else{
   System.out.println("It is not a Prime");
  }
}
}
}
     
     

