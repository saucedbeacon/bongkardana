package o;

import android.text.TextUtils;
import id.dana.model.CurrencyAmountModel;
import id.dana.splitbill.model.PayerModel;
import id.dana.splitbill.model.SplitBillModel;
import java.util.List;
import javax.inject.Inject;
import o.PhotoContext;

public final class updateFootState extends setSpeed<setLastScanStartTimeMillis, SplitBillModel> {
    private final PhotoContext.AnonymousClass2 setMax;
    private final setInitTextColor setMin;

    public final /* synthetic */ Object map(Object obj) {
        int parseInt;
        int parseInt2;
        setLastScanStartTimeMillis setlastscanstarttimemillis = (setLastScanStartTimeMillis) obj;
        if (setlastscanstarttimemillis == null) {
            return null;
        }
        SplitBillModel splitBillModel = new SplitBillModel();
        splitBillModel.isInside = setlastscanstarttimemillis.getStatus();
        splitBillModel.setMax = setlastscanstarttimemillis.getComment();
        splitBillModel.getMin = (CurrencyAmountModel) this.setMax.apply(setlastscanstarttimemillis.getTotalAmount());
        splitBillModel.IsOverlapping = setlastscanstarttimemillis.getSplitBillId();
        splitBillModel.getMax = Integer.valueOf(setlastscanstarttimemillis.getPayeeIndex()).intValue();
        splitBillModel.length = Integer.valueOf(setlastscanstarttimemillis.getPayerIndex()).intValue();
        List<PayerModel> list = (List) this.setMin.apply(setlastscanstarttimemillis.getPayers());
        splitBillModel.setMin = list;
        if (!TextUtils.isEmpty(setlastscanstarttimemillis.getPayeeIndex()) && list.size() > (parseInt2 = Integer.parseInt(setlastscanstarttimemillis.getPayeeIndex()))) {
            splitBillModel.getMax = parseInt2;
            list.get(parseInt2).toFloatRange = true;
            splitBillModel.equals = list.get(parseInt2);
        }
        if (TextUtils.isEmpty(setlastscanstarttimemillis.getPayerIndex()) || list.size() <= (parseInt = Integer.parseInt(setlastscanstarttimemillis.getPayerIndex()))) {
            return splitBillModel;
        }
        splitBillModel.length = parseInt;
        list.get(parseInt).isInside = true;
        splitBillModel.toIntRange = list.get(parseInt);
        return splitBillModel;
    }

    @Inject
    public updateFootState(PhotoContext.AnonymousClass2 r1, setInitTextColor setinittextcolor) {
        this.setMax = r1;
        this.setMin = setinittextcolor;
    }
}
