import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo một đối tượng AccountBank mới
        AccountBank account1 = new AccountBank();
        AccountBank account2 = new AccountBank();

        // Nhập thông tin cho tài khoản thứ nhất từ bàn phím
        System.out.print("Nhập số tài khoản cho tài khoản 1: ");
        account1.setAccountNumber(scanner.nextLine());
        System.out.print("Nhập tên chủ tài khoản cho tài khoản 1: ");
        account1.setAccountHolderName(scanner.nextLine());
        System.out.print("Nhập số dư ban đầu cho tài khoản 1: ");
        account1.setBalance(scanner.nextDouble());
        scanner.nextLine(); // clear the buffer

        // Nhập thông tin cho tài khoản thứ hai từ bàn phím
        System.out.print("Nhập số tài khoản cho tài khoản 2: ");
        account2.setAccountNumber(scanner.nextLine());
        System.out.print("Nhập tên chủ tài khoản cho tài khoản 2: ");
        account2.setAccountHolderName(scanner.nextLine());
        System.out.print("Nhập số dư ban đầu cho tài khoản 2: ");
        account2.setBalance(scanner.nextDouble());
        scanner.nextLine(); // clear the buffer

        // Hiển thị thông tin tài khoản ban đầu
        System.out.println("\nThông tin tài khoản ban đầu:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        // Thực hiện một loạt các giao dịch

        // Gửi tiền vào tài khoản thứ nhất
        System.out.print("\nNhập số tiền gửi vào tài khoản 1: ");
        double depositAmount = scanner.nextDouble();
        account1.deposits(depositAmount);
        account1.displayAccountInfo();

        // Rút tiền từ tài khoản thứ nhất
        System.out.print("\nNhập số tiền rút cho tài khoản 1: ");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);
        account1.displayAccountInfo();

        // Chuyển tiền từ tài khoản thứ nhất sang tài khoản thứ hai
        System.out.print("\nNhập số tiền chuyển từ tài khoản 1 sang tài khoản 2: ");
        double transferAmount = scanner.nextDouble();
        account1.transfer(account2, transferAmount);

        // Hiển thị thông tin tài khoản sau các giao dịch
        System.out.println("\nThông tin tài khoản sau khi giao dịch:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        scanner.close();
    }
}
