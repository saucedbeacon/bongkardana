package o;

public class getSDKVerison {
    private String config;
    private String treatment;

    public getSDKVerison(String str, String str2) {
        this.treatment = str;
        this.config = str2;
    }

    public getSDKVerison(String str) {
        this(str, (String) null);
    }

    public String treatment() {
        return this.treatment;
    }

    public String config() {
        return this.config;
    }
}
