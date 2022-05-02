package o;

public class getMatchingBeaconTypeCodeEndOffset extends getLayout {
    private String instId;
    private String payOption;
    private String withdrawInstId;
    private String withdrawInstLocalName;
    private String withdrawInstName;
    private String withdrawPayMethod;
    private String withdrawPayOption;

    public String getWithdrawInstId() {
        return this.withdrawInstId;
    }

    public void setWithdrawInstId(String str) {
        this.withdrawInstId = str;
    }

    public String getWithdrawInstName() {
        return this.withdrawInstName;
    }

    public void setWithdrawInstName(String str) {
        this.withdrawInstName = str;
    }

    public String getWithdrawInstLocalName() {
        return this.withdrawInstLocalName;
    }

    public void setWithdrawInstLocalName(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(677675554, oncanceled);
            onCancelLoad.getMin(677675554, oncanceled);
        }
        this.withdrawInstLocalName = str;
    }

    public String getWithdrawPayMethod() {
        return this.withdrawPayMethod;
    }

    public void setWithdrawPayMethod(String str) {
        this.withdrawPayMethod = str;
    }

    public String getWithdrawPayOption() {
        return this.withdrawPayOption;
    }

    public void setWithdrawPayOption(String str) {
        this.withdrawPayOption = str;
    }

    public String getInstId() {
        return this.instId;
    }

    public void setInstId(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(353487193, oncanceled);
            onCancelLoad.getMin(353487193, oncanceled);
        }
        this.instId = str;
    }

    public String getPayOption() {
        return this.payOption;
    }

    public void setPayOption(String str) {
        this.payOption = str;
    }
}
