public class Box {
    double height;
    double width;
    double length;

// constructor with assigned parameters / arguments
    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
//Create an instance method to calculate the volume of the box
// it should take no arguments and return a double results
    public double getVolume(){
        return height*width*length;
    }
}
