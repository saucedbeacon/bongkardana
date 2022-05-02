package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lid/dana/data/nearbyme/mapper/PromoInfoEntityMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/nearbyme/model/PromoInfoEntity;", "Lid/dana/domain/nearbyme/model/PromoInfo;", "()V", "map", "oldItem", "transform", "Lid/dana/domain/user/CurrencyAmount;", "entity", "Lid/dana/data/model/CurrencyAmountResult;", "transformPromoLimitInfo", "Lid/dana/domain/nearbyme/model/PromoLimitInfo;", "promoLimitInfoEntity", "Lid/dana/data/nearbyme/model/PromoLimitInfoEntity;", "transformPromoLimitInfoEntities", "", "promoLimitInfoEntities", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class sendToRender extends setSpeed<setScrollChangedCallback, FileCache.AnonymousClass1> {
    @NotNull
    public final FileCache.AnonymousClass1 map(@Nullable setScrollChangedCallback setscrollchangedcallback) {
        FileCache.AnonymousClass1 r18 = r1;
        FileCache.AnonymousClass1 r1 = new FileCache.AnonymousClass1((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (stopBleScan) null, 0, 0, (stopBleScan) null, (List) null, 2047, (DefaultConstructorMarker) null);
        if (setscrollchangedcallback == null) {
            return r18;
        }
        FileCache.AnonymousClass1 r2 = r18;
        r2.setActivityId(setscrollchangedcallback.getActivityId());
        r2.setPrizeType(setscrollchangedcallback.getPrizeType());
        r2.setPaymentMethods(setscrollchangedcallback.getPaymentMethods());
        r2.setMinTransactionAmount(transform(setscrollchangedcallback.getMinTransactionAmount()));
        r2.setEndDate(setscrollchangedcallback.getEndDate());
        r2.setBeginDate(setscrollchangedcallback.getBeginDate());
        r2.setMaxAmount(transform(setscrollchangedcallback.getMaxAmount()));
        r2.setPromoDescription(setscrollchangedcallback.getPromoDescription());
        r2.setPromoValue(setscrollchangedcallback.getPromoValue());
        r2.setPromoType(setscrollchangedcallback.getPromoType());
        r2.setLimitRule(transformPromoLimitInfoEntities(setscrollchangedcallback.getLimitRule()));
        return r2;
    }

    private final List<GriverBundleUtils> transformPromoLimitInfoEntities(List<? extends getScrollY> list) {
        List<GriverBundleUtils> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<getScrollY> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getScrollY transformPromoLimitInfo : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(transformPromoLimitInfo(transformPromoLimitInfo))));
            }
        }
        return arrayList;
    }

    private final GriverBundleUtils transformPromoLimitInfo(getScrollY getscrolly) {
        GriverBundleUtils griverBundleUtils = new GriverBundleUtils((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (getscrolly != null) {
            griverBundleUtils.setLimitCount(getscrolly.getLimitCount());
            griverBundleUtils.setLimitType(getscrolly.getLimitType());
            griverBundleUtils.setLimitRangeType(getscrolly.getLimitRangeType());
        }
        return griverBundleUtils;
    }

    private final stopBleScan transform(registerWorker registerworker) {
        if (registerworker != null) {
            return new stopBleScan(registerworker.getAmount(), registerworker.getCurrency());
        }
        return null;
    }
}
