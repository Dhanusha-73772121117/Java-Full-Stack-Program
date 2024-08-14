package LabPracticeiii;
class BankAccount {
 double balance;
 BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }
  void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }
  void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient funds.");
     }
 }
  double getBalance() {
     return balance;
 }
}
class SavingsAccount extends BankAccount {
 SavingsAccount(double initialBalance) {
     super(initialBalance);
 }
 void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= 100) {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     } else {
         System.out.println("Withdrawal denied. Insufficient balance");
     }
 }
}
public class MyClass5{
 public static void main(String[] args) {
     SavingsAccount myAccount = new SavingsAccount(500);
     myAccount.deposit(200); 
     myAccount.withdraw(300);
     myAccount.withdraw(350);
     System.out.println("Current balance: " + myAccount.getBalance());
 }
}

