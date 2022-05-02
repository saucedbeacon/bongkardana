package io.split.android.client.service.sseclient.notifications;

public class RawNotification {
    private String channel;
    private String clientId;
    private String data;
    private String name;
    private long timestamp;

    public String getClientId() {
        return this.clientId;
    }

    public String getData() {
        return this.data;
    }

    public String getChannel() {
        return this.channel;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getName() {
        return this.name;
    }
}
