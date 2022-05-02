package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.sendmoney.model.VoucherModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import o.PhotoContext;

public final class PhotoBrowseListener extends setSpeed<byteArrayToString, ArrayList<VoucherModel>> {
    private final PhotoContext.AnonymousClass2 getMax;
    private final PhotoContext.AnonymousClass1 getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lid/dana/sendmoney/mapper/WithdrawInitChannelOptionModelMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/sendmoney/model/WithdrawInitChannelOption;", "Lid/dana/sendmoney/model/WithdrawInitChannelOptionModel;", "()V", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class V2 extends setSpeed<List<? extends byteArraysMatch>, List<? extends onLoadComplete>> {
        public final /* synthetic */ Object map(Object obj) {
            List list;
            List list2 = (List) obj;
            if (list2 != null) {
                Iterable iterable = list2;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    byteArraysMatch bytearraysmatch = (byteArraysMatch) it.next();
                    Iterator it2 = it;
                    onLoadComplete onloadcomplete = r3;
                    onLoadComplete onloadcomplete2 = new onLoadComplete(bytearraysmatch.getCardNoLength(), bytearraysmatch.getChannelIndex(), bytearraysmatch.getDisable(), bytearraysmatch.getInstId(), bytearraysmatch.getInstLocalName(), bytearraysmatch.getInstName(), bytearraysmatch.getPayMethod(), bytearraysmatch.getPayOption(), bytearraysmatch.getSelected(), bytearraysmatch.getValidData(), bytearraysmatch.getDisableReason(), bytearraysmatch.getErrorCode(), bytearraysmatch.getErrorMsg());
                    arrayList.add(onloadcomplete);
                    it = it2;
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            return list == null ? CollectionsKt.emptyList() : list;
        }
    }

    public final /* synthetic */ Object map(Object obj) {
        byteArrayToString bytearraytostring = (byteArrayToString) obj;
        if (bytearraytostring == null || bytearraytostring.getCouponChannelInfo() == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (setBeaconLayout next : bytearraytostring.getCouponChannelInfo()) {
            VoucherModel voucherModel = new VoucherModel();
            voucherModel.setMin = next.getCouponId();
            voucherModel.getMax = next.getCouponName();
            stopBleScan availableAmount = next.getAvailableAmount();
            CurrencyAmountModel currencyAmountModel = null;
            voucherModel.length = availableAmount != null ? new CurrencyAmountModel(availableAmount.getAmount(), availableAmount.getCurrency(), availableAmount.isPlaceholder()) : null;
            stopBleScan totalAmount = next.getTotalAmount();
            if (totalAmount != null) {
                currencyAmountModel = new CurrencyAmountModel(totalAmount.getAmount(), totalAmount.getCurrency(), totalAmount.isPlaceholder());
            }
            voucherModel.setMax = currencyAmountModel;
            voucherModel.getMin = next.getDescription();
            voucherModel.equals = next.getActiveTime();
            voucherModel.toFloatRange = next.getExpiryTime();
            voucherModel.IsOverlapping = next.getExtendTime();
            voucherModel.isInside = next.getCreatedTime();
            voucherModel.toIntRange = next.getModifiedTime();
            voucherModel.toString = (List) this.getMin.apply(next.getCouponPayMethodInfos());
            arrayList.add(voucherModel);
        }
        return arrayList;
    }

    @Inject
    public PhotoBrowseListener(PhotoContext.AnonymousClass2 r1, PhotoContext.AnonymousClass1 r2) {
        this.getMax = r1;
        this.getMin = r2;
    }
}
