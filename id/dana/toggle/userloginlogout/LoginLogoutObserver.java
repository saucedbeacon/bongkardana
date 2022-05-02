package id.dana.toggle.userloginlogout;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Vector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.LocationBridgeExtension;
import o.RedDotManager;
import o.TypefaceCache;
import o.WheelView;
import o.a;
import o.getSecureSignatureComp;
import o.showsIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0007J\b\u0010\u001e\u001a\u00020\u0017H\u0007J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lid/dana/toggle/userloginlogout/LoginLogoutObserver;", "Landroidx/lifecycle/LifecycleObserver;", "loginLogoutSubject", "Lid/dana/data/login/LoginLogoutSubject;", "(Lid/dana/data/login/LoginLogoutSubject;)V", "<set-?>", "Lio/reactivex/disposables/Disposable;", "disposable", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "disposableLifecycleObserver", "getDisposableLifecycleObserver", "setDisposableLifecycleObserver", "Ljava/util/Vector;", "Lid/dana/toggle/userloginlogout/ILoginLogoutObserver;", "observers", "getObservers", "()Ljava/util/Vector;", "setObservers", "(Ljava/util/Vector;)V", "addObserver", "", "observer", "disposeObserver", "getCurrentState", "Lid/dana/data/login/LoginLogoutSubject$UserLogin;", "observeLoginLogout", "onCreate", "onDestroy", "removeObserver", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LoginLogoutObserver implements showsIcon {
    public final a.AnonymousClass7 getMax;
    @Nullable
    private GriverProgressBar.UpdateRunnable getMin;
    @NotNull
    Vector<TypefaceCache> length = new Vector<>();
    @Nullable
    private GriverProgressBar.UpdateRunnable setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/data/login/LoginLogoutSubject$UserLogin;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class length<T> implements RedDotManager<a.AnonymousClass7.setMin> {
        final /* synthetic */ LoginLogoutObserver getMax;

        length(LoginLogoutObserver loginLogoutObserver) {
            this.getMax = loginLogoutObserver;
        }

        public final /* synthetic */ void accept(Object obj) {
            a.AnonymousClass7.setMin setmin = (a.AnonymousClass7.setMin) obj;
            synchronized (this.getMax) {
                StringBuilder sb = new StringBuilder("User is logged-in ");
                sb.append(setmin.isLoggedIn());
                LocationBridgeExtension.setMax("DanaLogin", sb.toString());
                for (TypefaceCache min : this.getMax.length) {
                    Intrinsics.checkNotNullExpressionValue(setmin, "it");
                    min.getMin(setmin);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public LoginLogoutObserver(@NotNull a.AnonymousClass7 r2) {
        Intrinsics.checkNotNullParameter(r2, "loginLogoutSubject");
        this.getMax = r2;
        getMin();
        this.getMin = WheelView.AnonymousClass2.setMax(this);
    }

    public final synchronized void length(@NotNull TypefaceCache typefaceCache) {
        Intrinsics.checkNotNullParameter(typefaceCache, "observer");
        if (!this.length.contains(typefaceCache)) {
            this.length.addElement(typefaceCache);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        getMin();
    }

    private final void getMin() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.setMin;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.setMin = null;
        this.setMin = this.getMax.toObservable().subscribeOn(getSecureSignatureComp.setMin()).observeOn(getSecureSignatureComp.setMin()).subscribe(new length(this));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.setMin;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        this.setMin = null;
        GriverProgressBar.UpdateRunnable updateRunnable2 = this.getMin;
        if (updateRunnable2 != null) {
            updateRunnable2.dispose();
        }
    }
}
