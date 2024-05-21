import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj promień\n");
        double promien = scan.nextInt();
        double pole = (promien*promien)*Math.PI;
        double obwod = 2*promien*Math.PI;
        System.out.println("Obwód wynosi: "+obwod);
        System.out.println("Pole wynosi: "+pole);
        }
    }