package o;

import android.content.Context;
import android.provider.Settings;
import com.alipay.iap.android.lbs.LBSLocation;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.toggle.locationpermission.LocationPermissionObserver;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ShareRecyclerAdapter;
import o.a;
import o.onEmbedViewParamChanged;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lid/dana/toggle/SplitObservant;", "", "context", "Landroid/content/Context;", "locationPermissionObserver", "Lid/dana/toggle/locationpermission/LocationPermissionObserver;", "loginLogoutObserver", "Lid/dana/toggle/userloginlogout/LoginLogoutObserver;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "getIndoSubdivisionsByLocation", "Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;", "getLatestTransaction", "Lid/dana/domain/account/interactor/GetLatestTransaction;", "getUserInfo", "Lid/dana/domain/user/interactor/GetUserInfo;", "userInfoMapper", "Lid/dana/myprofile/UserInfoMapper;", "(Landroid/content/Context;Lid/dana/toggle/locationpermission/LocationPermissionObserver;Lid/dana/toggle/userloginlogout/LoginLogoutObserver;Lid/dana/data/toggle/SplitFacade;Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;Lid/dana/domain/account/interactor/GetLatestTransaction;Lid/dana/domain/user/interactor/GetUserInfo;Lid/dana/myprofile/UserInfoMapper;)V", "addGeoLocationAttribute", "", "indoSubdivisions", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "addLastTransactionAttribute", "transaction", "Lid/dana/domain/account/model/Transaction;", "addUserInfoAttribute", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "initLocationPermissionObserver", "initLoginLogoutObserver", "isGpsMockedForUnderLollipop", "", "locationPermissionOnChaged", "isEnabled", "obtainLastTransactionAttribute", "obtainLatestLocationAttribute", "setLoggedInAttribute", "userId", "", "setUserAttribute", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EmojiImageSpan {
    private final UpdateAppCallback getMax;
    private final onEmbedViewParamChanged getMin;
    private final sendData isInside;
    private final Context length;
    private final LoginLogoutObserver setMax;
    private final LocationPermissionObserver setMin;
    private final ShareRecyclerAdapter.ShareViewHolder toFloatRange;
    private final getOpenAuthStatus toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ EmojiImageSpan this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(EmojiImageSpan emojiImageSpan) {
            super(1);
            this.this$0 = emojiImageSpan;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            StringBuilder sb = new StringBuilder();
            sb.append(this.this$0.getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT, sb.toString(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "transaction", "Lid/dana/domain/account/model/Transaction;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<GriverOptionMenuPanelExtension, Unit> {
        final /* synthetic */ EmojiImageSpan this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(EmojiImageSpan emojiImageSpan) {
            super(1);
            this.this$0 = emojiImageSpan;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverOptionMenuPanelExtension) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverOptionMenuPanelExtension griverOptionMenuPanelExtension) {
            Intrinsics.checkNotNullParameter(griverOptionMenuPanelExtension, "transaction");
            EmojiImageSpan.setMin(griverOptionMenuPanelExtension);
        }
    }

    @Inject
    public EmojiImageSpan(@NotNull Context context, @NotNull LocationPermissionObserver locationPermissionObserver, @NotNull LoginLogoutObserver loginLogoutObserver, @NotNull UpdateAppCallback updateAppCallback, @NotNull onEmbedViewParamChanged onembedviewparamchanged, @NotNull getOpenAuthStatus getopenauthstatus, @NotNull sendData senddata, @NotNull ShareRecyclerAdapter.ShareViewHolder shareViewHolder) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(locationPermissionObserver, "locationPermissionObserver");
        Intrinsics.checkNotNullParameter(loginLogoutObserver, "loginLogoutObserver");
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        Intrinsics.checkNotNullParameter(onembedviewparamchanged, "getIndoSubdivisionsByLocation");
        Intrinsics.checkNotNullParameter(getopenauthstatus, "getLatestTransaction");
        Intrinsics.checkNotNullParameter(senddata, "getUserInfo");
        Intrinsics.checkNotNullParameter(shareViewHolder, "userInfoMapper");
        this.length = context;
        this.setMin = locationPermissionObserver;
        this.setMax = loginLogoutObserver;
        this.getMax = updateAppCallback;
        this.getMin = onembedviewparamchanged;
        this.toIntRange = getopenauthstatus;
        this.isInside = senddata;
        this.toFloatRange = shareViewHolder;
        locationPermissionObserver.getMax(new setMax(this));
        this.setMax.length(new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/toggle/SplitObservant$initLoginLogoutObserver$1", "Lid/dana/toggle/userloginlogout/ILoginLogoutObserver;", "onChange", "", "userLogin", "Lid/dana/data/login/LoginLogoutSubject$UserLogin;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements TypefaceCache {
        final /* synthetic */ EmojiImageSpan getMax;

        getMin(EmojiImageSpan emojiImageSpan) {
            this.getMax = emojiImageSpan;
        }

        public final void getMin(@NotNull a.AnonymousClass7.setMin setmin) {
            Intrinsics.checkNotNullParameter(setmin, "userLogin");
            if (setmin.isLoggedIn()) {
                EmojiImageSpan.setMin(this.getMax, setmin.getUserId());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/toggle/SplitObservant$initLocationPermissionObserver$1", "Lid/dana/toggle/locationpermission/ILocationPermissionObserver;", "onChange", "", "isEnabled", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements parseColor {
        final /* synthetic */ EmojiImageSpan getMin;

        setMax(EmojiImageSpan emojiImageSpan) {
            this.getMin = emojiImageSpan;
        }

        public final void getMax(boolean z) {
            EmojiImageSpan.length(this.getMin, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"id/dana/toggle/SplitObservant$obtainLatestLocationAttribute$1$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "onError", "", "e", "", "onNext", "indoSubdivisions", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<onUpdateResult> {
        final /* synthetic */ EmojiImageSpan length;

        setMin(EmojiImageSpan emojiImageSpan) {
            this.length = emojiImageSpan;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onUpdateResult onupdateresult = (onUpdateResult) obj;
            Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivisions");
            EmojiImageSpan.getMax(onupdateresult);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT, sb.toString(), th);
        }
    }

    private final boolean setMin() {
        if (!CornerMarkingDataProvider.valueOf() || Settings.Secure.getString(this.length.getContentResolver(), "mock_location") == "0") {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/toggle/SplitObservant$setUserAttribute$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onError", "", "e", "", "onNext", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ EmojiImageSpan length;

        IsOverlapping(EmojiImageSpan emojiImageSpan) {
            this.length = emojiImageSpan;
        }

        public final /* synthetic */ void onNext(Object obj) {
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            EmojiImageSpan.getMax(this.length, disconnect);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.SPLIT, sb.toString(), th);
        }
    }

    public static final /* synthetic */ void setMin(EmojiImageSpan emojiImageSpan, String str) {
        UpdateAppCallback.getMin("user_id", str);
        emojiImageSpan.isInside.executeInBackground(new IsOverlapping(emojiImageSpan));
        emojiImageSpan.toIntRange.executeInBackground(onReceivedIcon.INSTANCE, new length(emojiImageSpan), new getMax(emojiImageSpan));
    }

    public static final /* synthetic */ void length(EmojiImageSpan emojiImageSpan, boolean z) {
        LBSLocation latestLocation;
        if (z && (latestLocation = handlePushWindow.getLatestLocation(emojiImageSpan.length)) != null) {
            emojiImageSpan.getMin.executeInBackground(new setMin(emojiImageSpan), onEmbedViewParamChanged.setMax.Companion.forLocation(latestLocation, true, emojiImageSpan.setMin()));
        }
        UpdateAppCallback.getMin("location_permission", Boolean.valueOf(z));
    }

    public static final /* synthetic */ void setMin(GriverOptionMenuPanelExtension griverOptionMenuPanelExtension) {
        if (griverOptionMenuPanelExtension.getDate().length() > 0) {
            if (griverOptionMenuPanelExtension.getType().length() > 0) {
                UpdateAppCallback.getMax(MapsKt.mapOf(TuplesKt.to("last_transaction_type", griverOptionMenuPanelExtension.getType()), TuplesKt.to("last_transaction_date", griverOptionMenuPanelExtension.getDate())));
            }
        }
    }

    public static final /* synthetic */ void getMax(onUpdateResult onupdateresult) {
        Map hashMap = new HashMap();
        hashMap.put("province", onupdateresult.getProviceName());
        hashMap.put(desc.USER_CITY, onupdateresult.getCityName());
        hashMap.put("country_code", onupdateresult.getCountryCode());
        hashMap.put("country_name", onupdateresult.getCountryName());
        hashMap.put("district", onupdateresult.getDistrictName());
        UpdateAppCallback.getMax(hashMap);
    }

    public static final /* synthetic */ void getMax(EmojiImageSpan emojiImageSpan, disconnect disconnect) {
        String str;
        activityGetScreenOrientation activitygetscreenorientation;
        getPagePerfKey min = emojiImageSpan.toFloatRange.setMin(disconnect);
        String str2 = null;
        if (min == null || (activitygetscreenorientation = min.setMax) == null) {
            str = null;
        } else {
            str = activitygetscreenorientation.getMax;
        }
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            str2 = str;
        }
        if (str2 != null) {
            UpdateAppCallback.getMin("kyc_level", str2);
        }
    }
}
