package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/data/saving/repository/source/network/request/UserSavingSummaryConsultRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "needActiveSavings", "", "savingViewsPage", "", "savingViewsSize", "(ZJJ)V", "getNeedActiveSavings", "()Z", "getSavingViewsPage", "()J", "getSavingViewsSize", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class allowRetry extends BaseRpcRequest {
    private final boolean needActiveSavings;
    private final long savingViewsPage;
    private final long savingViewsSize;

    public allowRetry() {
        this(false, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ allowRetry copy$default(allowRetry allowretry, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = allowretry.needActiveSavings;
        }
        if ((i & 2) != 0) {
            j = allowretry.savingViewsPage;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = allowretry.savingViewsSize;
        }
        return allowretry.copy(z, j3, j2);
    }

    public final boolean component1() {
        return this.needActiveSavings;
    }

    public final long component2() {
        return this.savingViewsPage;
    }

    public final long component3() {
        return this.savingViewsSize;
    }

    @NotNull
    public final allowRetry copy(boolean z, long j, long j2) {
        return new allowRetry(z, j, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof allowRetry)) {
            return false;
        }
        allowRetry allowretry = (allowRetry) obj;
        return this.needActiveSavings == allowretry.needActiveSavings && this.savingViewsPage == allowretry.savingViewsPage && this.savingViewsSize == allowretry.savingViewsSize;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSavingSummaryConsultRequest(needActiveSavings=");
        sb.append(this.needActiveSavings);
        sb.append(", savingViewsPage=");
        sb.append(this.savingViewsPage);
        sb.append(", savingViewsSize=");
        sb.append(this.savingViewsSize);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getNeedActiveSavings() {
        return this.needActiveSavings;
    }

    public final long getSavingViewsPage() {
        return this.savingViewsPage;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ allowRetry(boolean r3, long r4, long r6, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L_0x0005
            r3 = 1
        L_0x0005:
            r9 = r8 & 2
            if (r9 == 0) goto L_0x000b
            r4 = 0
        L_0x000b:
            r0 = r4
            r4 = r8 & 4
            if (r4 == 0) goto L_0x0012
            r6 = 10
        L_0x0012:
            r8 = r6
            r4 = r2
            r5 = r3
            r6 = r0
            r4.<init>(r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.allowRetry.<init>(boolean, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getSavingViewsSize() {
        return this.savingViewsSize;
    }

    public allowRetry(boolean z, long j, long j2) {
        this.needActiveSavings = z;
        this.savingViewsPage = j;
        this.savingViewsSize = j2;
    }

    public final int hashCode() {
        boolean z = this.needActiveSavings;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + Long.valueOf(this.savingViewsPage).hashCode()) * 31) + Long.valueOf(this.savingViewsSize).hashCode();
    }
}
