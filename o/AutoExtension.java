package o;

public class AutoExtension {
    private String label;
    private String redirectUrl;
    private String type;

    public AutoExtension(String str, String str2, String str3) {
        this.label = str;
        this.redirectUrl = str2;
        this.type = str3;
    }

    public AutoExtension() {
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
