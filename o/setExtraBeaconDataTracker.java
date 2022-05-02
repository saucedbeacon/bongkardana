package o;

public class setExtraBeaconDataTracker {
    private String fundAmount;
    private String imageUrl;
    private String loginId;
    private String name;
    private String shownName;
    private String shownNumber;
    private String status;
    private String userId;

    public setExtraBeaconDataTracker() {
    }

    public setExtraBeaconDataTracker(String str) {
        this.imageUrl = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getFundAmount() {
        return this.fundAmount;
    }

    public void setFundAmount(String str) {
        this.fundAmount = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String str) {
        this.loginId = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getShownName() {
        return this.shownName;
    }

    public void setShownName(String str) {
        this.shownName = str;
    }

    public String getShownNumber() {
        return this.shownNumber;
    }

    public void setShownNumber(String str) {
        this.shownNumber = str;
    }
}
