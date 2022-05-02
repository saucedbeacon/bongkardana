package o;

import id.dana.data.sendmoney.model.PayMethodInfoResult;
import java.util.List;

public final class IOUtils {
    private boolean enableStatus;
    private String instId;
    private String instLocalName;
    private String instName;
    private String payMethod;
    private List<PayMethodInfoResult> payMethodInfos;
    private String payOption;

    public final List<PayMethodInfoResult> getPayMethodInfos() {
        return this.payMethodInfos;
    }

    public final void setPayMethodInfos(List<PayMethodInfoResult> list) {
        this.payMethodInfos = list;
    }

    public final String getInstId() {
        return this.instId;
    }

    public final void setInstId(String str) {
        this.instId = str;
    }

    public final boolean isEnableStatus() {
        return this.enableStatus;
    }

    public final void setEnableStatus(boolean z) {
        this.enableStatus = z;
    }

    public final String getInstLocalName() {
        return this.instLocalName;
    }

    public final void setInstLocalName(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-2071527175, oncanceled);
            onCancelLoad.getMin(-2071527175, oncanceled);
        }
        this.instLocalName = str;
    }

    public final String getInstName() {
        return this.instName;
    }

    public final void setInstName(String str) {
        this.instName = str;
    }

    public final String getPayMethod() {
        return this.payMethod;
    }

    public final void setPayMethod(String str) {
        this.payMethod = str;
    }

    public final String getPayOption() {
        return this.payOption;
    }

    public final void setPayOption(String str) {
        this.payOption = str;
    }
}
