package o;

import java.util.List;

public final class setQuery extends setOnCloseListener<getLogo> {
    private final getLogo getMax = new getLogo();

    public setQuery(List<setTitleMarginTop<getLogo>> list) {
        super(list);
    }

    public final /* synthetic */ Object getMax(setTitleMarginTop settitlemargintop, float f) {
        if (settitlemargintop.setMax == null || settitlemargintop.getMin == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        getLogo getlogo = (getLogo) settitlemargintop.setMax;
        getLogo getlogo2 = (getLogo) settitlemargintop.getMin;
        if (this.length != null) {
            setTitleMarginBottom settitlemarginbottom = this.length;
            settitlemarginbottom.setMax.length(settitlemargintop.equals, settitlemargintop.toIntRange.floatValue(), getlogo, getlogo2, f, length(), IsOverlapping());
            getLogo getlogo3 = (getLogo) settitlemarginbottom.getMax();
            if (getlogo3 != null) {
                return getlogo3;
            }
        }
        getLogo getlogo4 = this.getMax;
        float min = getTitleMarginTop.getMin(getlogo.setMin, getlogo2.setMin, f);
        float min2 = getTitleMarginTop.getMin(getlogo.setMax, getlogo2.setMax, f);
        getlogo4.setMin = min;
        getlogo4.setMax = min2;
        return this.getMax;
    }
}
