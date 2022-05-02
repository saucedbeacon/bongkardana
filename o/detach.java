package o;

import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import o.APWebSettings;
import o.PrepareException;
import o.b;
import o.setMediaId;

public final class detach implements toJavaObject {
    private b.C0007b<registerStageMonitor> FastBitmap$CoordinateSystem;
    private b.C0007b<filterCommonResources> IsOverlapping;
    private b.C0007b<getDefaultUserAgent> equals;
    private b.C0007b<getScheme> getMax;
    private b.C0007b<appxLoadFailed> getMin;
    private b.C0007b<setIsPicCurrentlyTaked> hashCode;
    private b.C0007b<transitToError> isInside;
    private b.C0007b<PrepareContextUitls> length;
    private b.C0007b<GriverWhiteScreenStageMonitor> setMax;
    private b.C0007b<setMediaId.getMin> setMin;
    private b.C0007b<APWebSettings.RenderPriority> toFloatRange;
    private b.C0007b<setDefaultFontSize> toIntRange;
    private b.C0007b<setMediaId.setMax> toString;

    public /* synthetic */ detach(RecentRecipientModule recentRecipientModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(recentRecipientModule, r2);
    }

    private detach(RecentRecipientModule recentRecipientModule, PrepareException.AnonymousClass1 r10) {
        this.setMin = isScrap.getMin(getIsAlbumMedia.setMin(recentRecipientModule));
        this.getMin = new setMax(r10);
        this.getMax = new getMax(r10);
        length length2 = new length(r10);
        this.setMax = length2;
        this.length = H5CommonResourceUtils.create(this.getMin, this.getMax, length2);
        setMin setmin = new setMin(r10);
        this.toIntRange = setmin;
        this.toFloatRange = APWebSettings.TextSize.create(this.getMin, this.getMax, setmin);
        this.equals = setEnableFastScroller.create(this.getMin, this.getMax, this.toIntRange);
        this.isInside = GriverStageMonitorManager.create(this.setMax, this.getMin, this.getMax);
        this.IsOverlapping = GriverStageMonitor.create(this.setMax);
        this.FastBitmap$CoordinateSystem = transitToNext.create(this.setMax);
        setThumbPath min = setThumbPath.getMin(this.setMin, this.length, asyncScanPhotoAndVideo.getMin(), this.toFloatRange, this.equals, this.isInside, this.IsOverlapping, this.FastBitmap$CoordinateSystem);
        this.hashCode = min;
        this.toString = isScrap.getMin(isPicCurrentlyTaked.getMax(recentRecipientModule, min));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMax;
        public RecentRecipientModule getMin;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class setMax implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.setMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.setMin.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<GriverWhiteScreenStageMonitor> {
        private final PrepareException.AnonymousClass1 getMax;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(RecentRecipientView recentRecipientView) {
        getLeftText.setMax(recentRecipientView, this.toString.get());
        getLeftText.setMin(recentRecipientView, new setIsAlbumMedia());
    }
}
