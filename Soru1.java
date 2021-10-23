import java.util.regex.Pattern;

public class Soru1 {

    private static final String COMPLEXITY = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[^/ ]{6,18}$";
    private static final String SUCCESS = "Geçerli şifre";
    private static final String FAIL = "Hatalı şifre, tekrar deneyin";

    public static String validatePassword(String input) {
        return Pattern.matches(COMPLEXITY, input) ? SUCCESS : FAIL;
    }

    protected static void checkPassword(String input) {
        System.out.printf("%-18s -> %s%n", input, validatePassword(input));
    }

    public static void main(String[] args) {
        checkPassword("Hello World0");
        checkPassword("Gecerli1");
        checkPassword("gecersiz1");
        checkPassword("Gece1");
        checkPassword("Gecersiz1/");
        checkPassword("Gecersiz 1");
    }
}
