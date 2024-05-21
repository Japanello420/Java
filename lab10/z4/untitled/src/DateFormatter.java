import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie formatu daty od użytkownika
        System.out.print("Podaj format daty (np. yyyy-MM-dd HH:mm:ss): ");
        String dateFormat = scanner.nextLine();

        try {
            // Tworzenie obiektu DateTimeFormatter na podstawie podanego formatu
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

            // Pobieranie bieżącej daty i godziny
            LocalDateTime now = LocalDateTime.now();

            // Formatowanie i wyświetlanie daty i/lub godziny
            String formattedDate = now.format(formatter);
            System.out.println("Bieżąca data i/lub godzina: " + formattedDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Podany format daty jest nieprawidłowy. Użyj poprawnego formatu.");
        } finally {
            scanner.close();
        }
    }
}
