package banking;

public class Account {
    private String holderName;
    private String cellNo;
    private double balance;
    private String pin;

    public Account(String name,String number,double amount,String pin){
        this.holderName=name;
        this.cellNo=number;
        this.balance=amount;
        this.pin=pin;
    }
    public void cashIn(double amount){
        this.balance+=amount;
        System.out.println("Cash In amount:: "+amount);
    }
    public void cashOut(double amount,String myPin) {
        if (myPin != this.pin) {
            System.out.println("Pin doesn't match :(");
        } else {
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Cash out amount:: " + amount);
            } else {
                System.out.println("Transaction failed due to insufficient balance :(");
            }
        }
    }
    public void updatePin(String oldPin,String newPin){
        if(oldPin==this.pin){
            this.pin=newPin;
            System.out.println("Pin update successful :)");
        }
        else{
            System.out.println("Pin update unsuccessful.Access denied :(");
        }
    }
    public String getHolderName(){
        return this.holderName;
    }
    public String getCellNo(){
        return this.cellNo;
    }

    public double getBalance() {
        return this.balance;
    }
}
