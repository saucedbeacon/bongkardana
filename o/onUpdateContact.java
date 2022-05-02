package o;

import id.dana.nearbyme.model.ShopOpenHourModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class onUpdateContact {
    public static final /* synthetic */ int[] getMin;

    static {
        int[] iArr = new int[ShopOpenHourModel.OpenHourType.values().length];
        getMin = iArr;
        iArr[ShopOpenHourModel.OpenHourType.NONE.ordinal()] = 1;
        getMin[ShopOpenHourModel.OpenHourType.CLOSE.ordinal()] = 2;
        getMin[ShopOpenHourModel.OpenHourType.CLOSING_SOON.ordinal()] = 3;
        getMin[ShopOpenHourModel.OpenHourType.OPENING_SOON.ordinal()] = 4;
        getMin[ShopOpenHourModel.OpenHourType.OPEN.ordinal()] = 5;
    }
}
