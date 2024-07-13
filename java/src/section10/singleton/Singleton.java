package section10.singleton;

public class Singleton {
    private Singleton() {

    }

    public static Singleton getNewInstancSingleton() {
        return new Singleton();
    }

    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
