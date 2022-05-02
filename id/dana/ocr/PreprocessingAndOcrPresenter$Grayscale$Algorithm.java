package id.dana.ocr;

import id.dana.ocr.model.OCRResultModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.NavigationBarCompat;
import o.RedDotDrawable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/ocr/model/OCRResultModel;", "kotlin.jvm.PlatformType", "it", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "apply"}, k = 3, mv = {1, 4, 2})
final class PreprocessingAndOcrPresenter$Grayscale$Algorithm<T, R> implements RedDotDrawable<NavigationBarCompat, OCRResultModel> {
    final /* synthetic */ PreprocessingAndOcrPresenter setMax;

    PreprocessingAndOcrPresenter$Grayscale$Algorithm(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter) {
        this.setMax = preprocessingAndOcrPresenter;
    }

    public final /* synthetic */ Object apply(Object obj) {
        NavigationBarCompat navigationBarCompat = (NavigationBarCompat) obj;
        Intrinsics.checkNotNullParameter(navigationBarCompat, "it");
        return PreprocessingAndOcrPresenter.getMax(navigationBarCompat);
    }
}
