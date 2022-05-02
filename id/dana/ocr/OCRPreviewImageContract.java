package id.dana.ocr;

import android.graphics.Bitmap;
import id.dana.ocr.model.OCRRequestModel;
import java.io.File;
import kotlin.Metadata;
import o.calculateDtToFit;
import o.onDelete;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/ocr/OCRPreviewImageContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface OCRPreviewImageContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/OCRPreviewImageContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "initialize", "", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "loadPictureResult", "pictureResult", "Lcom/otaliastudios/cameraview/PictureResult;", "onBottomSheetPromptAction", "result", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface Presenter extends onDelete.getMin {
        void getMax(@NotNull String str);

        void setMax(@NotNull OCRRequestModel oCRRequestModel);

        void setMax(@NotNull calculateDtToFit calculatedttofit);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lid/dana/ocr/OCRPreviewImageContract$View;", "Lid/dana/base/AbstractContract$AbstractView;", "closePage", "", "getStorageDir", "Ljava/io/File;", "hideBottomPrompt", "onFailConvertBitmap", "onFilePathNull", "onSuccessConvertImage", "bitmap", "Landroid/graphics/Bitmap;", "processImageOnBackground", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "filePath", "", "processImageOnForeground", "imageOrigin", "showBottomPrompt", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface View extends onDelete.length {
        void closePage();

        @NotNull
        File getStorageDir();

        void onFilePathNull();

        void onSuccessConvertImage(@NotNull Bitmap bitmap);

        void processImageOnBackground(@NotNull OCRRequestModel oCRRequestModel, @NotNull String str);

        void processImageOnForeground(@NotNull Bitmap bitmap);
    }
}
