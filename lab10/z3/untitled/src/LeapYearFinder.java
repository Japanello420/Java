import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class LeapYearFinder {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        List<Integer> leapYears = getNext100LeapYears(currentYear);

        System.out.println("The next 100 leap years are:");
        for (int year : leapYears) {
            System.out.println(year);
        }
    }

    private static List<Integer> getNext100LeapYears(int startYear) {
        List<Integer> leapYears = new ArrayList<>();
        int year = startYear;

        while (leapYears.size() < 100) {
            if (Year.isLeap(year)) {
                leapYears.add(year);
            }
            year++;
        }

        return leapYears;
    }
}
