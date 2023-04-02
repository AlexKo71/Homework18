import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Abc_1f", "Abc1");
        System.out.println("Подтвердите пароль:");
        Scanner keyboard = new Scanner(System.in);
        String confirmPassword = keyboard.next();
        Checking.checkCharacters(account.getLogin(), account.getPassword(), confirmPassword);
        keyboard.close();
    }
}
