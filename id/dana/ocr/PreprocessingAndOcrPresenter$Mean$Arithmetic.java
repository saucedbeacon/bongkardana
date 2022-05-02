package id.dana.ocr;

import id.dana.ocr.model.OCRResultModel;
import kotlin.Metadata;
import o.RedDotManager;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/ocr/model/OCRResultModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
final class PreprocessingAndOcrPresenter$Mean$Arithmetic<T> implements RedDotManager<OCRResultModel> {
    final /* synthetic */ String getMax;
    final /* synthetic */ PreprocessingAndOcrPresenter setMin;

    PreprocessingAndOcrPresenter$Mean$Arithmetic(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
        this.setMin = preprocessingAndOcrPresenter;
        this.getMax = str;
    }

    public final /* synthetic */ void accept(Object obj) {
        PreprocessingAndOcrPresenter.getMax(this.setMin, this.getMax, (OCRResultModel) obj);
    }
}
