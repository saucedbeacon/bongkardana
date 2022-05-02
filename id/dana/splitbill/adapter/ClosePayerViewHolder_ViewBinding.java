package id.dana.splitbill.adapter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import o.drawDividersHorizontal;

public class ClosePayerViewHolder_ViewBinding implements Unbinder {
    private ClosePayerViewHolder length;

    @UiThread
    public ClosePayerViewHolder_ViewBinding(ClosePayerViewHolder closePayerViewHolder, View view) {
        this.length = closePayerViewHolder;
        closePayerViewHolder.cbClosePayer = (CheckBox) drawDividersHorizontal.setMin(view, R.id.f37682131362223, "field 'cbClosePayer'", CheckBox.class);
        closePayerViewHolder.civClosePayerAvatar = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38182131362296, "field 'civClosePayerAvatar'", CircleImageView.class);
        closePayerViewHolder.tvClosePayerName = (TextView) drawDividersHorizontal.setMin(view, R.id.f65222131365147, "field 'tvClosePayerName'", TextView.class);
        closePayerViewHolder.tvClosePayerAmount = (TextView) drawDividersHorizontal.setMin(view, R.id.f65212131365146, "field 'tvClosePayerAmount'", TextView.class);
        closePayerViewHolder.tvClosePayerPhone = (TextView) drawDividersHorizontal.setMin(view, R.id.f65232131365148, "field 'tvClosePayerPhone'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ClosePayerViewHolder closePayerViewHolder = this.length;
        if (closePayerViewHolder != null) {
            this.length = null;
            closePayerViewHolder.cbClosePayer = null;
            closePayerViewHolder.civClosePayerAvatar = null;
            closePayerViewHolder.tvClosePayerName = null;
            closePayerViewHolder.tvClosePayerAmount = null;
            closePayerViewHolder.tvClosePayerPhone = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
