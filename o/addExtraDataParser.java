package o;

public class addExtraDataParser {
    boolean enable;
    String instId;
    String instLocalName;
    String key;
    String payMethod;
    String url;

    public addExtraDataParser() {
    }

    public addExtraDataParser(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.key = str;
        this.instId = str2;
        this.instLocalName = str3;
        this.payMethod = str4;
        this.url = str5;
        this.enable = z;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getInstId() {
        return this.instId;
    }

    public void setInstId(String str) {
        this.instId = str;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(String str) {
        this.payMethod = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String getInstLocalName() {
        return this.instLocalName;
    }

    public void setInstLocalName(String str) {
        this.instLocalName = str;
    }
}
