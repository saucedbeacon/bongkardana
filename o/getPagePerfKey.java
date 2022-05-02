package o;

import id.dana.model.CurrencyAmountModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.InternalApiBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bD\b\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fHÆ\u0003J¿\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020\u00132\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\nHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\"\"\u0004\b%\u0010$R\u001a\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\"\"\u0004\b'\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001a\"\u0004\b9\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001a\"\u0004\bA\u0010\u001c¨\u0006W"}, d2 = {"Lid/dana/model/UserInfo;", "", "name", "", "userID", "avatar", "balance", "Lid/dana/model/CurrencyAmountModel;", "nickname", "pendingTransaction", "", "loginId", "kycInfo", "Lid/dana/model/KycInfo;", "kybInfo", "Lid/dana/model/KybInfo;", "ktpName", "ktpId", "isKycCertified", "", "isFaceLoginEnabled", "hasFaceLoginEnrolled", "isFaceLoginReady", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/model/CurrencyAmountModel;Ljava/lang/String;ILjava/lang/String;Lid/dana/model/KycInfo;Lid/dana/model/KybInfo;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getBalance", "()Lid/dana/model/CurrencyAmountModel;", "setBalance", "(Lid/dana/model/CurrencyAmountModel;)V", "getHasFaceLoginEnrolled", "()Z", "setHasFaceLoginEnrolled", "(Z)V", "setFaceLoginEnabled", "setFaceLoginReady", "setKycCertified", "getKtpId", "setKtpId", "getKtpName", "setKtpName", "getKybInfo", "()Lid/dana/model/KybInfo;", "setKybInfo", "(Lid/dana/model/KybInfo;)V", "getKycInfo", "()Lid/dana/model/KycInfo;", "setKycInfo", "(Lid/dana/model/KycInfo;)V", "getLoginId", "setLoginId", "getName", "setName", "getNickname", "setNickname", "getPendingTransaction", "()I", "setPendingTransaction", "(I)V", "getUserID", "setUserID", "getUsername", "setUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPagePerfKey {
    @Nullable
    private String FastBitmap$CoordinateSystem;
    public boolean IsOverlapping;
    public boolean equals;
    @Nullable
    public CurrencyAmountModel getMax;
    @Nullable
    public String getMin;
    @Nullable
    private String hashCode;
    public boolean isInside;
    public int length;
    @Nullable
    public activityGetScreenOrientation setMax;
    @Nullable
    public String setMin;
    public boolean toDoubleRange;
    @Nullable
    public String toFloatRange;
    @Nullable
    public InternalApiBridgeExtension.AnonymousClass1 toIntRange;
    @Nullable
    public String toString;
    @Nullable
    private String valueOf;
    @Nullable
    private String values;

    public getPagePerfKey() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPagePerfKey)) {
            return false;
        }
        getPagePerfKey getpageperfkey = (getPagePerfKey) obj;
        return Intrinsics.areEqual((Object) this.hashCode, (Object) getpageperfkey.hashCode) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) getpageperfkey.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.values, (Object) getpageperfkey.values) && Intrinsics.areEqual((Object) this.getMax, (Object) getpageperfkey.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) getpageperfkey.getMin) && this.length == getpageperfkey.length && Intrinsics.areEqual((Object) this.setMin, (Object) getpageperfkey.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) getpageperfkey.setMax) && Intrinsics.areEqual((Object) this.toIntRange, (Object) getpageperfkey.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) getpageperfkey.toFloatRange) && Intrinsics.areEqual((Object) this.valueOf, (Object) getpageperfkey.valueOf) && this.isInside == getpageperfkey.isInside && this.equals == getpageperfkey.equals && this.IsOverlapping == getpageperfkey.IsOverlapping && this.toDoubleRange == getpageperfkey.toDoubleRange && Intrinsics.areEqual((Object) this.toString, (Object) getpageperfkey.toString);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(name=");
        sb.append(this.hashCode);
        sb.append(", userID=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", avatar=");
        sb.append(this.values);
        sb.append(", balance=");
        sb.append(this.getMax);
        sb.append(", nickname=");
        sb.append(this.getMin);
        sb.append(", pendingTransaction=");
        sb.append(this.length);
        sb.append(", loginId=");
        sb.append(this.setMin);
        sb.append(", kycInfo=");
        sb.append(this.setMax);
        sb.append(", kybInfo=");
        sb.append(this.toIntRange);
        sb.append(", ktpName=");
        sb.append(this.toFloatRange);
        sb.append(", ktpId=");
        sb.append(this.valueOf);
        sb.append(", isKycCertified=");
        sb.append(this.isInside);
        sb.append(", isFaceLoginEnabled=");
        sb.append(this.equals);
        sb.append(", hasFaceLoginEnrolled=");
        sb.append(this.IsOverlapping);
        sb.append(", isFaceLoginReady=");
        sb.append(this.toDoubleRange);
        sb.append(", username=");
        sb.append(this.toString);
        sb.append(")");
        return sb.toString();
    }

    private getPagePerfKey(byte b) {
        this.hashCode = null;
        this.FastBitmap$CoordinateSystem = null;
        this.values = null;
        this.getMax = null;
        this.getMin = null;
        this.length = 0;
        this.setMin = null;
        this.setMax = null;
        this.toIntRange = null;
        this.toFloatRange = null;
        this.valueOf = null;
        this.isInside = false;
        this.equals = false;
        this.IsOverlapping = false;
        this.toDoubleRange = false;
        this.toString = null;
    }

    public final boolean length() {
        return this.isInside;
    }

    public final boolean getMax() {
        return this.equals;
    }

    public final boolean setMax() {
        return this.IsOverlapping;
    }

    public final boolean getMin() {
        return this.toDoubleRange;
    }

    private /* synthetic */ getPagePerfKey(char c) {
        this((byte) 0);
    }

    public final int hashCode() {
        String str = this.hashCode;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.FastBitmap$CoordinateSystem;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.values;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        CurrencyAmountModel currencyAmountModel = this.getMax;
        int hashCode5 = (hashCode4 + (currencyAmountModel != null ? currencyAmountModel.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode6 = (((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.valueOf(this.length).hashCode()) * 31;
        String str5 = this.setMin;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        activityGetScreenOrientation activitygetscreenorientation = this.setMax;
        int hashCode8 = (hashCode7 + (activitygetscreenorientation != null ? activitygetscreenorientation.hashCode() : 0)) * 31;
        InternalApiBridgeExtension.AnonymousClass1 r2 = this.toIntRange;
        int hashCode9 = (hashCode8 + (r2 != null ? r2.hashCode() : 0)) * 31;
        String str6 = this.toFloatRange;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.valueOf;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z = this.isInside;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode11 + (z ? 1 : 0)) * 31;
        boolean z3 = this.equals;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.IsOverlapping;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.toDoubleRange;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str8 = this.toString;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i5 + i;
    }
}
