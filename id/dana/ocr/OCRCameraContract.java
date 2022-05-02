package id.dana.ocr;

import id.dana.ocr.model.OCRRequestModel;
import kotlin.Metadata;
import o.calculateDtToFit;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/ocr/OCRCameraContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface OCRCameraContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/OCRCameraContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "cancelProcess", "", "onPictureTaken", "result", "Lcom/otaliastudios/cameraview/PictureResult;", "startCapturing", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface Presenter extends onDelete.getMin {
        void getMax();

        void getMin();

        void setMax(@NotNull calculateDtToFit calculatedttofit);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/OCRCameraContract$View;", "Lid/dana/base/AbstractContract$AbstractView;", "capturePicture", "", "onFailure", "errorCode", "", "openPreviewPage", "pictureResult", "Lcom/otaliastudios/cameraview/PictureResult;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface View extends onDelete.length {
        void capturePicture();

        void onFailure(@NotNull String str);

        void openPreviewPage(@NotNull calculateDtToFit calculatedttofit, @NotNull OCRRequestModel oCRRequestModel);
    }
}
