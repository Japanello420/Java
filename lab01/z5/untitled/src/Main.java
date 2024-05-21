import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy\n");
        int rozmiar = scan.nextInt();
        int[] table = new int[rozmiar];
        for(int i=0; i<rozmiar; i++){
            System.out.println("Podaj "+(i+1)+" element tablicy");
            table[i]=scan.nextInt();
        }
        for(int i=0; i<rozmiar; i++){
            System.out.println(table[i]+" ");
        }
    }
}