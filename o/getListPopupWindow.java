package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

public final class getListPopupWindow extends ViewPager2.getMax {
    private final LinearLayoutManager getMin;
    public ViewPager2.toFloatRange setMin;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageSelected(int i) {
    }

    public getListPopupWindow(LinearLayoutManager linearLayoutManager) {
        this.getMin = linearLayoutManager;
    }

    public final void onPageScrolled(int i, float f, int i2) {
        if (this.setMin != null) {
            int i3 = 0;
            while (i3 < this.getMin.getChildCount()) {
                View childAt = this.getMin.getChildAt(i3);
                if (childAt != null) {
                    this.getMin.getPosition(childAt);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.getMin.getChildCount())}));
                }
            }
        }
    }
}
