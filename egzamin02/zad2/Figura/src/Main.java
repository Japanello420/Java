abstract class Figura{
    int[] krawedzie;

    Figura(int[] krawedzie){
        this.krawedzie=krawedzie;
    }
    abstract int wyjatek();
    abstract double Pole();
    abstract int SumaKrawedzi();
}
class Figura2D extends Figura{
    Figura2D(int[] krawedzie){
        super(krawedzie);
    }
    double Pole(){
        return 0;
    }
    int SumaKrawedzi(){
        return 0;
    }
    int wyjatek() {
        return 0;
    }
}

class Figura3D extends Figura{
   Figura3D(int[] krawedzie){
       super(krawedzie);
   }
    double Pole() {
        return 0;
    }
    int SumaKrawedzi(){
       return 0;
    }
    double Objetosc(){
       return 0;
    }
    int wyjatek() {
        return 0;
    }
}

class Prostokat extends Figura2D{
    Prostokat(int x, int y){
        super(new int[]{x, y, x, y});
        if(x==0 || y==0){
            throw new IllegalArgumentException("Bok musi być większy od zera");
        }
    }
    double Pole(){
        return krawedzie[0]*krawedzie[1];
    }
    int SumaKrawedzi(){
        return 2*(krawedzie[0]+krawedzie[1]);
    }
}

class Kwadrat extends Figura2D{
    Kwadrat(int z){
        super(new int[]{z, z, z, z});
        if(z==0){
            throw new IllegalArgumentException("Bok musi być większy od zera");
        }
    }
    double Pole(){
        return krawedzie[0]*krawedzie[0];
    }
    int SumaKrawedzi() {
        return 4*krawedzie[0];
    }
}
class Prostopadloscian extends Figura3D{
    Prostopadloscian(int x, int y, int z){
        super(new int[]{x, y, z, x, y, z});
        if(x==0||y==0||z==0){
            throw new IllegalArgumentException("Bok musi być większy od zera");
        }
    }
    double Pole() {
        return 2*(krawedzie[0]*krawedzie[1]+krawedzie[0]*krawedzie[4]+krawedzie[1]*krawedzie[4]);
    }
    int SumaKrawedzi(){
        return 4*(krawedzie[0]+krawedzie[1]+krawedzie[2]);
    }
    double Objetosc(){
        return krawedzie[0]*krawedzie[1]*krawedzie[4];
    }
}

class Szescian extends Prostopadloscian{
    Szescian(int z){
        super(z, z, z);
        if(z==0){
            throw new IllegalArgumentException("Bok musi być większy od zera");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(3, 6);
        System.out.println("Pole prostokata: "+prostokat.Pole());
        System.out.println("Suma krawędzi prostokąta: "+prostokat.SumaKrawedzi());

        Kwadrat kwadrat = new Kwadrat(7);
        System.out.println("Pole kwadratu: "+kwadrat.Pole());
        System.out.println("Suma Krawedzi kwadratu: "+kwadrat.SumaKrawedzi());

        Prostopadloscian prostopadloscian = new Prostopadloscian(5, 6, 7);
        System.out.println("Pole prostopadłościanu: "+prostopadloscian.Pole());
        System.out.println("Suma krawedzi prostopadłościanu: "+prostopadloscian.SumaKrawedzi());
        System.out.println("Objętość prostopadłoscianu: "+prostopadloscian.Objetosc());

        Szescian szescian = new Szescian(10);
        System.out.println("Pole sześcianu: "+szescian.Pole());
        System.out.println("Suma krawedzi sześcianu: "+szescian.SumaKrawedzi());
        System.out.println("Objętość sześcianu: "+szescian.Objetosc());
        }
    }
