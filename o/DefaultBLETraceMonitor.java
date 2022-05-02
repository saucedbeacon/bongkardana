package o;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/geofence/GeofenceConstant;", "", "()V", "GEOFENCE_DEFAULT_RADIUS", "", "GEOFENCE_EXPIRATION_IN_MILLISECONDS", "", "getGEOFENCE_EXPIRATION_IN_MILLISECONDS", "()J", "GEOFENCE_LOITERRING_DELAY_IN_MILLISECOND", "getGEOFENCE_LOITERRING_DELAY_IN_MILLISECOND", "()I", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DefaultBLETraceMonitor {
    private static final int getMax = ((int) TimeUnit.MINUTES.toMillis(2));
    @NotNull
    public static final DefaultBLETraceMonitor getMin = new DefaultBLETraceMonitor();
    private static final long setMin = TimeUnit.DAYS.toMillis(7);

    private DefaultBLETraceMonitor() {
    }

    public static int length() {
        return getMax;
    }

    public static long getMax() {
        return setMin;
    }
}
