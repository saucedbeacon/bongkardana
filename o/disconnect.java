package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAmcsLiteConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0002\u0010\u0018J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0010HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÅ\u0001\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010T\u001a\u00020\t2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020WHÖ\u0001J\u0006\u0010X\u001a\u00020\tJ\u0006\u0010Y\u001a\u00020\tJ\t\u0010Z\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\"\"\u0004\b%\u0010$R\u001a\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\"\"\u0004\b'\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010\u001cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\u001a\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\u001c¨\u0006["}, d2 = {"Lid/dana/domain/user/UserInfoResponse;", "", "balance", "Lid/dana/domain/user/CurrencyAmount;", "ktpName", "", "kybResponse", "Lid/dana/domain/homeinfo/KybResponse;", "isKycCertified", "", "kycInfo", "loginId", "nickname", "pendingTransaction", "userPan", "kycResponse", "Lid/dana/domain/homeinfo/KycResponse;", "isFaceLoginEnabled", "hasFaceLoginEnrolled", "isFaceLoginReady", "accountStatus", "loginStatus", "userStatus", "username", "(Lid/dana/domain/user/CurrencyAmount;Ljava/lang/String;Lid/dana/domain/homeinfo/KybResponse;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/homeinfo/KycResponse;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountStatus", "()Ljava/lang/String;", "setAccountStatus", "(Ljava/lang/String;)V", "getBalance", "()Lid/dana/domain/user/CurrencyAmount;", "setBalance", "(Lid/dana/domain/user/CurrencyAmount;)V", "getHasFaceLoginEnrolled", "()Z", "setHasFaceLoginEnrolled", "(Z)V", "setFaceLoginEnabled", "setFaceLoginReady", "setKycCertified", "getKtpName", "setKtpName", "getKybResponse", "()Lid/dana/domain/homeinfo/KybResponse;", "setKybResponse", "(Lid/dana/domain/homeinfo/KybResponse;)V", "getKycInfo", "setKycInfo", "getKycResponse", "()Lid/dana/domain/homeinfo/KycResponse;", "setKycResponse", "(Lid/dana/domain/homeinfo/KycResponse;)V", "getLoginId", "setLoginId", "getLoginStatus", "setLoginStatus", "getNickname", "setNickname", "getPendingTransaction", "setPendingTransaction", "getUserPan", "setUserPan", "getUserStatus", "setUserStatus", "getUsername", "setUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "isPremiumUser", "isUserAndAccountStatusEnable", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class disconnect {
    @Nullable
    private String accountStatus;
    @Nullable
    private stopBleScan balance;
    private boolean hasFaceLoginEnrolled;
    private boolean isFaceLoginEnabled;
    private boolean isFaceLoginReady;
    private boolean isKycCertified;
    @Nullable
    private String ktpName;
    @Nullable
    private GriverAmcsLiteConfig.AnonymousClass1 kybResponse;
    @Nullable
    private String kycInfo;
    @NotNull
    private onConfigChanged kycResponse;
    @NotNull
    private String loginId;
    @Nullable
    private String loginStatus;
    @NotNull
    private String nickname;
    @Nullable
    private String pendingTransaction;
    @Nullable
    private String userPan;
    @Nullable
    private String userStatus;
    @NotNull
    private String username;

    public disconnect() {
        this((stopBleScan) null, (String) null, (GriverAmcsLiteConfig.AnonymousClass1) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (onConfigChanged) null, false, false, false, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ disconnect copy$default(disconnect disconnect, stopBleScan stopblescan, String str, GriverAmcsLiteConfig.AnonymousClass1 r20, boolean z, String str2, String str3, String str4, String str5, String str6, onConfigChanged onconfigchanged, boolean z2, boolean z3, boolean z4, String str7, String str8, String str9, String str10, int i, Object obj) {
        disconnect disconnect2 = disconnect;
        int i2 = i;
        return disconnect.copy((i2 & 1) != 0 ? disconnect2.balance : stopblescan, (i2 & 2) != 0 ? disconnect2.ktpName : str, (i2 & 4) != 0 ? disconnect2.kybResponse : r20, (i2 & 8) != 0 ? disconnect2.isKycCertified : z, (i2 & 16) != 0 ? disconnect2.kycInfo : str2, (i2 & 32) != 0 ? disconnect2.loginId : str3, (i2 & 64) != 0 ? disconnect2.nickname : str4, (i2 & 128) != 0 ? disconnect2.pendingTransaction : str5, (i2 & 256) != 0 ? disconnect2.userPan : str6, (i2 & 512) != 0 ? disconnect2.kycResponse : onconfigchanged, (i2 & 1024) != 0 ? disconnect2.isFaceLoginEnabled : z2, (i2 & 2048) != 0 ? disconnect2.hasFaceLoginEnrolled : z3, (i2 & 4096) != 0 ? disconnect2.isFaceLoginReady : z4, (i2 & 8192) != 0 ? disconnect2.accountStatus : str7, (i2 & 16384) != 0 ? disconnect2.loginStatus : str8, (i2 & 32768) != 0 ? disconnect2.userStatus : str9, (i2 & 65536) != 0 ? disconnect2.username : str10);
    }

    @Nullable
    public final stopBleScan component1() {
        return this.balance;
    }

    @NotNull
    public final onConfigChanged component10() {
        return this.kycResponse;
    }

    public final boolean component11() {
        return this.isFaceLoginEnabled;
    }

    public final boolean component12() {
        return this.hasFaceLoginEnrolled;
    }

    public final boolean component13() {
        return this.isFaceLoginReady;
    }

    @Nullable
    public final String component14() {
        return this.accountStatus;
    }

    @Nullable
    public final String component15() {
        return this.loginStatus;
    }

    @Nullable
    public final String component16() {
        return this.userStatus;
    }

    @NotNull
    public final String component17() {
        return this.username;
    }

    @Nullable
    public final String component2() {
        return this.ktpName;
    }

    @Nullable
    public final GriverAmcsLiteConfig.AnonymousClass1 component3() {
        return this.kybResponse;
    }

    public final boolean component4() {
        return this.isKycCertified;
    }

    @Nullable
    public final String component5() {
        return this.kycInfo;
    }

    @NotNull
    public final String component6() {
        return this.loginId;
    }

    @NotNull
    public final String component7() {
        return this.nickname;
    }

    @Nullable
    public final String component8() {
        return this.pendingTransaction;
    }

    @Nullable
    public final String component9() {
        return this.userPan;
    }

    @NotNull
    public final disconnect copy(@Nullable stopBleScan stopblescan, @Nullable String str, @Nullable GriverAmcsLiteConfig.AnonymousClass1 r22, boolean z, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull onConfigChanged onconfigchanged, boolean z2, boolean z3, boolean z4, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String str10) {
        stopBleScan stopblescan2 = stopblescan;
        Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str4, "nickname");
        Intrinsics.checkNotNullParameter(onconfigchanged, "kycResponse");
        Intrinsics.checkNotNullParameter(str10, setBuildNumber.USERNAME_KEY);
        return new disconnect(stopblescan, str, r22, z, str2, str3, str4, str5, str6, onconfigchanged, z2, z3, z4, str7, str8, str9, str10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disconnect)) {
            return false;
        }
        disconnect disconnect = (disconnect) obj;
        return Intrinsics.areEqual((Object) this.balance, (Object) disconnect.balance) && Intrinsics.areEqual((Object) this.ktpName, (Object) disconnect.ktpName) && Intrinsics.areEqual((Object) this.kybResponse, (Object) disconnect.kybResponse) && this.isKycCertified == disconnect.isKycCertified && Intrinsics.areEqual((Object) this.kycInfo, (Object) disconnect.kycInfo) && Intrinsics.areEqual((Object) this.loginId, (Object) disconnect.loginId) && Intrinsics.areEqual((Object) this.nickname, (Object) disconnect.nickname) && Intrinsics.areEqual((Object) this.pendingTransaction, (Object) disconnect.pendingTransaction) && Intrinsics.areEqual((Object) this.userPan, (Object) disconnect.userPan) && Intrinsics.areEqual((Object) this.kycResponse, (Object) disconnect.kycResponse) && this.isFaceLoginEnabled == disconnect.isFaceLoginEnabled && this.hasFaceLoginEnrolled == disconnect.hasFaceLoginEnrolled && this.isFaceLoginReady == disconnect.isFaceLoginReady && Intrinsics.areEqual((Object) this.accountStatus, (Object) disconnect.accountStatus) && Intrinsics.areEqual((Object) this.loginStatus, (Object) disconnect.loginStatus) && Intrinsics.areEqual((Object) this.userStatus, (Object) disconnect.userStatus) && Intrinsics.areEqual((Object) this.username, (Object) disconnect.username);
    }

    public final int hashCode() {
        stopBleScan stopblescan = this.balance;
        int i = 0;
        int hashCode = (stopblescan != null ? stopblescan.hashCode() : 0) * 31;
        String str = this.ktpName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        GriverAmcsLiteConfig.AnonymousClass1 r2 = this.kybResponse;
        int hashCode3 = (hashCode2 + (r2 != null ? r2.hashCode() : 0)) * 31;
        boolean z = this.isKycCertified;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.kycInfo;
        int hashCode4 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.loginId;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.nickname;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.pendingTransaction;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.userPan;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        onConfigChanged onconfigchanged = this.kycResponse;
        int hashCode9 = (hashCode8 + (onconfigchanged != null ? onconfigchanged.hashCode() : 0)) * 31;
        boolean z3 = this.isFaceLoginEnabled;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode9 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasFaceLoginEnrolled;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isFaceLoginReady;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str7 = this.accountStatus;
        int hashCode10 = (i5 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.loginStatus;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userStatus;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.username;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode12 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfoResponse(balance=");
        sb.append(this.balance);
        sb.append(", ktpName=");
        sb.append(this.ktpName);
        sb.append(", kybResponse=");
        sb.append(this.kybResponse);
        sb.append(", isKycCertified=");
        sb.append(this.isKycCertified);
        sb.append(", kycInfo=");
        sb.append(this.kycInfo);
        sb.append(", loginId=");
        sb.append(this.loginId);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", pendingTransaction=");
        sb.append(this.pendingTransaction);
        sb.append(", userPan=");
        sb.append(this.userPan);
        sb.append(", kycResponse=");
        sb.append(this.kycResponse);
        sb.append(", isFaceLoginEnabled=");
        sb.append(this.isFaceLoginEnabled);
        sb.append(", hasFaceLoginEnrolled=");
        sb.append(this.hasFaceLoginEnrolled);
        sb.append(", isFaceLoginReady=");
        sb.append(this.isFaceLoginReady);
        sb.append(", accountStatus=");
        sb.append(this.accountStatus);
        sb.append(", loginStatus=");
        sb.append(this.loginStatus);
        sb.append(", userStatus=");
        sb.append(this.userStatus);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    public disconnect(@Nullable stopBleScan stopblescan, @Nullable String str, @Nullable GriverAmcsLiteConfig.AnonymousClass1 r9, boolean z, @Nullable String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull onConfigChanged onconfigchanged, boolean z2, boolean z3, boolean z4, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String str10) {
        onConfigChanged onconfigchanged2 = onconfigchanged;
        String str11 = str10;
        Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str4, "nickname");
        Intrinsics.checkNotNullParameter(onconfigchanged2, "kycResponse");
        Intrinsics.checkNotNullParameter(str11, setBuildNumber.USERNAME_KEY);
        this.balance = stopblescan;
        this.ktpName = str;
        this.kybResponse = r9;
        this.isKycCertified = z;
        this.kycInfo = str2;
        this.loginId = str3;
        this.nickname = str4;
        this.pendingTransaction = str5;
        this.userPan = str6;
        this.kycResponse = onconfigchanged2;
        this.isFaceLoginEnabled = z2;
        this.hasFaceLoginEnrolled = z3;
        this.isFaceLoginReady = z4;
        this.accountStatus = str7;
        this.loginStatus = str8;
        this.userStatus = str9;
        this.username = str11;
    }

    @Nullable
    public final stopBleScan getBalance() {
        return this.balance;
    }

    public final void setBalance(@Nullable stopBleScan stopblescan) {
        this.balance = stopblescan;
    }

    @Nullable
    public final String getKtpName() {
        return this.ktpName;
    }

    public final void setKtpName(@Nullable String str) {
        this.ktpName = str;
    }

    @Nullable
    public final GriverAmcsLiteConfig.AnonymousClass1 getKybResponse() {
        return this.kybResponse;
    }

    public final void setKybResponse(@Nullable GriverAmcsLiteConfig.AnonymousClass1 r1) {
        this.kybResponse = r1;
    }

    public final boolean isKycCertified() {
        return this.isKycCertified;
    }

    public final void setKycCertified(boolean z) {
        this.isKycCertified = z;
    }

    @Nullable
    public final String getKycInfo() {
        return this.kycInfo;
    }

    public final void setKycInfo(@Nullable String str) {
        this.kycInfo = str;
    }

    @NotNull
    public final String getLoginId() {
        return this.loginId;
    }

    public final void setLoginId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loginId = str;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
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
    public final String getUserPan() {
        return this.userPan;
    }

    public final void setUserPan(@Nullable String str) {
        this.userPan = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ disconnect(o.stopBleScan r19, java.lang.String r20, o.GriverAmcsLiteConfig.AnonymousClass1 r21, boolean r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, o.onConfigChanged r28, boolean r29, boolean r30, boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r19
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r20
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r21
        L_0x001a:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0021
            r5 = 0
            goto L_0x0023
        L_0x0021:
            r5 = r22
        L_0x0023:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0029
            r7 = 0
            goto L_0x002b
        L_0x0029:
            r7 = r23
        L_0x002b:
            r8 = r0 & 32
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x0033
            r8 = r9
            goto L_0x0035
        L_0x0033:
            r8 = r24
        L_0x0035:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003b
            r10 = r9
            goto L_0x003d
        L_0x003b:
            r10 = r25
        L_0x003d:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0043
            r11 = 0
            goto L_0x0045
        L_0x0043:
            r11 = r26
        L_0x0045:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004b
            r12 = 0
            goto L_0x004d
        L_0x004b:
            r12 = r27
        L_0x004d:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x005a
            o.onConfigChanged r13 = new o.onConfigChanged
            r13.<init>()
            r13.setLevel(r7)
            goto L_0x005c
        L_0x005a:
            r13 = r28
        L_0x005c:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r29
        L_0x0064:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r30
        L_0x006c:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = r31
        L_0x0073:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0079
            r2 = 0
            goto L_0x007b
        L_0x0079:
            r2 = r32
        L_0x007b:
            r19 = r9
            r9 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x0083
            r9 = 0
            goto L_0x0085
        L_0x0083:
            r9 = r33
        L_0x0085:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008f
            r16 = 0
            goto L_0x0091
        L_0x008f:
            r16 = r34
        L_0x0091:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x009a
            r0 = r19
            goto L_0x009c
        L_0x009a:
            r0 = r35
        L_0x009c:
            r19 = r18
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r7
            r25 = r8
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r6
            r33 = r2
            r34 = r9
            r35 = r16
            r36 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.disconnect.<init>(o.stopBleScan, java.lang.String, o.GriverAmcsLiteConfig$1, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.onConfigChanged, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final onConfigChanged getKycResponse() {
        return this.kycResponse;
    }

    public final void setKycResponse(@NotNull onConfigChanged onconfigchanged) {
        Intrinsics.checkNotNullParameter(onconfigchanged, "<set-?>");
        this.kycResponse = onconfigchanged;
    }

    public final boolean isFaceLoginEnabled() {
        return this.isFaceLoginEnabled;
    }

    public final void setFaceLoginEnabled(boolean z) {
        this.isFaceLoginEnabled = z;
    }

    public final boolean getHasFaceLoginEnrolled() {
        return this.hasFaceLoginEnrolled;
    }

    public final void setHasFaceLoginEnrolled(boolean z) {
        this.hasFaceLoginEnrolled = z;
    }

    public final boolean isFaceLoginReady() {
        return this.isFaceLoginReady;
    }

    public final void setFaceLoginReady(boolean z) {
        this.isFaceLoginReady = z;
    }

    @Nullable
    public final String getAccountStatus() {
        return this.accountStatus;
    }

    public final void setAccountStatus(@Nullable String str) {
        this.accountStatus = str;
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

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }

    public final boolean isPremiumUser() {
        return Intrinsics.areEqual((Object) "KYC2", (Object) this.kycResponse.getLevel()) && this.isKycCertified;
    }

    public final boolean isUserAndAccountStatusEnable() {
        return Intrinsics.areEqual((Object) "ENABLE", (Object) this.accountStatus) && Intrinsics.areEqual((Object) "ENABLE", (Object) this.userStatus);
    }
}
