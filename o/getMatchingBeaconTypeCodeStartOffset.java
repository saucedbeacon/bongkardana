package o;

public class getMatchingBeaconTypeCodeStartOffset {
    private String bindingId;
    private String cardBin;
    private boolean eligible;
    private String payMethod;
    private int priority;
    private boolean recommended;
    private stopBleScan recommendedAmount;

    public String getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1061329381, oncanceled);
            onCancelLoad.getMin(-1061329381, oncanceled);
        }
        this.payMethod = str;
    }

    public String getCardBin() {
        return this.cardBin;
    }

    public void setCardBin(String str) {
        this.cardBin = str;
    }

    public String getBindingId() {
        return this.bindingId;
    }

    public void setBindingId(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1739716450, oncanceled);
            onCancelLoad.getMin(-1739716450, oncanceled);
        }
        this.bindingId = str;
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public void setRecommended(boolean z) {
        this.recommended = z;
    }

    public boolean isEligible() {
        return this.eligible;
    }

    public void setEligible(boolean z) {
        this.eligible = z;
    }

    public stopBleScan getRecommendedAmount() {
        return this.recommendedAmount;
    }

    public void setRecommendedAmount(stopBleScan stopblescan) {
        this.recommendedAmount = stopblescan;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int i) {
        this.priority = i;
    }
}
