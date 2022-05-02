package androidx.viewpager2.adapter;

import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import o.setChecked;
import o.setPopupCallback;
import o.showPopup;
import o.showPopupUnchecked;

public class FragmentStateAdapter$2 implements setPopupCallback {
    final /* synthetic */ showPopupUnchecked getMin;
    final /* synthetic */ showPopup setMin;

    public FragmentStateAdapter$2(showPopupUnchecked showpopupunchecked, showPopup showpopup) {
        this.getMin = showpopupunchecked;
        this.setMin = showpopup;
    }

    public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
        if (!this.getMin.getMin()) {
            setchecked.getLifecycle().length(this);
            if (ViewCompat.ICustomTabsService((FrameLayout) this.setMin.itemView)) {
                this.getMin.getMax(this.setMin);
            }
        }
    }
}
