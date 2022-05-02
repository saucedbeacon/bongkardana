package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/data/social/repository/source/network/request/InitFeedRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "totalPhoneContactSize", "", "lastFetchTime", "", "(IJ)V", "getLastFetchTime", "()J", "getTotalPhoneContactSize", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAuthText extends BaseRpcRequest {
    private final long lastFetchTime;
    private final int totalPhoneContactSize;

    public static /* synthetic */ getAuthText copy$default(getAuthText getauthtext, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getauthtext.totalPhoneContactSize;
        }
        if ((i2 & 2) != 0) {
            j = getauthtext.lastFetchTime;
        }
        return getauthtext.copy(i, j);
    }

    public final int component1() {
        return this.totalPhoneContactSize;
    }

    public final long component2() {
        return this.lastFetchTime;
    }

    @NotNull
    public final getAuthText copy(int i, long j) {
        return new getAuthText(i, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAuthText)) {
            return false;
        }
        getAuthText getauthtext = (getAuthText) obj;
        return this.totalPhoneContactSize == getauthtext.totalPhoneContactSize && this.lastFetchTime == getauthtext.lastFetchTime;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InitFeedRequest(totalPhoneContactSize=");
        sb.append(this.totalPhoneContactSize);
        sb.append(", lastFetchTime=");
        sb.append(this.lastFetchTime);
        sb.append(")");
        return sb.toString();
    }

    public final int getTotalPhoneContactSize() {
        return this.totalPhoneContactSize;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getAuthText(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 0 : j);
    }

    public final long getLastFetchTime() {
        return this.lastFetchTime;
    }

    public getAuthText(int i, long j) {
        this.totalPhoneContactSize = i;
        this.lastFetchTime = j;
    }

    public final int hashCode() {
        return (Integer.valueOf(this.totalPhoneContactSize).hashCode() * 31) + Long.valueOf(this.lastFetchTime).hashCode();
    }
}
