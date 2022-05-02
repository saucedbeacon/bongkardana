package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/social/repository/source/network/response/FetchFeedNotificationCountResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "notificationCount", "", "(I)V", "getNotificationCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIsvAgent extends BaseRpcResult {
    private final int notificationCount;

    public setIsvAgent() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setIsvAgent copy$default(setIsvAgent setisvagent, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setisvagent.notificationCount;
        }
        return setisvagent.copy(i);
    }

    public final int component1() {
        return this.notificationCount;
    }

    @NotNull
    public final setIsvAgent copy(int i) {
        return new setIsvAgent(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setIsvAgent) && this.notificationCount == ((setIsvAgent) obj).notificationCount;
        }
        return true;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchFeedNotificationCountResponse(notificationCount=");
        sb.append(this.notificationCount);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setIsvAgent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getNotificationCount() {
        return this.notificationCount;
    }

    public setIsvAgent(int i) {
        this.notificationCount = i;
    }

    public final int hashCode() {
        return Integer.valueOf(this.notificationCount).hashCode();
    }
}
