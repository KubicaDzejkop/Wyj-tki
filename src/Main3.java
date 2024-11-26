import java.util.Scanner;

public class Main3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = loadNumber();
        System.out.println(a);
    }

    public static int loadNumber() {
        try {
            System.out.println("Podaj liczbę całkowitą");
            String str = scanner.nextLine();
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("Wprowadzileś nie liczbe");
            return loadNumber();
        } catch (Exception e) {
            System.out.println("Pojawił się niewyjaśniony błąd");
            return loadNumber();
        }

    }
}
