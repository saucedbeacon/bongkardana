package id.dana.statement.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.resetInternal;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/statement/view/StatementDownloadActivity$checkRecyclerViewFullyLoaded$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onLayoutCompleted", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementDownloadActivity$checkRecyclerViewFullyLoaded$1 extends LinearLayoutManager {
    final /* synthetic */ StatementDownloadActivity getMin;
    final /* synthetic */ Ref.IntRef setMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StatementDownloadActivity$checkRecyclerViewFullyLoaded$1(StatementDownloadActivity statementDownloadActivity, Ref.IntRef intRef, Context context) {
        super(context, 1, false);
        this.getMin = statementDownloadActivity;
        this.setMax = intRef;
    }

    public final void onLayoutCompleted(@Nullable RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        super.onLayoutCompleted(recyclerView$Mean$Arithmetic);
        this.setMax.element++;
        int findLastVisibleItemPosition = (findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1;
        RecyclerView recyclerView = (RecyclerView) this.getMin._$_findCachedViewById(resetInternal.setMax.hasOverlappingRendering);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_statement_history");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.intValue() >= findLastVisibleItemPosition && this.setMax.element == 2) {
            StatementDownloadActivity.access$prepareViewToSnap(this.getMin);
        }
    }
}
