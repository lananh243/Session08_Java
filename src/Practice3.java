import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, password;

        String emailRegex = "^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,6}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!&*]).{8,}$";

        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine();
            if (email.matches(emailRegex)) break;
            System.out.println("Email không hợp lệ! Nhập lại.");
        }

        while (true) {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();
            if (password.matches(passwordRegex)) break;
            System.out.println("Mật khẩu không hợp lệ! Nhập lại.");
        }

        System.out.println("Email và mật khẩu hợp lệ!");
    }
}
