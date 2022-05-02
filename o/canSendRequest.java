package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lid/dana/domain/otp/model/VerifyOtpResponse;", "Lid/dana/domain/model/rpc/response/BaseRpcResponse;", "failedCount", "", "maxFailedCount", "(II)V", "getFailedCount", "()I", "setFailedCount", "(I)V", "getMaxFailedCount", "setMaxFailedCount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class canSendRequest extends initWithSecurityGuard {
    private int failedCount;
    private int maxFailedCount;

    public canSendRequest() {
        this(0, 0, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ canSendRequest copy$default(canSendRequest cansendrequest, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cansendrequest.failedCount;
        }
        if ((i3 & 2) != 0) {
            i2 = cansendrequest.maxFailedCount;
        }
        return cansendrequest.copy(i, i2);
    }

    public final int component1() {
        return this.failedCount;
    }

    public final int component2() {
        return this.maxFailedCount;
    }

    @NotNull
    public final canSendRequest copy(int i, int i2) {
        return new canSendRequest(i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof canSendRequest)) {
            return false;
        }
        canSendRequest cansendrequest = (canSendRequest) obj;
        return this.failedCount == cansendrequest.failedCount && this.maxFailedCount == cansendrequest.maxFailedCount;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyOtpResponse(failedCount=");
        sb.append(this.failedCount);
        sb.append(", maxFailedCount=");
        sb.append(this.maxFailedCount);
        sb.append(")");
        return sb.toString();
    }

    public final int getFailedCount() {
        return this.failedCount;
    }

    public final void setFailedCount(int i) {
        this.failedCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ canSendRequest(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getMaxFailedCount() {
        return this.maxFailedCount;
    }

    public final void setMaxFailedCount(int i) {
        this.maxFailedCount = i;
    }

    public canSendRequest(int i, int i2) {
        this.failedCount = i;
        this.maxFailedCount = i2;
    }

    public final int hashCode() {
        return (Integer.valueOf(this.failedCount).hashCode() * 31) + Integer.valueOf(this.maxFailedCount).hashCode();
    }
}
