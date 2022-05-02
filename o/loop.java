package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.danah5.bioutility.BioUtilityBridge;
import id.dana.data.base.NetworkException;
import id.dana.data.login.source.VerificationErrorCode;
import id.dana.data.login.source.network.model.VerifyMethod;
import id.dana.data.tracker.TrackerDataKey;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020*H\u0002J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010/\u001a\u00020\u001eH\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020\u0010H\u0002J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0010H\u0002J\u0010\u00107\u001a\u0002042\u0006\u00106\u001a\u00020\u0010H\u0002J.\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010\u0019\u001a\u00020\fH\u0002J&\u0010:\u001a\b\u0012\u0004\u0012\u00020;0'2\u0006\u0010<\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lid/dana/data/bokuverification/BokuEntityRepository;", "Lid/dana/domain/bokuverification/BokuRepository;", "bokuEntityDataFactory", "Lid/dana/data/login/source/BokuEntityDataFactory;", "verifyRiskEntityDataFactory", "Lid/dana/data/bokuverification/source/network/VerifyRiskEntityDataFactory;", "regManager", "Lid/dana/data/registration/RegistrationProcessManager;", "context", "Landroid/content/Context;", "(Lid/dana/data/login/source/BokuEntityDataFactory;Lid/dana/data/bokuverification/source/network/VerifyRiskEntityDataFactory;Lid/dana/data/registration/RegistrationProcessManager;Landroid/content/Context;)V", "correlationId", "", "evUrlStatusResult", "Lid/dana/data/login/source/network/model/EvUrlStatusResult;", "isWifi", "", "<set-?>", "Lorg/json/JSONObject;", "mixpanelPropertiesObject", "getMixpanelPropertiesObject", "()Lorg/json/JSONObject;", "setMixpanelPropertiesObject", "(Lorg/json/JSONObject;)V", "phoneNumber", "securityId", "trackerSource", "withMobileData", "canRetryVerifyBoku", "checkErrorType", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "throwable", "", "checkWifiAvailability", "createBokuEntityData", "Lid/dana/data/login/source/BokuEntityData;", "createVerifyRiskEntityData", "Lid/dana/data/bokuverification/source/network/VerifyRiskEntityData;", "getBokuSilentOtp", "Lio/reactivex/Observable;", "", "networkUrlRpcResult", "Lid/dana/data/login/source/network/result/NetworkUrlRpcResult;", "getCurrentTime", "", "handleOnErrorGetBokuUrl", "handleVerifyRiskResult", "result", "isBokuSilentOtpSuccess", "status", "isCallTimeExceeds", "trackBokuEvent", "", "event", "success", "trackBokuVerifyResult", "verifyBoku", "verifyBokuToRisk", "verifyOtpToRisk", "Lid/dana/domain/otp/model/VerifyOtpRiskResponse;", "otpValue", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class loop implements GriverBaseManifest {
    @NotNull
    public static final setMax setMin = new setMax((byte) 0);
    private final getLogType FastBitmap$CoordinateSystem;
    @NotNull
    private JSONObject IsOverlapping = new JSONObject();
    private String equals = "";
    private boolean getMax;
    private String getMin = "";
    private com_alibaba_ariver_app_api_ExtOpt$63$1 isInside;
    private boolean length;
    private String setMax = "";
    private final setImageAssetDelegate toDoubleRange;
    private final b.AnonymousClass14 toFloatRange;
    private String toIntRange = "";
    private final Context toString;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "result", "Lid/dana/data/login/source/network/result/NetworkUrlRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<com_alibaba_ariver_app_api_ExtOpt$66$1, TitleBarRightButtonView.AnonymousClass4<? extends Integer>> {
        final /* synthetic */ loop getMax;

        IsOverlapping(loop loop) {
            this.getMax = loop;
        }

        public final /* synthetic */ Object apply(Object obj) {
            com_alibaba_ariver_app_api_ExtOpt$66$1 com_alibaba_ariver_app_api_extopt_66_1 = (com_alibaba_ariver_app_api_ExtOpt$66$1) obj;
            Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_66_1, "result");
            return loop.getMax(this.getMax, com_alibaba_ariver_app_api_extopt_66_1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "result", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<BaseRpcResult, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ loop setMax;

        equals(loop loop) {
            this.setMax = loop;
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, "result");
            return loop.length(this.setMax, baseRpcResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "success", "", "apply", "(Ljava/lang/Boolean;)Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Boolean, Integer> {
        public static final getMax setMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "success");
            return Integer.valueOf(bool.booleanValue() ? 2 : 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "status", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ loop getMin;

        isInside(loop loop) {
            this.getMin = loop;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            Intrinsics.checkNotNullParameter(num, "status");
            return loop.length(this.getMin, num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "success", "", "apply", "(Ljava/lang/Boolean;)Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<Boolean, Integer> {
        public static final setMin length = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "success");
            return Integer.valueOf(bool.booleanValue() ? 2 : 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/login/source/network/result/NetworkUrlRpcResult;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<Throwable, com_alibaba_ariver_app_api_ExtOpt$66$1> {
        final /* synthetic */ loop getMin;

        toFloatRange(loop loop) {
            this.getMin = loop;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return loop.getMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<Throwable, BaseRpcResult> {
        final /* synthetic */ loop getMax;

        toIntRange(loop loop) {
            this.getMax = loop;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            Intrinsics.checkNotNullParameter(th, "it");
            if (!this.getMax.setMax()) {
                setExtras.track(this.getMax.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, getRequestApps.addTrackerProperties(this.getMax.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, this.getMax.setMax, false));
            }
            return loop.length(th);
        }
    }

    @Inject
    public loop(@NotNull b.AnonymousClass14 r2, @NotNull setImageAssetDelegate setimageassetdelegate, @NotNull getLogType getlogtype, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(r2, "bokuEntityDataFactory");
        Intrinsics.checkNotNullParameter(setimageassetdelegate, "verifyRiskEntityDataFactory");
        Intrinsics.checkNotNullParameter(getlogtype, "regManager");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.toFloatRange = r2;
        this.toDoubleRange = setimageassetdelegate;
        this.FastBitmap$CoordinateSystem = getlogtype;
        this.toString = context;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> verifyBoku(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        Intrinsics.checkNotNullParameter(str3, "trackerSource");
        this.getMin = str;
        this.length = z;
        this.setMax = str3;
        this.toIntRange = str2;
        this.getMax = length();
        setExtras.track(this.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_REQUESTED, getRequestApps.addTrackerProperties(this.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_REQUESTED, this.setMax, false));
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.toFloatRange.createData("network").getBokuUrl(str2, str3).onErrorReturn(new toFloatRange(this)).flatMap(new IsOverlapping(this)).flatMap(new isInside(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "createBokuEntityData().g…ilentOtpSuccess(status) }");
        return flatMap;
    }

    private final boolean length() {
        return getOriginStartParams.isWifiEnable(this.toString);
    }

    /* access modifiers changed from: private */
    public final boolean setMax() {
        return this.isInside != null && setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/bokuverification/BokuEntityRepository$Companion;", "", "()V", "MAX_RETRY_TIMEOUT", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final length length = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<filterBundle> verifyOtpToRisk(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "otpValue");
        Intrinsics.checkNotNullParameter(str2, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str3, "phoneNumber");
        setImageAssetDelegate setimageassetdelegate = this.toDoubleRange;
        Intrinsics.checkNotNullParameter("network", "source");
        TitleBarRightButtonView.AnonymousClass1<R> map = setimageassetdelegate.setMin.getMax(str3, str2, this.equals, str).map(loop$FastBitmap$CoordinateSystem.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "createVerifyRiskEntityDa…sage ?: \"\")\n            }");
        return map;
    }

    private final TitleBarRightButtonView.AnonymousClass1<Boolean> setMax(String str) {
        setExtras.track(this.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_VERIFY_RESULT, getRequestApps.addTrackerProperties(this.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_VERIFY_RESULT, this.setMax, true));
        setImageAssetDelegate setimageassetdelegate = this.toDoubleRange;
        Intrinsics.checkNotNullParameter("network", "source");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = setimageassetdelegate.setMin.getMin(this.toIntRange, str, this.equals, this.setMax).onErrorReturn(new toIntRange(this)).flatMap(new equals(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "createVerifyRiskEntityDa…erifyRiskResult(result) }");
        return flatMap;
    }

    private final boolean setMin() {
        long currentTimeMillis = System.currentTimeMillis();
        com_alibaba_ariver_app_api_ExtOpt$63$1 com_alibaba_ariver_app_api_extopt_63_1 = this.isInside;
        Intrinsics.checkNotNull(com_alibaba_ariver_app_api_extopt_63_1);
        return currentTimeMillis - com_alibaba_ariver_app_api_extopt_63_1.getCallTime() < 3000;
    }

    public static final /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$66$1 getMin() {
        com_alibaba_ariver_app_api_ExtOpt$66$1 com_alibaba_ariver_app_api_extopt_66_1 = new com_alibaba_ariver_app_api_ExtOpt$66$1();
        com_alibaba_ariver_app_api_extopt_66_1.success = false;
        return com_alibaba_ariver_app_api_extopt_66_1;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getMax(loop loop, com_alibaba_ariver_app_api_ExtOpt$66$1 com_alibaba_ariver_app_api_extopt_66_1) {
        setExtras.track(loop.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_RECEIVED, getRequestApps.addTrackerProperties(loop.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_EVURL_RECEIVED, loop.setMax, com_alibaba_ariver_app_api_extopt_66_1.success));
        if (com_alibaba_ariver_app_api_extopt_66_1.success) {
            String correlationId = com_alibaba_ariver_app_api_extopt_66_1.getCorrelationId();
            Intrinsics.checkNotNullExpressionValue(correlationId, "networkUrlRpcResult.correlationId");
            loop.equals = correlationId;
            if (!loop.length || !getNegativeString.isOreoAndAbove()) {
                b.AnonymousClass10 createData = loop.toFloatRange.createData("network");
                String evUrl = com_alibaba_ariver_app_api_extopt_66_1.getEvUrl();
                Intrinsics.checkNotNullExpressionValue(evUrl, "networkUrlRpcResult.evUrl");
                TitleBarRightButtonView.AnonymousClass1<R> map = createData.getBokuSilentOTP(evUrl, loop.setMax).onErrorResumeNext(length.length).map(getMax.setMax);
                Intrinsics.checkNotNullExpressionValue(map, "createBokuEntityData().g…LED\n                    }");
                return map;
            }
            b.AnonymousClass10 createData2 = loop.toFloatRange.createData("network");
            String evUrl2 = com_alibaba_ariver_app_api_extopt_66_1.getEvUrl();
            Intrinsics.checkNotNullExpressionValue(evUrl2, "networkUrlRpcResult.evUrl");
            TitleBarRightButtonView.AnonymousClass1<R> map2 = createData2.getBokuSilentOTPWithMobileNetwork(evUrl2, loop.setMax).onErrorResumeNext(getMin.setMax).map(setMin.length);
            Intrinsics.checkNotNullExpressionValue(map2, "createBokuEntityData().g…LED\n                    }");
            return map2;
        }
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(0);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(BokuVeri…atus.GET_BOKU_URL_FAILED)");
        return just;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 length(loop loop, int i) {
        loop.isInside = com_alibaba_ariver_app_api_ExtOpt$63$1.Companion.createNewHitEvUrl(System.currentTimeMillis());
        if (i == 1) {
            setExtras.track(loop.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, getRequestApps.addTrackerProperties(loop.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, loop.setMax, false));
        } else if (i == 2) {
            return loop.setMax(loop.getMin);
        }
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }

    public static final /* synthetic */ BaseRpcResult length(Throwable th) {
        if (th instanceof NetworkException) {
            BaseRpcResult baseRpcResult = new BaseRpcResult();
            baseRpcResult.success = false;
            baseRpcResult.errorCode = ((NetworkException) th).getErrorCode();
            return baseRpcResult;
        }
        BaseRpcResult baseRpcResult2 = new BaseRpcResult();
        baseRpcResult2.success = false;
        baseRpcResult2.errorCode = "AE15002058020033";
        return baseRpcResult2;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 length(loop loop, BaseRpcResult baseRpcResult) {
        if (baseRpcResult.success) {
            if (Intrinsics.areEqual((Object) loop.setMax, (Object) "Registration")) {
                loop.FastBitmap$CoordinateSystem.setVerifyMethod(VerifyMethod.VERIFY_BOKU);
            }
            setExtras.track(loop.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, getRequestApps.addTrackerProperties(loop.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, loop.setMax, true));
            TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(true)");
            return just;
        } else if (Intrinsics.areEqual((Object) baseRpcResult.errorCode, (Object) VerificationErrorCode.RETRY_VERIFY)) {
            return loop.setMax(loop.getMin);
        } else {
            setExtras.track(loop.toString, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, getRequestApps.addTrackerProperties(loop.IsOverlapping, TrackerDataKey.Event.CARRIER_IDENTIFICATION_COMPLETED, loop.setMax, false));
            TitleBarRightButtonView.AnonymousClass1 just2 = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(just2, "Observable.just(false)");
            return just2;
        }
    }
}
