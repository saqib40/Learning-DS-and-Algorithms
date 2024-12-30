package oops.singleton;

public class Singleton {
    private Singleton() {

    }

    public static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            return new Singleton();
        }
        return instance;
    }
}
