package id.dana.ocr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverAppVirtualHostProxy;
import o.NavigationBarCompat;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/ocr/PreprocessingAndOcrPresenter$executeOcr$1$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "onError", "", "cause", "", "onNext", "receiptInfoModel", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PreprocessingAndOcrPresenter$executeOcr$1$1 extends GriverAppVirtualHostProxy<NavigationBarCompat> {
    final /* synthetic */ TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 setMin;

    PreprocessingAndOcrPresenter$executeOcr$1$1(TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        NavigationBarCompat navigationBarCompat = (NavigationBarCompat) obj;
        Intrinsics.checkNotNullParameter(navigationBarCompat, "receiptInfoModel");
        this.setMin.onSuccess(navigationBarCompat);
    }

    public final void onError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "cause");
        this.setMin.onError(th);
    }
}
