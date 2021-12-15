package zheng;

import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question4 {

//    public static TreeNode createTree(int[] inorder, int[] levelOrder) {
//
//    }

    public static void main(String[] args) {
        List<String> actors1 = new ArrayList<>();
        actors1.add("joe");
        actors1.add("djoe");

        Date date = new GregorianCalendar(1980, Calendar.FEBRUARY, 11).getTime();
        Movie movie1 = new Movie("code",date, actors1,"direc");

        List<String> actors2 = new ArrayList<>();
        actors2.add("vcxv");
        actors2.add("djozxcvce");

        Date date2 = new GregorianCalendar(2021, Calendar.FEBRUARY, 11).getTime();
        Movie movie2 = new Movie("love",date2, actors2,"direc 2");

        List<String> actors3 = new ArrayList<>();
        actors3.add("cvcx");
        actors3.add("dbvbjoe");

        Date date3 = new GregorianCalendar(1995, Calendar.FEBRUARY, 11).getTime();
        Movie movie3 = new Movie("peace",date3, actors3,"direc 3");

        List<String> actors4 = new ArrayList<>();
        actors3.add("444");
        actors3.add("44466");

        Date date4 = new GregorianCalendar(1888, Calendar.FEBRUARY, 11).getTime();
        Movie movie4 = new Movie("peace",date4, actors4,"direc 3");

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        Genre genre = new Genre(movies);
        List<Genre> netflix = new ArrayList<>();
        Netflix netflixObj = new Netflix(netflix);

//        For all movies released before 2000, add the string "(Classic)" to the title of the movie using
//        flatMap.
        Date date2000 = new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime();


        for(Movie sd : movies){
            if(sd.getDate().before(date2000)){
                sd.setTitle(sd.getTitle() + "(Classic)");
            }
            System.out.println(sd.getTitle());
        }

//        Get the latest 3 movies released using .limit() method of stream.

        ArrayList<Movie> movies3 = (ArrayList<Movie>) movies.stream()
                .sorted( ( st1, st2) ->  st2.getDate().compareTo(st1.getDate())).limit(3)
                .collect(Collectors.toList());

        for(Movie m : movies3){
            System.out.println(m.getDate());
        }

//        Create a predicate for release date before 2000 and a predicate for release date after 1990
//        and then Chain the predicates for finding movies between 1990 and 2000.

//        Date date2000 = new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime();
        Date date1990 = new GregorianCalendar(1990, Calendar.FEBRUARY, 11).getTime();
        Predicate<Movie> before2000 = m -> m.getDate().compareTo(date2000) < 0;
        Predicate<Movie> after1990 = m -> m.getDate().compareTo(date1990) > 0;

        boolean test = before2000.and(after1990).test(movie3);
        System.out.println(test);


//        Write a method which that will add release year in the title of the movie and return the title and
//        then use this method for all the movies.
        for(Movie m : movies){
            System.out.println(m.addReleaseYear());
        }

//      Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getDate().compareTo(m2.getDate());
            }
        });
        for(Movie m : movies){
            System.out.println(m.getDate());
        }
    }

}
