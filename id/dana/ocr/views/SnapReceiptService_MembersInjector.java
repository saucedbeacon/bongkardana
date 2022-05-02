package id.dana.ocr.views;

import dagger.internal.InjectedFieldSignature;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.UploadSnapReceiptContract;
import o.getBindingAdapter;
import o.getShortName;

public final class SnapReceiptService_MembersInjector implements getBindingAdapter<SnapReceiptService> {
    @InjectedFieldSignature("id.dana.ocr.views.SnapReceiptService.preprocessingAndOcrPresenter")
    public static void setMin(SnapReceiptService snapReceiptService, PreprocessingAndOcrContract.Presenter presenter) {
        snapReceiptService.preprocessingAndOcrPresenter = presenter;
    }

    @InjectedFieldSignature("id.dana.ocr.views.SnapReceiptService.uploadSnapReceiptPresenter")
    public static void setMax(SnapReceiptService snapReceiptService, UploadSnapReceiptContract.Presenter presenter) {
        snapReceiptService.uploadSnapReceiptPresenter = presenter;
    }

    @InjectedFieldSignature("id.dana.ocr.views.SnapReceiptService.dynamicUrlWrapper")
    public static void getMax(SnapReceiptService snapReceiptService, getShortName getshortname) {
        snapReceiptService.dynamicUrlWrapper = getshortname;
    }
}
