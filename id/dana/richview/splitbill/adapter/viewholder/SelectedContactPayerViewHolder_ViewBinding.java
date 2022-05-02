package id.dana.richview.splitbill.adapter.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class SelectedContactPayerViewHolder_ViewBinding implements Unbinder {
    private SelectedContactPayerViewHolder getMin;

    @UiThread
    public SelectedContactPayerViewHolder_ViewBinding(SelectedContactPayerViewHolder selectedContactPayerViewHolder, View view) {
        this.getMin = selectedContactPayerViewHolder;
        selectedContactPayerViewHolder.recentDetailView = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'recentDetailView'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        SelectedContactPayerViewHolder selectedContactPayerViewHolder = this.getMin;
        if (selectedContactPayerViewHolder != null) {
            this.getMin = null;
            selectedContactPayerViewHolder.recentDetailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
