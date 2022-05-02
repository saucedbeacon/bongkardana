package o;

import id.dana.model.SelectedPayerModule;
import id.dana.richview.splitbill.SelectedPayerView;
import o.CameraView;
import o.PrepareException;
import o.b;

public final class fastReadTarIntoMemory implements JSONAware {
    private b.C0007b<setActivityOrFragment> equals;
    private b.C0007b<CameraView.length> getMax;
    private b.C0007b<PrepareContextUitls> getMin;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<GriverWhiteScreenStageMonitor> setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<CameraView.setMin> toFloatRange;

    public /* synthetic */ fastReadTarIntoMemory(SelectedPayerModule selectedPayerModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(selectedPayerModule, r2);
    }

    private fastReadTarIntoMemory(SelectedPayerModule selectedPayerModule, PrepareException.AnonymousClass1 r4) {
        this.getMax = isScrap.getMin(fillAppCommonInfo.setMax(selectedPayerModule));
        this.length = new length(r4);
        this.setMin = new getMin(r4);
        setMin setmin = new setMin(r4);
        this.setMax = setmin;
        H5CommonResourceUtils create = H5CommonResourceUtils.create(this.length, this.setMin, setmin);
        this.getMin = create;
        setOnRecordListener max = setOnRecordListener.setMax(this.getMax, create, access$3000.setMax());
        this.equals = max;
        this.toFloatRange = isScrap.getMin(RVPerformanceLogHelper.setMax(selectedPayerModule, max));
    }

    public static final class setMax {
        public SelectedPayerModule getMin;
        public PrepareException.AnonymousClass1 length;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class length implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.getMin.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<GriverWhiteScreenStageMonitor> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy = this.setMin.ITrustedWebActivityCallback$Stub$Proxy();
            if (ITrustedWebActivityCallback$Stub$Proxy != null) {
                return ITrustedWebActivityCallback$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(SelectedPayerView selectedPayerView) {
        onSurfaceTextureAvailable.setMin(selectedPayerView, this.toFloatRange.get());
    }
}
