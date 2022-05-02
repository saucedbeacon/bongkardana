package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class ScannerViewHolder_ViewBinding implements Unbinder {
    private ScannerViewHolder getMax;

    @UiThread
    public ScannerViewHolder_ViewBinding(ScannerViewHolder scannerViewHolder, View view) {
        this.getMax = scannerViewHolder;
        scannerViewHolder.recentDetailView = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'recentDetailView'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        ScannerViewHolder scannerViewHolder = this.getMax;
        if (scannerViewHolder != null) {
            this.getMax = null;
            scannerViewHolder.recentDetailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
