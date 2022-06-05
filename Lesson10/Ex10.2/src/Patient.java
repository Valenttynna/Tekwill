//Here's a class named Patient. It has one string field name. You want to create a
//        method that would allow your patient to call for a doctor. Add the method say that
//        prints the message containing the name of a patient (instead of "...") and their
//        request for a doctor: Hello, my name is ..., I need a doctor.
//        This method doesn't take any parameters and doesn't return anything.
//class Patient {
//    String name;
//// write your code below
//}
public class Patient {
    private static String name;
    private static String[] names = new String[10];

    public Patient(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Hello, my name is " + name + ", I need a doctor.");
    }
}
