package ex_19_OOPs_Part_2.Encapsulation;

public class Lab_166_Real_Example_Encapsulation {
    public static void main(String[] args) {
        Bank Shailesh = new Bank("Shailesh",1000,"ICICI_Bank");
        System.out.println(Shailesh.getName());
        Shailesh.setBalance(50000,true);
        System.out.println(Shailesh.getBalance());
        System.out.println(Shailesh.Bank_Name);
    }
}

class Bank {
    // Define the data types//
    private String name;
    private long balance;
    String Bank_Name;

    // Create Constructor //


    public Bank(String name, long balance, String bank_Name) {
        this.name = name;
        this.balance = balance;
        Bank_Name = bank_Name;
    }

    // Generate Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean Cashier) {
        if (Cashier) {
            this.balance = balance;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }
}