import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList <TvShow> tvShows = new ArrayList <TvShow> ();
        while (true) {
            System.out.println("Enter a show name, number of episodes, and the genre: ");
            System.out.println("Entering nothing will stop the loop: ");
            System.out.println("Name of the show: ");
            String name = in.nextLine();
            if (name.isBlank()) {
                break;
            }
            System.out.println("How many episodes?");
            int numOfEpisodes = Integer.parseInt(in.nextLine());

            System.out.println("What is the genre?");
            String genre = in.nextLine();

            TvShow input = new TvShow(name, numOfEpisodes, genre);
            tvShows.add(input);
        }
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i).toString());
        }
        in.close();
    }
}