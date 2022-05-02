package id.dana.ocr;

import id.dana.ocr.OCRCameraContract;
import id.dana.ocr.model.OCRRequestModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.calculateDtToFit;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/ocr/OCRCameraPresenter;", "Lid/dana/ocr/OCRCameraContract$Presenter;", "view", "Lid/dana/ocr/OCRCameraContract$View;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "(Lid/dana/ocr/OCRCameraContract$View;Lid/dana/ocr/model/OCRRequestModel;)V", "captureTime", "", "cancelProcess", "", "onDestroy", "onPictureTaken", "result", "Lcom/otaliastudios/cameraview/PictureResult;", "startCapturing", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRCameraPresenter implements OCRCameraContract.Presenter {
    private static final String getMax;
    @NotNull
    public static final Companion setMin = new Companion((byte) 0);
    private long getMin;
    private final OCRRequestModel length;
    private final OCRCameraContract.View setMax;

    @Inject
    public OCRCameraPresenter(@NotNull OCRCameraContract.View view, @Nullable OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.setMax = view;
        this.length = oCRRequestModel;
    }

    public final void getMin() {
        this.setMax.showProgress();
        updateActionSheetContent.d(getMax, "Capturing picture...");
        this.getMin = System.currentTimeMillis();
        this.setMax.capturePicture();
    }

    public final void setMax(@NotNull calculateDtToFit calculatedttofit) {
        Intrinsics.checkNotNullParameter(calculatedttofit, "result");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.getMin == 0) {
            this.getMin = currentTimeMillis - 300;
        }
        String str = getMax;
        StringBuilder sb = new StringBuilder("Capture process delay: ");
        sb.append(currentTimeMillis - this.getMin);
        updateActionSheetContent.d(str, sb.toString());
        String str2 = getMax;
        StringBuilder sb2 = new StringBuilder("image rotation ");
        sb2.append(calculatedttofit.getMin);
        updateActionSheetContent.d(str2, sb2.toString());
        this.setMax.dismissProgress();
        OCRRequestModel oCRRequestModel = this.length;
        if (oCRRequestModel != null) {
            this.setMax.openPreviewPage(calculatedttofit, oCRRequestModel);
        } else {
            this.setMax.onFailure("001");
        }
    }

    public final void getMax() {
        this.setMax.onFailure("002");
    }

    public final void setMax() {
        this.setMax.dismissProgress();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/ocr/OCRCameraPresenter$Companion;", "", "()V", "DEFAULT_DEVIATION_TIME_MILLIS", "", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    static {
        String simpleName = OCRCameraPresenter.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "OCRCameraPresenter::class.java.simpleName");
        getMax = simpleName;
    }
}
