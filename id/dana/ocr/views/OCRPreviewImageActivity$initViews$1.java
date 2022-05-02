package id.dana.ocr.views;

import id.dana.ocr.preview.BottomSheetPromptView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/ocr/views/OCRPreviewImageActivity$initViews$1", "Lid/dana/ocr/preview/BottomSheetPromptView$BottomSheetPromptCallback;", "onAction", "", "result", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRPreviewImageActivity$initViews$1 implements BottomSheetPromptView.BottomSheetPromptCallback {
    final /* synthetic */ OCRPreviewImageActivity setMax;

    OCRPreviewImageActivity$initViews$1(OCRPreviewImageActivity oCRPreviewImageActivity) {
        this.setMax = oCRPreviewImageActivity;
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "result");
        this.setMax.getOcrPreviewImagePresenter().getMax(str);
    }
}
