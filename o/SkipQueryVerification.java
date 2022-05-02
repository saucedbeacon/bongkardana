package o;

import android.content.Context;
import android.os.Bundle;
import com.alipay.iap.android.common.utils.security.RSAHelper;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.isMainThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J.\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J8\u0010\u0016\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J5\u0010\u0019\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u001bJ$\u0010\u001c\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u001d\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010 \u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/challenge/pin/PinSwitchAutoRoutePresenter;", "Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "context", "Landroid/content/Context;", "switchAutoRouting", "Lid/dana/domain/autoroute/interactor/SwitchAutoRouting;", "view", "Lid/dana/challenge/pin/AbstractPinContract$View;", "(Landroid/content/Context;Lid/dana/domain/autoroute/interactor/SwitchAutoRouting;Lid/dana/challenge/pin/AbstractPinContract$View;)V", "checkFeatureFaceLoginEnable", "", "checkIsAppFirstLaunch", "checkKnowledgeBasedAuthFeature", "input", "inputPin", "", "withMobileData", "", "inputAutoRoute", "pubKey", "securityId", "autoRouteStatus", "inputPaymentAuth", "authType", "authStatus", "inputSwitchFaceAuth", "faceAuthNew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "inputTrustRisk", "inputTwilio", "verificationMethod", "sendOtpStrategy", "inputWithData", "data", "Landroid/os/Bundle;", "onDestroy", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SkipQueryVerification implements isMainThread.getMax {
    @NotNull
    public static final length length = new length((byte) 0);
    /* access modifiers changed from: private */
    public final Context getMax;
    /* access modifiers changed from: private */
    public final isMainThread.getMin setMax;
    private final getIconDrawable setMin;

    public final void getMax() {
    }

    public final void getMax(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4) {
    }

    public final void getMax(@Nullable String str, boolean z) {
    }

    public final void getMin(@Nullable String str, @Nullable Bundle bundle) {
    }

    public final void getMin(@Nullable String str, @Nullable String str2, boolean z) {
    }

    public final void length(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
    }

    public final void setMin() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/autoroute/model/UserAutoRouteConfigSwitch;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<GriverGeoLocationExtension, Unit> {
        final /* synthetic */ SkipQueryVerification this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(SkipQueryVerification skipQueryVerification) {
            super(1);
            this.this$0 = skipQueryVerification;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverGeoLocationExtension) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverGeoLocationExtension griverGeoLocationExtension) {
            Intrinsics.checkNotNullParameter(griverGeoLocationExtension, "it");
            this.this$0.setMax.dismissProgress();
            this.this$0.setMax.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SkipQueryVerification this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SkipQueryVerification skipQueryVerification) {
            super(1);
            this.this$0 = skipQueryVerification;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            String str;
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMax.dismissProgress();
            boolean z = th instanceof NetworkException;
            if (z) {
                isMainThread.getMin max = this.this$0.setMax;
                NetworkException networkException = (NetworkException) th;
                String errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                int leftTimes = networkException.getLeftTimes();
                if (leftTimes == null) {
                    leftTimes = 0;
                }
                max.getMin(errorCode, message, leftTimes);
            } else {
                isMainThread.getMin max2 = this.this$0.setMax;
                Context min = this.this$0.getMax;
                if (z) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min.getString(R.string.general_error_msg);
                }
                max2.onError(str);
            }
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.AUTO_ROUTE_SWITCH);
            sb.append(this.this$0.getClass().getName());
            sb.append(":onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.AUTO_ROUTE_SWITCH, sb.toString(), th);
        }
    }

    @Inject
    public SkipQueryVerification(@NotNull Context context, @NotNull getIconDrawable geticondrawable, @NotNull isMainThread.getMin getmin) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(geticondrawable, "switchAutoRouting");
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.getMax = context;
        this.setMin = geticondrawable;
        this.setMax = getmin;
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
        this.setMax.showProgress();
        this.setMin.execute(new GriverTitleBarCreatedEvent(Boolean.valueOf(z), "PASSWORD", str3, RSAHelper.encrypt(str, str2)), new getMin(this), new setMin(this));
    }

    public final void setMax() {
        this.setMin.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/challenge/pin/PinSwitchAutoRoutePresenter$Companion;", "", "()V", "PASSWORD", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
