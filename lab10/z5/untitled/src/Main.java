import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = {
                new Prostokat(5, 10),
                new Kolo(7),
                new Trojkat(6, 8, 5, 7, 9)
        };

        Arrays.sort(figury);

        for (Figura figura : figury) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Pole: " + figura.obliczPole());
            System.out.println("Obwód: " + figura.obliczObwod());
            System.out.println();
        }
    }
}

interface Figura extends Comparable<Figura>{
    double obliczPole();
    double obliczObwod();
}

class Prostokat implements Figura {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    @Override
    public double obliczPole() {
        return dlugosc * szerokosc;
    }

    @Override
    public double obliczObwod() {
        return 2 * (dlugosc + szerokosc);
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.obliczPole(), o.obliczPole());
    }
}

class Kolo implements Figura {
    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPole() {
        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.obliczPole(), o.obliczPole());
    }
}

class Trojkat implements Figura {
    private double podstawa;
    private double wysokosc;
    private double bokA;
    private double bokB;
    private double bokC;

    public Trojkat(double podstawa, double wysokosc, double bokA, double bokB, double bokC) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    @Override
    public double obliczPole() {
        return 0.5 * podstawa * wysokosc;
    }

    @Override
    public double obliczObwod() {
        return bokA + bokB + bokC;
    }

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.obliczPole(), o.obliczPole());
    }
}
