package id.dana.data.userconfig;

public class BiztypeEmptyException extends Exception {
    public BiztypeEmptyException() {
        super("Biztype must not be null or empty");
    }
}
