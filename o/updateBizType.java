package o;

import id.dana.sendmoney_v2.landing.di.module.ManageRecentBankAccountModule;
import id.dana.sendmoney_v2.recipient.activity.ManageRecentBankAccountBottomSheet;
import o.ImageObserver;
import o.PrepareException;
import o.b;
import o.setUnit;

public final class updateBizType implements hasOriginPhoto {
    private b.C0007b<GriverRVResourcePresetImpl> IsOverlapping;
    private b.C0007b<setUnit.getMin> equals;
    private b.C0007b<ResourceDownloadType> getMax;
    private b.C0007b<GriverWhiteScreenStageMonitor> getMin;
    private b.C0007b<setUnit.setMin> length;
    private b.C0007b<getScheme> setMax;
    private b.C0007b<appxLoadFailed> setMin;
    private b.C0007b<setFormat> toFloatRange;

    public /* synthetic */ updateBizType(ManageRecentBankAccountModule manageRecentBankAccountModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(manageRecentBankAccountModule, r2);
    }

    private updateBizType(ManageRecentBankAccountModule manageRecentBankAccountModule, PrepareException.AnonymousClass1 r4) {
        this.length = isScrap.getMin(ImageObserver.AnonymousClass1.getMin(manageRecentBankAccountModule));
        this.setMin = new getMin(r4);
        this.setMax = new length(r4);
        setMax setmax = new setMax(r4);
        this.getMin = setmax;
        this.getMax = setGriverResourcePresetProxy.create(this.setMin, this.setMax, setmax);
        GriverResourcePreset create = GriverResourcePreset.create(this.getMin);
        this.IsOverlapping = create;
        ImageHelper length2 = ImageHelper.length(this.length, this.getMax, create);
        this.toFloatRange = length2;
        this.equals = isScrap.getMin(ImageObserver.AnonymousClass3.getMin(manageRecentBankAccountModule, length2));
    }

    public static final class setMin {
        public ManageRecentBankAccountModule getMax;
        public PrepareException.AnonymousClass1 length;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMin implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.length.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<GriverWhiteScreenStageMonitor> {
        private final PrepareException.AnonymousClass1 getMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy = this.getMax.ITrustedWebActivityCallback$Stub$Proxy();
            if (ITrustedWebActivityCallback$Stub$Proxy != null) {
                return ITrustedWebActivityCallback$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(ManageRecentBankAccountBottomSheet manageRecentBankAccountBottomSheet) {
        getFinalY.setMax(manageRecentBankAccountBottomSheet, this.equals.get());
    }
}
