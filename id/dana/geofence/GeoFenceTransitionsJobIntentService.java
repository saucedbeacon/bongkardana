package id.dana.geofence;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.DANAJobIntentService;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import id.dana.DanaApplication;
import id.dana.di.modules.GeofenceModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.BLEBridgeExtension;
import o.IBLETraceMonitor;
import o.PrepareException;
import o.isSnapshotFileExist;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/geofence/GeoFenceTransitionsJobIntentService;", "Landroidx/core/app/DANAJobIntentService;", "()V", "geoFencePresenter", "Lid/dana/geofence/GeoFencePresenter;", "getGeoFencePresenter", "()Lid/dana/geofence/GeoFencePresenter;", "setGeoFencePresenter", "(Lid/dana/geofence/GeoFencePresenter;)V", "geofenceManager", "Lid/dana/geofence/GeofenceManager;", "getGeofenceManager", "()Lid/dana/geofence/GeofenceManager;", "setGeofenceManager", "(Lid/dana/geofence/GeofenceManager;)V", "handleTransitionDwell", "", "geofencingEvent", "Lcom/google/android/gms/location/GeofencingEvent;", "initComponent", "onCreate", "onHandleWork", "intent", "Landroid/content/Intent;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GeoFenceTransitionsJobIntentService extends DANAJobIntentService {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @Inject
    public BLEBridgeExtension.AnonymousClass6 geoFencePresenter;
    @Inject
    public BLEBridgeExtension.AnonymousClass9 geofenceManager;

    @NotNull
    public final BLEBridgeExtension.AnonymousClass6 getGeoFencePresenter() {
        BLEBridgeExtension.AnonymousClass6 r0 = this.geoFencePresenter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("geoFencePresenter");
        }
        return r0;
    }

    public final void setGeoFencePresenter(@NotNull BLEBridgeExtension.AnonymousClass6 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.geoFencePresenter = r2;
    }

    @NotNull
    public final BLEBridgeExtension.AnonymousClass9 getGeofenceManager() {
        BLEBridgeExtension.AnonymousClass9 r0 = this.geofenceManager;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("geofenceManager");
        }
        return r0;
    }

    public final void setGeofenceManager(@NotNull BLEBridgeExtension.AnonymousClass9 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.geofenceManager = r2;
    }

    public final void onCreate() {
        super.onCreate();
        isSnapshotFileExist.setMin setmin = new isSnapshotFileExist.setMin((byte) 0);
        Application application = getApplication();
        if (application != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) application).getApplicationComponent();
            if (applicationComponent != null) {
                setmin.setMax = applicationComponent;
                setmin.length = new GeofenceModule(new setMax());
                stopIgnoring.setMin(setmin.length, GeofenceModule.class);
                stopIgnoring.setMin(setmin.setMax, PrepareException.AnonymousClass1.class);
                new isSnapshotFileExist(setmin.length, setmin.setMax, (byte) 0).length(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u000f"}, d2 = {"id/dana/geofence/GeoFenceTransitionsJobIntentService$initComponent$geoFenceComponent$1", "Lid/dana/geofence/GeofenceContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onNotifyPoi", "success", "", "showProgress", "updatePoiList", "poiList", "", "Lid/dana/geofence/model/PoiModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements BLEBridgeExtension.TaskHandler.setMax {
        public final void dismissProgress() {
        }

        public final void getMax(@NotNull List<IBLETraceMonitor> list) {
            Intrinsics.checkNotNullParameter(list, "poiList");
        }

        public final void onError(@Nullable String str) {
        }

        public final void showProgress() {
        }

        setMax() {
        }
    }

    public final void onHandleWork(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
        if (!fromIntent.hasError()) {
            Intrinsics.checkNotNullExpressionValue(fromIntent, "geofencingEvent");
            if (fromIntent.getGeofenceTransition() == 4) {
                List<Geofence> triggeringGeofences = fromIntent.getTriggeringGeofences();
                BLEBridgeExtension.AnonymousClass6 r0 = this.geoFencePresenter;
                if (r0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("geoFencePresenter");
                }
                Intrinsics.checkNotNullExpressionValue(triggeringGeofences, "triggeringGeofences");
                Iterable<Geofence> iterable = triggeringGeofences;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (Geofence geofence : iterable) {
                    Intrinsics.checkNotNullExpressionValue(geofence, "it");
                    arrayList.add(geofence.getRequestId());
                }
                List list = (List) arrayList;
                Intrinsics.checkNotNullParameter(list, "poiIds");
                r0.setMin.execute(new BLEBridgeExtension.AnonymousClass6.setMin(r0), list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/geofence/GeoFenceTransitionsJobIntentService$Companion;", "", "()V", "JOB_ID", "", "enqueueWork", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        public static void setMin(@NotNull Context context, @NotNull Intent intent) {
            DANAJobIntentService.length length;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            DANAJobIntentService.getMax getmax = DANAJobIntentService.Companion;
            Class<GeoFenceTransitionsJobIntentService> cls = GeoFenceTransitionsJobIntentService.class;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(cls, "cls");
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            ComponentName componentName = new ComponentName(context, cls);
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(componentName, "cn");
            Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
            if (Build.VERSION.SDK_INT >= 26) {
                length = new DANAJobIntentService.getMin();
            } else {
                length = new DANAJobIntentService.setMin();
            }
            length.setMax(context, componentName, 573, intent);
        }
    }
}
