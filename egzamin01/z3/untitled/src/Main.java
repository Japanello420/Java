import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe x");
        int x = scan.nextInt();
        System.out.println("Podaj liczbe y");
        int y = scan.nextInt();
        System.out.println(COMPARE(x,y));
    }

    public static int COMPARE( int x, int y){
        int z;
        if(x<y){
            z=1;
        }else if(x==y){
            z=0;
        }else{
            z=-1;
        }
        return z;
    }
}