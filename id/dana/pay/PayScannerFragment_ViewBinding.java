package id.dana.pay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.scanner.ScannerFragment_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PayScannerFragment_ViewBinding extends ScannerFragment_ViewBinding {
    private View getMax;
    private PayScannerFragment length;
    private View setMin;

    @UiThread
    public PayScannerFragment_ViewBinding(final PayScannerFragment payScannerFragment, View view) {
        super(payScannerFragment, view);
        this.length = payScannerFragment;
        payScannerFragment.tvDoneScan = (TextView) drawDividersHorizontal.setMin(view, R.id.f65902131365217, "field 'tvDoneScan'", TextView.class);
        payScannerFragment.llScannerTools = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53612131363917, "field 'llScannerTools'", LinearLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f48982131363453, "field 'ivFlash' and method 'onIvFlashClicked'");
        payScannerFragment.ivFlash = (ImageView) drawDividersHorizontal.getMin(max, R.id.f48982131363453, "field 'ivFlash'", ImageView.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                payScannerFragment.onIvFlashClicked();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f49062131363461, "method 'onIvGalleryClicked'");
        this.setMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                payScannerFragment.onIvGalleryClicked();
            }
        });
    }

    public final void setMax() {
        PayScannerFragment payScannerFragment = this.length;
        if (payScannerFragment != null) {
            this.length = null;
            payScannerFragment.tvDoneScan = null;
            payScannerFragment.llScannerTools = null;
            payScannerFragment.ivFlash = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
