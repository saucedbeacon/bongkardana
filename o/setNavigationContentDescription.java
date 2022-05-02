package o;

import com.andrognito.flashbar.util.NavigationBarPosition;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
public final /* synthetic */ class setNavigationContentDescription {
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[NavigationBarPosition.values().length];
        setMin = iArr;
        iArr[NavigationBarPosition.LEFT.ordinal()] = 1;
        setMin[NavigationBarPosition.RIGHT.ordinal()] = 2;
        setMin[NavigationBarPosition.BOTTOM.ordinal()] = 3;
    }
}
