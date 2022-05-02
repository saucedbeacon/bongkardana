package o;

import com.andrognito.flashbar.Flashbar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class setNavigationIcon {
    public static final /* synthetic */ int[] getMax;
    public static final /* synthetic */ int[] getMin;
    public static final /* synthetic */ int[] setMax;
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[Flashbar.Gravity.values().length];
        getMax = iArr;
        iArr[Flashbar.Gravity.TOP.ordinal()] = 1;
        getMax[Flashbar.Gravity.BOTTOM.ordinal()] = 2;
        int[] iArr2 = new int[Flashbar.Gravity.values().length];
        setMin = iArr2;
        iArr2[Flashbar.Gravity.TOP.ordinal()] = 1;
        setMin[Flashbar.Gravity.BOTTOM.ordinal()] = 2;
        int[] iArr3 = new int[Flashbar.ProgressPosition.values().length];
        getMin = iArr3;
        iArr3[Flashbar.ProgressPosition.LEFT.ordinal()] = 1;
        getMin[Flashbar.ProgressPosition.RIGHT.ordinal()] = 2;
        int[] iArr4 = new int[Flashbar.ProgressPosition.values().length];
        setMax = iArr4;
        iArr4[Flashbar.ProgressPosition.LEFT.ordinal()] = 1;
        setMax[Flashbar.ProgressPosition.RIGHT.ordinal()] = 2;
    }
}
