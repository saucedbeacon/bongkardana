package o;

public class getEntryInfo {
    private static getEntryInfo instance;
    private static final Object sLock = new Object();
    private final onStartJob networkFlipperPlugin = new onStartJob();

    private getEntryInfo() {
    }

    public static getEntryInfo getInstance() {
        getEntryInfo getentryinfo;
        synchronized (sLock) {
            if (instance == null) {
                instance = new getEntryInfo();
            }
            getentryinfo = instance;
        }
        return getentryinfo;
    }

    public onStartJob getNetworkFlipperPlugin() {
        return this.networkFlipperPlugin;
    }
}
