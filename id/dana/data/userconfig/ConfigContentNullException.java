package id.dana.data.userconfig;

public class ConfigContentNullException extends Exception {
    public ConfigContentNullException() {
        super("Config content must not be null");
    }
}
