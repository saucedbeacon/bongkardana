package id.dana.ocr.views;

import id.dana.richview.camera.DanaCameraView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.calculateDtToFit;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/ocr/views/OCRCameraActivity$initViews$4", "Lid/dana/richview/camera/DanaCameraView$DanaCameraListener;", "onCameraPermissionDenied", "", "onImageCaptured", "result", "Lcom/otaliastudios/cameraview/PictureResult;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRCameraActivity$initViews$4 implements DanaCameraView.getMin {
    final /* synthetic */ OCRCameraActivity length;

    OCRCameraActivity$initViews$4(OCRCameraActivity oCRCameraActivity) {
        this.length = oCRCameraActivity;
    }

    public final void setMin() {
        this.length.setMin("005");
    }

    public final void setMax(@NotNull calculateDtToFit calculatedttofit) {
        Intrinsics.checkNotNullParameter(calculatedttofit, "result");
        this.length.getOcrCameraPresenter().setMax(calculatedttofit);
    }
}
