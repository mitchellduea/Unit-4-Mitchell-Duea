import java.util.Scanner;

public class BankAccount {


  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    BankAccount account = new BankAccount();
    account.depositmoney();
    account.withdrawmoney();

    System.out.println("BankAccount " + account.getNumber());
    System.out.println("you will have a balance of " + account.getBalance());
  }




  int account;


    int Number = 0;


  public BankAccount(double intialBalance)
  {
    balance = intialBalance;

    account= Number + 1;

  }

  public void deposit(double depositMoney)
  {
    balance += depositAmount;
  }

  public boolean withdraw(double withdrawMoney)
  {
    if (withdrawMoney > balance){
      System.out.println("Doesnt Work");
      return false;
    } else {
      balance -= withdrawMoney;
      return true;
    }
  }

   int Number()
  {
    return account;
  }

  public double Balance()
  {
    return balance;
  }

}
