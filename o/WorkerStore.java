package o;

import id.dana.ocr.receipt.model.ReceiptInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"toReceiptInfoModel", "Lio/reactivex/Observable;", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "kotlin.jvm.PlatformType", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class WorkerStore {
    public static final TitleBarRightButtonView.AnonymousClass1<NavigationBarCompat> toReceiptInfoModel(@NotNull TitleBarRightButtonView.AnonymousClass1<ReceiptInfo> r1) {
        Intrinsics.checkNotNullParameter(r1, "$this$toReceiptInfoModel");
        return r1.map(getMax.getMax);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "kotlin.jvm.PlatformType", "it", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<ReceiptInfo, NavigationBarCompat> {
        public static final getMax getMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ReceiptInfo receiptInfo = (ReceiptInfo) obj;
            Intrinsics.checkNotNullParameter(receiptInfo, "it");
            return new NavigationBarCompat(receiptInfo.setMin, receiptInfo.setMax, receiptInfo.length, receiptInfo.getMin, receiptInfo.getMax, receiptInfo.setMin());
        }
    }
}
