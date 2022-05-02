package o;

public class OnRpcResultListener {
    private boolean loginStatus;
    private String maskedLoginId;
    private onResultSuccess payMethodRiskResponse;

    public boolean isLoginStatus() {
        return this.loginStatus;
    }

    public void setLoginStatus(boolean z) {
        this.loginStatus = z;
    }

    public String getMaskedLoginId() {
        return this.maskedLoginId;
    }

    public void setMaskedLoginId(String str) {
        this.maskedLoginId = str;
    }

    public onResultSuccess getPayMethodRiskResponse() {
        return this.payMethodRiskResponse;
    }

    public void setPayMethodRiskResponse(onResultSuccess onresultsuccess) {
        this.payMethodRiskResponse = onresultsuccess;
    }
}
