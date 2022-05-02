package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import o.RVProxy;

public class doInitialize extends BaseRpcResult {
    private boolean campaignUpdated;
    private String howToUrl;
    private String referralCode;
    private RVProxy.Printer referredCampaignInfo;
    private RVProxy.Printer referrerCampaignInfo;

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

    public RVProxy.Printer getReferredCampaignInfo() {
        return this.referredCampaignInfo;
    }

    public void setReferredCampaignInfo(RVProxy.Printer printer) {
        this.referredCampaignInfo = printer;
    }

    public RVProxy.Printer getReferrerCampaignInfo() {
        return this.referrerCampaignInfo;
    }

    public void setReferrerCampaignInfo(RVProxy.Printer printer) {
        this.referrerCampaignInfo = printer;
    }

    public boolean isCampaignUpdated() {
        return this.campaignUpdated;
    }

    public void setCampaignUpdated(boolean z) {
        this.campaignUpdated = z;
    }
}
