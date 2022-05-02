package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.PromoLimitInfoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.FileCache;
import o.PhotoContext;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyme/mapper/PromoInfoMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/nearbyme/model/PromoInfo;", "Lid/dana/nearbyme/model/PromoInfoModel;", "currencyAmountModelMapper", "Lid/dana/sendmoney/mapper/CurrencyAmountModelMapper;", "promoLimitInfoMapper", "Lid/dana/nearbyme/mapper/PromoLimitInfoMapper;", "(Lid/dana/sendmoney/mapper/CurrencyAmountModelMapper;Lid/dana/nearbyme/mapper/PromoLimitInfoMapper;)V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverPage extends setSpeed<FileCache.AnonymousClass1, PromoInfoModel> {
    private final NebulaAppContext getMin;
    private final PhotoContext.AnonymousClass2 setMin;

    public final /* synthetic */ Object map(Object obj) {
        String str;
        String str2;
        List<String> list;
        long j;
        String str3;
        String str4;
        String str5;
        List<GriverBundleUtils> limitRule;
        FileCache.AnonymousClass1 r7 = (FileCache.AnonymousClass1) obj;
        PromoInfoModel promoInfoModel = new PromoInfoModel();
        List<PromoLimitInfoModel> list2 = null;
        if (r7 != null) {
            str = r7.getActivityId();
        } else {
            str = null;
        }
        String str6 = "";
        if (str == null) {
            str = str6;
        }
        promoInfoModel.setMin = str;
        if (r7 != null) {
            str2 = r7.getPrizeType();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str6 = str2;
        }
        promoInfoModel.length = str6;
        if (r7 != null) {
            list = r7.getPaymentMethods();
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        promoInfoModel.equals = list;
        promoInfoModel.isInside = (CurrencyAmountModel) this.setMin.apply(r7 != null ? r7.getMinTransactionAmount() : null);
        long j2 = 0;
        if (r7 != null) {
            j = r7.getEndDate();
        } else {
            j = 0;
        }
        promoInfoModel.IsOverlapping = j;
        if (r7 != null) {
            j2 = r7.getBeginDate();
        }
        promoInfoModel.toFloatRange = j2;
        promoInfoModel.toIntRange = (CurrencyAmountModel) this.setMin.apply(r7 != null ? r7.getMaxAmount() : null);
        if (r7 != null) {
            str3 = r7.getPromoDescription();
        } else {
            str3 = null;
        }
        promoInfoModel.getMax = str3;
        if (r7 != null) {
            str4 = r7.getPromoValue();
        } else {
            str4 = null;
        }
        promoInfoModel.getMin = str4;
        if (r7 != null) {
            str5 = r7.getPromoType();
        } else {
            str5 = null;
        }
        promoInfoModel.setMax = str5;
        if (!(r7 == null || (limitRule = r7.getLimitRule()) == null)) {
            Iterable<GriverBundleUtils> iterable = limitRule;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (GriverBundleUtils apply : iterable) {
                arrayList.add((PromoLimitInfoModel) this.getMin.apply(apply));
            }
            list2 = (List) arrayList;
        }
        promoInfoModel.toDoubleRange = list2;
        return promoInfoModel;
    }

    @Inject
    public GriverPage(@NotNull PhotoContext.AnonymousClass2 r2, @NotNull NebulaAppContext nebulaAppContext) {
        Intrinsics.checkNotNullParameter(r2, "currencyAmountModelMapper");
        Intrinsics.checkNotNullParameter(nebulaAppContext, "promoLimitInfoMapper");
        this.setMin = r2;
        this.getMin = nebulaAppContext;
    }
}
