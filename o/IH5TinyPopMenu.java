package o;

import androidx.viewpager.widget.ViewPager;

public class IH5TinyPopMenu {
    public onInvalidation getMax;
    public ViewPager setMin;

    private IH5TinyPopMenu(ViewPager viewPager, onInvalidation oninvalidation) {
        viewPager.setAdapter(oninvalidation);
        this.setMin = viewPager;
        this.getMax = oninvalidation;
    }

    public static IH5TinyPopMenu setMin(ViewPager viewPager, onInvalidation oninvalidation) {
        return new IH5TinyPopMenu(viewPager, oninvalidation);
    }

    public final boolean getMax() {
        return this.getMax.getMax(this.setMin.getCurrentItem()).n_();
    }
}
