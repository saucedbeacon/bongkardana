package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import o.setChecked;
import o.setPopupCallback;
import o.showPopupUnchecked;

public class FragmentStateAdapter$5 implements setPopupCallback {
    final /* synthetic */ Handler getMax;
    final /* synthetic */ showPopupUnchecked length;
    final /* synthetic */ Runnable setMin;

    public FragmentStateAdapter$5(showPopupUnchecked showpopupunchecked, Handler handler, Runnable runnable) {
        this.length = showpopupunchecked;
        this.getMax = handler;
        this.setMin = runnable;
    }

    public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.getMax.removeCallbacks(this.setMin);
            setchecked.getLifecycle().length(this);
        }
    }
}
