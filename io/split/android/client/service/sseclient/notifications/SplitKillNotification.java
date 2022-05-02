package io.split.android.client.service.sseclient.notifications;

public class SplitKillNotification extends IncomingNotification {
    private long changeNumber;
    private String defaultTreatment;
    private String splitName;

    public long getChangeNumber() {
        return this.changeNumber;
    }

    public String getSplitName() {
        return this.splitName;
    }

    public String getDefaultTreatment() {
        return this.defaultTreatment;
    }
}
