package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class KybStatusCardView_ViewBinding implements Unbinder {
    private KybStatusCardView getMax;

    @UiThread
    public KybStatusCardView_ViewBinding(KybStatusCardView kybStatusCardView, View view) {
        this.getMax = kybStatusCardView;
        kybStatusCardView.dot = (ImageView) drawDividersHorizontal.setMin(view, R.id.f42532131362764, "field 'dot'", ImageView.class);
        kybStatusCardView.icKyb = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46062131363151, "field 'icKyb'", ImageView.class);
        kybStatusCardView.kybImageArrow = (ImageView) drawDividersHorizontal.setMin(view, R.id.f51532131363709, "field 'kybImageArrow'", ImageView.class);
        kybStatusCardView.labelKybStatus = (TextView) drawDividersHorizontal.setMin(view, R.id.f51542131363710, "field 'labelKybStatus'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        KybStatusCardView kybStatusCardView = this.getMax;
        if (kybStatusCardView != null) {
            this.getMax = null;
            kybStatusCardView.dot = null;
            kybStatusCardView.icKyb = null;
            kybStatusCardView.kybImageArrow = null;
            kybStatusCardView.labelKybStatus = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
