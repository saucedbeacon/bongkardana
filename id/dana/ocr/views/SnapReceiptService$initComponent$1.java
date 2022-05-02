package id.dana.ocr.views;

import id.dana.R;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import id.dana.ocr.model.SnapReceiptBroadcastData;
import id.dana.ocr.model.SubmitReceiptResultModel;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"id/dana/ocr/views/SnapReceiptService$initComponent$1", "Lid/dana/ocr/PreprocessingAndOcrContract$View;", "getStorageDir", "Ljava/io/File;", "notifyStartOcrProcess", "", "taskId", "", "notifyStartPreProcessingProcess", "notifyStartSubmissionProcess", "sendOCRResult", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "ocrResultModel", "Lid/dana/ocr/model/OCRResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SnapReceiptService$initComponent$1 implements PreprocessingAndOcrContract.View {
    final /* synthetic */ SnapReceiptService getMin;

    @JvmDefault
    public final void dismissProgress() {
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @JvmDefault
    public final void showProgress() {
    }

    SnapReceiptService$initComponent$1(SnapReceiptService snapReceiptService) {
        this.getMin = snapReceiptService;
    }

    @NotNull
    public final File setMin() {
        File min = ConfirmPopup.AnonymousClass2.getMin(this.getMin);
        Intrinsics.checkNotNullExpressionValue(min, "FileUtil.getAppPrivateDi…(this@SnapReceiptService)");
        return min;
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        SnapReceiptService snapReceiptService = this.getMin;
        String string = snapReceiptService.getString(R.string.loading_info_text_ocr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loading_info_text_ocr)");
        snapReceiptService.getMax(new SnapReceiptBroadcastData(SnapReceiptBroadcastData.Status.InProgress, string, (String) null, (SubmitReceiptResultModel) null));
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        SnapReceiptService snapReceiptService = this.getMin;
        String string = snapReceiptService.getString(R.string.loading_info_text_preprocessing);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loadi…_info_text_preprocessing)");
        snapReceiptService.getMax(new SnapReceiptBroadcastData(SnapReceiptBroadcastData.Status.InProgress, string, (String) null, (SubmitReceiptResultModel) null));
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        SnapReceiptService snapReceiptService = this.getMin;
        String string = snapReceiptService.getString(R.string.loading_info_text_submission);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loading_info_text_submission)");
        snapReceiptService.getMax(new SnapReceiptBroadcastData(SnapReceiptBroadcastData.Status.InProgress, string, (String) null, (SubmitReceiptResultModel) null));
    }

    public final void getMax(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel, @NotNull OCRResultModel oCRResultModel) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        Intrinsics.checkNotNullParameter(oCRResultModel, "ocrResultModel");
        if (oCRResultModel.getMax() || Intrinsics.areEqual((Object) oCRResultModel.getMin, (Object) "004")) {
            this.getMin.getUploadSnapReceiptPresenter().length(str, oCRRequestModel, oCRResultModel);
        } else {
            SnapReceiptService.access$onError(this.getMin, str, "OCR Failed", oCRResultModel.getMin);
        }
    }
}
