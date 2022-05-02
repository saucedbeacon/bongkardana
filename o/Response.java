package o;

import id.dana.promocenter.model.PromoSectionModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class Response {
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[PromoSectionModel.State.values().length];
        setMin = iArr;
        iArr[PromoSectionModel.State.STATE_SHOW_LOADING.ordinal()] = 1;
        setMin[PromoSectionModel.State.STATE_HIDE_LOADING.ordinal()] = 2;
        setMin[PromoSectionModel.State.STATE_SHOW.ordinal()] = 3;
        setMin[PromoSectionModel.State.STATE_HIDDEN.ordinal()] = 4;
    }
}
