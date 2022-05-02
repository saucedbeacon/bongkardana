package o;

import java.util.List;

public class setBooleanConfig extends initWithSecurityGuard {
    private List<setStringConfig> badgeInfos;
    private int numUpdated;
    private long serverTimestamp;

    public long getServerTimestamp() {
        return this.serverTimestamp;
    }

    public void setServerTimestamp(long j) {
        this.serverTimestamp = j;
    }

    public void setBadgeInfos(List<setStringConfig> list) {
        this.badgeInfos = list;
    }

    public List<setStringConfig> getBadgeInfos() {
        return this.badgeInfos;
    }

    public int getNumUpdated() {
        return this.numUpdated;
    }

    public void setNumUpdated(int i) {
        this.numUpdated = i;
    }
}
