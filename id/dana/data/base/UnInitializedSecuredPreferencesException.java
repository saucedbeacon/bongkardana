package id.dana.data.base;

public class UnInitializedSecuredPreferencesException extends Exception {
    public UnInitializedSecuredPreferencesException() {
        super("Secured Preferences has not been initialized");
    }
}
