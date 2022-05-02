package o;

public class getMD5Base64 {
    private String scopeDescription;
    private String scopeName;

    public getMD5Base64() {
    }

    public getMD5Base64(String str, String str2) {
        this.scopeName = str;
        this.scopeDescription = str2;
    }

    public String getScopeName() {
        return this.scopeName;
    }

    public void setScopeName(String str) {
        this.scopeName = str;
    }

    public String getScopeDescription() {
        return this.scopeDescription;
    }

    public void setScopeDescription(String str) {
        this.scopeDescription = str;
    }
}
