import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {

            try {
                System.out.println("Wprowadź index tablicy");
                int index = scanner.nextInt();
                System.out.println("Wprowadź liczbę");
                numbers[index] = scanner.nextInt();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indeks tablicy musi sie zawierać pomiędzy 0 a 9 włącznie");
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowy typ danych");
                System.out.println(e.getMessage());
            }

        }
        for (double number : numbers) {
            System.out.print(number + ", ");
        }

    }
}
