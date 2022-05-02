package o;

import android.content.Context;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.tracker.TrackerKey;
import id.dana.twilio.onboarding.TwilioIntroductionActivity;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ScanFilterUtils;
import o.TitleBarExtension;
import o.convertDipToPx;
import o.getPdus;
import o.isLastRecoverySucceeded;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 82\u00020\u0001:\u00018BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u001c\u0010 \u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002J\u001c\u0010$\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002J.\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010*\u001a\u00020\u0018J\b\u0010+\u001a\u00020\u0016H\u0002J\u000e\u0010,\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0018H\u0016J\u000e\u00100\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001aJ\u001e\u00101\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ \u00102\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0016J\u0018\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u000e\u00105\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001aJ\u0016\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionPresenter;", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;", "twilioConsultEnrollment", "Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment;", "checkTwilioEnrollmentStatus", "Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;", "twilioEnrollment", "Lid/dana/domain/twilio/interactor/TwilioEnrollment;", "createTwilioFactor", "Lid/dana/domain/twilio/interactor/CreateTwilioFactor;", "verifyTwilioFactor", "Lid/dana/domain/twilio/interactor/VerifyTwilioFactor;", "deleteTwilioLocalFactor", "Lid/dana/domain/twilio/interactor/DeleteTwilioLocalFactor;", "twilioBindEnrollment", "Lid/dana/domain/twilio/interactor/TwilioBindEnrollment;", "(Landroid/content/Context;Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;Lid/dana/domain/twilio/interactor/TwilioConsultEnrollment;Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;Lid/dana/domain/twilio/interactor/TwilioEnrollment;Lid/dana/domain/twilio/interactor/CreateTwilioFactor;Lid/dana/domain/twilio/interactor/VerifyTwilioFactor;Lid/dana/domain/twilio/interactor/DeleteTwilioLocalFactor;Lid/dana/domain/twilio/interactor/TwilioBindEnrollment;)V", "timeStamp", "", "bindEnroll", "", "factorId", "", "identity", "source", "consultEnrollmentStatus", "securityId", "consultEnrollmentTwilio", "convertParamToTwilioBindEnroll", "Lid/dana/twilio/onboarding/model/request/TwilioBindEnrollModel;", "convertParamToTwilioConsult", "Lid/dana/twilio/onboarding/model/request/TwilioConsultModel;", "convertParamToTwilioEnroll", "Lid/dana/twilio/onboarding/model/request/TwilioEnrollModel;", "createFactor", "serviceSid", "pushToken", "accessToken", "deleteFactor", "getCurrentTime", "getSourceForTwilioEnrollMixpanel", "isCallTimeExceeds", "", "onDestroy", "onSuccessBindEnrollmentTwilio", "retryBindEnroll", "submitEnroll", "trackTwilioEnrollFailed", "failReason", "trackTwilioEnrollSuccess", "verifyFactor", "sid", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class showBackHome implements TitleBarExtension.AnonymousClass1.getMin {
    @NotNull
    public static final getMax toIntRange = new getMax((byte) 0);
    private final isLastRecoverySucceeded IsOverlapping;
    final getStartIndex equals;
    final Context getMax;
    final onNonBeaconLeScan getMin;
    final ScanFilterUtils isInside;
    /* access modifiers changed from: package-private */
    public long length;
    public final getDetectedCrashCount setMax;
    /* access modifiers changed from: package-private */
    public final TitleBarExtension.AnonymousClass1.length setMin;
    private final getPdus toDoubleRange;
    final BootstrapNotifier toFloatRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/twilio/model/EnrollInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<enableBluetooth, Unit> {
        final /* synthetic */ String $pushToken;
        final /* synthetic */ String $source;
        final /* synthetic */ showBackHome this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(showBackHome showbackhome, String str, String str2) {
            super(1);
            this.this$0 = showbackhome;
            this.$pushToken = str;
            this.$source = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((enableBluetooth) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull enableBluetooth enablebluetooth) {
            Intrinsics.checkNotNullParameter(enablebluetooth, "it");
            if (enablebluetooth.getAccessToken().length() > 0) {
                showBackHome showbackhome = this.this$0;
                String serviceSid = enablebluetooth.getServiceSid();
                String str = "";
                if (serviceSid == null) {
                    serviceSid = str;
                }
                String identity = enablebluetooth.getIdentity();
                if (identity != null) {
                    str = identity;
                }
                String str2 = this.$pushToken;
                String accessToken = enablebluetooth.getAccessToken();
                String str3 = this.$source;
                Intrinsics.checkNotNullParameter(serviceSid, "serviceSid");
                Intrinsics.checkNotNullParameter(str, "identity");
                Intrinsics.checkNotNullParameter(str2, "pushToken");
                Intrinsics.checkNotNullParameter(accessToken, "accessToken");
                Intrinsics.checkNotNullParameter(str3, "source");
                showbackhome.isInside.execute(new toFloatRange(showbackhome, str3), new ScanFilterUtils.length(serviceSid, str, str2, accessToken));
                return;
            }
            this.this$0.setMin.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ showBackHome this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(showBackHome showbackhome) {
            super(1);
            this.this$0 = showbackhome;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/twilio/model/TwilioInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<disableBluetooth, Unit> {
        final /* synthetic */ String $source;
        final /* synthetic */ showBackHome this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(showBackHome showbackhome, String str) {
            super(1);
            this.this$0 = showbackhome;
            this.$source = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((disableBluetooth) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull disableBluetooth disablebluetooth) {
            Intrinsics.checkNotNullParameter(disablebluetooth, "it");
            List<String> verificationMethodInfos = disablebluetooth.getVerificationMethodInfos();
            boolean z = false;
            if (verificationMethodInfos != null && !verificationMethodInfos.isEmpty()) {
                z = true;
            }
            String str = "";
            if (z) {
                TitleBarExtension.AnonymousClass1.length max = this.this$0.setMin;
                String securityId = disablebluetooth.getSecurityId();
                if (securityId == null) {
                    securityId = str;
                }
                String str2 = this.$source;
                List<String> verificationMethodInfos2 = disablebluetooth.getVerificationMethodInfos();
                String str3 = verificationMethodInfos2 != null ? (String) CollectionsKt.first(verificationMethodInfos2) : null;
                if (str3 != null) {
                    str = str3;
                }
                max.getMax(securityId, str2, str);
            } else if (!disablebluetooth.getRegistered() && disablebluetooth.getRegisterAllowed()) {
                TitleBarExtension.AnonymousClass1.length max2 = this.this$0.setMin;
                String securityId2 = disablebluetooth.getSecurityId();
                if (securityId2 != null) {
                    str = securityId2;
                }
                max2.getMax(str, this.$source);
            } else if (!disablebluetooth.getRegistered() || !disablebluetooth.getRegisterAllowed()) {
                this.this$0.setMin.getMin();
            } else {
                showBackHome showbackhome = this.this$0;
                String securityId3 = disablebluetooth.getSecurityId();
                if (securityId3 != null) {
                    str = securityId3;
                }
                String str4 = this.$source;
                Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
                Intrinsics.checkNotNullParameter(str4, "source");
                showbackhome.getMin.execute(new getMin(showbackhome, str, str4));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ showBackHome this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(showBackHome showbackhome) {
            super(1);
            this.this$0 = showbackhome;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
        }
    }

    @Inject
    public showBackHome(@NotNull Context context, @NotNull TitleBarExtension.AnonymousClass1.length length2, @NotNull getDetectedCrashCount getdetectedcrashcount, @NotNull onNonBeaconLeScan onnonbeaconlescan, @NotNull isLastRecoverySucceeded islastrecoverysucceeded, @NotNull ScanFilterUtils scanFilterUtils, @NotNull getStartIndex getstartindex, @NotNull BootstrapNotifier bootstrapNotifier, @NotNull getPdus getpdus) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(getdetectedcrashcount, "twilioConsultEnrollment");
        Intrinsics.checkNotNullParameter(onnonbeaconlescan, "checkTwilioEnrollmentStatus");
        Intrinsics.checkNotNullParameter(islastrecoverysucceeded, "twilioEnrollment");
        Intrinsics.checkNotNullParameter(scanFilterUtils, "createTwilioFactor");
        Intrinsics.checkNotNullParameter(getstartindex, "verifyTwilioFactor");
        Intrinsics.checkNotNullParameter(bootstrapNotifier, "deleteTwilioLocalFactor");
        Intrinsics.checkNotNullParameter(getpdus, "twilioBindEnrollment");
        this.getMax = context;
        this.setMin = length2;
        this.setMax = getdetectedcrashcount;
        this.getMin = onnonbeaconlescan;
        this.IsOverlapping = islastrecoverysucceeded;
        this.isInside = scanFilterUtils;
        this.equals = getstartindex;
        this.toFloatRange = bootstrapNotifier;
        this.toDoubleRange = getpdus;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionPresenter$consultEnrollmentStatus$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "enrolled", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ showBackHome getMax;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;

        getMin(showBackHome showbackhome, String str, String str2) {
            this.getMax = showbackhome;
            this.setMax = str;
            this.length = str2;
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.getMax.setMin.getMax(this.setMax, this.length);
            } else {
                this.getMax.setMin.getMin();
            }
        }
    }

    public final void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-99100216, oncanceled);
            onCancelLoad.getMin(-99100216, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "source");
        Intrinsics.checkNotNullParameter(str3, "pushToken");
        isLastRecoverySucceeded islastrecoverysucceeded = this.IsOverlapping;
        multilevelSelect multilevelselect = new multilevelSelect(str, str2);
        Intrinsics.checkNotNullParameter(multilevelselect, "$this$toTwilioEnroll");
        islastrecoverysucceeded.execute(new isLastRecoverySucceeded.getMax(new isDiscovering(multilevelselect.getMin, multilevelselect.setMin)), new equals(this, str3, str2), new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionPresenter$createFactor$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ showBackHome getMax;
        final /* synthetic */ String getMin;

        toFloatRange(showBackHome showbackhome, String str) {
            this.getMax = showbackhome;
            this.getMin = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, SecurityConstants.KEY_TEXT);
            if (str.length() > 0) {
                showBackHome showbackhome = this.getMax;
                String str2 = this.getMin;
                Intrinsics.checkNotNullParameter(str, "sid");
                Intrinsics.checkNotNullParameter(str2, "source");
                showbackhome.equals.execute(new IsOverlapping(showbackhome, str2), str);
                return;
            }
            this.getMax.getMax("Create Factor error", this.getMin);
            this.getMax.setMin.getMin();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.getMax("Create Factor error", this.getMin);
            this.getMax.setMin.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionPresenter$verifyFactor$1", "Lid/dana/domain/DefaultObserver;", "", "", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<List<? extends String>> {
        final /* synthetic */ String getMax;
        final /* synthetic */ showBackHome getMin;

        IsOverlapping(showBackHome showbackhome, String str) {
            this.getMin = showbackhome;
            this.getMax = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, SecurityConstants.KEY_TEXT);
            if (!list.isEmpty()) {
                this.getMin.length = System.currentTimeMillis();
                this.getMin.setMin((String) CollectionsKt.first(list), (String) CollectionsKt.last(list), this.getMax);
                return;
            }
            this.getMin.setMin.getMin();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMin.setMin.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionPresenter$bindEnroll$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/twilio/model/BindEnrollInfo;", "onError", "", "e", "", "onNext", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<getActualLength> {
        final /* synthetic */ showBackHome getMin;
        final /* synthetic */ String length;
        final /* synthetic */ String setMax;
        final /* synthetic */ String setMin;

        setMin(showBackHome showbackhome, String str, String str2, String str3) {
            this.getMin = showbackhome;
            this.length = str;
            this.setMin = str2;
            this.setMax = str3;
        }

        public final /* synthetic */ void onNext(Object obj) {
            int i;
            getActualLength getactuallength = (getActualLength) obj;
            Intrinsics.checkNotNullParameter(getactuallength, SecurityConstants.KEY_TEXT);
            String status = getactuallength.getStatus();
            int hashCode = status.hashCode();
            if (hashCode != 2252048) {
                if (hashCode == 63390046 && status.equals("BOUND")) {
                    showBackHome showbackhome = this.getMin;
                    String str = this.length;
                    Intrinsics.checkNotNullParameter(str, "source");
                    if (str != null) {
                        i = str.length();
                    } else {
                        i = 0;
                    }
                    int max = dispatchOnCancelled.setMax(i);
                    if (i != max) {
                        onCanceled oncanceled = new onCanceled(i, max, 1);
                        onCancelLoad.setMax(-1743319330, oncanceled);
                        onCancelLoad.getMin(-1743319330, oncanceled);
                    }
                    Intrinsics.checkNotNullParameter(str, "source");
                    convertDipToPx.length length2 = new convertDipToPx.length(showbackhome.getMax);
                    length2.getMax = TrackerKey.Event.TWILIO_PUSH_ENROLL;
                    convertDipToPx.length min = length2.setMax("Source", showBackHome.setMax(str)).setMin(TrackerKey.Property.IS_SUCCESS, true);
                    min.setMin();
                    genTextSelector.getMax(new convertDipToPx(min, (byte) 0));
                    showbackhome.setMin.getMax();
                    return;
                }
            } else if (status.equals("INIT")) {
                showBackHome showbackhome2 = this.getMin;
                String str2 = this.setMin;
                String str3 = this.setMax;
                String str4 = this.length;
                Intrinsics.checkNotNullParameter(str2, "factorId");
                Intrinsics.checkNotNullParameter(str3, "identity");
                Intrinsics.checkNotNullParameter(str4, "source");
                if (showBackHome.setMax(showbackhome2.length)) {
                    showbackhome2.setMin(str2, str3, str4);
                } else {
                    showbackhome2.setMin.getMin();
                    showbackhome2.toFloatRange.execute(new toIntRange());
                }
                showbackhome2.length = showBackHome.getMin();
                return;
            }
            this.getMin.getMax("Bind enrollment error", this.length);
            this.getMin.setMin.getMin();
            this.getMin.toFloatRange.execute(new toIntRange());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMin.getMax("Bind enrollment error", this.length);
            this.getMin.setMin.onError("");
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_CONSULT, th.getMessage(), th);
        }
    }

    public final void setMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "factorId");
        Intrinsics.checkNotNullParameter(str2, "identity");
        Intrinsics.checkNotNullParameter(str3, "source");
        optionsPicker optionspicker = new optionsPicker(str, str2);
        Intrinsics.checkNotNullParameter(optionspicker, "$this$toTwilioBindEnroll");
        this.toDoubleRange.execute(new setMin(this, str3, str, str2), new getPdus.getMax(new registerBLEState(optionspicker.getMin, optionspicker.setMax)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/twilio/onboarding/TwilioIntroductionPresenter$deleteFactor$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "t", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends GriverAppVirtualHostProxy<Boolean> {
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }

        toIntRange() {
        }
    }

    public final void getMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "failReason");
        Intrinsics.checkNotNullParameter(str2, "source");
        convertDipToPx.length length2 = new convertDipToPx.length(this.getMax);
        length2.getMax = TrackerKey.Event.TWILIO_PUSH_ENROLL;
        Intrinsics.checkNotNullParameter(str2, "source");
        convertDipToPx.length max = length2.setMax("Source", Intrinsics.areEqual((Object) str2, (Object) TwilioIntroductionActivity.HOME_PAGE) ? "Home" : "Setting").setMin(TrackerKey.Property.IS_SUCCESS, false).setMax(TrackerKey.Property.FAIL_REASON, str);
        max.setMin();
        genTextSelector.getMax(new convertDipToPx(max, (byte) 0));
    }

    @NotNull
    public static String setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        return Intrinsics.areEqual((Object) str, (Object) TwilioIntroductionActivity.HOME_PAGE) ? "Home" : "Setting";
    }

    public static PickerBridgeExtension getMax(String str) {
        return new PickerBridgeExtension(str);
    }

    static long getMin() {
        return System.currentTimeMillis();
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
        this.IsOverlapping.dispose();
        this.isInside.dispose();
        this.equals.dispose();
        this.toDoubleRange.dispose();
        this.toFloatRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionPresenter$Companion;", "", "()V", "BIND_ENROLLMENT_ERROR", "", "CREATE_FACTOR_ERROR", "HOME", "MAX_RETRY_TIME", "", "PUSH_NOTIF_TOKEN_NULL", "SETTING", "STATUS_BOUND", "STATUS_INIT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    static boolean setMax(long j) {
        return System.currentTimeMillis() - j < 3000;
    }
}
