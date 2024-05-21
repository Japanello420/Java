import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj liczbe od 1 do 7\n");
    int dzien = scan.nextInt();
    if(dzien==1){
        System.out.println("poniedzialek");
    }else if(dzien==2){
        System.out.println("wtorek");
    }else if(dzien==3){
        System.out.println("środa");
    } else if (dzien == 4) {
        System.out.println("czwartek");
    }else if(dzien==5){
        System.out.println("piątek");
    }else if(dzien==6){
        System.out.println("sobota");
    } else if (dzien == 7) {
        System.out.println("niedziela");
    }else{
        System.out.println("nie dziala");
    }
    }
}