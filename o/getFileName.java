package o;

import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.MoneyView;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/data/statement/repository/source/network/response/UserAccumulateQuerySummaryResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "accumulateAmount", "Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;", "userAccumulateSummaries", "", "Lid/dana/data/statement/repository/source/network/response/UserAccumulateSummary;", "(Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;Ljava/util/List;)V", "getAccumulateAmount", "()Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;", "getUserAccumulateSummaries", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getFileName extends BaseRpcResult {
    @NotNull
    private final MoneyView accumulateAmount;
    @NotNull
    private final List<setFilePath> userAccumulateSummaries;

    public static /* synthetic */ getFileName copy$default(getFileName getfilename, MoneyView moneyView, List<setFilePath> list, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyView = getfilename.accumulateAmount;
        }
        if ((i & 2) != 0) {
            list = getfilename.userAccumulateSummaries;
        }
        return getfilename.copy(moneyView, list);
    }

    @NotNull
    public final MoneyView component1() {
        return this.accumulateAmount;
    }

    @NotNull
    public final List<setFilePath> component2() {
        return this.userAccumulateSummaries;
    }

    @NotNull
    public final getFileName copy(@NotNull MoneyView moneyView, @NotNull List<setFilePath> list) {
        Intrinsics.checkNotNullParameter(moneyView, "accumulateAmount");
        Intrinsics.checkNotNullParameter(list, "userAccumulateSummaries");
        return new getFileName(moneyView, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFileName)) {
            return false;
        }
        getFileName getfilename = (getFileName) obj;
        return Intrinsics.areEqual((Object) this.accumulateAmount, (Object) getfilename.accumulateAmount) && Intrinsics.areEqual((Object) this.userAccumulateSummaries, (Object) getfilename.userAccumulateSummaries);
    }

    public final int hashCode() {
        MoneyView moneyView = this.accumulateAmount;
        int i = 0;
        int hashCode = (moneyView != null ? moneyView.hashCode() : 0) * 31;
        List<setFilePath> list = this.userAccumulateSummaries;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAccumulateQuerySummaryResult(accumulateAmount=");
        sb.append(this.accumulateAmount);
        sb.append(", userAccumulateSummaries=");
        sb.append(this.userAccumulateSummaries);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final MoneyView getAccumulateAmount() {
        return this.accumulateAmount;
    }

    @NotNull
    public final List<setFilePath> getUserAccumulateSummaries() {
        return this.userAccumulateSummaries;
    }

    public getFileName(@NotNull MoneyView moneyView, @NotNull List<setFilePath> list) {
        Intrinsics.checkNotNullParameter(moneyView, "accumulateAmount");
        Intrinsics.checkNotNullParameter(list, "userAccumulateSummaries");
        this.accumulateAmount = moneyView;
        this.userAccumulateSummaries = list;
    }
}
