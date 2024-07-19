package section11.interface_case;

public interface RemoteControl {
    public static final int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    public abstract void turnOn();

    void turnOff(); // public abstract 생략가능

    default void userGuide() {
        System.out.println("Welcome!");
    }
}
