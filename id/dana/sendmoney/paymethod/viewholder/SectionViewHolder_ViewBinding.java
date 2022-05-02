package id.dana.sendmoney.paymethod.viewholder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SectionViewHolder_ViewBinding implements Unbinder {
    private SectionViewHolder getMax;

    @UiThread
    public SectionViewHolder_ViewBinding(SectionViewHolder sectionViewHolder, View view) {
        this.getMax = sectionViewHolder;
        sectionViewHolder.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SectionViewHolder sectionViewHolder = this.getMax;
        if (sectionViewHolder != null) {
            this.getMax = null;
            sectionViewHolder.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
