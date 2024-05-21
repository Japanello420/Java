import java.util.Scanner;
class StringUtils {
    public static String odwrocString(String tekst) {
        if (tekst.isEmpty()) {
            throw new IllegalArgumentException("String jest pusty");
        }
        return new StringBuilder(tekst).reverse().toString();
    }
    public static String Cezar(String tekst, int przesuniecie) {
        if (tekst.isEmpty()) {
            throw new IllegalArgumentException("String jest pusty");
        }
        StringBuilder zaszyfrowanyTekst = new StringBuilder();
        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) {
                char start = Character.isUpperCase(znak) ? 'A' : 'a';
                zaszyfrowanyTekst.append((char) (((znak - start + przesuniecie) % 26) + start));
            } else {
                zaszyfrowanyTekst.append(znak);
            }
        }
        return zaszyfrowanyTekst.toString();
    }
    public static String MaleLitery(String tekst) {
        if (tekst.isEmpty()) {
            throw new IllegalArgumentException("String jest pusty");
        }
        return tekst.toLowerCase();
    }
    public static String DuzeLitery(String tekst) {
        if (tekst.isEmpty()) {
            throw new IllegalArgumentException("String jest pusty");
        }
        return tekst.toUpperCase();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        int wybor;
        int przesuniecie;

        do {
            System.out.println("Menu:");
            System.out.println("1. Odwróć string");
            System.out.println("2. Szyfruj string szyfrem Cezara");
            System.out.println("3. Zamień string na małe litery");
            System.out.println("4. Zamień string na duże litery");
            System.out.println("0. Wyjdź z programu");
            System.out.print("Wybierz opcję: ");
            wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj string do odwrócenia: ");
                    tekst = scanner.nextLine();
                    try {
                        System.out.println("Odwrocony string: " + StringUtils.odwrocString(tekst));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Podaj string do zaszyfrowania: ");
                    tekst = scanner.nextLine();
                    System.out.print("Podaj przesunięcie (liczba całkowita): ");
                    przesuniecie = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        System.out.println("Zaszyfrowany string: " + StringUtils.Cezar(tekst, przesuniecie));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Podaj string do zamiany na małe litery: ");
                    tekst = scanner.nextLine();
                    try {
                        System.out.println("String zamieniony na małe litery: " + StringUtils.MaleLitery(tekst));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Podaj string do zamiany na duże litery: ");
                    tekst = scanner.nextLine();
                    try {
                        System.out.println("String zamieniony na duże litery: " + StringUtils.DuzeLitery(tekst));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Wybierz opcję od 0 do 4.");
            }
        } while (wybor != 0);
        scanner.close();
    }
}