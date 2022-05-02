package io.split.android.client.service.sseclient.notifications;

public class OccupancyNotification extends IncomingNotification {
    private static final String CONTROL_PRI_TOKEN = "control_pri";
    private static final String CONTROL_SEC_TOKEN = "control_sec";
    private Metrics metrics;

    public OccupancyNotification() {
        this.type = NotificationType.OCCUPANCY;
    }

    public static class Metrics {
        private int publishers;

        public int getPublishers() {
            return this.publishers;
        }
    }

    public Metrics getMetrics() {
        return this.metrics;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public boolean isControlPriChannel() {
        if (getChannel() == null) {
            return false;
        }
        return getChannel().contains(CONTROL_PRI_TOKEN);
    }

    public boolean isControlSecChannel() {
        if (getChannel() == null) {
            return false;
        }
        return getChannel().contains(CONTROL_SEC_TOKEN);
    }
}
