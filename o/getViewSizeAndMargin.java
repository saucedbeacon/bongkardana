package o;

import id.dana.statement.TimeUnitInterval;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class getViewSizeAndMargin {
    public static final /* synthetic */ int[] getMax;

    static {
        int[] iArr = new int[TimeUnitInterval.values().length];
        getMax = iArr;
        iArr[TimeUnitInterval.DAY.ordinal()] = 1;
        getMax[TimeUnitInterval.MONTH.ordinal()] = 2;
        getMax[TimeUnitInterval.WEEK.ordinal()] = 3;
    }
}
