package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/request/UserGenerateQrRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "qris", "", "qrisBizType", "", "qrCount", "", "(ZLjava/lang/String;Ljava/lang/Integer;)V", "getQrCount", "()Ljava/lang/Integer;", "setQrCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getQris", "()Z", "getQrisBizType", "()Ljava/lang/String;", "setQrisBizType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;)Lid/dana/data/qrbarcode/repository/source/network/request/UserGenerateQrRequest;", "equals", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BridgeExtension extends BaseRpcRequest {
    @Nullable
    private Integer qrCount;
    private final boolean qris;
    @Nullable
    private String qrisBizType;

    public static /* synthetic */ BridgeExtension copy$default(BridgeExtension bridgeExtension, boolean z, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bridgeExtension.qris;
        }
        if ((i & 2) != 0) {
            str = bridgeExtension.qrisBizType;
        }
        if ((i & 4) != 0) {
            num = bridgeExtension.qrCount;
        }
        return bridgeExtension.copy(z, str, num);
    }

    public final boolean component1() {
        return this.qris;
    }

    @Nullable
    public final String component2() {
        return this.qrisBizType;
    }

    @Nullable
    public final Integer component3() {
        return this.qrCount;
    }

    @NotNull
    public final BridgeExtension copy(boolean z, @Nullable String str, @Nullable Integer num) {
        return new BridgeExtension(z, str, num);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeExtension)) {
            return false;
        }
        BridgeExtension bridgeExtension = (BridgeExtension) obj;
        return this.qris == bridgeExtension.qris && Intrinsics.areEqual((Object) this.qrisBizType, (Object) bridgeExtension.qrisBizType) && Intrinsics.areEqual((Object) this.qrCount, (Object) bridgeExtension.qrCount);
    }

    public final int hashCode() {
        boolean z = this.qris;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.qrisBizType;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.qrCount;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserGenerateQrRequest(qris=");
        sb.append(this.qris);
        sb.append(", qrisBizType=");
        sb.append(this.qrisBizType);
        sb.append(", qrCount=");
        sb.append(this.qrCount);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getQris() {
        return this.qris;
    }

    @Nullable
    public final String getQrisBizType() {
        return this.qrisBizType;
    }

    public final void setQrisBizType(@Nullable String str) {
        this.qrisBizType = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeExtension(boolean z, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }

    @Nullable
    public final Integer getQrCount() {
        return this.qrCount;
    }

    public final void setQrCount(@Nullable Integer num) {
        this.qrCount = num;
    }

    public BridgeExtension(boolean z, @Nullable String str, @Nullable Integer num) {
        this.qris = z;
        this.qrisBizType = str;
        this.qrCount = num;
    }
}
