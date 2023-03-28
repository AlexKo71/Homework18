
public class Checking {
    public static void checkCharacters(String login, String password, String confirmPassword) {
        try {
            checkAbc(login);
            if (login.length() >= 20) {
                throw new WrongLoginException();
            }
            checkAbc1(password);
            if (password.length() > 20) {
                throw new WrongPasswordException();
            }
            if (confirmPassword.equals(password)) {
                System.out.println("Вход в систему выполнен");
            } else {
                System.out.println("Неверный пароль");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Данные не удовлетворяют условиям");
        }

    }

    public static void checkAbc(String abc) {
        String abc1 = abc.toLowerCase();
        for (int i = 0; i < abc1.length(); i++) {
            char c = abc1.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_') {
                continue;
            }
            throw new WrongLoginException();
        }
    }

    public static void checkAbc1(String abc) {
        if (!abc.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException();
        }
    }
}








