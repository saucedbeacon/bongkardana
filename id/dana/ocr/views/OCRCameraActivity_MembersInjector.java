package id.dana.ocr.views;

import dagger.internal.InjectedFieldSignature;
import id.dana.ocr.OCRCameraContract;
import o.getBindingAdapter;
import o.getSelectedIndex;

public final class OCRCameraActivity_MembersInjector implements getBindingAdapter<OCRCameraActivity> {
    @InjectedFieldSignature("id.dana.ocr.views.OCRCameraActivity.ocrCameraPresenter")
    public static void getMin(OCRCameraActivity oCRCameraActivity, OCRCameraContract.Presenter presenter) {
        oCRCameraActivity.ocrCameraPresenter = presenter;
    }

    @InjectedFieldSignature("id.dana.ocr.views.OCRCameraActivity.onBoardingPresenter")
    public static void setMin(OCRCameraActivity oCRCameraActivity, getSelectedIndex.length length) {
        oCRCameraActivity.onBoardingPresenter = length;
    }
}
