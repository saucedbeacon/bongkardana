package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/twilio/repository/source/network/result/VerifySecurityProductResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "identFailedCount", "", "maxFailedLimit", "lockedExpireMins", "(III)V", "getIdentFailedCount", "()I", "getLockedExpireMins", "getMaxFailedLimit", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class needWaitForSetup extends BaseRpcResult {
    private final int identFailedCount;
    private final int lockedExpireMins;
    private final int maxFailedLimit;

    public needWaitForSetup() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ needWaitForSetup copy$default(needWaitForSetup needwaitforsetup, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = needwaitforsetup.identFailedCount;
        }
        if ((i4 & 2) != 0) {
            i2 = needwaitforsetup.maxFailedLimit;
        }
        if ((i4 & 4) != 0) {
            i3 = needwaitforsetup.lockedExpireMins;
        }
        return needwaitforsetup.copy(i, i2, i3);
    }

    public final int component1() {
        return this.identFailedCount;
    }

    public final int component2() {
        return this.maxFailedLimit;
    }

    public final int component3() {
        return this.lockedExpireMins;
    }

    @NotNull
    public final needWaitForSetup copy(int i, int i2, int i3) {
        return new needWaitForSetup(i, i2, i3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof needWaitForSetup)) {
            return false;
        }
        needWaitForSetup needwaitforsetup = (needWaitForSetup) obj;
        return this.identFailedCount == needwaitforsetup.identFailedCount && this.maxFailedLimit == needwaitforsetup.maxFailedLimit && this.lockedExpireMins == needwaitforsetup.lockedExpireMins;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifySecurityProductResult(identFailedCount=");
        sb.append(this.identFailedCount);
        sb.append(", maxFailedLimit=");
        sb.append(this.maxFailedLimit);
        sb.append(", lockedExpireMins=");
        sb.append(this.lockedExpireMins);
        sb.append(")");
        return sb.toString();
    }

    public final int getIdentFailedCount() {
        return this.identFailedCount;
    }

    public final int getMaxFailedLimit() {
        return this.maxFailedLimit;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ needWaitForSetup(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getLockedExpireMins() {
        return this.lockedExpireMins;
    }

    public needWaitForSetup(int i, int i2, int i3) {
        this.identFailedCount = i;
        this.maxFailedLimit = i2;
        this.lockedExpireMins = i3;
    }

    public final int hashCode() {
        return (((Integer.valueOf(this.identFailedCount).hashCode() * 31) + Integer.valueOf(this.maxFailedLimit).hashCode()) * 31) + Integer.valueOf(this.lockedExpireMins).hashCode();
    }
}
