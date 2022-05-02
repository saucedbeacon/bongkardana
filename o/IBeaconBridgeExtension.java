package o;

import com.google.android.gms.location.Geofence;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/geofence/PointOfInterestEmptyException;", "", "()V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IBeaconBridgeExtension extends Throwable {
    public IBeaconBridgeExtension() {
        super("Point of interest must not be empty to get fencing request");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00030\u0005\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0007\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\b\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\b"}, d2 = {"toGeofenceObject", "Lcom/google/android/gms/location/Geofence;", "kotlin.jvm.PlatformType", "Lid/dana/geofence/model/PoiModel;", "toGeofenceObjects", "", "toPoiModel", "Lid/dana/domain/geofence/model/Poi;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.IBeaconBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        public static final List<Geofence> setMax(@NotNull List<IBLETraceMonitor> list) {
            Geofence geofence;
            Intrinsics.checkNotNullParameter(list, "$this$toGeofenceObjects");
            Collection arrayList = new ArrayList();
            for (IBLETraceMonitor iBLETraceMonitor : list) {
                try {
                    Intrinsics.checkNotNullParameter(iBLETraceMonitor, "$this$toGeofenceObject");
                    Geofence.Builder requestId = new Geofence.Builder().setRequestId(iBLETraceMonitor.setMin);
                    DefaultBLETraceMonitor defaultBLETraceMonitor = DefaultBLETraceMonitor.getMin;
                    Geofence.Builder circularRegion = requestId.setLoiteringDelay(DefaultBLETraceMonitor.length()).setTransitionTypes(5).setCircularRegion(((Number) iBLETraceMonitor.getMin.getValue()).doubleValue(), ((Number) iBLETraceMonitor.length.getValue()).doubleValue(), (float) (iBLETraceMonitor.getMax <= 0 ? 700 : iBLETraceMonitor.getMax));
                    DefaultBLETraceMonitor defaultBLETraceMonitor2 = DefaultBLETraceMonitor.getMin;
                    geofence = circularRegion.setExpirationDuration(DefaultBLETraceMonitor.getMax()).build();
                } catch (Exception e) {
                    updateActionSheetContent.e(DanaLogConstants.TAG.GEOFENCE_TAG, "Error creating geofences", e);
                    geofence = null;
                }
                if (geofence != null) {
                    arrayList.add(geofence);
                }
            }
            return (List) arrayList;
        }
    }
}
