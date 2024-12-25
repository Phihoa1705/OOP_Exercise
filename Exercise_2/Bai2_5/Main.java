package OOP_Ex.Exercise_2.Bai2_5;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(12,"Hòa",'M');
        Account account = new Account(21,customer,3000000);

        System.out.println("Customer: " + customer);
        System.out.println("Account: " + account);

        account.deposit(5000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(3000000);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}
