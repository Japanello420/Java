import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] table = new int[5];
        for(int i=0; i<5; i++) {
            System.out.println("Podaj "+(i+1)+" element tablicy");
            table[i]= scan.nextInt();
        }
        System.out.println("Tablica przed mnożeniem");;
        for(int i=0; i<5; i++){
            System.out.println(table[i]+" ");
        }
        System.out.println("Tablica pomnożona przez 3");
        for(int i=0; i<5; i++){
            System.out.println(table[i]*3+" ");
        }
    }
}
