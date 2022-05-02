package id.dana.requestmoney.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import o.drawDividersHorizontal;

public class ViewHolderListPayer_ViewBinding implements Unbinder {
    private ViewHolderListPayer length;

    @UiThread
    public ViewHolderListPayer_ViewBinding(ViewHolderListPayer viewHolderListPayer, View view) {
        this.length = viewHolderListPayer;
        viewHolderListPayer.civPayerAvatar = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38242131362302, "field 'civPayerAvatar'", CircleImageView.class);
        viewHolderListPayer.tvPayerName = (TextView) drawDividersHorizontal.setMin(view, R.id.f68122131365439, "field 'tvPayerName'", TextView.class);
        viewHolderListPayer.tvTime = (TextView) drawDividersHorizontal.setMin(view, R.id.f69692131365596, "field 'tvTime'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ViewHolderListPayer viewHolderListPayer = this.length;
        if (viewHolderListPayer != null) {
            this.length = null;
            viewHolderListPayer.civPayerAvatar = null;
            viewHolderListPayer.tvPayerName = null;
            viewHolderListPayer.tvTime = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
