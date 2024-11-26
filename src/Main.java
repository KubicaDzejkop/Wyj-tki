import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();

        try {
            int result = no1 / no2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Błąd dzielenia przez zero");
            System.out.println(Arrays.toString(e.getStackTrace()));
//            e.getStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Dalsza część programu");

        int a = scanner.nextInt();
        System.out.println(a);
    }
}