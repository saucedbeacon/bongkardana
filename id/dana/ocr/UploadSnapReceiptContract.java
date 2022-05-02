package id.dana.ocr;

import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import id.dana.ocr.model.SubmitReceiptResultModel;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/ocr/UploadSnapReceiptContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface UploadSnapReceiptContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/UploadSnapReceiptContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "uploadReceipt", "", "taskId", "", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "ocrResultModel", "Lid/dana/ocr/model/OCRResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface Presenter extends parentColumns.setMin {
        void length(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel);

        void length(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel, @NotNull OCRResultModel oCRResultModel);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/ocr/UploadSnapReceiptContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "deleteFile", "", "filePath", "", "notifyStartUploadProcess", "taskId", "onError", "errorCode", "uploadResult", "submitResult", "Lid/dana/ocr/model/SubmitReceiptResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface View extends parentColumns.getMax {
        void getMin(@NotNull String str);

        void getMin(@NotNull String str, @NotNull String str2);

        void setMax(@NotNull String str);

        void setMin(@NotNull String str, @NotNull SubmitReceiptResultModel submitReceiptResultModel);
    }
}
