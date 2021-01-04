package banking;

public class Transaction {
    public Transaction(){

    }
    public void startBanking(){

        Account harun=new Account("Harun","01723823848",5000,"1330");
        Account shimul=new Account("Shimul","01838438299",9000,"1001");
        System.out.println("First transaction::\n ");
        harun.cashIn(4000);
        harun.cashOut(1200,"1330");
        System.out.println("Holder name:: "+harun.getHolderName());
        System.out.println("Cell no:: "+harun.getCellNo());
        System.out.println("Balance:: "+harun.getBalance());
        harun.updatePin("1330","2454");

        System.out.println("\n\nSecond transaction::\n ");
        shimul.cashIn(5000);
        shimul.cashOut(9000,"1001");
        System.out.println("Holder name:: "+shimul.getHolderName());
        System.out.println("Cell no:: "+shimul.getCellNo());
        System.out.println("Balance:: "+shimul.getBalance());
        shimul.updatePin("1009","7888");

    }

}
