package id.dana.sendmoney.recipient;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SectionViewHolder_ViewBinding implements Unbinder {
    private SectionViewHolder length;

    @UiThread
    public SectionViewHolder_ViewBinding(SectionViewHolder sectionViewHolder, View view) {
        this.length = sectionViewHolder;
        sectionViewHolder.tvHeaderSection = (TextView) drawDividersHorizontal.setMin(view, R.id.f66622131365289, "field 'tvHeaderSection'", TextView.class);
        sectionViewHolder.vDivider = drawDividersHorizontal.getMax(view, R.id.f72252131365860, "field 'vDivider'");
    }

    @CallSuper
    public final void setMax() {
        SectionViewHolder sectionViewHolder = this.length;
        if (sectionViewHolder != null) {
            this.length = null;
            sectionViewHolder.tvHeaderSection = null;
            sectionViewHolder.vDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
