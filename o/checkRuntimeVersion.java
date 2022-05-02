package o;

import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkStream;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/data/twilio/repository/TwilioEntityRepository;", "Lid/dana/domain/twilio/TwilioRepository;", "twilioEnrollmentEntityDataFactory", "Lid/dana/data/twilio/repository/source/TwilioEnrollmentEntityDataFactory;", "securityEntityDataFactory", "Lid/dana/data/security/source/SecurityEntityDataFactory;", "(Lid/dana/data/twilio/repository/source/TwilioEnrollmentEntityDataFactory;Lid/dana/data/security/source/SecurityEntityDataFactory;)V", "consultEnrollmentStatus", "Lio/reactivex/Observable;", "Lid/dana/domain/twilio/model/TwilioInfo;", "twilioConsult", "Lid/dana/domain/twilio/model/TwilioConsult;", "createNetworkTwilioEnrollmentEntityData", "Lid/dana/data/twilio/repository/source/TwilioEntityData;", "createSecurityData", "Lid/dana/data/security/source/SecurityEntityData;", "getLoginKey", "", "requestChallenge", "Lid/dana/domain/twilio/model/RequestChallengeInfo;", "twilioChallenge", "Lid/dana/domain/twilio/model/TwilioChallenge;", "submitBindEnrollment", "Lid/dana/domain/twilio/model/BindEnrollInfo;", "twilioBindEnroll", "Lid/dana/domain/twilio/model/TwilioBindEnroll;", "submitDerollment", "Lid/dana/domain/twilio/model/DerollInfo;", "twilioDeroll", "Lid/dana/domain/twilio/model/TwilioDeroll;", "submitEnrollment", "Lid/dana/domain/twilio/model/EnrollInfo;", "twilioEnroll", "Lid/dana/domain/twilio/model/TwilioEnroll;", "verifySecurityProduct", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "twilioVerify", "Lid/dana/domain/twilio/model/TwilioVerify;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class checkRuntimeVersion implements onBatchScanResults {
    @NotNull
    public static final setMin setMin = new setMin((byte) 0);
    private final NetworkStream getMin;
    private final access$2300 length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/twilio/model/EnrollInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushEnrollResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<teardown, enableBluetooth> {
        public static final equals setMin = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            teardown teardown = (teardown) obj;
            Intrinsics.checkNotNullParameter(teardown, "it");
            Intrinsics.checkNotNullParameter(teardown, "$this$toEnrollInfo");
            return new enableBluetooth(teardown.getSucces(), teardown.getAccessToken(), teardown.getIdentity(), teardown.getServiceSid());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/twilio/model/TwilioInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushConsultResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<OnlineResource, disableBluetooth> {
        public static final getMax length = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            OnlineResource onlineResource = (OnlineResource) obj;
            Intrinsics.checkNotNullParameter(onlineResource, "it");
            Intrinsics.checkNotNullParameter(onlineResource, "$this$toTwilioInfo");
            return new disableBluetooth(onlineResource.getRegistered(), onlineResource.getRegisterAllowed(), onlineResource.getSecurityId(), onlineResource.getVerificationMethodInfos());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/twilio/model/RequestChallengeInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushRequestChallengeResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<setBelongsPackage, setBetterBleListener> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setBelongsPackage setbelongspackage = (setBelongsPackage) obj;
            Intrinsics.checkNotNullParameter(setbelongspackage, "it");
            Intrinsics.checkNotNullParameter(setbelongspackage, "$this$toRequestChallengeInfo");
            return new setBetterBleListener(setbelongspackage.getChallengeSid(), setbelongspackage.getTimer(), setbelongspackage.getAction());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/twilio/model/VerifySecurityInfo;", "kotlin.jvm.PlatformType", "key", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends getConnectedBluetoothDevices>> {
        final /* synthetic */ getBluetoothDevices length;
        final /* synthetic */ checkRuntimeVersion setMax;

        isInside(checkRuntimeVersion checkruntimeversion, getBluetoothDevices getbluetoothdevices) {
            this.setMax = checkruntimeversion;
            this.length = getbluetoothdevices;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "key");
            getRealStream min = this.setMax.getMin.getMax;
            getBluetoothDevices getbluetoothdevices = this.length;
            Intrinsics.checkNotNullParameter(getbluetoothdevices, "$this$toVerifySecurityProductRequest");
            return min.setMin(new onResourceError(getbluetoothdevices.getSecurityId(), getbluetoothdevices.getVerificationMethod(), getbluetoothdevices.getValidateData(), getbluetoothdevices.getSendOtpStrategy()), str).map(AnonymousClass4.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/twilio/model/BindEnrollInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushBindEnrollmentResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getBelongsPackage, getActualLength> {
        public static final length getMin = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getBelongsPackage getbelongspackage = (getBelongsPackage) obj;
            Intrinsics.checkNotNullParameter(getbelongspackage, "it");
            Intrinsics.checkNotNullParameter(getbelongspackage, "$this$toBindEnrollInfo");
            return new getActualLength(getbelongspackage.getStatus());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/twilio/model/DerollInfo;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/twilio/repository/source/network/result/VerifyPushDerollResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<ResourcePackage, getEndIndex> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ResourcePackage resourcePackage = (ResourcePackage) obj;
            Intrinsics.checkNotNullParameter(resourcePackage, "it");
            Intrinsics.checkNotNullParameter(resourcePackage, "$this$toDerollInfo");
            return new getEndIndex(resourcePackage.getSecurityId(), resourcePackage.getVerificationMethodInfos(), resourcePackage.success);
        }
    }

    @Inject
    public checkRuntimeVersion(@NotNull NetworkStream networkStream, @NotNull access$2300 access_2300) {
        Intrinsics.checkNotNullParameter(networkStream, "twilioEnrollmentEntityDataFactory");
        Intrinsics.checkNotNullParameter(access_2300, "securityEntityDataFactory");
        this.getMin = networkStream;
        this.length = access_2300;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/twilio/repository/TwilioEntityRepository$Companion;", "", "()V", "INIT_DELAY", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<disableBluetooth> consultEnrollmentStatus(@NotNull closeBluetoothAdapter closebluetoothadapter) {
        Intrinsics.checkNotNullParameter(closebluetoothadapter, "twilioConsult");
        Intrinsics.checkNotNullParameter(closebluetoothadapter, "$this$toVerifyPushConsultRequest");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.getMin.getMax.getMax(new OfflineResource(closebluetoothadapter.getSource())).map(getMax.length);
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkTwilioEnrol…map { it.toTwilioInfo() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<enableBluetooth> submitEnrollment(@NotNull isDiscovering isdiscovering) {
        Intrinsics.checkNotNullParameter(isdiscovering, "twilioEnroll");
        Intrinsics.checkNotNullParameter(isdiscovering, "$this$toVerifyPushEnrollRequest");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.getMin.getMax.setMax(new onInputException(isdiscovering.getSecurityId(), isdiscovering.getSource())).map(equals.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkTwilioEnrol…map { it.toEnrollInfo() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getActualLength> submitBindEnrollment(@NotNull registerBLEState registerblestate) {
        Intrinsics.checkNotNullParameter(registerblestate, "twilioBindEnroll");
        Intrinsics.checkNotNullParameter(registerblestate, "$this$toVerifyPushBindEnrollmentRequest");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.getMin.getMax.setMin(new NetworkStream.Listener(registerblestate.getFactorId(), registerblestate.getIdentity())).delay(200, TimeUnit.MILLISECONDS).map(length.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkTwilioEnrol…{ it.toBindEnrollInfo() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getEndIndex> submitDerollment(@NotNull isOpened isopened) {
        Intrinsics.checkNotNullParameter(isopened, "twilioDeroll");
        Intrinsics.checkNotNullParameter(isopened, "$this$toVerifyPushDerollRequest");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.getMin.getMax.length(new onInputOpen(isopened.getSource())).map(setMax.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkTwilioEnrol…map { it.toDerollInfo() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setBetterBleListener> requestChallenge(@NotNull BLEManager bLEManager) {
        Intrinsics.checkNotNullParameter(bLEManager, "twilioChallenge");
        Intrinsics.checkNotNullParameter(bLEManager, "$this$toVerifyPushRequestChallengeRequest");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.getMin.getMax.length(new onInputClose(bLEManager.getScene(), bLEManager.getChallengeInfo())).map(getMin.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "createNetworkTwilioEnrol…oRequestChallengeInfo() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getConnectedBluetoothDevices> verifySecurityProduct(@NotNull getBluetoothDevices getbluetoothdevices) {
        Intrinsics.checkNotNullParameter(getbluetoothdevices, "twilioVerify");
        access$2400 createData = this.length.createData("network");
        Intrinsics.checkNotNullExpressionValue(createData, "securityEntityDataFactor…reateData(Source.NETWORK)");
        TitleBarRightButtonView.AnonymousClass1<String> loginKey = createData.loginKey();
        Intrinsics.checkNotNullExpressionValue(loginKey, "createSecurityData().loginKey()");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = loginKey.flatMap(new isInside(this, getbluetoothdevices));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getLoginKey().flatMap { …ecurityInfo() }\n        }");
        return flatMap;
    }
}
