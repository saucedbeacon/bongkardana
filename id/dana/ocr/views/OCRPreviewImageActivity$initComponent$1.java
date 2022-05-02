package id.dana.ocr.views;

import id.dana.R;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"id/dana/ocr/views/OCRPreviewImageActivity$initComponent$1", "Lid/dana/ocr/PreprocessingAndOcrContract$View;", "dismissProgress", "", "getStorageDir", "Ljava/io/File;", "notifyStartOcrProcess", "taskId", "", "notifyStartPreProcessingProcess", "notifyStartSubmissionProcess", "sendOCRResult", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "ocrResultModel", "Lid/dana/ocr/model/OCRResultModel;", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRPreviewImageActivity$initComponent$1 implements PreprocessingAndOcrContract.View {
    final /* synthetic */ OCRPreviewImageActivity setMax;

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    OCRPreviewImageActivity$initComponent$1(OCRPreviewImageActivity oCRPreviewImageActivity) {
        this.setMax = oCRPreviewImageActivity;
    }

    public final void showProgress() {
        OCRPreviewImageActivity.showLoading$default(this.setMax, (String) null, 1, (Object) null);
    }

    public final void dismissProgress() {
        this.setMax.setMin();
    }

    @NotNull
    public final File setMin() {
        File min = ConfirmPopup.AnonymousClass2.getMin(this.setMax);
        Intrinsics.checkNotNullExpressionValue(min, "FileUtil.getAppPrivateDi…                        )");
        return min;
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        this.setMax.getMax(this.setMax.getString(R.string.loading_info_text_ocr));
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        this.setMax.getMax(this.setMax.getString(R.string.loading_info_text_preprocessing));
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        this.setMax.getMax(this.setMax.getString(R.string.loading_info_text_submission));
    }

    public final void getMax(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel, @NotNull OCRResultModel oCRResultModel) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        Intrinsics.checkNotNullParameter(oCRResultModel, "ocrResultModel");
        OCRPreviewImageActivity.access$setResultActivityAndFinish(this.setMax, oCRResultModel);
    }
}
