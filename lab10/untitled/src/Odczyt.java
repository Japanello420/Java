import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args){
        String nazwaPliku = "Z:\\java\\lab10\\untitled\\src\\Input";
        int suma = sumujCoDrugaLinie(nazwaPliku);

        if (suma != -1) {
            System.out.println("Suma co drugiej linijki w pliku "+nazwaPliku+" wynosi: " + suma);
        }
    }

    public static int sumujCoDrugaLinie(String nazwaPliku) {
        int suma = 0;
        try (Scanner scanner = new Scanner(new File(nazwaPliku))) {
            int numerSlowa = 0;
            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine().trim();
                String[] slowa = linia.split("\\s+");
                for(String slowo : slowa) {
                    numerSlowa++;
                    if(numerSlowa%2==0){
                        suma+=slowo.length();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik " + nazwaPliku + " nie został znaleziony.");
            return -1;
        }
        return suma;
    }
}

