package o;

import id.dana.statement.model.StatementDetailModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lid/dana/statement/model/UserStatementDetailModel;", "", "statementDetailModels", "", "Lid/dana/statement/model/StatementDetailModel;", "(Ljava/util/List;)V", "getStatementDetailModels", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class chooseSizeAndMargin {
    @Nullable
    public final List<StatementDetailModel> getMin;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof chooseSizeAndMargin) && Intrinsics.areEqual((Object) this.getMin, (Object) ((chooseSizeAndMargin) obj).getMin);
        }
        return true;
    }

    public final int hashCode() {
        List<StatementDetailModel> list = this.getMin;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStatementDetailModel(statementDetailModels=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public chooseSizeAndMargin(@Nullable List<StatementDetailModel> list) {
        this.getMin = list;
    }
}
