package o;

import id.dana.nearbyme.model.PromoLimitInfoModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/mapper/PromoLimitInfoMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/PromoLimitInfo;", "Lid/dana/nearbyme/model/PromoLimitInfoModel;", "()V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NebulaAppContext extends setSpeed<GriverBundleUtils, PromoLimitInfoModel> {
    public final /* synthetic */ Object map(Object obj) {
        String str;
        String str2;
        GriverBundleUtils griverBundleUtils = (GriverBundleUtils) obj;
        PromoLimitInfoModel promoLimitInfoModel = new PromoLimitInfoModel();
        String str3 = null;
        if (griverBundleUtils != null) {
            str = griverBundleUtils.getLimitCount();
        } else {
            str = null;
        }
        promoLimitInfoModel.getMax = str;
        if (griverBundleUtils != null) {
            str2 = griverBundleUtils.getLimitType();
        } else {
            str2 = null;
        }
        promoLimitInfoModel.length = str2;
        if (griverBundleUtils != null) {
            str3 = griverBundleUtils.getLimitRangeType();
        }
        promoLimitInfoModel.setMin = str3;
        return promoLimitInfoModel;
    }
}
