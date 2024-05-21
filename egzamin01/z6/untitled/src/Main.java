import java.util.Scanner;
import java.util.Random;

public class Main {

    public static boolean MODULO(int table [], int rozmiar){
        int suma = 0;
        boolean wynik;
        for(int i=0; i<rozmiar; i++){
            suma=suma+table[i];
        }
        if(suma%5==0){
            wynik=true;
        }else{
            wynik=false;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int rozmiar = scan.nextInt();
        int[] table = new int[rozmiar];

        for(int i=0; i<rozmiar; i++){
            Random liczba = new Random();
            table[i]=liczba.nextInt(101);
            System.out.println(table[i]);
        }
        System.out.println(MODULO(table, rozmiar));

    }
}