package o;

import android.content.Context;
import android.location.Location;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.constants.ErrorCode;
import id.dana.data.base.NetworkException;
import id.dana.data.network.exception.MockGpsDetectedException;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.MemoryWarningBridgeExtension;
import o.OpenAPIBridgeExtension;
import o.convertDipToPx;
import o.onEmbedViewParamChanged;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0006\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodePresenter;", "Lid/dana/onboarding/referral/ReferralContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/onboarding/referral/ReferralContract$View;", "verifyReferralCode", "Lid/dana/domain/referral/interactor/VerifyReferralCode;", "getIndoSubdivisionsByLocation", "Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;", "(Landroid/content/Context;Lid/dana/onboarding/referral/ReferralContract$View;Lid/dana/domain/referral/interactor/VerifyReferralCode;Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;)V", "cityRequiredErrorCounter", "", "validReferral", "", "gotoProfile", "", "referralCode", "", "handleNetworkException", "exception", "Lid/dana/data/base/NetworkException;", "onDestroy", "trackEvent", "verifyReferralCodeWithGivenLocation", "userLocation", "Landroid/location/Location;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendUPDMessageExtension implements MemoryWarningBridgeExtension.length {
    @NotNull
    public static final length getMin = new length((byte) 0);
    /* access modifiers changed from: private */
    public int getMax = 1;
    /* access modifiers changed from: private */
    public final MemoryWarningBridgeExtension.getMax isInside;
    final OpenAPIBridgeExtension length;
    /* access modifiers changed from: package-private */
    public boolean setMax;
    private final Context setMin;
    private final onEmbedViewParamChanged toIntRange;

    @Inject
    public SendUPDMessageExtension(@NotNull Context context, @NotNull MemoryWarningBridgeExtension.getMax getmax, @NotNull OpenAPIBridgeExtension openAPIBridgeExtension, @NotNull onEmbedViewParamChanged onembedviewparamchanged) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(openAPIBridgeExtension, "verifyReferralCode");
        Intrinsics.checkNotNullParameter(onembedviewparamchanged, "getIndoSubdivisionsByLocation");
        this.setMin = context;
        this.isInside = getmax;
        this.length = openAPIBridgeExtension;
        this.toIntRange = onembedviewparamchanged;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/onboarding/referral/VerifyReferralCodePresenter$verifyReferralCode$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/referral/model/VerifyReferralCodeResponse;", "onError", "", "e", "", "onNext", "response", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<OpenAPIBridgeExtension.AnonymousClass2> {
        final /* synthetic */ SendUPDMessageExtension getMax;

        setMax(SendUPDMessageExtension sendUPDMessageExtension) {
            this.getMax = sendUPDMessageExtension;
        }

        public final /* synthetic */ void onNext(Object obj) {
            OpenAPIBridgeExtension.AnonymousClass2 r2 = (OpenAPIBridgeExtension.AnonymousClass2) obj;
            Intrinsics.checkNotNullParameter(r2, "response");
            if (!r2.isSuccess() || !r2.isValid()) {
                this.getMax.isInside.length((String) null);
                return;
            }
            this.getMax.setMax = true;
            this.getMax.isInside.getMin();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            if (this.getMax.getMax >= 2) {
                this.getMax.isInside.length((String) null);
            } else if (th instanceof NetworkException) {
                SendUPDMessageExtension.getMax(this.getMax, (NetworkException) th);
            } else if (th instanceof MockGpsDetectedException) {
                this.getMax.isInside.toIntRange();
            } else {
                this.getMax.isInside.length((String) null);
            }
        }
    }

    public final void setMax(@Nullable String str) {
        this.setMax = false;
        this.length.execute(new setMax(this), OpenAPIBridgeExtension.getMin.forReferralVerify(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/onboarding/referral/VerifyReferralCodePresenter$verifyReferralCodeWithGivenLocation$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "onError", "", "e", "", "onNext", "indoSubdivisions", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<onUpdateResult> {
        final /* synthetic */ SendUPDMessageExtension getMax;
        final /* synthetic */ String getMin;

        getMin(SendUPDMessageExtension sendUPDMessageExtension, String str) {
            this.getMax = sendUPDMessageExtension;
            this.getMin = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            Intrinsics.checkNotNullParameter((onUpdateResult) obj, "indoSubdivisions");
            SendUPDMessageExtension sendUPDMessageExtension = this.getMax;
            String str = this.getMin;
            sendUPDMessageExtension.setMax = false;
            sendUPDMessageExtension.length.execute(new setMax(sendUPDMessageExtension), OpenAPIBridgeExtension.getMin.forReferralVerify(str));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.isInside.length((String) null);
        }
    }

    public final void length(@Nullable String str, @NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "userLocation");
        this.toIntRange.execute(new getMin(this, str), onEmbedViewParamChanged.setMax.getMin.forLocation$default(onEmbedViewParamChanged.setMax.Companion, location, false, false, 6, (Object) null));
    }

    public final void setMin(@Nullable String str) {
        if (this.setMax) {
            this.isInside.toFloatRange();
            if (str == null) {
                str = "";
            }
            convertDipToPx.length length2 = new convertDipToPx.length(this.setMin);
            length2.getMax = TrackerKey.Event.REGISTRATION_REFERRAL_INPUT;
            convertDipToPx.length max = length2.setMax("Referral Code", str);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        }
    }

    public final void setMax() {
        this.getMax = 0;
        this.length.dispose();
        this.toIntRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/onboarding/referral/VerifyReferralCodePresenter$Companion;", "", "()V", "MAXIMUM_ERROR_COUNT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMax(SendUPDMessageExtension sendUPDMessageExtension, NetworkException networkException) {
        String errorCode = networkException.getErrorCode();
        if (errorCode != null) {
            switch (errorCode.hashCode()) {
                case 408596276:
                    if (errorCode.equals(ErrorCode.PROMO_LOCATION_REQUIRED)) {
                        sendUPDMessageExtension.getMax++;
                        sendUPDMessageExtension.isInside.length();
                        return;
                    }
                    break;
                case 408596277:
                    if (errorCode.equals(ErrorCode.PROMO_LOCATION_NOT_VALID)) {
                        sendUPDMessageExtension.isInside.length(networkException.getMessage());
                        return;
                    }
                    break;
            }
        }
        sendUPDMessageExtension.isInside.length(networkException.getMessage());
    }
}
