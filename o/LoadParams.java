package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantAdditionalInfoResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "bizInfo", "", "infoContent", "(Ljava/lang/String;Ljava/lang/String;)V", "getBizInfo", "()Ljava/lang/String;", "getInfoContent", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toMerchantAdditionalInfo", "Lid/dana/domain/nearbyme/model/MerchantAdditionalInfo;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LoadParams extends BaseRpcResult {
    @Nullable
    private final String bizInfo;
    @Nullable
    private final String infoContent;

    public static /* synthetic */ LoadParams copy$default(LoadParams loadParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loadParams.bizInfo;
        }
        if ((i & 2) != 0) {
            str2 = loadParams.infoContent;
        }
        return loadParams.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.bizInfo;
    }

    @Nullable
    public final String component2() {
        return this.infoContent;
    }

    @NotNull
    public final LoadParams copy(@Nullable String str, @Nullable String str2) {
        return new LoadParams(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadParams)) {
            return false;
        }
        LoadParams loadParams = (LoadParams) obj;
        return Intrinsics.areEqual((Object) this.bizInfo, (Object) loadParams.bizInfo) && Intrinsics.areEqual((Object) this.infoContent, (Object) loadParams.infoContent);
    }

    public final int hashCode() {
        String str = this.bizInfo;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.infoContent;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantAdditionalInfoResult(bizInfo=");
        sb.append(this.bizInfo);
        sb.append(", infoContent=");
        sb.append(this.infoContent);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getBizInfo() {
        return this.bizInfo;
    }

    @Nullable
    public final String getInfoContent() {
        return this.infoContent;
    }

    public LoadParams(@Nullable String str, @Nullable String str2) {
        this.bizInfo = str;
        this.infoContent = str2;
    }

    @NotNull
    public final getIMEIEncrypt toMerchantAdditionalInfo() {
        String str = this.bizInfo;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.infoContent;
        if (str3 != null) {
            str2 = str3;
        }
        return new getIMEIEncrypt(str, str2);
    }
}
