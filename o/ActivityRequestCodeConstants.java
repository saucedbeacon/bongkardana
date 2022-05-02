package o;

import id.dana.di.modules.PreprocessingAndOcrModule;

public final class ActivityRequestCodeConstants implements getAdapterPosition<IRedDotManager> {
    private final PreprocessingAndOcrModule getMax;

    private ActivityRequestCodeConstants(PreprocessingAndOcrModule preprocessingAndOcrModule) {
        this.getMax = preprocessingAndOcrModule;
    }

    public static ActivityRequestCodeConstants getMin(PreprocessingAndOcrModule preprocessingAndOcrModule) {
        return new ActivityRequestCodeConstants(preprocessingAndOcrModule);
    }

    public static IRedDotManager getMax(PreprocessingAndOcrModule preprocessingAndOcrModule) {
        IRedDotManager min = preprocessingAndOcrModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        IRedDotManager min = this.getMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
