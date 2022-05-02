package o;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONObject;

public class getRequestHeaders {
    private String action;
    private String codeValue;
    private String destinationPath;
    private JSONObject extendedInfo;
    private String fullUrl;
    private String innerUrl;
    private isForMainFrame oauthParams;
    private String orderId;
    private Map<String, String> params;
    private String path;
    private String promoCode;
    private String referralCode;
    private String shortCode;
    private boolean skipHomePage;

    @NonNull
    public JSONObject getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(@NonNull JSONObject jSONObject) {
        this.extendedInfo = jSONObject;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getInnerUrl() {
        return this.innerUrl;
    }

    public String getDestinationPath() {
        return this.destinationPath;
    }

    public void setDestinationPath(String str) {
        this.destinationPath = str;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setInnerUrl(String str) {
        this.innerUrl = str;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public void setShortCode(String str) {
        this.shortCode = str;
    }

    public String getReferralCode() {
        return this.referralCode;
    }

    public void setReferralCode(String str) {
        this.referralCode = str;
    }

    public String getFullUrl() {
        return this.fullUrl;
    }

    public void setFullUrl(String str) {
        this.fullUrl = str;
    }

    @Nullable
    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    @NonNull
    public Map<String, String> getParams() {
        return this.params;
    }

    public void setParams(Map<String, String> map) {
        this.params = map;
    }

    public boolean isSkipHomePage() {
        return this.skipHomePage;
    }

    public void setSkipHomePage(boolean z) {
        this.skipHomePage = z;
    }

    public isForMainFrame getOauthParams() {
        return this.oauthParams;
    }

    public void setOauthParams(isForMainFrame isformainframe) {
        this.oauthParams = isformainframe;
    }

    @Nullable
    public String getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(String str) {
        this.promoCode = str;
    }

    public String getCodeValue() {
        return this.codeValue;
    }

    public void setCodeValue(String str) {
        this.codeValue = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r1 = removeUriParameter(android.net.Uri.parse(r1), id.dana.data.constant.BranchLinkConstant.PaymentParams.OTT).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getConstructCashierUrl() {
        /*
            r5 = this;
            java.util.Map r0 = r5.getParams()
            java.lang.String r1 = "android_url"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r1 = r5.getParams()
            java.lang.String r2 = "referring_link"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            if (r1 == 0) goto L_0x004c
            if (r0 != 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r3 = "ott"
            android.net.Uri r1 = r5.removeUriParameter(r1, r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "pay?"
            int r3 = r1.lastIndexOf(r3)
            r4 = -1
            if (r3 != r4) goto L_0x0036
            return r2
        L_0x0036:
            int r3 = r3 + 4
            java.lang.String r1 = r1.substring(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRequestHeaders.getConstructCashierUrl():java.lang.String");
    }

    public Uri removeUriParameter(Uri uri, String str) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String next : uri.getQueryParameterNames()) {
            if (!next.equals(str)) {
                clearQuery.appendQueryParameter(next, uri.getQueryParameter(next));
            }
        }
        return clearQuery.build();
    }
}
