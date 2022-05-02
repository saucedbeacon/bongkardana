package o;

import id.dana.di.modules.PreprocessingAndOcrModule;
import id.dana.di.modules.PromoBannerModule;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.PreprocessingAndOcrPresenter;
import o.GriverBridgeManifest;
import o.b;

public final class GriverConfigProxy implements getAdapterPosition<PreprocessingAndOcrContract.Presenter> {
    private final PreprocessingAndOcrModule getMin;
    private final b.C0007b<PreprocessingAndOcrPresenter> setMax;

    public final class OnSectionConfigChangeListener implements getAdapterPosition<GriverBridgeManifest.setMax> {
        private final PromoBannerModule setMin;

        private OnSectionConfigChangeListener(PromoBannerModule promoBannerModule) {
            this.setMin = promoBannerModule;
        }

        public static OnSectionConfigChangeListener getMin(PromoBannerModule promoBannerModule) {
            return new OnSectionConfigChangeListener(promoBannerModule);
        }

        public final /* synthetic */ Object get() {
            GriverBridgeManifest.setMax min = this.setMin.setMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class OnConfigChangeListener implements getAdapterPosition<GriverBridgeManifest.getMin> {
        private final b.C0007b<GriverExtensionRegistry> length;
        private final PromoBannerModule setMin;

        public static GriverBridgeManifest.getMin getMax(PromoBannerModule promoBannerModule, GriverExtensionRegistry griverExtensionRegistry) {
            GriverBridgeManifest.getMin min = promoBannerModule.setMin(griverExtensionRegistry);
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            GriverBridgeManifest.getMin min = this.setMin.setMin(this.length.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static PreprocessingAndOcrContract.Presenter getMin(PreprocessingAndOcrModule preprocessingAndOcrModule, PreprocessingAndOcrPresenter preprocessingAndOcrPresenter) {
        PreprocessingAndOcrContract.Presenter max = preprocessingAndOcrModule.setMax(preprocessingAndOcrPresenter);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        PreprocessingAndOcrContract.Presenter max = this.getMin.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
