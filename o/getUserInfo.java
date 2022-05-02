package o;

public class getUserInfo {
    private boolean campaignEnabled;
    private String campaignId;
    private stopBleScan prizeAmount;
    private String prizeName;

    public boolean isCampaignEnabled() {
        return this.campaignEnabled;
    }

    public void setCampaignEnabled(boolean z) {
        this.campaignEnabled = z;
    }

    public stopBleScan getPrizeAmount() {
        return this.prizeAmount;
    }

    public void setPrizeAmount(stopBleScan stopblescan) {
        this.prizeAmount = stopblescan;
    }

    public String getPrizeName() {
        return this.prizeName;
    }

    public void setPrizeName(String str) {
        this.prizeName = str;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(String str) {
        this.campaignId = str;
    }
}
