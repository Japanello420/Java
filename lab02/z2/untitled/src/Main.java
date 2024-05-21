import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int x = scan.nextInt();
        int[] table = new int [x];
        for(int i=0; i<x; i++){
            System.out.println("Podaj "+(i+1)+" element");
            table[i] = scan.nextInt();
        }
        for(int i=(x-1); i>=0; i--){
            System.out.println(table[i]+" ");
        }
    }
}