package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bU\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\rHÆ\u0003J\t\u0010U\u001a\u00020\rHÆ\u0003J\t\u0010V\u001a\u00020\rHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010]\u001a\u00020\rHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jå\u0001\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010a\u001a\u00020\r2\b\u0010b\u001a\u0004\u0018\u00010cHÖ\u0003J\t\u0010d\u001a\u00020eHÖ\u0001J\t\u0010f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0016\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\u0018\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010\u001eR\u0011\u0010G\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bH\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001c\"\u0004\bJ\u0010\u001eR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001c\"\u0004\bL\u0010\u001e¨\u0006g"}, d2 = {"Lid/dana/data/user/source/network/result/UserInfoRpcResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "accountStatus", "", "avatarUrl", "balance", "Lid/dana/data/model/CurrencyAmountResult;", "ktpName", "kybInfo", "Lid/dana/data/homeinfo/model/KybEntity;", "kyc", "Lid/dana/data/homeinfo/model/KycEntity;", "kycCertified", "", "kycLevel", "loginStatus", "userStatus", "ncc", "loginId", "nickname", "pendingTransaction", "shortcode", "faceAuthStatus", "enrollStatus", "faceLoginReady", "username", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/data/model/CurrencyAmountResult;Ljava/lang/String;Lid/dana/data/homeinfo/model/KybEntity;Lid/dana/data/homeinfo/model/KycEntity;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)V", "getAccountStatus", "()Ljava/lang/String;", "setAccountStatus", "(Ljava/lang/String;)V", "getAvatarUrl", "setAvatarUrl", "getBalance", "()Lid/dana/data/model/CurrencyAmountResult;", "setBalance", "(Lid/dana/data/model/CurrencyAmountResult;)V", "getEnrollStatus", "()Z", "setEnrollStatus", "(Z)V", "getFaceAuthStatus", "setFaceAuthStatus", "getFaceLoginReady", "setFaceLoginReady", "getKtpName", "setKtpName", "getKybInfo", "()Lid/dana/data/homeinfo/model/KybEntity;", "setKybInfo", "(Lid/dana/data/homeinfo/model/KybEntity;)V", "getKyc", "()Lid/dana/data/homeinfo/model/KycEntity;", "setKyc", "(Lid/dana/data/homeinfo/model/KycEntity;)V", "getKycCertified", "setKycCertified", "getKycLevel", "setKycLevel", "getLoginId", "setLoginId", "getLoginStatus", "setLoginStatus", "getNcc", "setNcc", "getNickname", "setNickname", "getPendingTransaction", "setPendingTransaction", "getShortcode", "setShortcode", "userPan", "getUserPan", "getUserStatus", "setUserStatus", "getUsername", "setUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTemplateConfig extends BaseRpcResult {
    @Nullable
    private String accountStatus;
    @Nullable
    private String avatarUrl;
    @Nullable
    private registerWorker balance;
    private boolean enrollStatus;
    private boolean faceAuthStatus;
    private boolean faceLoginReady;
    @Nullable
    private String ktpName;
    @Nullable
    private setActiveIcon kybInfo;
    @Nullable
    private setName kyc;
    private boolean kycCertified;
    @Nullable
    private String kycLevel;
    @Nullable
    private String loginId;
    @Nullable
    private String loginStatus;
    @Nullable
    private String ncc;
    @Nullable
    private String nickname;
    @Nullable
    private String pendingTransaction;
    @Nullable
    private String shortcode;
    @Nullable
    private String userStatus;
    @Nullable
    private String username;

    public setTemplateConfig() {
        this((String) null, (String) null, (registerWorker) null, (String) null, (setActiveIcon) null, (setName) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setTemplateConfig copy$default(setTemplateConfig settemplateconfig, String str, String str2, registerWorker registerworker, String str3, setActiveIcon setactiveicon, setName setname, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z2, boolean z3, boolean z4, String str12, int i, Object obj) {
        setTemplateConfig settemplateconfig2 = settemplateconfig;
        int i2 = i;
        return settemplateconfig.copy((i2 & 1) != 0 ? settemplateconfig2.accountStatus : str, (i2 & 2) != 0 ? settemplateconfig2.avatarUrl : str2, (i2 & 4) != 0 ? settemplateconfig2.balance : registerworker, (i2 & 8) != 0 ? settemplateconfig2.ktpName : str3, (i2 & 16) != 0 ? settemplateconfig2.kybInfo : setactiveicon, (i2 & 32) != 0 ? settemplateconfig2.kyc : setname, (i2 & 64) != 0 ? settemplateconfig2.kycCertified : z, (i2 & 128) != 0 ? settemplateconfig2.kycLevel : str4, (i2 & 256) != 0 ? settemplateconfig2.loginStatus : str5, (i2 & 512) != 0 ? settemplateconfig2.userStatus : str6, (i2 & 1024) != 0 ? settemplateconfig2.ncc : str7, (i2 & 2048) != 0 ? settemplateconfig2.loginId : str8, (i2 & 4096) != 0 ? settemplateconfig2.nickname : str9, (i2 & 8192) != 0 ? settemplateconfig2.pendingTransaction : str10, (i2 & 16384) != 0 ? settemplateconfig2.shortcode : str11, (i2 & 32768) != 0 ? settemplateconfig2.faceAuthStatus : z2, (i2 & 65536) != 0 ? settemplateconfig2.enrollStatus : z3, (i2 & 131072) != 0 ? settemplateconfig2.faceLoginReady : z4, (i2 & 262144) != 0 ? settemplateconfig2.username : str12);
    }

    @Nullable
    public final String component1() {
        return this.accountStatus;
    }

    @Nullable
    public final String component10() {
        return this.userStatus;
    }

    @Nullable
    public final String component11() {
        return this.ncc;
    }

    @Nullable
    public final String component12() {
        return this.loginId;
    }

    @Nullable
    public final String component13() {
        return this.nickname;
    }

    @Nullable
    public final String component14() {
        return this.pendingTransaction;
    }

    @Nullable
    public final String component15() {
        return this.shortcode;
    }

    public final boolean component16() {
        return this.faceAuthStatus;
    }

    public final boolean component17() {
        return this.enrollStatus;
    }

    public final boolean component18() {
        return this.faceLoginReady;
    }

    @Nullable
    public final String component19() {
        return this.username;
    }

    @Nullable
    public final String component2() {
        return this.avatarUrl;
    }

    @Nullable
    public final registerWorker component3() {
        return this.balance;
    }

    @Nullable
    public final String component4() {
        return this.ktpName;
    }

    @Nullable
    public final setActiveIcon component5() {
        return this.kybInfo;
    }

    @Nullable
    public final setName component6() {
        return this.kyc;
    }

    public final boolean component7() {
        return this.kycCertified;
    }

    @Nullable
    public final String component8() {
        return this.kycLevel;
    }

    @Nullable
    public final String component9() {
        return this.loginStatus;
    }

    @NotNull
    public final setTemplateConfig copy(@Nullable String str, @Nullable String str2, @Nullable registerWorker registerworker, @Nullable String str3, @Nullable setActiveIcon setactiveicon, @Nullable setName setname, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z2, boolean z3, boolean z4, @Nullable String str12) {
        return new setTemplateConfig(str, str2, registerworker, str3, setactiveicon, setname, z, str4, str5, str6, str7, str8, str9, str10, str11, z2, z3, z4, str12);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTemplateConfig)) {
            return false;
        }
        setTemplateConfig settemplateconfig = (setTemplateConfig) obj;
        return Intrinsics.areEqual((Object) this.accountStatus, (Object) settemplateconfig.accountStatus) && Intrinsics.areEqual((Object) this.avatarUrl, (Object) settemplateconfig.avatarUrl) && Intrinsics.areEqual((Object) this.balance, (Object) settemplateconfig.balance) && Intrinsics.areEqual((Object) this.ktpName, (Object) settemplateconfig.ktpName) && Intrinsics.areEqual((Object) this.kybInfo, (Object) settemplateconfig.kybInfo) && Intrinsics.areEqual((Object) this.kyc, (Object) settemplateconfig.kyc) && this.kycCertified == settemplateconfig.kycCertified && Intrinsics.areEqual((Object) this.kycLevel, (Object) settemplateconfig.kycLevel) && Intrinsics.areEqual((Object) this.loginStatus, (Object) settemplateconfig.loginStatus) && Intrinsics.areEqual((Object) this.userStatus, (Object) settemplateconfig.userStatus) && Intrinsics.areEqual((Object) this.ncc, (Object) settemplateconfig.ncc) && Intrinsics.areEqual((Object) this.loginId, (Object) settemplateconfig.loginId) && Intrinsics.areEqual((Object) this.nickname, (Object) settemplateconfig.nickname) && Intrinsics.areEqual((Object) this.pendingTransaction, (Object) settemplateconfig.pendingTransaction) && Intrinsics.areEqual((Object) this.shortcode, (Object) settemplateconfig.shortcode) && this.faceAuthStatus == settemplateconfig.faceAuthStatus && this.enrollStatus == settemplateconfig.enrollStatus && this.faceLoginReady == settemplateconfig.faceLoginReady && Intrinsics.areEqual((Object) this.username, (Object) settemplateconfig.username);
    }

    public final int hashCode() {
        String str = this.accountStatus;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        registerWorker registerworker = this.balance;
        int hashCode3 = (hashCode2 + (registerworker != null ? registerworker.hashCode() : 0)) * 31;
        String str3 = this.ktpName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        setActiveIcon setactiveicon = this.kybInfo;
        int hashCode5 = (hashCode4 + (setactiveicon != null ? setactiveicon.hashCode() : 0)) * 31;
        setName setname = this.kyc;
        int hashCode6 = (hashCode5 + (setname != null ? setname.hashCode() : 0)) * 31;
        boolean z = this.kycCertified;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str4 = this.kycLevel;
        int hashCode7 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.loginStatus;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.userStatus;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.ncc;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.loginId;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.nickname;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.pendingTransaction;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.shortcode;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z3 = this.faceAuthStatus;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode14 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.enrollStatus;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.faceLoginReady;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str12 = this.username;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfoRpcResult(accountStatus=");
        sb.append(this.accountStatus);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", ktpName=");
        sb.append(this.ktpName);
        sb.append(", kybInfo=");
        sb.append(this.kybInfo);
        sb.append(", kyc=");
        sb.append(this.kyc);
        sb.append(", kycCertified=");
        sb.append(this.kycCertified);
        sb.append(", kycLevel=");
        sb.append(this.kycLevel);
        sb.append(", loginStatus=");
        sb.append(this.loginStatus);
        sb.append(", userStatus=");
        sb.append(this.userStatus);
        sb.append(", ncc=");
        sb.append(this.ncc);
        sb.append(", loginId=");
        sb.append(this.loginId);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", pendingTransaction=");
        sb.append(this.pendingTransaction);
        sb.append(", shortcode=");
        sb.append(this.shortcode);
        sb.append(", faceAuthStatus=");
        sb.append(this.faceAuthStatus);
        sb.append(", enrollStatus=");
        sb.append(this.enrollStatus);
        sb.append(", faceLoginReady=");
        sb.append(this.faceLoginReady);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getAccountStatus() {
        return this.accountStatus;
    }

    public final void setAccountStatus(@Nullable String str) {
        this.accountStatus = str;
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final void setAvatarUrl(@Nullable String str) {
        this.avatarUrl = str;
    }

    @Nullable
    public final registerWorker getBalance() {
        return this.balance;
    }

    public final void setBalance(@Nullable registerWorker registerworker) {
        this.balance = registerworker;
    }

    @Nullable
    public final String getKtpName() {
        return this.ktpName;
    }

    public final void setKtpName(@Nullable String str) {
        this.ktpName = str;
    }

    @Nullable
    public final setActiveIcon getKybInfo() {
        return this.kybInfo;
    }

    public final void setKybInfo(@Nullable setActiveIcon setactiveicon) {
        this.kybInfo = setactiveicon;
    }

    @Nullable
    public final setName getKyc() {
        return this.kyc;
    }

    public final void setKyc(@Nullable setName setname) {
        this.kyc = setname;
    }

    public final boolean getKycCertified() {
        return this.kycCertified;
    }

    public final void setKycCertified(boolean z) {
        this.kycCertified = z;
    }

    @Nullable
    public final String getKycLevel() {
        return this.kycLevel;
    }

    public final void setKycLevel(@Nullable String str) {
        this.kycLevel = str;
    }

    @Nullable
    public final String getLoginStatus() {
        return this.loginStatus;
    }

    public final void setLoginStatus(@Nullable String str) {
        this.loginStatus = str;
    }

    @Nullable
    public final String getUserStatus() {
        return this.userStatus;
    }

    public final void setUserStatus(@Nullable String str) {
        this.userStatus = str;
    }

    @Nullable
    public final String getNcc() {
        return this.ncc;
    }

    public final void setNcc(@Nullable String str) {
        this.ncc = str;
    }

    @Nullable
    public final String getLoginId() {
        return this.loginId;
    }

    public final void setLoginId(@Nullable String str) {
        this.loginId = str;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    @Nullable
    public final String getPendingTransaction() {
        return this.pendingTransaction;
    }

    public final void setPendingTransaction(@Nullable String str) {
        this.pendingTransaction = str;
    }

    @Nullable
    public final String getShortcode() {
        return this.shortcode;
    }

    public final void setShortcode(@Nullable String str) {
        this.shortcode = str;
    }

    public final boolean getFaceAuthStatus() {
        return this.faceAuthStatus;
    }

    public final void setFaceAuthStatus(boolean z) {
        this.faceAuthStatus = z;
    }

    public final boolean getEnrollStatus() {
        return this.enrollStatus;
    }

    public final void setEnrollStatus(boolean z) {
        this.enrollStatus = z;
    }

    public final boolean getFaceLoginReady() {
        return this.faceLoginReady;
    }

    public final void setFaceLoginReady(boolean z) {
        this.faceLoginReady = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ setTemplateConfig(java.lang.String r21, java.lang.String r22, o.registerWorker r23, java.lang.String r24, o.setActiveIcon r25, o.setName r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37, boolean r38, java.lang.String r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r27
        L_0x003a:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0040
            r10 = 0
            goto L_0x0042
        L_0x0040:
            r10 = r28
        L_0x0042:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0048
            r11 = 0
            goto L_0x004a
        L_0x0048:
            r11 = r29
        L_0x004a:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0050
            r12 = 0
            goto L_0x0052
        L_0x0050:
            r12 = r30
        L_0x0052:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0058
            r13 = 0
            goto L_0x005a
        L_0x0058:
            r13 = r31
        L_0x005a:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0060
            r14 = 0
            goto L_0x0062
        L_0x0060:
            r14 = r32
        L_0x0062:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0068
            r15 = 0
            goto L_0x006a
        L_0x0068:
            r15 = r33
        L_0x006a:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0070
            r2 = 0
            goto L_0x0072
        L_0x0070:
            r2 = r34
        L_0x0072:
            r9 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x0078
            r9 = 0
            goto L_0x007a
        L_0x0078:
            r9 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = ""
            goto L_0x00a7
        L_0x00a5:
            r0 = r39
        L_0x00a7:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r9
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTemplateConfig.<init>(java.lang.String, java.lang.String, o.registerWorker, java.lang.String, o.setActiveIcon, o.setName, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(@Nullable String str) {
        this.username = str;
    }

    public setTemplateConfig(@Nullable String str, @Nullable String str2, @Nullable registerWorker registerworker, @Nullable String str3, @Nullable setActiveIcon setactiveicon, @Nullable setName setname, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z2, boolean z3, boolean z4, @Nullable String str12) {
        this.accountStatus = str;
        this.avatarUrl = str2;
        this.balance = registerworker;
        this.ktpName = str3;
        this.kybInfo = setactiveicon;
        this.kyc = setname;
        this.kycCertified = z;
        this.kycLevel = str4;
        this.loginStatus = str5;
        this.userStatus = str6;
        this.ncc = str7;
        this.loginId = str8;
        this.nickname = str9;
        this.pendingTransaction = str10;
        this.shortcode = str11;
        this.faceAuthStatus = z2;
        this.enrollStatus = z3;
        this.faceLoginReady = z4;
        this.username = str12;
    }

    @NotNull
    public final String getUserPan() {
        return Intrinsics.stringPlus(this.ncc, this.shortcode);
    }
}
