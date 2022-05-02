package id.dana.nearbyrevamp;

import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantdetail.bottomsheet.MerchantDetailBottomsheetView;
import kotlin.Metadata;
import o.onMeasure;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/ShopModel;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 2})
final class NewNearbyMeActivity$FastBitmap$CoordinateSystem<T> implements onMeasure<ShopModel> {
    final /* synthetic */ NewNearbyMeActivity getMax;

    NewNearbyMeActivity$FastBitmap$CoordinateSystem(NewNearbyMeActivity newNearbyMeActivity) {
        this.getMax = newNearbyMeActivity;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        ShopModel shopModel = (ShopModel) obj;
        if (shopModel == null) {
            MerchantDetailBottomsheetView merchantDetailBottomsheetView = (MerchantDetailBottomsheetView) this.getMax._$_findCachedViewById(resetInternal.setMax.hideOverflowMenu);
            if (merchantDetailBottomsheetView != null) {
                merchantDetailBottomsheetView.resetMerchantDetailContent();
                return;
            }
            return;
        }
        NewNearbyMeActivity newNearbyMeActivity = this.getMax;
        String str = shopModel.invoke;
        if (str == null) {
            str = "";
        }
        newNearbyMeActivity.setTitle(str);
    }
}
