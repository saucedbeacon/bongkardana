package o;

import id.dana.di.modules.ExpiryModule;
import id.dana.sendmoney.view.ExpireTimeView;
import o.DownloadStep;
import o.PrepareException;
import o.b;
import o.onExecuted;

public final class getSnapshotExtDir implements DownloadStep.MyPluginDownloadCallback {
    private b.C0007b<onExecuted.getMin> IsOverlapping;
    private b.C0007b<getScheme> getMax;
    private b.C0007b<onExecuted.length> getMin;
    private b.C0007b<setDefaultFontSize> length;
    private b.C0007b<appxLoadFailed> setMax;
    private b.C0007b<zoomIn> setMin;
    private b.C0007b<CombineContinuationsWorker> toIntRange;

    public /* synthetic */ getSnapshotExtDir(ExpiryModule expiryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(expiryModule, r2);
    }

    private getSnapshotExtDir(ExpiryModule expiryModule, PrepareException.AnonymousClass1 r4) {
        this.getMin = isScrap.getMin(map.setMax(expiryModule));
        this.setMax = new getMax(r4);
        this.getMax = new length(r4);
        setMin setmin = new setMin(r4);
        this.length = setmin;
        zoomOut create = zoomOut.create(this.setMax, this.getMax, setmin);
        this.setMin = create;
        startForeground max = startForeground.setMax(this.getMin, create, PhotoResolver.setMax());
        this.toIntRange = max;
        this.IsOverlapping = isScrap.getMin(getFieldValuesMap.setMin(expiryModule, max));
    }

    public static final class setMax {
        public ExpiryModule getMin;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class getMax implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length2 = this.length.length();
            if (length2 != null) {
                return length2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMax;

        length(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.setMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.length.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMax(ExpireTimeView expireTimeView) {
        setLargePhotoWidth.setMax(expireTimeView, this.IsOverlapping.get());
    }
}
