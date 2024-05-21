import java.util.Arrays;

class Student implements Comparable<Student> {
    private String imie;
    private String nazwisko;
    private String numerIndeksu;

    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public int compareTo(Student o) {
        return this.numerIndeksu.compareTo(o.numerIndeksu);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerIndeksu='" + numerIndeksu + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy studentów
        Student[] students = new Student[5];
        students[0] = new Student("Jan", "Kowalski", "s52345");
        students[1] = new Student("Anna", "Nowak", "s23456");
        students[2] = new Student("Piotr", "Wiśniewski", "s14567");
        students[3] = new Student("Maria", "Kowalczyk", "s65678");
        students[4] = new Student("Tomasz", "Lewandowski", "s56789");

        // Sortowanie studentów według numeru indeksu
        Arrays.sort(students);

        // Wyświetlanie posortowanej tablicy studentów
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
