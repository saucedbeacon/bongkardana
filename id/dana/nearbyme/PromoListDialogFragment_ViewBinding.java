package id.dana.nearbyme;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class PromoListDialogFragment_ViewBinding implements Unbinder {
    private PromoListDialogFragment length;

    @UiThread
    public PromoListDialogFragment_ViewBinding(PromoListDialogFragment promoListDialogFragment, View view) {
        this.length = promoListDialogFragment;
        promoListDialogFragment.coordinatorLayout = (ViewGroup) drawDividersHorizontal.setMin(view, R.id.f51802131363736, "field 'coordinatorLayout'", ViewGroup.class);
        promoListDialogFragment.rvNearbyPromo = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59492131364534, "field 'rvNearbyPromo'", RecyclerView.class);
        promoListDialogFragment.ivClose = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48372131363391, "field 'ivClose'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        PromoListDialogFragment promoListDialogFragment = this.length;
        if (promoListDialogFragment != null) {
            this.length = null;
            promoListDialogFragment.coordinatorLayout = null;
            promoListDialogFragment.rvNearbyPromo = null;
            promoListDialogFragment.ivClose = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
