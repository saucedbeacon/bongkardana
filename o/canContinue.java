package o;

import java.io.Serializable;

public class canContinue implements Serializable {
    private String separator;
    private String token;

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String getSeparator() {
        return this.separator;
    }

    public void setSeparator(String str) {
        this.separator = str;
    }
}
