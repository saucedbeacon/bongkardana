package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/SavingDetailResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "savingView", "Lid/dana/data/saving/model/SavingView;", "topUpViews", "", "Lid/dana/data/saving/model/TopUpViewEntity;", "hasNext", "", "(Lid/dana/data/saving/model/SavingView;Ljava/util/List;Z)V", "getHasNext", "()Z", "getSavingView", "()Lid/dana/data/saving/model/SavingView;", "getTopUpViews", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class shortLinkOnly extends BaseRpcResult {
    private final boolean hasNext;
    @NotNull
    private final headers savingView;
    @Nullable
    private final List<useSpdy> topUpViews;

    public static /* synthetic */ shortLinkOnly copy$default(shortLinkOnly shortlinkonly, headers headers, List<useSpdy> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            headers = shortlinkonly.savingView;
        }
        if ((i & 2) != 0) {
            list = shortlinkonly.topUpViews;
        }
        if ((i & 4) != 0) {
            z = shortlinkonly.hasNext;
        }
        return shortlinkonly.copy(headers, list, z);
    }

    @NotNull
    public final headers component1() {
        return this.savingView;
    }

    @Nullable
    public final List<useSpdy> component2() {
        return this.topUpViews;
    }

    public final boolean component3() {
        return this.hasNext;
    }

    @NotNull
    public final shortLinkOnly copy(@NotNull headers headers, @Nullable List<useSpdy> list, boolean z) {
        Intrinsics.checkNotNullParameter(headers, "savingView");
        return new shortLinkOnly(headers, list, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shortLinkOnly)) {
            return false;
        }
        shortLinkOnly shortlinkonly = (shortLinkOnly) obj;
        return Intrinsics.areEqual((Object) this.savingView, (Object) shortlinkonly.savingView) && Intrinsics.areEqual((Object) this.topUpViews, (Object) shortlinkonly.topUpViews) && this.hasNext == shortlinkonly.hasNext;
    }

    public final int hashCode() {
        headers headers = this.savingView;
        int i = 0;
        int hashCode = (headers != null ? headers.hashCode() : 0) * 31;
        List<useSpdy> list = this.topUpViews;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.hasNext;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingDetailResult(savingView=");
        sb.append(this.savingView);
        sb.append(", topUpViews=");
        sb.append(this.topUpViews);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final headers getSavingView() {
        return this.savingView;
    }

    @Nullable
    public final List<useSpdy> getTopUpViews() {
        return this.topUpViews;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public shortLinkOnly(@NotNull headers headers, @Nullable List<useSpdy> list, boolean z) {
        Intrinsics.checkNotNullParameter(headers, "savingView");
        this.savingView = headers;
        this.topUpViews = list;
        this.hasNext = z;
    }
}
