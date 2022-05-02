package o;

public class onReceivedError {
    private int maxAmount;
    private int minAmount;

    public int getMinAmount() {
        return this.minAmount;
    }

    public void setMinAmount(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(495936543, oncanceled);
            onCancelLoad.getMin(495936543, oncanceled);
        }
        this.minAmount = i;
    }

    public int getMaxAmount() {
        return this.maxAmount;
    }

    public void setMaxAmount(int i) {
        this.maxAmount = i;
    }
}
