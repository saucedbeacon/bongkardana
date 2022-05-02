package id.dana.data.userconfig;

public class BiztypeTooLongException extends Exception {
    public BiztypeTooLongException() {
        super("bizType must not more than 35 character");
    }
}
