package o;

import id.dana.di.modules.OCRCameraModule;
import id.dana.ocr.model.OCRRequestModel;
import org.jetbrains.annotations.Nullable;

public final class isTiny implements getAdapterPosition<OCRRequestModel> {
    private final OCRCameraModule length;

    private isTiny(OCRCameraModule oCRCameraModule) {
        this.length = oCRCameraModule;
    }

    public static isTiny setMax(OCRCameraModule oCRCameraModule) {
        return new isTiny(oCRCameraModule);
    }

    @Nullable
    public final /* synthetic */ Object get() {
        return this.length.setMax();
    }
}
