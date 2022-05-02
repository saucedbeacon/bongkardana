package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/result/merchantreview/MerchantCreateReviewResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "success", "", "merchantMetaDataId", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getMerchantMetaDataId", "()Ljava/lang/String;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lid/dana/data/nearbyme/repository/source/network/result/merchantreview/MerchantCreateReviewResult;", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppxDomain extends BaseRpcResult {
    @Nullable
    private final String merchantMetaDataId;
    @Nullable
    private final Boolean success;

    public static /* synthetic */ setAppxDomain copy$default(setAppxDomain setappxdomain, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = setappxdomain.success;
        }
        if ((i & 2) != 0) {
            str = setappxdomain.merchantMetaDataId;
        }
        return setappxdomain.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.success;
    }

    @Nullable
    public final String component2() {
        return this.merchantMetaDataId;
    }

    @NotNull
    public final setAppxDomain copy(@Nullable Boolean bool, @Nullable String str) {
        return new setAppxDomain(bool, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAppxDomain)) {
            return false;
        }
        setAppxDomain setappxdomain = (setAppxDomain) obj;
        return Intrinsics.areEqual((Object) this.success, (Object) setappxdomain.success) && Intrinsics.areEqual((Object) this.merchantMetaDataId, (Object) setappxdomain.merchantMetaDataId);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.merchantMetaDataId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantCreateReviewResult(success=");
        sb.append(this.success);
        sb.append(", merchantMetaDataId=");
        sb.append(this.merchantMetaDataId);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final String getMerchantMetaDataId() {
        return this.merchantMetaDataId;
    }

    public setAppxDomain(@Nullable Boolean bool, @Nullable String str) {
        this.success = bool;
        this.merchantMetaDataId = str;
    }
}
