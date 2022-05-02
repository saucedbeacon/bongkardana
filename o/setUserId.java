package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.PromoLimitInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.FileCache;
import o.PhotoContext;

public final class setUserId {
    private final PhotoContext.AnonymousClass2 getMax;

    @Inject
    public setUserId(PhotoContext.AnonymousClass2 r1) {
        this.getMax = r1;
    }

    public final List<ShopModel> setMax(List<ShopModel> list, List<getTempPath> list2) {
        ArrayList arrayList = new ArrayList();
        for (getTempPath next : list2) {
            int indexOf = list.indexOf(new ShopModel(next.getMerchantId(), next.getShopId()));
            if (indexOf >= 0) {
                ShopModel shopModel = list.get(indexOf);
                shopModel.length(getMin(next.getPromoInfos()));
                arrayList.add(shopModel);
            }
        }
        return arrayList;
    }

    public final List<PromoInfoModel> getMin(List<FileCache.AnonymousClass1> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (FileCache.AnonymousClass1 next : list) {
                if (next != null) {
                    PromoInfoModel promoInfoModel = new PromoInfoModel();
                    promoInfoModel.setMin = next.getActivityId();
                    promoInfoModel.length = next.getPrizeType();
                    promoInfoModel.equals = next.getPaymentMethods();
                    promoInfoModel.isInside = (CurrencyAmountModel) this.getMax.apply(next.getMinTransactionAmount());
                    promoInfoModel.IsOverlapping = next.getEndDate();
                    promoInfoModel.toFloatRange = next.getBeginDate();
                    promoInfoModel.toIntRange = (CurrencyAmountModel) this.getMax.apply(next.getMaxAmount());
                    promoInfoModel.setMax = next.getPromoType();
                    promoInfoModel.getMax = next.getPromoDescription();
                    promoInfoModel.getMin = next.getPromoValue();
                    promoInfoModel.toDoubleRange = length(next.getLimitRule());
                    arrayList.add(promoInfoModel);
                }
            }
        }
        return arrayList;
    }

    private static List<PromoLimitInfoModel> length(List<GriverBundleUtils> list) {
        PromoLimitInfoModel promoLimitInfoModel;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (GriverBundleUtils next : list) {
                if (next == null) {
                    promoLimitInfoModel = null;
                } else {
                    PromoLimitInfoModel promoLimitInfoModel2 = new PromoLimitInfoModel();
                    promoLimitInfoModel2.length = next.getLimitType();
                    promoLimitInfoModel2.setMin = next.getLimitRangeType();
                    promoLimitInfoModel2.getMax = next.getLimitCount();
                    promoLimitInfoModel = promoLimitInfoModel2;
                }
                arrayList.add(promoLimitInfoModel);
            }
        }
        return arrayList;
    }
}
