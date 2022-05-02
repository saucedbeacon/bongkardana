package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.appsflyer.AppsFlyerLib;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.constant.TrackerType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.convertDipToPx;
import o.getTypefaceByCat;
import o.inTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0006\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/challenge/pin/LogoutPresenter;", "Lid/dana/challenge/pin/LogoutContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/challenge/pin/LogoutContract$View;", "logout", "Lid/dana/domain/login/interactor/Logout;", "deviceInfo", "Lid/dana/data/config/DeviceInformationProvider;", "clearFaceAuthSuggestionState", "Lid/dana/domain/auth/face/interactor/ClearFaceAuthSuggestionState;", "(Landroid/content/Context;Lid/dana/challenge/pin/LogoutContract$View;Lid/dana/domain/login/interactor/Logout;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/domain/auth/face/interactor/ClearFaceAuthSuggestionState;)V", "clearUserEducation", "", "onDestroy", "setEventTrackerLogout", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class createAllTables implements inTransaction.getMax {
    private final GriverMonitor getMax;
    private final setToolbarMenus getMin;
    /* access modifiers changed from: private */
    public final inTransaction.getMin length;
    private final getPerformanceTracker setMax;
    private final Context setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aBoolean", "", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Boolean, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final void invoke(@Nullable Boolean bool) {
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final void invoke(@Nullable Throwable th) {
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public createAllTables(@NotNull Context context, @NotNull inTransaction.getMin getmin, @NotNull GriverMonitor griverMonitor, @NotNull getPerformanceTracker getperformancetracker, @NotNull setToolbarMenus settoolbarmenus) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(griverMonitor, "logout");
        Intrinsics.checkNotNullParameter(getperformancetracker, DanaLogConstants.BizType.DEVICE_INFO);
        Intrinsics.checkNotNullParameter(settoolbarmenus, "clearFaceAuthSuggestionState");
        this.setMin = context;
        this.length = getmin;
        this.getMax = griverMonitor;
        this.setMax = getperformancetracker;
        this.getMin = settoolbarmenus;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/challenge/pin/LogoutPresenter$logout$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "error", "", "onNext", "state", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ createAllTables setMin;

        length(createAllTables createalltables) {
            this.setMin = createalltables;
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            super.onError(th);
            this.setMin.length.getMin();
            this.setMin.length.getMax();
            updateActionSheetContent.logNetworkException("logout", DanaLogConstants.ExceptionType.LOGOUT_EXCEPTION, th);
        }

        public final /* synthetic */ void onNext(Object obj) {
            AppsFlyerLib.getInstance().setCustomerUserId((String) null);
            this.setMin.length.getMin();
            this.setMin.length.getMax();
            createAllTables.length(this.setMin);
            getDeviceName.length().onNext(Boolean.FALSE);
        }
    }

    public final void length() {
        this.length.setMax();
        this.getMax.execute(new length(this));
        this.getMin.execute(onReceivedIcon.INSTANCE, getMax.INSTANCE, setMax.INSTANCE);
    }

    public final void setMax() {
        this.getMax.dispose();
    }

    public static final /* synthetic */ void length(createAllTables createalltables) {
        convertDipToPx.length length2 = new convertDipToPx.length(createalltables.setMin);
        length2.getMax = TrackerKey.Event.LOGOUT;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.LOGOUT_TYPE, "Normal");
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        judgeRes.setMin(new getTypefaceByCat(new getTypefaceByCat.setMin(), (byte) 0), TrackerType.MIXPANEL, createalltables.setMax).setMin();
    }
}
