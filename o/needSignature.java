package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "withdrawMethodViews", "", "Lid/dana/data/saving/model/WithdrawMethodView;", "savingView", "Lid/dana/data/saving/model/SavingView;", "(Ljava/util/List;Lid/dana/data/saving/model/SavingView;)V", "getSavingView", "()Lid/dana/data/saving/model/SavingView;", "getWithdrawMethodViews", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class needSignature extends BaseRpcResult {
    @NotNull
    private final headers savingView;
    @NotNull
    private final List<RVHttpResponse> withdrawMethodViews;

    public static /* synthetic */ needSignature copy$default(needSignature needsignature, List<RVHttpResponse> list, headers headers, int i, Object obj) {
        if ((i & 1) != 0) {
            list = needsignature.withdrawMethodViews;
        }
        if ((i & 2) != 0) {
            headers = needsignature.savingView;
        }
        return needsignature.copy(list, headers);
    }

    @NotNull
    public final List<RVHttpResponse> component1() {
        return this.withdrawMethodViews;
    }

    @NotNull
    public final headers component2() {
        return this.savingView;
    }

    @NotNull
    public final needSignature copy(@NotNull List<RVHttpResponse> list, @NotNull headers headers) {
        Intrinsics.checkNotNullParameter(list, "withdrawMethodViews");
        Intrinsics.checkNotNullParameter(headers, "savingView");
        return new needSignature(list, headers);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof needSignature)) {
            return false;
        }
        needSignature needsignature = (needSignature) obj;
        return Intrinsics.areEqual((Object) this.withdrawMethodViews, (Object) needsignature.withdrawMethodViews) && Intrinsics.areEqual((Object) this.savingView, (Object) needsignature.savingView);
    }

    public final int hashCode() {
        List<RVHttpResponse> list = this.withdrawMethodViews;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        headers headers = this.savingView;
        if (headers != null) {
            i = headers.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingWithdrawInitEntityResult(withdrawMethodViews=");
        sb.append(this.withdrawMethodViews);
        sb.append(", savingView=");
        sb.append(this.savingView);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<RVHttpResponse> getWithdrawMethodViews() {
        return this.withdrawMethodViews;
    }

    @NotNull
    public final headers getSavingView() {
        return this.savingView;
    }

    public needSignature(@NotNull List<RVHttpResponse> list, @NotNull headers headers) {
        Intrinsics.checkNotNullParameter(list, "withdrawMethodViews");
        Intrinsics.checkNotNullParameter(headers, "savingView");
        this.withdrawMethodViews = list;
        this.savingView = headers;
    }
}
