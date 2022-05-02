package o;

import android.text.TextUtils;
import o.PhotoPagerListener;

public final class setPhoto {
    public String IsOverlapping;
    public isSelected getMax;
    public PhotoPagerListener.V3 getMin;
    public String length;
    public String setMax;
    public String setMin;
    public String toIntRange;

    public final String length(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://m.dana.id");
        if (setMin()) {
            sb.append(getMin(str, str2, str3, str4));
        } else {
            sb.append(getMax(str, str2, str3, str4));
        }
        return sb.toString();
    }

    private String getMax(String str, String str2, String str3, String str4) {
        if (setMin(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("/m/portal/cashier/result?cashierOrderId=%s", new Object[]{this.setMin}));
            sb.append(String.format("&couponId=%s", new Object[]{str4}));
            return sb.toString();
        } else if (length(str, str2, str3)) {
            return getMax(str3, str4);
        } else {
            return setMax(str, str2, str4);
        }
    }

    private String setMax(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("/m/portal/cashier/checkout?bizOrderType=SEND_MONEY&reloadRequest=true");
        sb.append(String.format("&cashierOrderId=%s", new Object[]{this.setMin}));
        sb.append(String.format("&couponId=%s", new Object[]{str3}));
        sb.append(String.format("&filter={\"payMethodFilter\":[\"%s\",\"COUPON\"],\"cardIndexNo\":\"%s\"}", new Object[]{str2, str}));
        return sb.toString();
    }

    private String getMax(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(String.format("&cashierOrderId=%s", new Object[]{this.setMin}));
        sb.append(String.format("&couponId=%s", new Object[]{str2}));
        return sb.toString();
    }

    private String getMin(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (setMin(str2)) {
            sb.append("/m/portal/cashier/checkout?bizOrderType=SEND_MONEY&reloadRequest=true");
            sb.append(String.format("&cashierOrderId=%s", new Object[]{this.setMin}));
            sb.append(String.format("&couponId=%s", new Object[]{str4}));
        } else if (length(str, str2, str3)) {
            sb.append(getMax(str3, str4));
        } else {
            sb.append(setMax(str, str2, str4));
        }
        if (getMin()) {
            sb.append(setMax());
        }
        return sb.toString();
    }

    private static boolean setMin(String str) {
        return "BALANCE".equals(str);
    }

    private static boolean length(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) && !setMin(str2) && !TextUtils.isEmpty(str3);
    }

    private boolean setMin() {
        return length() || getMin();
    }

    private boolean length() {
        return this.getMax != null;
    }

    private boolean getMin() {
        PhotoPagerListener.V3 v3 = this.getMin;
        return (v3 == null || v3.setMin == null) ? false : true;
    }

    private String setMax() {
        StringBuilder sb = new StringBuilder();
        isSelected isselected = this.getMin.setMin;
        sb.append(String.format("&infoForRiskII={\"riskResult\":\"%s\",\"verificationMethods\":[\"%s\"],\"riskPhoneNumber\":\"%s\"}", new Object[]{isselected.getMin, isselected.setMin, isselected.length}));
        return sb.toString();
    }
}
