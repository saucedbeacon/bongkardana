package io.split.android.client.service.sseclient.notifications;

public class ControlNotification extends IncomingNotification {
    private ControlType controlType;

    public enum ControlType {
        STREAMING_ENABLED,
        STREAMING_DISABLED,
        STREAMING_PAUSED
    }

    public ControlType getControlType() {
        return this.controlType;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
