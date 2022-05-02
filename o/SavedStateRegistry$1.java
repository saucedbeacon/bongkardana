package o;

import android.content.Context;
import android.os.Bundle;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.challenge.ChallengeControl;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.isMainThread;
import o.queryLocalIdByPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J8\u0010\u001d\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0016J5\u0010 \u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\"J$\u0010#\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010$\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010%\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010'\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010(\u001a\u00020\nH\u0016J\b\u0010)\u001a\u00020\nH\u0002J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000eH\u0002J\b\u0010-\u001a\u00020\nH\u0002J\f\u0010.\u001a\u00020\u0018*\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lid/dana/challenge/pin/presenter/PinUnbindMerchantPresenter;", "Lid/dana/challenge/pin/AbstractPinContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/challenge/pin/AbstractPinContract$View;", "unbindMerchant", "Lid/dana/domain/merchantmanagement/interactor/UnbindMerchant;", "(Landroid/content/Context;Lid/dana/challenge/pin/AbstractPinContract$View;Lid/dana/domain/merchantmanagement/interactor/UnbindMerchant;)V", "checkFeatureFaceLoginEnable", "", "checkIsAppFirstLaunch", "checkKnowledgeBasedAuthFeature", "getUnbindMerchantParam", "Lid/dana/domain/merchantmanagement/model/UnbindMerchantParam;", "inputPin", "", "data", "Landroid/os/Bundle;", "handleOnErrorInputPin", "throwable", "", "input", "withMobileData", "", "inputAutoRoute", "pubKey", "securityId", "autoRouteStatus", "inputPaymentAuth", "authType", "authStatus", "inputSwitchFaceAuth", "faceAuthNew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "inputTrustRisk", "inputTwilio", "verificationMethod", "sendOtpStrategy", "inputWithData", "onDestroy", "onErrorGetBundleData", "onErrorInputPin", "onSuccessGetBundleData", "unbindMerchantParam", "onSuccessInputPin", "isMandatoryFieldContainsValue", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavedStateRegistry$1 implements isMainThread.getMax {
    private final isMainThread.getMin getMin;
    private final Context setMax;
    private final queryLocalIdByPath setMin;

    public final void getMax() {
    }

    public final void getMax(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4) {
    }

    public final void getMax(@Nullable String str, boolean z) {
    }

    public final void getMin(@Nullable String str, @Nullable String str2, boolean z) {
    }

    public final void length(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) {
    }

    public final void setMin() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ SavedStateRegistry$1 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(SavedStateRegistry$1 savedStateRegistry$1) {
            super(1);
            this.this$0 = savedStateRegistry$1;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            SavedStateRegistry$1.getMin(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ SavedStateRegistry$1 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SavedStateRegistry$1 savedStateRegistry$1) {
            super(1);
            this.this$0 = savedStateRegistry$1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            SavedStateRegistry$1.setMax(this.this$0, th);
        }
    }

    @Inject
    public SavedStateRegistry$1(@NotNull Context context, @NotNull isMainThread.getMin getmin, @NotNull queryLocalIdByPath querylocalidbypath) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(querylocalidbypath, "unbindMerchant");
        this.setMax = context;
        this.getMin = getmin;
        this.setMin = querylocalidbypath;
    }

    public final void getMin(@Nullable String str, @Nullable Bundle bundle) {
        String str2;
        this.getMin.showProgress();
        String str3 = str == null ? "" : str;
        String string = bundle != null ? bundle.getString(ChallengeControl.Key.CLIENT_ID) : null;
        if (string == null) {
            string = "";
        }
        String string2 = bundle != null ? bundle.getString(ChallengeControl.Key.PUB_KEY) : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle != null ? bundle.getString(ChallengeControl.Key.MERCHANT_ID) : null;
        if (string3 == null) {
            string3 = "";
        }
        String string4 = bundle != null ? bundle.getString(ChallengeControl.Key.DIVISION_ID) : null;
        if (bundle != null) {
            str2 = bundle.getString(ChallengeControl.Key.SECURITY_ID);
        } else {
            str2 = null;
        }
        LocalIdTool localIdTool = new LocalIdTool(string, string2, string3, string4, str3, str2 == null ? "" : str2);
        if (!setMin(localIdTool)) {
            localIdTool = null;
        }
        if (localIdTool != null) {
            this.setMin.execute(new queryLocalIdByPath.length(localIdTool), new setMax(this), new setMin(this));
            return;
        }
        SavedStateRegistry$1 savedStateRegistry$1 = this;
        savedStateRegistry$1.getMin.dismissProgress();
        savedStateRegistry$1.getMin.onError(savedStateRegistry$1.setMax.getString(R.string.home_error));
        updateActionSheetContent.e(DanaLogConstants.TAG.MERCHANT_MANAGEMENT, "Unbind Merchant bundle data is empty");
    }

    public final void setMax() {
        this.setMin.dispose();
    }

    private static boolean setMin(LocalIdTool localIdTool) {
        Iterable<String> listOf = CollectionsKt.listOf(localIdTool.getClientId(), localIdTool.getPubKey(), localIdTool.getMerchantId(), localIdTool.getPin(), localIdTool.getSecurityId());
        if (!(listOf instanceof Collection) || !((Collection) listOf).isEmpty()) {
            for (String isBlank : listOf) {
                if (!(!StringsKt.isBlank(isBlank))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final /* synthetic */ void getMin(SavedStateRegistry$1 savedStateRegistry$1) {
        savedStateRegistry$1.getMin.dismissProgress();
        savedStateRegistry$1.getMin.getMin();
    }

    public static final /* synthetic */ void setMax(SavedStateRegistry$1 savedStateRegistry$1, Throwable th) {
        savedStateRegistry$1.getMin.dismissProgress();
        if (th instanceof NetworkException) {
            isMainThread.getMin getmin = savedStateRegistry$1.getMin;
            NetworkException networkException = (NetworkException) th;
            String errorCode = networkException.getErrorCode();
            String message = th.getMessage();
            int leftTimes = networkException.getLeftTimes();
            if (leftTimes == null) {
                leftTimes = 0;
            }
            getmin.getMin(errorCode, message, leftTimes);
        } else {
            savedStateRegistry$1.getMin.onError(savedStateRegistry$1.setMax.getString(R.string.home_error));
        }
        updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.UNBIND_MERCHANT, DanaLogConstants.ExceptionType.MERCHANT_MANAGEMENT_EXCEPTION, th);
    }
}
