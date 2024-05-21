import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach Celsjusza");
        double cel = scan.nextDouble();
        double fahr = (9.0/5.0)*cel+32;
        System.out.println(cel+" celsjuszy równa się "+fahr+" fahrenhaitom");
    }
}