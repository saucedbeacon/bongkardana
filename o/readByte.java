package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/data/promocode/repository/source/network/result/PromoCodeResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "needRetry", "", "prizeAward", "", "Lid/dana/data/promocode/repository/source/network/result/PrizeAwardVOResult;", "(ZLjava/util/List;)V", "getNeedRetry", "()Z", "getPrizeAward", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class readByte extends BaseRpcResult {
    private final boolean needRetry;
    @Nullable
    private final List<free> prizeAward;

    public static /* synthetic */ readByte copy$default(readByte readbyte, boolean z, List<free> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = readbyte.needRetry;
        }
        if ((i & 2) != 0) {
            list = readbyte.prizeAward;
        }
        return readbyte.copy(z, list);
    }

    public final boolean component1() {
        return this.needRetry;
    }

    @Nullable
    public final List<free> component2() {
        return this.prizeAward;
    }

    @NotNull
    public final readByte copy(boolean z, @Nullable List<free> list) {
        return new readByte(z, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readByte)) {
            return false;
        }
        readByte readbyte = (readByte) obj;
        return this.needRetry == readbyte.needRetry && Intrinsics.areEqual((Object) this.prizeAward, (Object) readbyte.prizeAward);
    }

    public final int hashCode() {
        boolean z = this.needRetry;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<free> list = this.prizeAward;
        return i + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeResult(needRetry=");
        sb.append(this.needRetry);
        sb.append(", prizeAward=");
        sb.append(this.prizeAward);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getNeedRetry() {
        return this.needRetry;
    }

    @Nullable
    public final List<free> getPrizeAward() {
        return this.prizeAward;
    }

    public readByte(boolean z, @Nullable List<free> list) {
        this.needRetry = z;
        this.prizeAward = list;
    }
}
