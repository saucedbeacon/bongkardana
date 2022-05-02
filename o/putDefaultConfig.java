package o;

import id.dana.di.modules.PreprocessingAndOcrModule;
import id.dana.ocr.PreprocessingAndOcrContract;

public final class putDefaultConfig implements getAdapterPosition<PreprocessingAndOcrContract.View> {
    private final PreprocessingAndOcrModule getMax;

    public static PreprocessingAndOcrContract.View setMax(PreprocessingAndOcrModule preprocessingAndOcrModule) {
        PreprocessingAndOcrContract.View length = preprocessingAndOcrModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        PreprocessingAndOcrContract.View length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
