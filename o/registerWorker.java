package o;

public class registerWorker {
    private String amount;
    private String currency;
    private boolean placeholder = false;

    public static registerWorker getDefault() {
        registerWorker registerworker = new registerWorker();
        registerworker.setAmount("0");
        registerworker.setCurrency("Rp.");
        registerworker.setPlaceholder(true);
        return registerworker;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public boolean isPlaceholder() {
        return this.placeholder;
    }

    public void setPlaceholder(boolean z) {
        this.placeholder = z;
    }

    public stopBleScan toCurrencyAmount() {
        stopBleScan stopblescan = new stopBleScan();
        stopblescan.setAmount(this.amount);
        stopblescan.setCurrency(this.currency);
        stopblescan.setPlaceholder(this.placeholder);
        return stopblescan;
    }
}
