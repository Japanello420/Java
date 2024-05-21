import java.util.Scanner;

public class Main {
    public static int MIN(int table[]){
        return table[0];
    }
    public static int MAX(int table[], int rozmiar){
        return table[rozmiar-1];
    }
    public static int SUMA( int table[], int rozmiar){
        int suma=0;
        for(int i=0; i<rozmiar; i++){
            suma=suma+table[i];
        }
        return  suma;
    }
    public static int AVG(int table[], int rozmiar){
        int avg=SUMA(table, rozmiar)/rozmiar;
        return avg;
    }
    public static int MEDIANA(int table[], int rozmiar){
        int mediana=0;
        if(rozmiar%2==0){
            mediana=(table[rozmiar/2]+table[(rozmiar/2)+1])/2;
        }else{
            mediana=table[rozmiar/2];
        }
        return mediana;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int rozmiar = scan.nextInt();
        int[] table = new int[rozmiar];
        System.out.println("Podaj pierwsza liczbe tablicy");
        table[0]=scan.nextInt();
        if(table[0]%2==0){
            for(int i=1; i<rozmiar; i++){
                table[i]=table[i-1]+2;
            }
        }else{
            table[1]=table[0]+1;
            for(int i=2; i<rozmiar; i++){
                table[i]=table[i-1]+2;
            }
        }

        for(int i=0; i<rozmiar; i++){
            System.out.println(table[i]+" ");
        }
        System.out.println("Najmniejsza liczba tablicy to: "+MIN(table));
        System.out.println("Największa liczba w  tablicy to: "+MAX(table, rozmiar));
        System.out.println("Suma liczb tablicy wynosi: "+SUMA(table,rozmiar));
        System.out.println("Średnia liczb tablicy wynosi: "+AVG(table,rozmiar));
        System.out.println("Mediana tablicy wynosi: "+MEDIANA(table,rozmiar));
    }
}