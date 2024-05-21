import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz do odwrócenia");
        String wyraz = input.nextLine();
        String wyraz2 = new StringBuilder().append(wyraz).reverse().toString();
        System.out.println(wyraz);
        System.out.println(wyraz2);
    }
}