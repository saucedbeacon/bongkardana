package o;

import android.content.Context;
import id.dana.di.modules.GeofenceModule;
import o.BLEBridgeExtension;
import o.b;

public final class PropertyPreFilter implements getAdapterPosition<BLEBridgeExtension.AnonymousClass9> {
    private final b.C0007b<Context> getMax;
    private final GeofenceModule setMax;

    public static BLEBridgeExtension.AnonymousClass9 getMax(GeofenceModule geofenceModule, Context context) {
        BLEBridgeExtension.AnonymousClass9 max = geofenceModule.getMax(context);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        BLEBridgeExtension.AnonymousClass9 max = this.setMax.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
