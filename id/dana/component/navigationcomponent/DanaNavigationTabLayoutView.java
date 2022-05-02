package id.dana.component.navigationcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setBackgroundColorRes;

public class DanaNavigationTabLayoutView extends TabLayout {
    private int setMin;

    public DanaNavigationTabLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.MediaDescriptionCompat, 0, 0);
            try {
                this.setMin = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.MediaBrowserCompat$ItemReceiver, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        int i = this.setMin;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-430029466, oncanceled);
            onCancelLoad.getMin(-430029466, oncanceled);
        }
        if (i == 0) {
            setTabIndicatorFullWidth(true);
            setSelectedTabIndicatorColor(getResources().getColor(setBackgroundColorRes.getMax.setMax));
            setBackgroundColor(getResources().getColor(setBackgroundColorRes.getMax.IsOverlapping));
            setTabTextColors(getResources().getColor(setBackgroundColorRes.getMax.getMax), getResources().getColor(setBackgroundColorRes.getMax.setMax));
        } else if (i == 1) {
            setSelectedTabIndicator(getResources().getDrawable(setBackgroundColorRes.getMin.ic_icon_active_tab));
            setTabIndicatorFullWidth(false);
            setSelectedTabIndicatorColor(getResources().getColor(setBackgroundColorRes.getMax.IsOverlapping));
            setBackgroundColor(getResources().getColor(setBackgroundColorRes.getMax.setMax));
            setSelectedTabIndicatorHeight((int) (Resources.getSystem().getDisplayMetrics().density * 8.0f));
        }
    }
}
