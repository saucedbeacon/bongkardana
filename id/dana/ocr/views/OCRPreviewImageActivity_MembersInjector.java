package id.dana.ocr.views;

import dagger.internal.InjectedFieldSignature;
import id.dana.ocr.OCRPreviewImageContract;
import id.dana.ocr.PreprocessingAndOcrContract;
import o.getBindingAdapter;

public final class OCRPreviewImageActivity_MembersInjector implements getBindingAdapter<OCRPreviewImageActivity> {
    @InjectedFieldSignature("id.dana.ocr.views.OCRPreviewImageActivity.ocrPreviewImagePresenter")
    public static void setMin(OCRPreviewImageActivity oCRPreviewImageActivity, OCRPreviewImageContract.Presenter presenter) {
        oCRPreviewImageActivity.ocrPreviewImagePresenter = presenter;
    }

    @InjectedFieldSignature("id.dana.ocr.views.OCRPreviewImageActivity.preprocessingAndOcrPresenter")
    public static void setMin(OCRPreviewImageActivity oCRPreviewImageActivity, PreprocessingAndOcrContract.Presenter presenter) {
        oCRPreviewImageActivity.preprocessingAndOcrPresenter = presenter;
    }
}
