package o;

import id.dana.di.modules.GeofenceModule;
import o.BLEBridgeExtension;

public final class ObjectSerializer implements getAdapterPosition<BLEBridgeExtension.TaskHandler.setMax> {
    private final GeofenceModule getMax;

    private ObjectSerializer(GeofenceModule geofenceModule) {
        this.getMax = geofenceModule;
    }

    public static ObjectSerializer getMax(GeofenceModule geofenceModule) {
        return new ObjectSerializer(geofenceModule);
    }

    public final /* synthetic */ Object get() {
        BLEBridgeExtension.TaskHandler.setMax length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
