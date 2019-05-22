package movies;

import util.Input;

import java.util.Arrays;
import java.util.List;

public class MoviesApplication {

    private static Input input = new Input();
    private static List<Movie> movies = Arrays.asList(MoviesArray.findAll());

    public static void main(String[] args) {

        do {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("2 - View movies in the 'Animated' category");
            System.out.println("3 - View movies in the 'Drama' category");
            System.out.println("4 - View movies in the 'Horror' category");
            System.out.println("5 - View movies in the 'Sci-fi' category");

            System.out.println("Select: ");
            int option = input.getInt(0, 5);

            switch (option) {

                case 0:
                    System.out.println("Goodbye");
                    return;

                case 1:
                    for (Movie movie : movies)
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;

                case 2:

                    for (Movie movie : movies)
                        if ("animated".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;

                case 3:
                    for (Movie movie : movies)
                        if ("drama".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;

                case 4:
                    for (Movie movie : movies)
                        if ("horror".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;

                case 5:
                    for (Movie movie : movies)
                        if ("scifi".equals(movie.getCategory()))
                            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    break;

                default:
                    System.err.println("Not an option");
            }
            System.out.print("Continue?");
        } while (input.yesNo(true));
    }
}
