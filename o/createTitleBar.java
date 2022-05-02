package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lid/dana/data/globalnetwork/model/UniPaymentEntityResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "bizModelsJsonStr", "", "(Ljava/lang/String;)V", "getBizModelsJsonStr", "()Ljava/lang/String;", "setBizModelsJsonStr", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createTitleBar extends BaseRpcResult {
    @NotNull
    private String bizModelsJsonStr;

    public static /* synthetic */ createTitleBar copy$default(createTitleBar createtitlebar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createtitlebar.bizModelsJsonStr;
        }
        return createtitlebar.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.bizModelsJsonStr;
    }

    @NotNull
    public final createTitleBar copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "bizModelsJsonStr");
        return new createTitleBar(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof createTitleBar) && Intrinsics.areEqual((Object) this.bizModelsJsonStr, (Object) ((createTitleBar) obj).bizModelsJsonStr);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.bizModelsJsonStr;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UniPaymentEntityResult(bizModelsJsonStr=");
        sb.append(this.bizModelsJsonStr);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getBizModelsJsonStr() {
        return this.bizModelsJsonStr;
    }

    public final void setBizModelsJsonStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizModelsJsonStr = str;
    }

    public createTitleBar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "bizModelsJsonStr");
        this.bizModelsJsonStr = str;
    }
}
