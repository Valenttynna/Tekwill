public class Main {
    public static void main(String[] args) {

//Calling instance methods:
// To call an instance method, you need to create an object of the class
// instance named box
        Box box = new Box(10,11,12);

        System.out.println("Volume: "+ box.getVolume());
    }
}
