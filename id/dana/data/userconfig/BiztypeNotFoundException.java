package id.dana.data.userconfig;

public class BiztypeNotFoundException extends Exception {
    public BiztypeNotFoundException() {
        super("User config not found both in local & backend");
    }
}
