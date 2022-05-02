package id.dana.ocr;

import android.graphics.Bitmap;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import java.io.File;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/ocr/PreprocessingAndOcrContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface PreprocessingAndOcrContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "initialize", "", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "processImage", "taskId", "", "imageOrigin", "Landroid/graphics/Bitmap;", "filePath", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface Presenter extends parentColumns.setMin {
        void length(@NotNull String str, @NotNull Bitmap bitmap);

        void setMax(@NotNull OCRRequestModel oCRRequestModel);

        void setMin(@NotNull String str, @NotNull String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/PreprocessingAndOcrContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "getStorageDir", "Ljava/io/File;", "notifyStartOcrProcess", "", "taskId", "", "notifyStartPreProcessingProcess", "notifyStartSubmissionProcess", "sendOCRResult", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "ocrResultModel", "Lid/dana/ocr/model/OCRResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface View extends parentColumns.getMax {
        void getMax(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel, @NotNull OCRResultModel oCRResultModel);

        void length(@NotNull String str);

        void setMax(@NotNull String str);

        @NotNull
        File setMin();

        void setMin(@NotNull String str);
    }
}
