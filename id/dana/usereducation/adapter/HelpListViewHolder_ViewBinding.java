package id.dana.usereducation.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class HelpListViewHolder_ViewBinding implements Unbinder {
    private HelpListViewHolder setMin;

    @UiThread
    public HelpListViewHolder_ViewBinding(HelpListViewHolder helpListViewHolder, View view) {
        this.setMin = helpListViewHolder;
        helpListViewHolder.ivIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49242131363479, "field 'ivIcon'", ImageView.class);
        helpListViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f62242131364837, "field 'tvTitle'", TextView.class);
        helpListViewHolder.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f42152131362709, "field 'tvDescription'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        HelpListViewHolder helpListViewHolder = this.setMin;
        if (helpListViewHolder != null) {
            this.setMin = null;
            helpListViewHolder.ivIcon = null;
            helpListViewHolder.tvTitle = null;
            helpListViewHolder.tvDescription = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
