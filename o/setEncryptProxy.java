package o;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010C\u001a\u0004\u0018\u00010\u0004J\u0006\u0010D\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001a\u0010.\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R\u001c\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001a\u0010:\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010\u0014R\u001c\u0010=\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001c\u0010@\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\b¨\u0006F"}, d2 = {"Lid/dana/domain/model/rpc/response/CheckRegistrationResponse;", "Lid/dana/domain/model/rpc/response/BaseRpcResponse;", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "campaignEnabled", "", "getCampaignEnabled", "()Z", "setCampaignEnabled", "(Z)V", "expirySeconds", "", "getExpirySeconds", "()I", "setExpirySeconds", "(I)V", "extendInfo", "", "getExtendInfo", "()Ljava/util/Map;", "setExtendInfo", "(Ljava/util/Map;)V", "faceLoginAuthMethodIndex", "getFaceLoginAuthMethodIndex", "setFaceLoginAuthMethodIndex", "localPhoneNumber", "getLocalPhoneNumber", "setLocalPhoneNumber", "loginAuthenticationOptionResponses", "", "Lid/dana/domain/model/rpc/response/LoginAuthenticationOptionResponse;", "getLoginAuthenticationOptionResponses", "()Ljava/util/List;", "setLoginAuthenticationOptionResponses", "(Ljava/util/List;)V", "otpChannel", "getOtpChannel", "setOtpChannel", "otpCodeLength", "getOtpCodeLength", "setOtpCodeLength", "passwordAuthMethodIndex", "getPasswordAuthMethodIndex", "setPasswordAuthMethodIndex", "prizeAmount", "Lid/dana/domain/user/CurrencyAmount;", "getPrizeAmount", "()Lid/dana/domain/user/CurrencyAmount;", "setPrizeAmount", "(Lid/dana/domain/user/CurrencyAmount;)V", "prizeName", "getPrizeName", "setPrizeName", "retrySendSeconds", "getRetrySendSeconds", "setRetrySendSeconds", "securityId", "getSecurityId", "setSecurityId", "userName", "getUserName", "setUserName", "getRegistrationSource", "isVerificationMethodBoku", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setEncryptProxy extends initWithSecurityGuard {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    private static final String REGISTRATION_SOURCE = "registrationSource";
    private static final String VERIFICATION_METHOD = "verificationMethod";
    private static final String VERIFY_BOKU = "CARRIER_IDENTIFICATION";
    @Nullable
    private String action;
    private boolean campaignEnabled;
    private int expirySeconds;
    @Nullable
    private Map<String, String> extendInfo;
    private int faceLoginAuthMethodIndex;
    @Nullable
    private String localPhoneNumber;
    @Nullable
    private List<? extends initWithKey> loginAuthenticationOptionResponses;
    @Nullable
    private String otpChannel;
    private int otpCodeLength;
    private int passwordAuthMethodIndex;
    @Nullable
    private stopBleScan prizeAmount;
    @Nullable
    private String prizeName;
    private int retrySendSeconds;
    @Nullable
    private String securityId;
    @Nullable
    private String userName;

    @Nullable
    public final String getAction() {
        return this.action;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final boolean getCampaignEnabled() {
        return this.campaignEnabled;
    }

    public final void setCampaignEnabled(boolean z) {
        this.campaignEnabled = z;
    }

    public final int getExpirySeconds() {
        return this.expirySeconds;
    }

    public final void setExpirySeconds(int i) {
        this.expirySeconds = i;
    }

    @Nullable
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public final void setExtendInfo(@Nullable Map<String, String> map) {
        this.extendInfo = map;
    }

    @Nullable
    public final String getLocalPhoneNumber() {
        return this.localPhoneNumber;
    }

    public final void setLocalPhoneNumber(@Nullable String str) {
        this.localPhoneNumber = str;
    }

    @Nullable
    public final String getOtpChannel() {
        return this.otpChannel;
    }

    public final void setOtpChannel(@Nullable String str) {
        this.otpChannel = str;
    }

    public final int getOtpCodeLength() {
        return this.otpCodeLength;
    }

    public final void setOtpCodeLength(int i) {
        this.otpCodeLength = i;
    }

    @Nullable
    public final stopBleScan getPrizeAmount() {
        return this.prizeAmount;
    }

    public final void setPrizeAmount(@Nullable stopBleScan stopblescan) {
        this.prizeAmount = stopblescan;
    }

    @Nullable
    public final String getPrizeName() {
        return this.prizeName;
    }

    public final void setPrizeName(@Nullable String str) {
        this.prizeName = str;
    }

    public final int getRetrySendSeconds() {
        return this.retrySendSeconds;
    }

    public final void setRetrySendSeconds(int i) {
        this.retrySendSeconds = i;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }

    @Nullable
    public final List<initWithKey> getLoginAuthenticationOptionResponses() {
        return this.loginAuthenticationOptionResponses;
    }

    public final void setLoginAuthenticationOptionResponses(@Nullable List<? extends initWithKey> list) {
        this.loginAuthenticationOptionResponses = list;
    }

    public final int getFaceLoginAuthMethodIndex() {
        return this.faceLoginAuthMethodIndex;
    }

    public final void setFaceLoginAuthMethodIndex(int i) {
        this.faceLoginAuthMethodIndex = i;
    }

    public final int getPasswordAuthMethodIndex() {
        return this.passwordAuthMethodIndex;
    }

    public final void setPasswordAuthMethodIndex(int i) {
        this.passwordAuthMethodIndex = i;
    }

    @Nullable
    public final String getRegistrationSource() {
        Map<String, String> map = this.extendInfo;
        if (map == null) {
            return "";
        }
        Intrinsics.checkNotNull(map);
        if (map.get(REGISTRATION_SOURCE) == null) {
            return "";
        }
        Map<String, String> map2 = this.extendInfo;
        Intrinsics.checkNotNull(map2);
        return map2.get(REGISTRATION_SOURCE);
    }

    public final boolean isVerificationMethodBoku() {
        Map<String, String> map = this.extendInfo;
        if (map == null) {
            return false;
        }
        Intrinsics.checkNotNull(map);
        if (map.get(VERIFICATION_METHOD) == null) {
            return false;
        }
        Map<String, String> map2 = this.extendInfo;
        Intrinsics.checkNotNull(map2);
        return Intrinsics.areEqual((Object) map2.get(VERIFICATION_METHOD), (Object) "CARRIER_IDENTIFICATION");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/domain/model/rpc/response/CheckRegistrationResponse$Companion;", "", "()V", "REGISTRATION_SOURCE", "", "VERIFICATION_METHOD", "VERIFY_BOKU", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
