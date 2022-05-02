package id.dana.nearbyme.merchantdetail.merchantphoto;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class MerchantPhotosView_ViewBinding implements Unbinder {
    private View getMax;
    private MerchantPhotosView length;

    @UiThread
    public MerchantPhotosView_ViewBinding(final MerchantPhotosView merchantPhotosView, View view) {
        this.length = merchantPhotosView;
        View max = drawDividersHorizontal.getMax(view, R.id.f69152131365542, "method 'onClick'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                merchantPhotosView.onClick();
            }
        });
    }

    public final void setMax() {
        if (this.length != null) {
            this.length = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
