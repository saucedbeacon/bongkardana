package o;

import android.content.Context;
import android.text.TextUtils;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import io.reactivex.internal.util.NotificationLite;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.a;
import o.sendLocation;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lid/dana/toggle/TrafficTypeUserProxy;", "Lid/dana/data/toggle/traffictype/LazyTrafficTypeFactory;", "context", "Landroid/content/Context;", "config", "Lid/dana/lib/toggle/ToggleClientConfig$Builder;", "apikey", "", "loginLogoutObserver", "Lid/dana/toggle/userloginlogout/LoginLogoutObserver;", "mixpanelEntityRepository", "Lid/dana/data/tracker/MixpanelEntityRepository;", "loginLogoutSubject", "Lid/dana/data/login/LoginLogoutSubject;", "preferenceAccountEntityData", "Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;", "(Landroid/content/Context;Lid/dana/lib/toggle/ToggleClientConfig$Builder;Ljava/lang/String;Lid/dana/toggle/userloginlogout/LoginLogoutObserver;Lid/dana/data/tracker/MixpanelEntityRepository;Lid/dana/data/login/LoginLogoutSubject;Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;)V", "subjectTrafficTypeUser", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "trafficTypeUser", "Lid/dana/data/toggle/traffictype/user/TrafficTypeUser;", "getTrafficTypeUser", "()Lid/dana/data/toggle/traffictype/user/TrafficTypeUser;", "trafficTypeUser$delegate", "Lkotlin/Lazy;", "addObserverLoginLogout", "", "checkTrafficTypeUserIsAlreadyAdded", "", "getBaseTrafficType", "Lio/reactivex/Observable;", "initTrafficTypeUser", "userId", "obtainUserIdFromPreference", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getScreenWidth_Height implements setForce {
    private final removeString<getRequestMainPackage> getMin;
    final Lazy length;

    @Inject
    public getScreenWidth_Height(@NotNull Context context, @NotNull sendLocation.setMin setmin, @NotNull String str, @NotNull LoginLogoutObserver loginLogoutObserver, @NotNull getQueryScene getqueryscene, @NotNull a.AnonymousClass7 r7, @NotNull getFrameMarginVertical$core getframemarginvertical_core) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmin, "config");
        Intrinsics.checkNotNullParameter(str, "apikey");
        Intrinsics.checkNotNullParameter(loginLogoutObserver, "loginLogoutObserver");
        Intrinsics.checkNotNullParameter(getqueryscene, "mixpanelEntityRepository");
        Intrinsics.checkNotNullParameter(r7, "loginLogoutSubject");
        Intrinsics.checkNotNullParameter(getframemarginvertical_core, "preferenceAccountEntityData");
        this.length = LazyKt.lazy(new setMax(context, setmin, str, getqueryscene));
        removeString<getRequestMainPackage> max = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "BehaviorSubject.create()");
        this.getMin = max;
        getframemarginvertical_core.getUserId().subscribeOn(getSecureSignatureComp.setMin()).observeOn(getSecureSignatureComp.setMin()).subscribe(new setMin(r7));
        loginLogoutObserver.length(new length(this));
        Object obj3 = loginLogoutObserver.getMax.getSubject().getMax.get();
        Object obj4 = null;
        if (NotificationLite.isComplete(obj3) || NotificationLite.isError(obj3)) {
            obj = null;
        } else {
            obj = NotificationLite.getValue(obj3);
        }
        Intrinsics.checkNotNull(obj);
        if (((a.AnonymousClass7.setMin) obj).isLoggedIn()) {
            Object obj5 = loginLogoutObserver.getMax.getSubject().getMax.get();
            if (NotificationLite.isComplete(obj5) || NotificationLite.isError(obj5)) {
                obj2 = null;
            } else {
                obj2 = NotificationLite.getValue(obj5);
            }
            Intrinsics.checkNotNull(obj2);
            if (!TextUtils.isEmpty(((a.AnonymousClass7.setMin) obj2).getUserId())) {
                Object obj6 = loginLogoutObserver.getMax.getSubject().getMax.get();
                if (!NotificationLite.isComplete(obj6) && !NotificationLite.isError(obj6)) {
                    obj4 = NotificationLite.getValue(obj6);
                }
                Intrinsics.checkNotNull(obj4);
                getMin(((a.AnonymousClass7.setMin) obj4).getUserId());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/toggle/traffictype/user/TrafficTypeUser;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<UpdateAppParam> {
        final /* synthetic */ String $apikey;
        final /* synthetic */ sendLocation.setMin $config;
        final /* synthetic */ Context $context;
        final /* synthetic */ getQueryScene $mixpanelEntityRepository;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(Context context, sendLocation.setMin setmin, String str, getQueryScene getqueryscene) {
            super(0);
            this.$context = context;
            this.$config = setmin;
            this.$apikey = str;
            this.$mixpanelEntityRepository = getqueryscene;
        }

        @NotNull
        public final UpdateAppParam invoke() {
            return new UpdateAppParam(this.$context, this.$config, this.$apikey, this.$mixpanelEntityRepository);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/toggle/TrafficTypeUserProxy$obtainUserIdFromPreference$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "userId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ a.AnonymousClass7 setMin;

        setMin(a.AnonymousClass7 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "userId");
            super.onNext(str);
            if (str.length() > 0) {
                this.setMin.setUserId(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/toggle/TrafficTypeUserProxy$addObserverLoginLogout$1", "Lid/dana/toggle/userloginlogout/ILoginLogoutObserver;", "onChange", "", "userLogin", "Lid/dana/data/login/LoginLogoutSubject$UserLogin;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements TypefaceCache {
        final /* synthetic */ getScreenWidth_Height setMax;

        length(getScreenWidth_Height getscreenwidth_height) {
            this.setMax = getscreenwidth_height;
        }

        public final void getMin(@NotNull a.AnonymousClass7.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "userLogin");
            if (setmin.isLoggedIn()) {
                this.setMax.getMin(setmin.getUserId());
                return;
            }
            isUesCacheLocation max = isUesCacheLocation.getMax();
            getCurrentLocation remove = max.length.remove(((UpdateAppParam) this.setMax.length.getValue()).setMin());
            if (remove != null && remove.setMin != null) {
                remove.setMin.flush();
                remove.setMin.destroy();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(String str) {
        if (!setMin()) {
            removeString<getRequestMainPackage> removestring = this.getMin;
            UpdateAppParam updateAppParam = (UpdateAppParam) this.length.getValue();
            updateAppParam.getMin(str);
            Unit unit = Unit.INSTANCE;
            removestring.onNext(updateAppParam);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getRequestMainPackage> length() {
        return this.getMin;
    }

    private final boolean setMin() {
        return ((UpdateAppParam) this.length.getValue()).getMax();
    }
}
