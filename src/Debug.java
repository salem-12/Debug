import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Debug{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Year of birth?");
        int year = sc.nextInt();
        System.out.println("Month of birth?");
        int month = sc.nextInt();
        System.out.println("Day of birth?");
        int day = sc.nextInt();

        LocalDate current = LocalDate.now();
        LocalDate born = LocalDate.of(year, month, day);
        long years = ChronoUnit.YEARS.between(born, current);

        System.out.printf("%s is %d years old", name, years);
    }
}