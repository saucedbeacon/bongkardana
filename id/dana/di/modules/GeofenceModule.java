package id.dana.di.modules;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import dagger.Module;
import dagger.Provides;
import id.dana.geofence.GeofenceBroadcastReceiver;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BLEBridgeExtension;
import o.IBeaconBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/di/modules/GeofenceModule;", "", "view", "Lid/dana/geofence/GeofenceContract$View;", "(Lid/dana/geofence/GeofenceContract$View;)V", "provideGeofenceManager", "Lid/dana/geofence/GeofenceManager;", "context", "Landroid/content/Context;", "provideGeofenceManager$app_productionRelease", "providePresenter", "Lid/dana/geofence/GeofenceContract$Presenter;", "presenter", "Lid/dana/geofence/GeoFencePresenter;", "providePresenter$app_productionRelease", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class GeofenceModule {
    private final BLEBridgeExtension.TaskHandler.setMax getMin;

    public GeofenceModule(@NotNull BLEBridgeExtension.TaskHandler.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.getMin = setmax;
    }

    @NotNull
    @Provides
    public final BLEBridgeExtension.TaskHandler.setMax length() {
        return this.getMin;
    }

    @NotNull
    @Provides
    public final BLEBridgeExtension.TaskHandler.setMin getMin(@NotNull BLEBridgeExtension.AnonymousClass6 r2) {
        Intrinsics.checkNotNullParameter(r2, "presenter");
        return r2;
    }

    @NotNull
    @Provides
    public final BLEBridgeExtension.AnonymousClass9 getMax(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return new Object(context) {
            @NotNull
            public static final setMax getMax = new setMax((byte) 0);
            private final GeofencingClient length;
            private final Lazy setMax = LazyKt.lazy(new getMin(this));
            @NotNull
            final Context setMin;

            {
                Intrinsics.checkNotNullParameter(r2, HummerConstants.CONTEXT);
                this.setMin = r2;
                GeofencingClient geofencingClient = LocationServices.getGeofencingClient(r2);
                Intrinsics.checkNotNullExpressionValue(geofencingClient, "LocationServices.getGeofencingClient(context)");
                this.length = geofencingClient;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.BLEBridgeExtension$9$getMin */
            static final class getMin extends Lambda implements Function0<PendingIntent> {
                final /* synthetic */ AnonymousClass9 this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                getMin(AnonymousClass9 r1) {
                    super(0);
                    this.this$0 = r1;
                }

                public final PendingIntent invoke() {
                    Intent intent = new Intent(this.this$0.setMin, GeofenceBroadcastReceiver.class);
                    intent.setAction("dana.id.geofence.action.ACTION_GEOFENCE_EVENT");
                    return PendingIntent.getBroadcast(this.this$0.setMin, 0, intent, 134217728);
                }
            }

            public final boolean getMin(@NotNull List<IBLETraceMonitor> list) {
                Intrinsics.checkNotNullParameter(list, "poiList");
                if (list.isEmpty()) {
                    updateActionSheetContent.d("GEO_FENCE_MANAGER", "Point of interest empty", new IBeaconBridgeExtension());
                    return false;
                }
                GeofencingClient geofencingClient = this.length;
                GeofencingRequest build = new GeofencingRequest.Builder().setInitialTrigger(5).addGeofences(IBeaconBridgeExtension.AnonymousClass1.setMax(list)).build();
                Intrinsics.checkNotNullExpressionValue(build, "GeofencingRequest.Builde…                 .build()");
                geofencingClient.addGeofences(build, (PendingIntent) this.setMax.getValue());
                return true;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/geofence/GeofenceManager$Companion;", "", "()V", "ACTION_GEOFENCE_EVENT", "", "GEO_FENCE_MANAGER", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.BLEBridgeExtension$9$setMax */
            public static final class setMax {
                private setMax() {
                }

                public /* synthetic */ setMax(byte b) {
                    this();
                }
            }
        };
    }
}
