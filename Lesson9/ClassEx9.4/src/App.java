// 2. Creating instances
public class App {
    public static void main(String[] args) {
        Movie m1 = new Movie ("Movie title1", "Movie desc1" , 2001);
        Movie m2 = new Movie ("Movie title1", "Movie desc2" , 2002);

// 4 Call the method printMovie
     printMovie( m1 );
     printMovie( m2 );
    }

// 3. Method for printing
public static void printMovie (Movie movie) {
    System.out.println("Movie:" + movie.title + " has description \"" + movie.desc + "\"is from" + movie.year);

}
}
