package o;

import id.dana.contract.maintenance.MaintenanceBroadcastModule;
import id.dana.richview.MaintenanceBroadcastView;
import o.GriverCaptureActivity;
import o.PrepareException;
import o.b;
import o.setTabIndicatorColor;

public final class getPageWidth implements PagerTabStrip {
    private b.C0007b<setTabIndicatorColor.getMax> IsOverlapping;
    private b.C0007b<setTabIndicatorColor.setMin> getMax;
    private b.C0007b<setDefaultFontSize> getMin;
    private b.C0007b<getDrawFullUnderline> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<getScheme> setMax;
    private b.C0007b<apiName> setMin;

    public /* synthetic */ getPageWidth(MaintenanceBroadcastModule maintenanceBroadcastModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(maintenanceBroadcastModule, r2);
    }

    private getPageWidth(MaintenanceBroadcastModule maintenanceBroadcastModule, PrepareException.AnonymousClass1 r4) {
        this.getMax = isScrap.getMin(setDrawFullUnderline.length(maintenanceBroadcastModule));
        this.length = new getMin(r4);
        this.setMax = new setMin(r4);
        getMax getmax = new getMax(r4);
        this.getMin = getmax;
        needAsynAppType create = needAsynAppType.create(this.length, this.setMax, getmax);
        this.setMin = create;
        b.C0007b<getDrawFullUnderline> min = isScrap.getMin(updateTextPositions.getMin(this.getMax, create));
        this.isInside = min;
        this.IsOverlapping = isScrap.getMin(PagerTitleStrip.length(maintenanceBroadcastModule, min));
    }

    public static final class length {
        public PrepareException.AnonymousClass1 length;
        public MaintenanceBroadcastModule setMax;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getMin implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMin;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    public final void length(MaintenanceBroadcastView maintenanceBroadcastView) {
        GriverCaptureActivity.AnonymousClass4.getMax(maintenanceBroadcastView, this.IsOverlapping.get());
    }
}
