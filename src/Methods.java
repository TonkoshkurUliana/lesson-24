import java.util.Scanner;

public class Methods {

    public static Time getTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour:  ");
        int hour = scanner.nextInt();
        System.out.print("Min: ");
        int min = scanner.nextInt();
        Time time = new Time(hour, min);
        return time;
    }

    public static Movie getMovie() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input film name:  ");
        String title = scanner.nextLine();
        System.out.println("\nFilm duration: ");
        Time duration = getTime();
        Movie movie = new Movie(title, duration);
        return movie;
    }

    public static Seance getSeance() {
        Scanner scanner = new Scanner(System.in);
        Movie movie = getMovie();
        System.out.println("\nInput seance start time ");
        Time timeStart = getTime();
        Seance seance = new Seance(movie, timeStart);
        return seance;
    }
}
