package o;

public class appxrpc extends initWithSecurityGuard {
    private boolean campaignUpdated;
    private String howToUrl;
    private String referralCode;
    private getUserInfo referredCampaignInfo;
    private getUserInfo referrerCampaignInfo;

    public String getHowToUrl() {
        return this.howToUrl;
    }

    public void setHowToUrl(String str) {
        this.howToUrl = str;
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public void setReferralCode(String str) {
        this.referralCode = str;
    }

    public getUserInfo getReferrerCampaignInfo() {
        return this.referrerCampaignInfo;
    }

    public void setReferrerCampaignInfo(getUserInfo getuserinfo) {
        this.referrerCampaignInfo = getuserinfo;
    }

    public getUserInfo getReferredCampaignInfo() {
        return this.referredCampaignInfo;
    }

    public void setReferredCampaignInfo(getUserInfo getuserinfo) {
        this.referredCampaignInfo = getuserinfo;
    }

    public boolean isCampaignEnable() {
        return getReferrerCampaignInfo() != null && getReferrerCampaignInfo().isCampaignEnabled();
    }

    public boolean isCampaignUpdated() {
        return this.campaignUpdated;
    }

    public void setCampaignUpdated(boolean z) {
        this.campaignUpdated = z;
    }
}
