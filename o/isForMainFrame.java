package o;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

public class isForMainFrame {
    private String clientId;
    private String codeChallenge;
    private String merchantId;
    private String merchantName;
    private boolean needMobileToken;
    private String phoneNumber;
    private String redirectUrl;
    private String referringLink;
    private String responseType;
    private List<String> scope;
    private String state;

    public String getResponseType() {
        return this.responseType;
    }

    public void setResponseType(String str) {
        this.responseType = str;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public List<String> getScope() {
        return this.scope;
    }

    public void setScope(List<String> list) {
        this.scope = list;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String getCodeChallenge() {
        return this.codeChallenge;
    }

    public void setCodeChallenge(String str) {
        this.codeChallenge = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public boolean isNeedMobileToken() {
        return this.needMobileToken;
    }

    public void setNeedMobileToken(boolean z) {
        this.needMobileToken = z;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public String getReferringLink() {
        return this.referringLink;
    }

    public void setReferringLink(String str) {
        this.referringLink = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            isForMainFrame isformainframe = (isForMainFrame) obj;
            return this.needMobileToken == isformainframe.needMobileToken && Objects.equals(this.responseType, isformainframe.responseType) && Objects.equals(this.clientId, isformainframe.clientId) && Objects.equals(this.phoneNumber, isformainframe.phoneNumber) && Objects.equals(this.scope, isformainframe.scope) && Objects.equals(this.state, isformainframe.state) && Objects.equals(this.codeChallenge, isformainframe.codeChallenge) && Objects.equals(this.redirectUrl, isformainframe.redirectUrl);
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.responseType, this.clientId, this.phoneNumber, this.scope, this.state, this.codeChallenge, this.redirectUrl, Boolean.valueOf(this.needMobileToken)});
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OauthParams{responseType='");
        sb.append(this.responseType);
        sb.append('\'');
        sb.append(", clientId='");
        sb.append(this.clientId);
        sb.append('\'');
        sb.append(", phoneNumber='");
        sb.append(this.phoneNumber);
        sb.append('\'');
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", state='");
        sb.append(this.state);
        sb.append('\'');
        sb.append(", codeChallenge='");
        sb.append(this.codeChallenge);
        sb.append('\'');
        sb.append(", redirectUrl='");
        sb.append(this.redirectUrl);
        sb.append('\'');
        sb.append(", needMobileToken=");
        sb.append(this.needMobileToken);
        sb.append('}');
        return sb.toString();
    }
}
