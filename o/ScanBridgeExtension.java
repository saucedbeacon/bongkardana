package o;

public class ScanBridgeExtension {
    private boolean enabled;
    private String howToUrl;
    private String title;

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public String getHowToUrl() {
        return this.howToUrl;
    }

    public void setHowToUrl(String str) {
        this.howToUrl = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(469749493, oncanceled);
            onCancelLoad.getMin(469749493, oncanceled);
        }
        this.title = str;
    }
}
