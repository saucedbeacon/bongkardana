package o;

import android.app.Activity;
import android.content.res.Resources;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.google.common.net.HttpHeaders;
import id.dana.R;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.data.login.source.VerificationErrorCode;
import id.dana.tracker.TrackerKey;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.convertDipToPx;
import o.crashDetected;
import o.forceFlush;
import o.makePhoneCall;
import o.setH5Page;
import o.setUpdateNotifier;
import o.showTwoWheelDialog;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0019H\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010+\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010-\u001a\u00020%J6\u0010.\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010/\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\u0010H\u0002J\u0010\u00103\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001005H\u0002J\u0010\u00106\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\u0012\u00108\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\u0010\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;H\u0007J\u0018\u0010<\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010=\u001a\u00020%H\u0002J\b\u0010>\u001a\u00020%H\u0002J\b\u0010?\u001a\u00020%H\u0002J\u0010\u0010@\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager;", "", "checkTwilioEnrollmentStatus", "Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;", "twilioRequestChallenge", "Lid/dana/domain/twilio/interactor/TwilioRequestChallenge;", "twilioVerifySecurityProduct", "Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;", "updateTwilioChallenge", "Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge;", "twilioMixpanelTracker", "Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "(Lid/dana/domain/twilio/interactor/CheckTwilioEnrollmentStatus;Lid/dana/domain/twilio/interactor/TwilioRequestChallenge;Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct;Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge;Lid/dana/twilio/tracker/TwilioMixpanelTracker;)V", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "challengeSid", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentAddress", "eventName", "factorSid", "geocoder", "Landroid/location/Geocoder;", "isTimeout", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "securityId", "startTime", "Ljava/util/Date;", "timeout", "", "timerUtil", "Lid/dana/utils/TimerUtil;", "verificationMethod", "approveTwilioChallenge", "", "createRequestChallengeParam", "Lid/dana/domain/twilio/interactor/TwilioRequestChallenge$Params;", "isEnrolled", "createUpdateTwilioChallengeParam", "Lid/dana/domain/twilio/interactor/UpdateTwilioChallenge$Param;", "createVerifySecurityParam", "Lid/dana/domain/twilio/interactor/TwilioVerifySecurityProduct$Param;", "disposeAllObservable", "doVerify", "getAddress", "location", "Landroid/location/Location;", "getDeviceModel", "getEnrollmentStatus", "getRequestChallengeInfo", "", "getRequestChallengeScene", "isHaveLocationPermission", "onLocationUpdate", "onNotificationReceived", "event", "Lid/dana/danah5/twilioverifysecurityproduct/TwilioPushVerifyEvent;", "requestChallenge", "startTimer", "unregisterEventBus", "updateLocation", "verifySecurityProduct", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class disableItems {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    @NotNull
    public static final String DATE_FORMAT = "d MMM yyyy HH:mm:ss";
    private static final String ERROR_CODE_INVALID = "AE15112168005028";
    private static final String SCENE_RESET_PIN = "RESET_PIN";
    private static final String SCENE_RESET_PIN_FROM_NEW_DEVICE = "RESET_PIN_FROM_NEW_DEVICE";
    private static final String STATUS_APPROVED = "approved";
    private static final String VERIFICATION_STATUS = "verificationStatus";
    private static final String VERIFICATION_STATUS_INVALID = "INVALID";
    @NotNull
    public static final String VERIFY_SECURITY_PRODUCT_POST_LOGIN = "verifySecurityProductPost";
    /* access modifiers changed from: private */
    public BridgeCallback bridgeCallback;
    /* access modifiers changed from: private */
    public String challengeSid = "";
    private final onNonBeaconLeScan checkTwilioEnrollmentStatus;
    private IRedDotManager compositeDisposable;
    private String currentAddress = "unknown";
    private String eventName;
    /* access modifiers changed from: private */
    public String factorSid = "";
    private Geocoder geocoder;
    /* access modifiers changed from: private */
    public boolean isTimeout;
    /* access modifiers changed from: private */
    public Page page;
    private String securityId;
    /* access modifiers changed from: private */
    public Date startTime;
    private int timeout;
    /* access modifiers changed from: private */
    public setH5Page timerUtil;
    /* access modifiers changed from: private */
    public final showTwoWheelDialog twilioMixpanelTracker;
    private final crashDetected twilioRequestChallenge;
    private final forceFlush twilioVerifySecurityProduct;
    private final setUpdateNotifier updateTwilioChallenge;
    private String verificationMethod;

    private final String getRequestChallengeScene(boolean z) {
        return z ? SCENE_RESET_PIN : SCENE_RESET_PIN_FROM_NEW_DEVICE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ disableItems this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(disableItems disableitems) {
            super(1);
            this.this$0 = disableitems;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.unregisterEventBus();
            disableItems.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(new BridgeResponse(replaceItems.INSTANCE.getFailedResult(String.valueOf(th.getMessage()))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ disableItems this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(disableItems disableitems) {
            super(1);
            this.this$0 = disableitems;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.unregisterEventBus();
            updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_UPDATE_CHALLENGE, th.getMessage(), th);
            disableItems.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(new BridgeResponse(replaceItems.INSTANCE.getFailedResult(String.valueOf(th.getMessage()))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/twilio/model/RequestChallengeInfo;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<setBetterBleListener, Unit> {
        final /* synthetic */ String $factorSid;
        final /* synthetic */ disableItems this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(disableItems disableitems, String str) {
            super(1);
            this.this$0 = disableitems;
            this.$factorSid = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setBetterBleListener) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setBetterBleListener setbetterblelistener) {
            Intrinsics.checkNotNullParameter(setbetterblelistener, "it");
            this.this$0.challengeSid = setbetterblelistener.getChallengeSid();
            this.this$0.twilioMixpanelTracker.setMax(TrackerKey.SourceType.FORGOT_PIN, this.this$0.startTime, this.$factorSid, this.this$0.challengeSid, true);
            this.this$0.verifySecurityProduct(this.$factorSid);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $factorSid;
        final /* synthetic */ disableItems this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(disableItems disableitems, String str) {
            super(1);
            this.this$0 = disableitems;
            this.$factorSid = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            Resources resources;
            if (!z) {
                updateActionSheetContent.e(DanaLogConstants.TAG.TWILIO_UPDATE_CHALLENGE, String.valueOf(z));
                Page access$getPage$p = disableItems.access$getPage$p(this.this$0);
                Intrinsics.checkNotNullParameter(access$getPage$p, "$this$activity");
                PageContext pageContext = access$getPage$p.getPageContext();
                Activity activity = pageContext != null ? pageContext.getActivity() : null;
                if (activity != null && (resources = activity.getResources()) != null) {
                    BridgeCallback access$getBridgeCallback$p = disableItems.access$getBridgeCallback$p(this.this$0);
                    replaceItems replaceitems = replaceItems.INSTANCE;
                    String string = resources.getString(R.string.general_error_msg);
                    Intrinsics.checkNotNullExpressionValue(string, "it.getString(R.string.general_error_msg)");
                    access$getBridgeCallback$p.sendBridgeResponse(new BridgeResponse(replaceitems.getFailedResult(string)));
                    return;
                }
                return;
            }
            this.this$0.verifySecurityProduct(this.$factorSid);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/location/Location;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class toIntRange extends FunctionReferenceImpl implements Function1<Location, Unit> {
        toIntRange(disableItems disableitems) {
            super(1, disableitems, disableItems.class, "onLocationUpdate", "onLocationUpdate(Landroid/location/Location;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Location location) {
            ((disableItems) this.receiver).onLocationUpdate(location);
        }
    }

    @Inject
    public disableItems(@NotNull onNonBeaconLeScan onnonbeaconlescan, @NotNull crashDetected crashdetected, @NotNull forceFlush forceflush, @NotNull setUpdateNotifier setupdatenotifier, @NotNull showTwoWheelDialog showtwowheeldialog) {
        Intrinsics.checkNotNullParameter(onnonbeaconlescan, "checkTwilioEnrollmentStatus");
        Intrinsics.checkNotNullParameter(crashdetected, "twilioRequestChallenge");
        Intrinsics.checkNotNullParameter(forceflush, "twilioVerifySecurityProduct");
        Intrinsics.checkNotNullParameter(setupdatenotifier, "updateTwilioChallenge");
        Intrinsics.checkNotNullParameter(showtwowheeldialog, "twilioMixpanelTracker");
        this.checkTwilioEnrollmentStatus = onnonbeaconlescan;
        this.twilioRequestChallenge = crashdetected;
        this.twilioVerifySecurityProduct = forceflush;
        this.updateTwilioChallenge = setupdatenotifier;
        this.twilioMixpanelTracker = showtwowheeldialog;
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "Calendar.getInstance().time");
        this.startTime = time;
    }

    public static final /* synthetic */ BridgeCallback access$getBridgeCallback$p(disableItems disableitems) {
        BridgeCallback bridgeCallback2 = disableitems.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        return bridgeCallback2;
    }

    public static final /* synthetic */ Page access$getPage$p(disableItems disableitems) {
        Page page2 = disableitems.page;
        if (page2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("page");
        }
        return page2;
    }

    public static final /* synthetic */ setH5Page access$getTimerUtil$p(disableItems disableitems) {
        setH5Page seth5page = disableitems.timerUtil;
        if (seth5page == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerUtil");
        }
        return seth5page;
    }

    public final void doVerify(@NotNull String str, @NotNull BridgeCallback bridgeCallback2, @NotNull String str2, @NotNull String str3, int i, @NotNull Page page2) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(str2, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str3, "verificationMethod");
        Intrinsics.checkNotNullParameter(page2, "page");
        this.eventName = str;
        this.bridgeCallback = bridgeCallback2;
        this.securityId = str2;
        this.verificationMethod = str3;
        this.page = page2;
        this.timeout = i;
        startTimer();
        if (Intrinsics.areEqual((Object) str, (Object) VERIFY_SECURITY_PRODUCT_POST_LOGIN)) {
            onInput.getDefault().register(this);
            makePhoneCall.length length2 = makePhoneCall.getMin;
            makePhoneCall.setMin = true;
        }
        updateLocation();
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "Calendar.getInstance().time");
        this.startTime = time;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r2 = r2.getActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateLocation() {
        /*
            r4 = this;
            boolean r0 = r4.isHaveLocationPermission()
            if (r0 == 0) goto L_0x0056
            o.IRedDotManager r0 = new o.IRedDotManager
            r0.<init>()
            r4.compositeDisposable = r0
            if (r0 != 0) goto L_0x0014
            java.lang.String r1 = "compositeDisposable"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0014:
            o.WheelView$ScrollerTask$getMax r1 = new o.WheelView$ScrollerTask$getMax
            com.alibaba.ariver.app.api.Page r2 = r4.page
            if (r2 != 0) goto L_0x001f
            java.lang.String r3 = "page"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x001f:
            java.lang.String r3 = "$this$context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            com.alibaba.ariver.app.api.PageContext r2 = r2.getPageContext()
            if (r2 == 0) goto L_0x0035
            android.app.Activity r2 = r2.getActivity()
            if (r2 == 0) goto L_0x0035
            android.content.Context r2 = r2.getApplicationContext()
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            r1.<init>(r2)
            o.TitleBarRightButtonView$1 r1 = r1.getMin()
            o.disableItems$toIntRange r2 = new o.disableItems$toIntRange
            r3 = r4
            o.disableItems r3 = (o.disableItems) r3
            r2.<init>(r3)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            o.requiredHeightForButtons r3 = new o.requiredHeightForButtons
            r3.<init>(r2)
            o.RedDotManager r3 = (o.RedDotManager) r3
            o.GriverProgressBar$UpdateRunnable r1 = r1.subscribe(r3)
            r0.getMin(r1)
            return
        L_0x0056:
            java.lang.String r0 = r4.factorSid
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = ""
        L_0x005c:
            r4.getEnrollmentStatus(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.disableItems.updateLocation():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r0 = r0.getActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isHaveLocationPermission() {
        /*
            r2 = this;
            boolean r0 = o.CornerMarkingDataProvider.IsOverlapping()
            if (r0 == 0) goto L_0x0030
            com.alibaba.ariver.app.api.Page r0 = r2.page
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = "page"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x000f:
            java.lang.String r1 = "$this$context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            com.alibaba.ariver.app.api.PageContext r0 = r0.getPageContext()
            if (r0 == 0) goto L_0x0025
            android.app.Activity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = o.setStateOn.getMin(r0, r1)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            return r0
        L_0x0030:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.disableItems.isHaveLocationPermission():boolean");
    }

    /* access modifiers changed from: private */
    public final void onLocationUpdate(Location location) {
        if (location != null) {
            String str = this.factorSid;
            if (str == null) {
                str = "";
            }
            getAddress(location, str);
            IRedDotManager iRedDotManager = this.compositeDisposable;
            if (iRedDotManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("compositeDisposable");
            }
            iRedDotManager.dispose();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = r1.getActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void getAddress(android.location.Location r7, java.lang.String r8) {
        /*
            r6 = this;
            android.location.Geocoder r0 = new android.location.Geocoder
            com.alibaba.ariver.app.api.Page r1 = r6.page
            if (r1 != 0) goto L_0x000b
            java.lang.String r2 = "page"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x000b:
            java.lang.String r2 = "$this$context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.alibaba.ariver.app.api.PageContext r1 = r1.getPageContext()
            if (r1 == 0) goto L_0x0021
            android.app.Activity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x0021
            android.content.Context r1 = r1.getApplicationContext()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            r6.geocoder = r0
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = "geocoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0032:
            double r1 = r7.getLatitude()
            double r3 = r7.getLongitude()
            r5 = 1
            java.util.List r7 = r0.getFromLocation(r1, r3, r5)
            r0 = 0
            java.lang.Object r7 = r7.get(r0)
            android.location.Address r7 = (android.location.Address) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "selectedAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            java.lang.String r1 = r7.getLocality()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r2 = r7.getSubAdminArea()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r7 = r7.getAdminArea()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.currentAddress = r7
            r6.getEnrollmentStatus(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.disableItems.getAddress(android.location.Location, java.lang.String):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager$getEnrollmentStatus$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "error", "", "onNext", "isEnrolled", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ String $factorSid;
        final /* synthetic */ disableItems this$0;

        setMin(disableItems disableitems, String str) {
            this.this$0 = disableitems;
            this.$factorSid = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onNext(((Boolean) obj).booleanValue());
        }

        public final void onNext(boolean z) {
            showTwoWheelDialog access$getTwilioMixpanelTracker$p = this.this$0.twilioMixpanelTracker;
            Intrinsics.checkNotNullParameter(TrackerKey.SourceType.FORGOT_PIN, "source");
            convertDipToPx.length min = convertDipToPx.length.setMin(access$getTwilioMixpanelTracker$p.setMin);
            Intrinsics.checkNotNullExpressionValue(min, "builder");
            new showTwoWheelDialog.length(TrackerKey.SourceType.FORGOT_PIN).invoke(min);
            min.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
            List length = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length.toArray(new convertSpToPx[length.size()]));
            this.this$0.requestChallenge(z, this.$factorSid);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            disableItems.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(new BridgeResponse(replaceItems.INSTANCE.getFailedResult(String.valueOf(th.getMessage()))));
        }
    }

    private final void getEnrollmentStatus(String str) {
        this.checkTwilioEnrollmentStatus.execute(new setMin(this, str));
    }

    /* access modifiers changed from: private */
    public final void requestChallenge(boolean z, String str) {
        this.twilioMixpanelTracker.length(TrackerKey.SourceType.FORGOT_PIN, this.challengeSid, HttpHeaders.ACCEPT);
        this.twilioRequestChallenge.execute(createRequestChallengeParam(z), new getMin(this, str), new equals(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager$verifySecurityProduct$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "onError", "", "error", "", "onNext", "verifySecurityInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<getConnectedBluetoothDevices> {
        final /* synthetic */ String $factorSid;
        final /* synthetic */ disableItems this$0;

        toFloatRange(disableItems disableitems, String str) {
            this.this$0 = disableitems;
            this.$factorSid = str;
        }

        public final void onNext(@NotNull getConnectedBluetoothDevices getconnectedbluetoothdevices) {
            Intrinsics.checkNotNullParameter(getconnectedbluetoothdevices, "verifySecurityInfo");
            setH5Page access$getTimerUtil$p = disableItems.access$getTimerUtil$p(this.this$0);
            if (access$getTimerUtil$p.setMin != null && !access$getTimerUtil$p.setMin.isDisposed()) {
                access$getTimerUtil$p.setMin.dispose();
            }
            this.this$0.twilioMixpanelTracker.setMax(TrackerKey.SourceType.FORGOT_PIN, this.this$0.startTime, this.$factorSid, this.this$0.challengeSid);
            disableItems.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(new BridgeResponse(replaceItems.INSTANCE.getSuccessResult(new checkAllItems(String.valueOf(getconnectedbluetoothdevices.getExtendInfo().get(disableItems.VERIFICATION_STATUS))))));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            if (th instanceof NetworkException) {
                String errorCode = ((NetworkException) th).getErrorCode();
                if (Intrinsics.areEqual((Object) errorCode, (Object) VerificationErrorCode.RETRY_VERIFY)) {
                    if (!this.this$0.isTimeout) {
                        this.this$0.verifySecurityProduct(this.$factorSid);
                    }
                } else if (Intrinsics.areEqual((Object) errorCode, (Object) "AE15112168005028")) {
                    setH5Page access$getTimerUtil$p = disableItems.access$getTimerUtil$p(this.this$0);
                    if (access$getTimerUtil$p.setMin != null && !access$getTimerUtil$p.setMin.isDisposed()) {
                        access$getTimerUtil$p.setMin.dispose();
                    }
                    this.this$0.twilioMixpanelTracker.setMin(TrackerKey.SourceType.FORGOT_PIN, this.this$0.startTime, this.$factorSid, this.this$0.challengeSid, String.valueOf(th.getMessage()));
                    this.this$0.unregisterEventBus();
                    disableItems.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(new BridgeResponse(replaceItems.INSTANCE.getSuccessResult(new checkAllItems(disableItems.VERIFICATION_STATUS_INVALID))));
                } else {
                    setH5Page access$getTimerUtil$p2 = disableItems.access$getTimerUtil$p(this.this$0);
                    if (access$getTimerUtil$p2.setMin != null && !access$getTimerUtil$p2.setMin.isDisposed()) {
                        access$getTimerUtil$p2.setMin.dispose();
                    }
                    this.this$0.twilioMixpanelTracker.setMin(TrackerKey.SourceType.FORGOT_PIN, this.this$0.startTime, this.$factorSid, this.this$0.challengeSid, String.valueOf(th.getMessage()));
                    this.this$0.unregisterEventBus();
                    disableItems.access$getBridgeCallback$p(this.this$0).sendBridgeResponse(new BridgeResponse(replaceItems.INSTANCE.getFailedResult(String.valueOf(th.getMessage()))));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void verifySecurityProduct(String str) {
        this.twilioVerifySecurityProduct.dispose();
        forceFlush forceflush = this.twilioVerifySecurityProduct;
        setGlobalUserData tofloatrange = new toFloatRange(this, str);
        String str2 = this.securityId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BioUtilityBridge.SECURITY_ID);
        }
        String str3 = this.verificationMethod;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verificationMethod");
        }
        forceflush.execute(tofloatrange, createVerifySecurityParam(str2, str3, this.challengeSid));
    }

    private final void startTimer() {
        this.isTimeout = false;
        setH5Page seth5page = new setH5Page();
        seth5page.getMax(this.timeout, new isInside(this));
        Unit unit = Unit.INSTANCE;
        this.timerUtil = seth5page;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onFinish", "id/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager$startTimer$1$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements setH5Page.getMax {
        final /* synthetic */ disableItems this$0;

        isInside(disableItems disableitems) {
            this.this$0 = disableitems;
        }

        public final void onFinish() {
            this.this$0.twilioMixpanelTracker.length(TrackerKey.SourceType.FORGOT_PIN, this.this$0.challengeSid, "Expired");
            showTwoWheelDialog access$getTwilioMixpanelTracker$p = this.this$0.twilioMixpanelTracker;
            Date access$getStartTime$p = this.this$0.startTime;
            String access$getFactorSid$p = this.this$0.factorSid;
            if (access$getFactorSid$p == null) {
                access$getFactorSid$p = "";
            }
            access$getTwilioMixpanelTracker$p.setMin(TrackerKey.SourceType.FORGOT_PIN, access$getStartTime$p, access$getFactorSid$p, this.this$0.challengeSid, "Client Session Expired");
            this.this$0.isTimeout = true;
            this.this$0.unregisterEventBus();
            setH5Page access$getTimerUtil$p = disableItems.access$getTimerUtil$p(this.this$0);
            if (access$getTimerUtil$p.setMin != null && !access$getTimerUtil$p.setMin.isDisposed()) {
                access$getTimerUtil$p.setMin.dispose();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onNotificationReceived(@NotNull shouldBeVisible shouldbevisible) {
        Intrinsics.checkNotNullParameter(shouldbevisible, "event");
        String str = this.eventName;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(IpcMessageConstants.EXTRA_EVENT);
        }
        if (Intrinsics.areEqual((Object) str, (Object) VERIFY_SECURITY_PRODUCT_POST_LOGIN)) {
            this.challengeSid = shouldbevisible.getChallengeSid();
            this.factorSid = shouldbevisible.getFactorSid();
            approveTwilioChallenge(shouldbevisible.getFactorSid(), shouldbevisible.getChallengeSid());
        }
    }

    private final void approveTwilioChallenge(String str, String str2) {
        this.updateTwilioChallenge.execute(createUpdateTwilioChallengeParam(str, str2), new setMax(this, str), new getMax(this));
    }

    private final crashDetected.getMax createRequestChallengeParam(boolean z) {
        invalidateChildRegion invalidatechildregion = new invalidateChildRegion(getRequestChallengeScene(z), getRequestChallengeInfo());
        Intrinsics.checkNotNullParameter(invalidatechildregion, "$this$toTwilioChallenge");
        return new crashDetected.getMax(new BLEManager(invalidatechildregion.setMax, invalidatechildregion.getMax));
    }

    private final Map<String, String> getRequestChallengeInfo() {
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
        return MapsKt.mapOf(TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE, getDeviceModel()), TuplesKt.to("location", this.currentAddress), TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, startBluetoothDevicesDiscovery.getDateTime(DATE_FORMAT, locale, "gmt")), TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, String.valueOf(this.timeout)), TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_VERIFICATION_TYPE, TwilioIdentityVerificationActivity.VERIFICATION_TYPE_CHANGE_PIN));
    }

    private final String getDeviceModel() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        return sb.toString();
    }

    private final forceFlush.setMax createVerifySecurityParam(String str, String str2, String str3) {
        beehiveMultilevelSelect beehivemultilevelselect = new beehiveMultilevelSelect(str, str2, str3, (String) null, 8);
        Intrinsics.checkNotNullParameter(beehivemultilevelselect, "$this$toTwilioVerify");
        return new forceFlush.setMax(new getBluetoothDevices(beehivemultilevelselect.getMin, beehivemultilevelselect.length, beehivemultilevelselect.setMax, beehivemultilevelselect.setMin));
    }

    private final setUpdateNotifier.getMin createUpdateTwilioChallengeParam(String str, String str2) {
        return new setUpdateNotifier.getMin(str, str2, STATUS_APPROVED);
    }

    /* access modifiers changed from: private */
    public final void unregisterEventBus() {
        onInput.getDefault().unregister(this);
        makePhoneCall.length length2 = makePhoneCall.getMin;
        makePhoneCall.setMin = false;
    }

    public final void disposeAllObservable() {
        this.checkTwilioEnrollmentStatus.dispose();
        this.twilioRequestChallenge.dispose();
        this.twilioVerifySecurityProduct.dispose();
        this.updateTwilioChallenge.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/danah5/twilioverifysecurityproduct/TwilioVerifySecurityProductManager$Companion;", "", "()V", "DATE_FORMAT", "", "ERROR_CODE_INVALID", "SCENE_RESET_PIN", "SCENE_RESET_PIN_FROM_NEW_DEVICE", "STATUS_APPROVED", "VERIFICATION_STATUS", "VERIFICATION_STATUS_INVALID", "VERIFY_SECURITY_PRODUCT_POST_LOGIN", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
