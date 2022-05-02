package o;

import android.content.Context;
import id.dana.contract.services.ServiceCategoryModule;
import id.dana.richview.servicescard.ServiceCategoryView;
import o.BindDimen;
import o.CameraUtils;
import o.OrientationDetector;
import o.PrepareException;
import o.b;

public final class setParseContext implements JSONObject {
    private b.C0007b<BindColor> IsOverlapping;
    private b.C0007b<toHexString> getMax;
    private b.C0007b<toUuidString> getMin;
    private b.C0007b<Context> isInside;
    private b.C0007b<getScheme> length;
    private b.C0007b<appxLoadFailed> setMax;
    private b.C0007b<BindDimen.setMin> setMin;
    private b.C0007b<BindDimen.setMax> toFloatRange;
    private b.C0007b<OrientationDetector.OrientationListener> toIntRange;

    public /* synthetic */ setParseContext(ServiceCategoryModule serviceCategoryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(serviceCategoryModule, r2);
    }

    private setParseContext(ServiceCategoryModule serviceCategoryModule, PrepareException.AnonymousClass1 r5) {
        this.setMin = isScrap.getMin(BindDrawable.setMax(serviceCategoryModule));
        this.setMax = new getMax(r5);
        this.length = new getMin(r5);
        setMax setmax = new setMax(r5);
        this.getMin = setmax;
        this.getMax = didEnterRegion.create(this.setMax, this.length, setmax);
        setMin setmin = new setMin(r5);
        this.isInside = setmin;
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(setmin);
        this.toIntRange = max;
        BindString length2 = BindString.length(this.setMin, this.getMax, max, this.isInside);
        this.IsOverlapping = length2;
        this.toFloatRange = isScrap.getMin(BindFloat.setMax(serviceCategoryModule, length2));
    }

    public static final class length {
        public PrepareException.AnonymousClass1 getMax;
        public ServiceCategoryModule setMin;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getMax implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 setMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.setMax.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(ServiceCategoryView serviceCategoryView) {
        CameraUtils.CameraHelperListener.setMin(serviceCategoryView, this.toFloatRange.get());
    }
}
