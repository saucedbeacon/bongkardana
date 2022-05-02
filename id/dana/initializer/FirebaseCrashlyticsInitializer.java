package id.dana.initializer;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.DanaAppInitializer;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.TypefaceCache;
import o.a;
import o.setShowingForActionMode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u000f0\u000eH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lid/dana/initializer/FirebaseCrashlyticsInitializer;", "Landroidx/startup/Initializer;", "", "()V", "loginLogoutObserver", "Lid/dana/toggle/userloginlogout/LoginLogoutObserver;", "getLoginLogoutObserver", "()Lid/dana/toggle/userloginlogout/LoginLogoutObserver;", "setLoginLogoutObserver", "(Lid/dana/toggle/userloginlogout/LoginLogoutObserver;)V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FirebaseCrashlyticsInitializer implements setShowingForActionMode<Unit> {
    @Inject
    public LoginLogoutObserver loginLogoutObserver;

    public final /* synthetic */ Object setMin(Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (PrepareException.getMin != null) {
            PrepareException.getMin.setMax.length(this);
            LoginLogoutObserver loginLogoutObserver2 = this.loginLogoutObserver;
            if (loginLogoutObserver2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginLogoutObserver");
            }
            loginLogoutObserver2.length(new setMin());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Application components needs to be set in Application");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/initializer/FirebaseCrashlyticsInitializer$create$1", "Lid/dana/toggle/userloginlogout/ILoginLogoutObserver;", "onChange", "", "userLogin", "Lid/dana/data/login/LoginLogoutSubject$UserLogin;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements TypefaceCache {
        setMin() {
        }

        public final void getMin(@NotNull a.AnonymousClass7.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "userLogin");
            FirebaseCrashlytics.getInstance().setUserId(setmin.getUserId());
        }
    }

    @NotNull
    public final List<Class<? extends setShowingForActionMode<?>>> getMin() {
        return CollectionsKt.listOf(DanaAppInitializer.class);
    }
}
