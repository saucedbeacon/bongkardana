package o;

import id.dana.contract.exploredana.ExploreDanaModule;
import id.dana.richview.exploredana.ExploreDanaView;
import o.DownloadStep;
import o.PrepareException;
import o.TakePictureProcessor;
import o.b;
import o.getTrimPathStart;

public final class snapshotHit implements DownloadStep.MyPackageDownloadCallback.AnonymousClass1 {
    private b.C0007b<getFixedFontFamily> IsOverlapping;
    private b.C0007b<appxLoadFailed> getMax;
    private b.C0007b<getScheme> getMin;
    private b.C0007b<setFillAlpha> isInside;
    private b.C0007b<getTrimPathStart.length> length;
    private b.C0007b<getSansSerifFontFamily> setMax;
    private final ExploreDanaModule setMin;
    private b.C0007b<getStandardFontFamily> toFloatRange;
    private b.C0007b<setFixedFontFamily> toIntRange;

    public /* synthetic */ snapshotHit(ExploreDanaModule exploreDanaModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(exploreDanaModule, r2);
    }

    private snapshotHit(ExploreDanaModule exploreDanaModule, PrepareException.AnonymousClass1 r5) {
        this.setMin = exploreDanaModule;
        this.length = setTrimPathEnd.setMax(exploreDanaModule);
        this.getMax = new setMax(r5);
        this.getMin = new getMax(r5);
        setMin setmin = new setMin(r5);
        this.setMax = setmin;
        this.toFloatRange = setSansSerifFontFamily.create(this.getMax, this.getMin, setmin);
        this.toIntRange = setSerifFontFamily.create(this.getMax, this.getMin, this.setMax);
        getLayoutAlgorithm create = getLayoutAlgorithm.create(this.getMax, this.getMin, this.setMax);
        this.IsOverlapping = create;
        this.isInside = isScrap.getMin(getTrimPathOffset.getMin(this.length, this.toFloatRange, this.toIntRange, create, TakePictureProcessor.AnonymousClass6.length()));
    }

    public static final class getMin {
        public ExploreDanaModule getMin;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class setMax implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.getMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<getSansSerifFontFamily> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getSansSerifFontFamily asBinder = this.getMax.asBinder();
            if (asBinder != null) {
                return asBinder;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(ExploreDanaView exploreDanaView) {
        TakePictureProcessor.AnonymousClass1.setMax(exploreDanaView, getTrimPathEnd.getMin(this.setMin, this.isInside.get()));
    }
}
