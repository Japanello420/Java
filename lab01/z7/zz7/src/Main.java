import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int r = 0;
        int fst = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int sec = scan.nextInt();
        while(sec!=0){
            r = fst%sec;
            fst=sec;
            sec=r;
        }
        System.out.println("Największy wspólny dzielnik wynosi "+fst);
    }
}