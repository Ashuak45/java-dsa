import java.util.Scanner;
class BankAccount{
String acc_holder;
String acc_no;
double balance;

void SetAccountDetails(String name,String ano,double bal) {
    acc_holder = name;
    acc_no = ano;
    balance =bal;
}
    void deposit(double amount){
        balance+=amount;
        System.out.println("RS."+amount+" deposited and balanceis"+balance);
    }
    void withdraw(double Amount){
        if(balance-Amount<500) {
            System.out.println("withdrawl not possible");
        }else{
                balance = balance - Amount;
                System.out.println("Withdrawl of"+Amount+"has been done successfully");
            }
            }
        void ApplyIntrest(double ratePercent ){
            double intrest = (balance * ratePercent) / 100;
            balance += intrest;
            System.out.println("intrest of RS." + intrest + "applied");
        }
        void Displaydetails(){
            System.out.println("-----------A/C SUMMARY---------------");
            System.out.println("name =" +acc_holder);
            System.out.println("A/C no.=" +acc_no);
            System.out.println("balance =" +balance);
        }

    }

public class Bank_app {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BankAccount acc=new BankAccount();
        System.out.println("enter a/c holder name");
        String name=in.nextLine();
        System.out.println("enter account number");
        String accno= in.next();
        System.out.println("enter initial balance");
        double balance=in.nextDouble();
        acc.SetAccountDetails(name,accno,balance);
        System.out.print("\n Enter amount to be deposited");
        double depositAmount=in.nextDouble();
        acc.deposit (depositAmount);
        System.out.println("Enter withdrawl amount:RS.");
        double withdrawAmount=in.nextDouble();
        acc.withdraw (withdrawAmount);
        System.out.println("enter annual intrest rate");
        double intrestRate= in.nextDouble();
        acc.ApplyIntrest(intrestRate);
        acc.Displaydetails();
        in.close();

    }
}
