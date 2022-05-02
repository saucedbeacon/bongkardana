package o;

import id.dana.danah5.bioutility.BioUtilityBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lid/dana/domain/merchantmanagement/model/UnbindMerchantParam;", "", "clientId", "", "pubKey", "merchantId", "divisionId", "pin", "securityId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getDivisionId", "setDivisionId", "getMerchantId", "setMerchantId", "getPin", "setPin", "getPubKey", "setPubKey", "getSecurityId", "setSecurityId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class LocalIdTool {
    @NotNull
    private String clientId;
    @Nullable
    private String divisionId;
    @NotNull
    private String merchantId;
    @NotNull
    private String pin;
    @NotNull
    private String pubKey;
    @NotNull
    private String securityId;

    public static /* synthetic */ LocalIdTool copy$default(LocalIdTool localIdTool, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localIdTool.clientId;
        }
        if ((i & 2) != 0) {
            str2 = localIdTool.pubKey;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = localIdTool.merchantId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = localIdTool.divisionId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = localIdTool.pin;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = localIdTool.securityId;
        }
        return localIdTool.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.clientId;
    }

    @NotNull
    public final String component2() {
        return this.pubKey;
    }

    @NotNull
    public final String component3() {
        return this.merchantId;
    }

    @Nullable
    public final String component4() {
        return this.divisionId;
    }

    @NotNull
    public final String component5() {
        return this.pin;
    }

    @NotNull
    public final String component6() {
        return this.securityId;
    }

    @NotNull
    public final LocalIdTool copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "pubKey");
        Intrinsics.checkNotNullParameter(str3, "merchantId");
        Intrinsics.checkNotNullParameter(str5, "pin");
        Intrinsics.checkNotNullParameter(str6, BioUtilityBridge.SECURITY_ID);
        return new LocalIdTool(str, str2, str3, str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalIdTool)) {
            return false;
        }
        LocalIdTool localIdTool = (LocalIdTool) obj;
        return Intrinsics.areEqual((Object) this.clientId, (Object) localIdTool.clientId) && Intrinsics.areEqual((Object) this.pubKey, (Object) localIdTool.pubKey) && Intrinsics.areEqual((Object) this.merchantId, (Object) localIdTool.merchantId) && Intrinsics.areEqual((Object) this.divisionId, (Object) localIdTool.divisionId) && Intrinsics.areEqual((Object) this.pin, (Object) localIdTool.pin) && Intrinsics.areEqual((Object) this.securityId, (Object) localIdTool.securityId);
    }

    public final int hashCode() {
        String str = this.clientId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.pubKey;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.merchantId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.divisionId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.pin;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.securityId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UnbindMerchantParam(clientId=");
        sb.append(this.clientId);
        sb.append(", pubKey=");
        sb.append(this.pubKey);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", divisionId=");
        sb.append(this.divisionId);
        sb.append(", pin=");
        sb.append(this.pin);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(")");
        return sb.toString();
    }

    public LocalIdTool(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "pubKey");
        Intrinsics.checkNotNullParameter(str3, "merchantId");
        Intrinsics.checkNotNullParameter(str5, "pin");
        Intrinsics.checkNotNullParameter(str6, BioUtilityBridge.SECURITY_ID);
        this.clientId = str;
        this.pubKey = str2;
        this.merchantId = str3;
        this.divisionId = str4;
        this.pin = str5;
        this.securityId = str6;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    @NotNull
    public final String getPubKey() {
        return this.pubKey;
    }

    public final void setPubKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pubKey = str;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantId = str;
    }

    @Nullable
    public final String getDivisionId() {
        return this.divisionId;
    }

    public final void setDivisionId(@Nullable String str) {
        this.divisionId = str;
    }

    @NotNull
    public final String getPin() {
        return this.pin;
    }

    public final void setPin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pin = str;
    }

    @NotNull
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.securityId = str;
    }
}
