public class Movie {
    String title;
    String desc;
    int year;

// 1. write 2 constructors here
    // sau click sus: Code > Generate > Constructor
    public Movie(String t, String d, int y) {
        this.title = t;
        this.desc = d;
        this.year = y;
    }
    public Movie(String t, int y) {
        this.title = t;
        this.desc = "Empty";
        this.year = y;

//        this(t, y);
//        this.desc = "Empty";

//        this(t, "Empty", y); // apelarea in interiorul altui constructor


    }
}
