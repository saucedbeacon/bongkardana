package id.dana.statement.adapter;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.statement.view.TransactionStatementView;
import o.drawDividersHorizontal;

public final class StatementHistoryViewHolder_ViewBinding implements Unbinder {
    private StatementHistoryViewHolder getMax;

    @UiThread
    public StatementHistoryViewHolder_ViewBinding(StatementHistoryViewHolder statementHistoryViewHolder, View view) {
        this.getMax = statementHistoryViewHolder;
        statementHistoryViewHolder.transactionStatementView = (TransactionStatementView) drawDividersHorizontal.setMin(view, R.id.f73302131365965, "field 'transactionStatementView'", TransactionStatementView.class);
    }

    public final void setMax() {
        StatementHistoryViewHolder statementHistoryViewHolder = this.getMax;
        if (statementHistoryViewHolder != null) {
            this.getMax = null;
            statementHistoryViewHolder.transactionStatementView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
