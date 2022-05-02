package o;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import o.getLocation;
import o.getPackageValidityCheckComp;

public class sendLocation {
    private static volatile sendLocation setMin;
    public getPackageValidityCheckComp getMin;

    public static sendLocation getMax() {
        if (setMin == null) {
            synchronized (sendLocation.class) {
                if (setMin == null) {
                    setMin = new sendLocation();
                }
            }
        }
        return setMin;
    }

    public static final class setMin {
        private long FastBitmap$CoordinateSystem = 2048;
        private int Grayscale$Algorithm = 2000;
        private int ICustomTabsCallback = 15;
        private int IsOverlapping = 60;
        private long Mean$Arithmetic = GriverConfigConstants.DEFAULT_ASYNC_UPDATE_PERIOD;
        private boolean b = true;
        private getLocation create = new getLocation.getMin().getMax();
        private int equals = 60;
        private boolean getCause = true;
        public boolean getMax = false;
        public int getMin = 15000;
        private int hashCode = 10000;
        private String invoke = "unknown";
        private String invokeSuspend = "unknown";
        private int isInside = 60;
        public boolean length = false;
        private boolean onNavigationEvent = false;
        public int setMax = -1;
        public String setMin = null;
        private int toDoubleRange = 1800;
        private int toFloatRange = 2000;
        private int toIntRange = 30000;
        private int toString = 5000;
        private String valueOf = null;
        private int values = 15000;

        public final sendLocation getMin() {
            getPackageValidityCheckComp.setMax syncConfig = getPackageValidityCheckComp.builder().connectionTimeout(this.getMin).eventFlushInterval(this.Mean$Arithmetic).eventsPerPush(this.Grayscale$Algorithm).eventsQueueSize(this.hashCode).featuresRefreshRate(this.IsOverlapping).hostname(this.invoke).impressionsChunkSize(this.FastBitmap$CoordinateSystem).impressionsQueueSize(this.toIntRange).impressionsRefreshRate(this.equals).ip(this.invokeSuspend).metricsRefreshRate(this.toDoubleRange).readTimeout(this.values).ready(this.setMax).segmentsRefreshRate(this.isInside).trafficType(this.setMin).waitBeforeShutdown(this.toString).proxyHost(this.valueOf).sychronizeInBackground(this.getMax).sychronizeInBackgroundPeriod((long) this.ICustomTabsCallback).backgroundSyncWhenBatteryNotLow(this.getCause).backgroundSyncWhenWifiOnly(this.onNavigationEvent).streamingEnabled(this.b).syncConfig(this.create.setMax);
            if (this.length) {
                syncConfig.enableDebug();
            }
            return sendLocation.getMax().getMin = syncConfig.build();
        }
    }
}
