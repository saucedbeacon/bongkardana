package o;

import java.util.List;

public final class setOnQueryTextListener extends setOnCloseListener<Float> {
    public setOnQueryTextListener(List<setTitleMarginTop<Float>> list) {
        super(list);
    }

    private float getMin(setTitleMarginTop<Float> settitlemargintop, float f) {
        if (settitlemargintop.setMax == null || settitlemargintop.getMin == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.length != null) {
            setTitleMarginBottom settitlemarginbottom = this.length;
            settitlemarginbottom.setMax.length(settitlemargintop.equals, settitlemargintop.toIntRange.floatValue(), settitlemargintop.setMax, settitlemargintop.getMin, f, length(), IsOverlapping());
            Float f2 = (Float) settitlemarginbottom.getMax();
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        if (settitlemargintop.isInside == -3987645.8f) {
            settitlemargintop.isInside = ((Float) settitlemargintop.setMax).floatValue();
        }
        float f3 = settitlemargintop.isInside;
        if (settitlemargintop.toFloatRange == -3987645.8f) {
            settitlemargintop.toFloatRange = ((Float) settitlemargintop.getMin).floatValue();
        }
        return getTitleMarginTop.getMin(f3, settitlemargintop.toFloatRange, f);
    }

    public final float isInside() {
        return getMin(getMax(), setMin());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        return Float.valueOf(getMin(settitlemargintop, f));
    }
}
