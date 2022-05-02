package io.split.android.client.service.sseclient.notifications;

public class SplitsChangeNotification extends IncomingNotification {
    private long changeNumber;

    public SplitsChangeNotification(long j) {
        this.changeNumber = j;
    }

    public long getChangeNumber() {
        return this.changeNumber;
    }
}
