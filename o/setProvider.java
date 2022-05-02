package o;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public final class setProvider extends ViewPager2.getMax {
    @NonNull
    public final List<ViewPager2.getMax> setMin = new ArrayList(3);

    public final void onPageScrolled(int i, float f, @Px int i2) {
        try {
            for (ViewPager2.getMax onPageScrolled : this.setMin) {
                onPageScrolled.onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public final void onPageSelected(int i) {
        try {
            for (ViewPager2.getMax onPageSelected : this.setMin) {
                onPageSelected.onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public final void onPageScrollStateChanged(int i) {
        try {
            for (ViewPager2.getMax onPageScrollStateChanged : this.setMin) {
                onPageScrollStateChanged.onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
