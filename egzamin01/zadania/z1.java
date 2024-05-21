import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fst;
        do {
            System.out.println("Podaj pierwszą liczbę\n");
            fst = scan.nextDouble();
        }
        while (fst == 0);
        double sec;
        do {
            System.out.println("Podaj drugą liczbę\n");
            sec = scan.nextDouble();
        }while(sec==0);
        double dzielenie = fst / sec;
        System.out.println("Dzielenie tych liczb wynosi: " + dzielenie);
    }
}