package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.perf.metrics.Trace;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverOpenAuthExtension;
import o.completeScroll;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/contract/ott/OttVerifyPresenter;", "Lid/dana/contract/ott/OttVerifyContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/contract/ott/OttVerifyContract$View;", "getOttVerify", "Lid/dana/domain/ott/interactor/GetOttVerify;", "getPhoneNumber", "Lid/dana/domain/account/interactor/GetPhoneNumber;", "(Landroid/content/Context;Lid/dana/contract/ott/OttVerifyContract$View;Lid/dana/domain/ott/interactor/GetOttVerify;Lid/dana/domain/account/interactor/GetPhoneNumber;)V", "tag", "", "kotlin.jvm.PlatformType", "onDestroy", "", "verifyOttContent", "ottValue", "verifyPhoneNumber", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class resetTouch implements completeScroll.getMax {
    private final getSecurityExtraData getMax;
    /* access modifiers changed from: private */
    public final Context getMin;
    /* access modifiers changed from: private */
    public final String length = resetTouch.class.getSimpleName();
    /* access modifiers changed from: private */
    public final completeScroll.setMax setMax;
    public final GriverOpenAuthExtension.RevokeCallback setMin;

    @Inject
    public resetTouch(@NotNull Context context, @NotNull completeScroll.setMax setmax, @NotNull getSecurityExtraData getsecurityextradata, @NotNull GriverOpenAuthExtension.RevokeCallback revokeCallback) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmax, "view");
        Intrinsics.checkNotNullParameter(getsecurityextradata, "getOttVerify");
        Intrinsics.checkNotNullParameter(revokeCallback, Constants.JS_API_GET_PHONE_NUMBER);
        this.getMin = context;
        this.setMax = setmax;
        this.getMax = getsecurityextradata;
        this.setMin = revokeCallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/ott/OttVerifyPresenter$verifyOttContent$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/ott/OttVerifyResult;", "onError", "", "throwable", "", "onNext", "ottVerifyResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<StartupParamsUtils> {
        final /* synthetic */ resetTouch setMin;

        length(resetTouch resettouch) {
            this.setMin = resettouch;
        }

        public final /* synthetic */ void onNext(Object obj) {
            StartupParamsUtils startupParamsUtils = (StartupParamsUtils) obj;
            Intrinsics.checkNotNullParameter(startupParamsUtils, "ottVerifyResult");
            completeScroll.setMax min = this.setMin.setMax;
            Intrinsics.checkNotNullParameter(startupParamsUtils, "$this$toOttVerifyModel");
            String userId = startupParamsUtils.getUserId();
            String str = "";
            if (userId == null) {
                userId = str;
            }
            String merchantId = startupParamsUtils.getMerchantId();
            if (merchantId == null) {
                merchantId = str;
            }
            Boolean needLogout = startupParamsUtils.getNeedLogout();
            boolean booleanValue = needLogout != null ? needLogout.booleanValue() : false;
            String phoneNumber = startupParamsUtils.getPhoneNumber();
            if (phoneNumber != null) {
                str = phoneNumber;
            }
            min.getMax(new doLog(userId, merchantId, booleanValue, str));
            this.setMin.setMax.dismissProgress();
        }

        public final void onError(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "throwable");
            super.onError(th);
            getBubbleHeight min = getBubbleHeight.getMax.getMin();
            Intrinsics.checkNotNullParameter("deeplink_payment_with_ott", "name");
            Trace trace = min.getMin.get("deeplink_payment_with_ott");
            if (trace != null) {
                trace.stop();
            }
            completeScroll.setMax min2 = this.setMin.setMax;
            Context length = this.setMin.getMin;
            if (th instanceof NetworkException) {
                str = ((NetworkException) th).getMessage();
            } else {
                str = length.getString(R.string.general_error_msg);
            }
            min2.onError(str);
            this.setMin.setMax.dismissProgress();
            updateActionSheetContent.e(this.setMin.length, th.getMessage());
        }
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "ottValue");
        this.setMax.showProgress();
        this.getMax.execute(new length(this), str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/ott/OttVerifyPresenter$verifyPhoneNumber$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "throwable", "", "onNext", "phoneNumber", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ resetTouch getMax;

        public setMax(resetTouch resettouch) {
            this.getMax = resettouch;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            String str2 = getStartDelay.IsOverlapping.setMin().setMax;
            if (str2 == null) {
                str2 = "";
            }
            this.getMax.setMax.setMin(Intrinsics.areEqual((Object) isOriginHasAppInfo.getClearPhoneNumber(str), (Object) isOriginHasAppInfo.getClearPhoneNumber(str2)));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            super.onError(th);
            updateActionSheetContent.e(this.getMax.length, th.getMessage());
        }
    }

    public final void setMax() {
        this.getMax.dispose();
        this.setMin.dispose();
    }
}
