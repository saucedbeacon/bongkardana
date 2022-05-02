package o;

import android.content.Context;
import id.dana.di.modules.SavingConfigModule;
import id.dana.savings.view.TotalSavingAmountView;
import o.Beacon;
import o.PrepareException;
import o.SightCameraView;
import o.b;
import o.notifyPrepared;

public final class preParsePackage implements getDoubleValue {
    private b.C0007b<notifyPrepared.length> getMax;
    private b.C0007b<Beacon.AnonymousClass1> getMin;
    private b.C0007b<Context> length;
    private b.C0007b<sync> setMax;
    private b.C0007b<getCommonResources> setMin;
    private b.C0007b<SightCameraView.OnRecordListener> toFloatRange;

    public /* synthetic */ preParsePackage(SavingConfigModule savingConfigModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(savingConfigModule, r2);
    }

    private preParsePackage(SavingConfigModule savingConfigModule, PrepareException.AnonymousClass1 r4) {
        this.length = new setMin(r4);
        this.getMax = isScrap.getMin(DownloadCallback.setMin(savingConfigModule));
        length length2 = new length(r4);
        this.setMin = length2;
        this.getMin = copyBeaconFields.create(length2);
        setLongitude create = setLongitude.create(this.setMin);
        this.setMax = create;
        this.toFloatRange = isScrap.getMin(SightCameraView.FrameType.length(this.length, this.getMax, this.getMin, create));
    }

    public static final class getMin {
        public SavingConfigModule setMax;
        public PrepareException.AnonymousClass1 setMin;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.length.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(TotalSavingAmountView totalSavingAmountView) {
        onSingleTapUp.setMin(totalSavingAmountView, this.toFloatRange.get());
    }
}
