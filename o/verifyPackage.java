package o;

import id.dana.di.modules.SavedBankModule;
import id.dana.sendmoney.bank.savedcard.SavedBankCardView;
import o.AppPreDownloadPackageManager;
import o.GriverResourcePreset;
import o.PrepareException;
import o.b;
import o.onSuccess;

public final class verifyPackage implements getShortValue {
    private b.C0007b<onSuccess.length> IsOverlapping;
    private b.C0007b<packagePathForURLString> equals;
    private b.C0007b<appxLoadFailed> getMax;
    private b.C0007b<AppPreDownloadPackageManager.AnonymousClass1.AnonymousClass1> getMin;
    private b.C0007b<GriverWhiteScreenStageMonitor> length;
    private b.C0007b<onSuccess.getMax> setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<IWorkManagerImplCallback> toFloatRange;
    private b.C0007b<savePresetConfiguration> toIntRange;

    public /* synthetic */ verifyPackage(SavedBankModule savedBankModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(savedBankModule, r2);
    }

    private verifyPackage(SavedBankModule savedBankModule, PrepareException.AnonymousClass1 r6) {
        this.setMax = isScrap.getMin(upload.getMin(savedBankModule));
        this.getMax = new length(r6);
        this.setMin = new getMin(r6);
        getMax getmax = new getMax(r6);
        this.length = getmax;
        this.getMin = removePackageForURLString.create(this.getMax, this.setMin, getmax);
        this.equals = packageExistsForForURLString.create(this.length);
        GriverResourcePreset.AnonymousClass3 create = GriverResourcePreset.AnonymousClass3.create(this.getMax, this.setMin, this.length);
        this.toIntRange = create;
        PathEvaluator$PathMode length2 = PathEvaluator$PathMode.length(this.setMax, this.getMin, this.equals, create, getBucketList.length());
        this.toFloatRange = length2;
        this.IsOverlapping = isScrap.getMin(pageDestroy.getMax(savedBankModule, length2));
    }

    public static final class setMax {
        public PrepareException.AnonymousClass1 getMin;
        public SavedBankModule setMin;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class length implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class getMin implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<GriverWhiteScreenStageMonitor> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy = this.length.ITrustedWebActivityCallback$Stub$Proxy();
            if (ITrustedWebActivityCallback$Stub$Proxy != null) {
                return ITrustedWebActivityCallback$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(SavedBankCardView savedBankCardView) {
        AlipayImageParamConverter.getMin(savedBankCardView, this.IsOverlapping.get());
        AlipayImageParamConverter.setMin(savedBankCardView, CenterCropMode.setMax());
    }
}
