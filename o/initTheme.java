package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import id.dana.R;
import id.dana.statement.model.StatementViewModel;
import id.dana.statement.model.UserStatementModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/statement/adapter/StatementSectionTitleViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/statement/model/StatementViewModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class initTheme extends Ignore<StatementViewModel> {
    public final /* synthetic */ void setMax(Object obj) {
        String str;
        UserStatementModel userStatementModel;
        StatementViewModel statementViewModel = (StatementViewModel) obj;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.grantReadPermission);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_statement_type");
        if (statementViewModel == null || (userStatementModel = statementViewModel.setMin) == null) {
            str = null;
        } else {
            str = userStatementModel.setMin;
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public initTheme(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_statement_type, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
