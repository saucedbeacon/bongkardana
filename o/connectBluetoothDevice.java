package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.domain.globalsearch.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import o.TMNTokenClient;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0002J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/domain/util/SingleShotLocationProvider;", "", "()V", "MAX_GET_LOCATION_TIME", "", "requestSingleUpdate", "", "context", "Landroid/content/Context;", "onNewLocationAvailable", "Lkotlin/Function1;", "Landroid/location/Location;", "requestSingleUpdateObservable", "Lio/reactivex/Observable;", "Lid/dana/domain/globalsearch/model/LatLng;", "location", "domain_release"}, k = 1, mv = {1, 4, 2})
@SuppressLint({"MissingPermission"})
public final class connectBluetoothDevice {
    @NotNull
    public static final connectBluetoothDevice INSTANCE = new connectBluetoothDevice();
    private static final long MAX_GET_LOCATION_TIME = 5000;

    private connectBluetoothDevice() {
    }

    /* access modifiers changed from: private */
    public final void requestSingleUpdate(Context context, Function1<? super Location, Unit> function1) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            Handler handler = new Handler();
            Runnable getmin = new getMin(booleanRef, locationManager, function1);
            if (locationManager.isProviderEnabled("network")) {
                Criteria criteria = new Criteria();
                criteria.setAccuracy(2);
                locationManager.requestSingleUpdate(criteria, new getMax(booleanRef, handler, getmin, function1), (Looper) null);
            } else if (locationManager.isProviderEnabled("gps")) {
                Criteria criteria2 = new Criteria();
                criteria2.setAccuracy(1);
                locationManager.requestSingleUpdate(criteria2, new setMax(booleanRef, handler, getmin, function1), (Looper) null);
            } else {
                booleanRef.element = false;
                Location lastKnownLocation = locationManager.getLastKnownLocation("passive");
                if (lastKnownLocation == null) {
                    lastKnownLocation = new Location("");
                }
                Intrinsics.checkNotNullExpressionValue(lastKnownLocation, "locationManager.getLastK…PROVIDER) ?: Location(\"\")");
                function1.invoke(lastKnownLocation);
                return;
            }
            handler.postDelayed(getmin, 5000);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements Runnable {
        final /* synthetic */ Function1 getMin;
        final /* synthetic */ LocationManager setMax;
        final /* synthetic */ Ref.BooleanRef setMin;

        getMin(Ref.BooleanRef booleanRef, LocationManager locationManager, Function1 function1) {
            this.setMin = booleanRef;
            this.setMax = locationManager;
            this.getMin = function1;
        }

        public final void run() {
            if (this.setMin.element) {
                this.setMin.element = false;
                Location lastKnownLocation = this.setMax.getLastKnownLocation("passive");
                if (lastKnownLocation == null) {
                    lastKnownLocation = new Location("");
                }
                Intrinsics.checkNotNullExpressionValue(lastKnownLocation, "locationManager.getLastK…PROVIDER) ?: Location(\"\")");
                this.getMin.invoke(lastKnownLocation);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/domain/util/SingleShotLocationProvider$requestSingleUpdate$1", "Landroid/location/LocationListener;", "onLocationChanged", "", "location", "Landroid/location/Location;", "onProviderDisabled", "provider", "", "onProviderEnabled", "onStatusChanged", "status", "", "extras", "Landroid/os/Bundle;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements LocationListener {
        final /* synthetic */ Runnable $getLastKnownLocationRunnable;
        final /* synthetic */ Handler $handler;
        final /* synthetic */ Function1 $onNewLocationAvailable;
        final /* synthetic */ Ref.BooleanRef $requestLocation;

        public final void onProviderDisabled(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "provider");
        }

        public final void onProviderEnabled(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "provider");
        }

        public final void onStatusChanged(@NotNull String str, int i, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "provider");
            Intrinsics.checkNotNullParameter(bundle, "extras");
        }

        getMax(Ref.BooleanRef booleanRef, Handler handler, Runnable runnable, Function1 function1) {
            this.$requestLocation = booleanRef;
            this.$handler = handler;
            this.$getLastKnownLocationRunnable = runnable;
            this.$onNewLocationAvailable = function1;
        }

        public final void onLocationChanged(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            if (this.$requestLocation.element) {
                this.$handler.removeCallbacks(this.$getLastKnownLocationRunnable);
                this.$onNewLocationAvailable.invoke(location);
                this.$requestLocation.element = false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/domain/util/SingleShotLocationProvider$requestSingleUpdate$2", "Landroid/location/LocationListener;", "onLocationChanged", "", "location", "Landroid/location/Location;", "onProviderDisabled", "provider", "", "onProviderEnabled", "onStatusChanged", "status", "", "extras", "Landroid/os/Bundle;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements LocationListener {
        final /* synthetic */ Runnable $getLastKnownLocationRunnable;
        final /* synthetic */ Handler $handler;
        final /* synthetic */ Function1 $onNewLocationAvailable;
        final /* synthetic */ Ref.BooleanRef $requestLocation;

        public final void onProviderDisabled(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "provider");
        }

        public final void onProviderEnabled(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "provider");
        }

        public final void onStatusChanged(@NotNull String str, int i, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "provider");
            Intrinsics.checkNotNullParameter(bundle, "extras");
        }

        setMax(Ref.BooleanRef booleanRef, Handler handler, Runnable runnable, Function1 function1) {
            this.$requestLocation = booleanRef;
            this.$handler = handler;
            this.$getLastKnownLocationRunnable = runnable;
            this.$onNewLocationAvailable = function1;
        }

        public final void onLocationChanged(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            if (this.$requestLocation.element) {
                this.$handler.removeCallbacks(this.$getLastKnownLocationRunnable);
                this.$onNewLocationAvailable.invoke(location);
                this.$requestLocation.element = false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lid/dana/domain/globalsearch/model/LatLng;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<LatLng> {
        final /* synthetic */ Context getMax;
        final /* synthetic */ Location setMax;

        setMin(Context context, Location location) {
            this.getMax = context;
            this.setMax = location;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.AnonymousClass2<LatLng> r5) {
            Intrinsics.checkNotNullParameter(r5, "emitter");
            if (IntRange.length(this.getMax, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                xp4.getMin(TMNTokenClient.InitResultListener.length, DeviceTokenClient.length(), (CoroutineStart) null, new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                    int label;
                    final /* synthetic */ setMin this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        Intrinsics.checkNotNullParameter(continuation, "completion");
                        return 

                        @JvmStatic
                        @NotNull
                        public static final TitleBarRightButtonView.AnonymousClass1<LatLng> requestSingleUpdateObservable(@NotNull Context context, @Nullable Location location) {
                            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                            TitleBarRightButtonView.AnonymousClass1<LatLng> create = TitleBarRightButtonView.AnonymousClass1.create(new setMin(context, location));
                            Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…)\n            }\n        }");
                            return create;
                        }
                    }
