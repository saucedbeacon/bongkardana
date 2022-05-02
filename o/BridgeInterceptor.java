package o;

import id.dana.di.modules.OCRCameraModule;
import id.dana.di.modules.OCRPreviewImageModule;
import id.dana.ocr.OCRCameraContract;
import id.dana.ocr.OCRPreviewImageContract;

public final class BridgeInterceptor implements getAdapterPosition<OCRPreviewImageContract.View> {
    private final OCRPreviewImageModule length;

    public final class InterceptContext implements getAdapterPosition<OCRCameraContract.View> {
        private final OCRCameraModule getMax;

        private InterceptContext(OCRCameraModule oCRCameraModule) {
            this.getMax = oCRCameraModule;
        }

        public static InterceptContext setMax(OCRCameraModule oCRCameraModule) {
            return new InterceptContext(oCRCameraModule);
        }

        public final /* synthetic */ Object get() {
            OCRCameraContract.View min = this.getMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private BridgeInterceptor(OCRPreviewImageModule oCRPreviewImageModule) {
        this.length = oCRPreviewImageModule;
    }

    public static BridgeInterceptor length(OCRPreviewImageModule oCRPreviewImageModule) {
        return new BridgeInterceptor(oCRPreviewImageModule);
    }

    public final /* synthetic */ Object get() {
        OCRPreviewImageContract.View min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
