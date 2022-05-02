package id.dana.toggle.locationpermission;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.RedDotManager;
import o.WheelView;
import o.getSecureSignatureComp;
import o.isAlipayApp;
import o.parseColor;
import o.showsIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0007J\b\u0010\u001f\u001a\u00020\u001aH\u0007J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lid/dana/toggle/locationpermission/LocationPermissionObserver;", "Landroidx/lifecycle/LifecycleObserver;", "locationPermissionSubject", "Lid/dana/toggle/locationpermission/LocationPermissionSubject;", "(Lid/dana/toggle/locationpermission/LocationPermissionSubject;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable$app_productionRelease$annotations", "()V", "getDisposable$app_productionRelease", "()Lio/reactivex/disposables/Disposable;", "setDisposable$app_productionRelease", "(Lio/reactivex/disposables/Disposable;)V", "disposableLifecycleObserver", "getDisposableLifecycleObserver$app_productionRelease$annotations", "getDisposableLifecycleObserver$app_productionRelease", "setDisposableLifecycleObserver$app_productionRelease", "observers", "Ljava/util/Vector;", "Lid/dana/toggle/locationpermission/ILocationPermissionObserver;", "getObservers$app_productionRelease$annotations", "getObservers$app_productionRelease", "()Ljava/util/Vector;", "setObservers$app_productionRelease", "(Ljava/util/Vector;)V", "addObserver", "", "observer", "disposeObserver", "observerLocationPermission", "onCreate", "onDestroy", "removeObserver", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LocationPermissionObserver implements showsIcon {
    @Nullable
    private GriverProgressBar.UpdateRunnable getMax;
    @NotNull
    Vector<parseColor> getMin = new Vector<>();
    @Nullable
    private GriverProgressBar.UpdateRunnable length;
    private final isAlipayApp setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
    static final class length<T> implements RedDotManager<Boolean> {
        final /* synthetic */ LocationPermissionObserver getMin;

        length(LocationPermissionObserver locationPermissionObserver) {
            this.getMin = locationPermissionObserver;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            synchronized (this.getMin) {
                for (parseColor max : this.getMin.getMin) {
                    Intrinsics.checkNotNullExpressionValue(bool, "it");
                    max.getMax(bool.booleanValue());
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public LocationPermissionObserver(@NotNull isAlipayApp isalipayapp) {
        Intrinsics.checkNotNullParameter(isalipayapp, "locationPermissionSubject");
        this.setMin = isalipayapp;
        setMax();
        this.getMax = WheelView.AnonymousClass2.setMax(this);
    }

    public final synchronized void getMax(@NotNull parseColor parsecolor) {
        Intrinsics.checkNotNullParameter(parsecolor, "observer");
        if (!this.getMin.contains(parsecolor)) {
            this.getMin.addElement(parsecolor);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        setMax();
    }

    private final void setMax() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.length;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.length = null;
        this.length = this.setMin.setMin.subscribeOn(getSecureSignatureComp.setMin()).observeOn(getSecureSignatureComp.setMin()).subscribe(new length(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.length;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.length = null;
        GriverProgressBar.UpdateRunnable updateRunnable2 = this.getMax;
        if (updateRunnable2 != null) {
            updateRunnable2.dispose();
        }
    }
}
