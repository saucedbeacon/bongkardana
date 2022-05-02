package o;

public class onConfigChanged {
    private boolean govFlag;
    private String level;
    private String orderStatus;
    private String tncUrl;
    private boolean userQuits;

    public String getTncUrl() {
        return this.tncUrl;
    }

    public void setTncUrl(String str) {
        this.tncUrl = str;
    }

    public boolean isUserQuits() {
        return this.userQuits;
    }

    public void setUserQuits(boolean z) {
        this.userQuits = z;
    }

    public boolean isGovFlag() {
        return this.govFlag;
    }

    public void setGovFlag(boolean z) {
        this.govFlag = z;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String str) {
        this.orderStatus = str;
    }

    public boolean hasKyc() {
        return "KYC2".equalsIgnoreCase(this.level);
    }
}
