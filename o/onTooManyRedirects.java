package o;

public class onTooManyRedirects {
    private boolean featureEnable;
    private int maxRecipient;

    public onTooManyRedirects(boolean z, int i) {
        this.featureEnable = z;
        this.maxRecipient = i;
    }

    public boolean isFeatureEnable() {
        return this.featureEnable;
    }

    public int getMaxRecipient() {
        return this.maxRecipient;
    }
}
