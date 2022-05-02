package o;

import android.location.Location;
import java.util.List;
import kotlin.collections.CollectionsKt;
import o.getAlpha;

public final /* synthetic */ class setRootAlpha {
    public static /* synthetic */ void length(getAlpha.length length, String str, int i, int i2, List list, Location location, int i3) {
        int i4 = (i3 & 2) != 0 ? 1 : i;
        int i5 = (i3 & 4) != 0 ? 8 : i2;
        if ((i3 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        if ((i3 & 16) != 0) {
            location = null;
        }
        length.setMax(str, i4, i5, list2, location);
    }
}
