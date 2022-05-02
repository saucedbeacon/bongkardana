package o;

import android.animation.ValueAnimator;
import java.util.List;
import o.getFixedHeightMinor;

final class getFixedWidthMajor implements ValueAnimator.AnimatorUpdateListener {
    private final getFixedHeightMinor getMax;
    private final List getMin;

    public getFixedWidthMajor(getFixedHeightMinor getfixedheightminor, List list) {
        this.getMax = getfixedheightminor;
        this.getMin = list;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        getFixedHeightMinor getfixedheightminor = this.getMax;
        List list = this.getMin;
        if (!getfixedheightminor.length) {
            getfixedheightminor.setMax();
        }
        for (getFixedHeightMinor.setMin next : getfixedheightminor.getMax) {
            setDecorPadding setdecorpadding = next.length.hashCode;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float f = next.setMin;
            float max = next.length.setMax(animatedFraction);
            next.setMin = max;
            setdecorpadding.setMin += max - f;
            list.add(setdecorpadding);
        }
        getfixedheightminor.setMin.setMin(list);
        list.clear();
    }
}
