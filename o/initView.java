package o;

import id.dana.nearbyrevamp.model.MerchantBannerItemModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class initView {
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[MerchantBannerItemModel.State.values().length];
        setMin = iArr;
        iArr[MerchantBannerItemModel.State.SHIMMERING.ordinal()] = 1;
        setMin[MerchantBannerItemModel.State.LOADED.ordinal()] = 2;
    }
}
