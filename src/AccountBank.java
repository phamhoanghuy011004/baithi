public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public AccountBank(){
        this.accountNumber = "unknow";
        this.accountHolderName = "unknow";
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo(){
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Tên Chủ Tài khoản: " + accountHolderName);
        System.out.println("Số dư tài khoản: " + balance);
    }
    //gui tien vao tai khoan
    public void deposits(double quantity){
        if(quantity > 0) {
            this.balance += quantity;
            System.out.println("Số tiền gửi: " + quantity);
        }else{
            System.out.println("Số tiền gửi không hợp lệ");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Số tiền rút: " + amount);
        } else {
            System.out.println("Số dư không hợp lệ hoặc không đủ để rút tiền");
        }
    }

    // Phương thức chuyển tiền từ tài khoản này sang tài khoản khác
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            destinationAccount.deposits(amount);
            System.out.println("Chuyển số tiền  " + amount + " đến số tài khoản " + destinationAccount.getAccountNumber());
        } else {
            System.out.println("Số tiền không hợp lệ hoặc số dư không đủ");
        }
    }
}
