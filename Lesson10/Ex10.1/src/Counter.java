//You are given a class named Counter. Write two instance methods:
//        ● inc that increases the value of the field current by one;
//        ● getCurrent that returns the current value;
//class Counter {
//    int current;
//// write your code below
//}
public class Counter {
    private int current;

    public Counter(int current) {
        this.current = current;
    }

    public void inc() {
        current++;
    }

    public int getCurrent() {
        return current;
    }

}
