package id.dana.ocr.views;

import android.content.Context;
import id.dana.R;
import id.dana.ocr.UploadSnapReceiptContract;
import id.dana.ocr.model.SnapReceiptBroadcastData;
import id.dana.ocr.model.SubmitReceiptResultModel;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"id/dana/ocr/views/SnapReceiptService$initComponent$2", "Lid/dana/ocr/UploadSnapReceiptContract$View;", "deleteFile", "", "filePath", "", "notifyStartUploadProcess", "taskId", "onError", "errorCode", "uploadResult", "submitResult", "Lid/dana/ocr/model/SubmitReceiptResultModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SnapReceiptService$initComponent$2 implements UploadSnapReceiptContract.View {
    final /* synthetic */ SnapReceiptService getMax;

    @JvmDefault
    public final void dismissProgress() {
    }

    @JvmDefault
    public final void onError(@Nullable String str) {
    }

    @JvmDefault
    public final void showProgress() {
    }

    SnapReceiptService$initComponent$2(SnapReceiptService snapReceiptService) {
        this.getMax = snapReceiptService;
    }

    public final void getMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        SnapReceiptService snapReceiptService = this.getMax;
        String string = snapReceiptService.getString(R.string.loading_info_text_upload_receipt);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loadi…info_text_upload_receipt)");
        snapReceiptService.getMax(new SnapReceiptBroadcastData(SnapReceiptBroadcastData.Status.InProgress, string, (String) null, (SubmitReceiptResultModel) null));
    }

    public final void setMin(@NotNull String str, @NotNull SubmitReceiptResultModel submitReceiptResultModel) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(submitReceiptResultModel, "submitResult");
        SnapReceiptService snapReceiptService = this.getMax;
        String string = snapReceiptService.getString(R.string.loading_info_text_upload_succeeded);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loadi…fo_text_upload_succeeded)");
        SnapReceiptService.access$onSuccess(snapReceiptService, str, string, submitReceiptResultModel);
    }

    public final void getMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(str2, "errorCode");
        SnapReceiptService snapReceiptService = this.getMax;
        String string = snapReceiptService.getString(R.string.loading_info_text_upload_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loadi…_info_text_upload_failed)");
        SnapReceiptService.access$onError(snapReceiptService, str, string, str2);
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        ConfirmPopup.AnonymousClass2.setMin((Context) this.getMax, str);
    }
}
