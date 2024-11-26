import java.io.File;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź nazwę pliku bez rozszerzenia");
        String fileName = scanner.nextLine();

        try {
            File file = new File("src/"+ fileName + ".txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (Exception e) {
            System.err.println("Nie znaleziono pliku");
        }
    }
}
