package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lid/dana/data/merchantmanagement/model/MerchantInfoDTO;", "", "merchantName", "", "merchantLogo", "merchantPCLogo", "merchantBoundDate", "", "merchantId", "divisionId", "clientId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getDivisionId", "getMerchantBoundDate", "()J", "getMerchantId", "getMerchantLogo", "getMerchantName", "getMerchantPCLogo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getToggleButtonVisible {
    @NotNull
    private final String clientId;
    @Nullable
    private final String divisionId;
    private final long merchantBoundDate;
    @NotNull
    private final String merchantId;
    @Nullable
    private final String merchantLogo;
    @NotNull
    private final String merchantName;
    @Nullable
    private final String merchantPCLogo;

    public static /* synthetic */ getToggleButtonVisible copy$default(getToggleButtonVisible gettogglebuttonvisible, String str, String str2, String str3, long j, String str4, String str5, String str6, int i, Object obj) {
        getToggleButtonVisible gettogglebuttonvisible2 = gettogglebuttonvisible;
        return gettogglebuttonvisible.copy((i & 1) != 0 ? gettogglebuttonvisible2.merchantName : str, (i & 2) != 0 ? gettogglebuttonvisible2.merchantLogo : str2, (i & 4) != 0 ? gettogglebuttonvisible2.merchantPCLogo : str3, (i & 8) != 0 ? gettogglebuttonvisible2.merchantBoundDate : j, (i & 16) != 0 ? gettogglebuttonvisible2.merchantId : str4, (i & 32) != 0 ? gettogglebuttonvisible2.divisionId : str5, (i & 64) != 0 ? gettogglebuttonvisible2.clientId : str6);
    }

    @NotNull
    public final String component1() {
        return this.merchantName;
    }

    @Nullable
    public final String component2() {
        return this.merchantLogo;
    }

    @Nullable
    public final String component3() {
        return this.merchantPCLogo;
    }

    public final long component4() {
        return this.merchantBoundDate;
    }

    @NotNull
    public final String component5() {
        return this.merchantId;
    }

    @Nullable
    public final String component6() {
        return this.divisionId;
    }

    @NotNull
    public final String component7() {
        return this.clientId;
    }

    @NotNull
    public final getToggleButtonVisible copy(@NotNull String str, @Nullable String str2, @Nullable String str3, long j, @NotNull String str4, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "merchantId");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "clientId");
        return new getToggleButtonVisible(str, str2, str3, j, str7, str5, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getToggleButtonVisible)) {
            return false;
        }
        getToggleButtonVisible gettogglebuttonvisible = (getToggleButtonVisible) obj;
        return Intrinsics.areEqual((Object) this.merchantName, (Object) gettogglebuttonvisible.merchantName) && Intrinsics.areEqual((Object) this.merchantLogo, (Object) gettogglebuttonvisible.merchantLogo) && Intrinsics.areEqual((Object) this.merchantPCLogo, (Object) gettogglebuttonvisible.merchantPCLogo) && this.merchantBoundDate == gettogglebuttonvisible.merchantBoundDate && Intrinsics.areEqual((Object) this.merchantId, (Object) gettogglebuttonvisible.merchantId) && Intrinsics.areEqual((Object) this.divisionId, (Object) gettogglebuttonvisible.divisionId) && Intrinsics.areEqual((Object) this.clientId, (Object) gettogglebuttonvisible.clientId);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantInfoDTO(merchantName=");
        sb.append(this.merchantName);
        sb.append(", merchantLogo=");
        sb.append(this.merchantLogo);
        sb.append(", merchantPCLogo=");
        sb.append(this.merchantPCLogo);
        sb.append(", merchantBoundDate=");
        sb.append(this.merchantBoundDate);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", divisionId=");
        sb.append(this.divisionId);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(")");
        return sb.toString();
    }

    public getToggleButtonVisible(@NotNull String str, @Nullable String str2, @Nullable String str3, long j, @NotNull String str4, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str4, "merchantId");
        Intrinsics.checkNotNullParameter(str6, "clientId");
        this.merchantName = str;
        this.merchantLogo = str2;
        this.merchantPCLogo = str3;
        this.merchantBoundDate = j;
        this.merchantId = str4;
        this.divisionId = str5;
        this.clientId = str6;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final String getMerchantLogo() {
        return this.merchantLogo;
    }

    @Nullable
    public final String getMerchantPCLogo() {
        return this.merchantPCLogo;
    }

    public final long getMerchantBoundDate() {
        return this.merchantBoundDate;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    public final String getDivisionId() {
        return this.divisionId;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    public final int hashCode() {
        String str = this.merchantName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.merchantLogo;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.merchantPCLogo;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.valueOf(this.merchantBoundDate).hashCode()) * 31;
        String str4 = this.merchantId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.divisionId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.clientId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }
}
