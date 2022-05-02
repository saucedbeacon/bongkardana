package o;

import java.util.List;

public final class getInputType extends setOnCloseListener<Integer> {
    public getInputType(List<setTitleMarginTop<Integer>> list) {
        super(list);
    }

    private int getMin(setTitleMarginTop<Integer> settitlemargintop, float f) {
        if (settitlemargintop.setMax == null || settitlemargintop.getMin == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) settitlemargintop.setMax).intValue();
        int intValue2 = ((Integer) settitlemargintop.getMin).intValue();
        if (this.length != null) {
            setTitleMarginBottom settitlemarginbottom = this.length;
            settitlemarginbottom.setMax.length(settitlemargintop.equals, settitlemargintop.toIntRange.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, length(), IsOverlapping());
            Integer num = (Integer) settitlemarginbottom.getMax();
            if (num != null) {
                return num.intValue();
            }
        }
        return getTitleMarginStart.getMax(getTitleMarginTop.setMax(f, 0.0f, 1.0f), intValue, intValue2);
    }

    public final int toIntRange() {
        return getMin(getMax(), setMin());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        return Integer.valueOf(getMin(settitlemargintop, f));
    }
}
