package o;

public class mkdirs {
    private String failedReason;
    private String govFlag;
    private String level;
    private String orderStatus;
    private String tncUrl;
    private boolean userQuits;

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

    public String getFailedReason() {
        return this.failedReason;
    }

    public void setFailedReason(String str) {
        this.failedReason = str;
    }

    public String getGovFlag() {
        return this.govFlag;
    }

    public void setGovFlag(String str) {
        this.govFlag = str;
    }

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
}
