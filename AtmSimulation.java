import java.util.Scanner;
class AnyTimeMoney {
        private double balance;

        public AnyTimeMoney(double initialBalance) {
        this.balance = initialBalance;
       }
        public void checkbal() {
        System.out.println("Your Current Account Balance Is : $" + balance);
       }
        public void deposit(double amount) {
            balance += amount;
        System.out.println("You Have Successfully Deposited : $" + amount);
        System.out.println("Your New Balance Is : $" + balance);
       }
        public void withdraw(double amount) {
            if(amount>balance){
                System.out.println("Insufficient balance...!!\nPlease Enter Valid Amount !!!\n");
            }
            else{
                balance-=amount;
                System.out.println("!!!...Thank You...!!!");
            System.out.println("Transaction Successfully Done.!!");
            System.out.println("Your Remaining Balance is : $" + balance);
        }
        }
    }
    public class AtmSimulation {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    AnyTimeMoney Atm = new AnyTimeMoney(50000);
    boolean end = false;

    while (!end) { 
    System.out.println("==============================ATM=SERVICE============================\n");
    System.out.print("Which Operation Do You Wish to Perform ?\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit\n");
    System.out.print("Enter Your Choice : ");

    int a = sc.nextInt();

    switch(a) {
        case 1:
            System.out.println("Enter Amount To Deposit : ");
            double b = sc.nextDouble();
            Atm.deposit(b);
            break;
        
        case 2 :
            System.out.println("Enter The Withdrawal Amount : ");
            double c = sc.nextDouble();
            Atm.withdraw(c);
            break;

        case 3:
            Atm.checkbal();
            break;

        case 4:
        end = true;
        System.out.println("!!!...Thank You...!!!");
        break;
            
        default:
            System.out.println("Invalid Input..!! Try Again...!!!\n");
            continue;
        }
      }
      sc.close();
    }
}