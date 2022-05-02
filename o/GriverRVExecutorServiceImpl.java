package o;

public class GriverRVExecutorServiceImpl {
    private boolean needUserConsent;
    private String redirectUrl;
    private String userConsentConfigKey;
    private String userConsentMessage;

    public boolean isNeedUserConsent() {
        return this.needUserConsent;
    }

    public void setNeedUserConsent(boolean z) {
        this.needUserConsent = z;
    }

    public String getUserConsentConfigKey() {
        return this.userConsentConfigKey;
    }

    public void setUserConsentConfigKey(String str) {
        this.userConsentConfigKey = str;
    }

    public String getUserConsentMessage() {
        return this.userConsentMessage;
    }

    public void setUserConsentMessage(String str) {
        this.userConsentMessage = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }
}
