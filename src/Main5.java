import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź nazwę pliku bez rozszerzenia");
        String fileName = scanner.nextLine();

        File file = new File("src/" + fileName + ".txt");
        try (Scanner fileScanner = new Scanner(file)) {

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

        }catch (FileNotFoundException e){
            System.err.println("Nie znaleziono pliku" + e.getMessage());

        } catch (Exception e) {
            System.err.println("Nieoczekiwany błąd");
        }
    }
}
