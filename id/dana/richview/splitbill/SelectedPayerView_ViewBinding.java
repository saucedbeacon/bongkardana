package id.dana.richview.splitbill;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class SelectedPayerView_ViewBinding implements Unbinder {
    private SelectedPayerView getMin;

    @UiThread
    public SelectedPayerView_ViewBinding(SelectedPayerView selectedPayerView, View view) {
        this.getMin = selectedPayerView;
        selectedPayerView.rdvScanner = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f57512131364329, "field 'rdvScanner'", RecentDetailView.class);
        selectedPayerView.rvSelectedPayers = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59812131364566, "field 'rvSelectedPayers'", RecyclerView.class);
        selectedPayerView.tvCountPayers = (TextView) drawDividersHorizontal.setMin(view, R.id.f65352131365160, "field 'tvCountPayers'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SelectedPayerView selectedPayerView = this.getMin;
        if (selectedPayerView != null) {
            this.getMin = null;
            selectedPayerView.rdvScanner = null;
            selectedPayerView.rvSelectedPayers = null;
            selectedPayerView.tvCountPayers = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
