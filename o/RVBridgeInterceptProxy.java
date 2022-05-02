package o;

import id.dana.ocr.receipt.ReceiptOcr;
import id.dana.ocr.receipt.ReceiptOcrFactory;
import id.dana.ocr.receipt.model.ReceiptInfo;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lid/dana/data/ocr/repository/source/firebase/FirebaseVisionOcrData;", "Lid/dana/data/ocr/repository/source/OCREntityData;", "()V", "getOcrReceiptResponse", "Lio/reactivex/Observable;", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "requestReceiptInfo", "Lid/dana/data/ocr/model/RequestReceiptInfo;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVBridgeInterceptProxy implements NativeCallOnInvokePoint {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/ObservableEmitter;", "Lid/dana/ocr/receipt/model/ReceiptInfo;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<ReceiptInfo> {
        final /* synthetic */ webType length;

        setMin(webType webtype) {
            this.length = webtype;
        }

        public final void subscribe(@NotNull final TitleBarRightButtonView.AnonymousClass2<ReceiptInfo> r5) {
            Intrinsics.checkNotNullParameter(r5, "emitter");
            ReceiptOcrFactory.setMin().setMax(this.length.getRules()).length(this.length.getImage(), this.length.getMerchantNameAlias(), new ReceiptOcr.Callback() {
                public final void onFailure(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "cause");
                    r5.onError(th);
                }

                public final void onSuccess(@NotNull ReceiptInfo receiptInfo) {
                    Intrinsics.checkNotNullParameter(receiptInfo, "receiptInfo");
                    r5.onNext(receiptInfo);
                }
            });
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<ReceiptInfo> getOcrReceiptResponse(@NotNull webType webtype) {
        Intrinsics.checkNotNullParameter(webtype, "requestReceiptInfo");
        TitleBarRightButtonView.AnonymousClass1<ReceiptInfo> create = TitleBarRightButtonView.AnonymousClass1.create(new setMin(webtype));
        Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…             })\n        }");
        return create;
    }
}
