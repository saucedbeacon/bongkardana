package o;

import android.content.Context;
import id.dana.nearbyme.di.module.MerchantReviewFormModule;
import id.dana.nearbyme.merchantreview.MerchantReviewDialogFragment;
import o.AndroidWebView;
import o.GriverSecurity;
import o.GriverWebEngineImpl;
import o.NavigationBarUtil;
import o.PrepareException;
import o.b;
import o.d;
import o.f;
import o.j;

public final class GriverStartClientProxy implements GriverWebEngineImpl.AnonymousClass3 {
    private b.C0007b<AndroidWebView> IsOverlapping;
    private b.C0007b<addError> equals;
    private b.C0007b<getResponseString> getMax;
    private b.C0007b<CommonUtils> getMin;
    private b.C0007b<Context> isInside;
    private b.C0007b<getBeacons> length;
    private b.C0007b<isAppPermissionOPen> setMax;
    private b.C0007b<GriverSecurity.AnonymousClass1> setMin;
    private b.C0007b<getPrimaryError> toFloatRange;
    private b.C0007b<j.AnonymousClass1.length> toIntRange;

    public /* synthetic */ GriverStartClientProxy(MerchantReviewFormModule merchantReviewFormModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(merchantReviewFormModule, r2);
    }

    private GriverStartClientProxy(MerchantReviewFormModule merchantReviewFormModule, PrepareException.AnonymousClass1 r5) {
        getMax getmax = new getMax(r5);
        this.setMin = getmax;
        this.setMax = getAndroidId.create(getmax);
        this.getMin = DensityUtil.create(this.setMin);
        getMin getmin = new getMin(r5);
        this.getMax = getmin;
        getFilter create = getFilter.create(getmin);
        this.length = create;
        AndroidWebView.AnonymousClass1 min = AndroidWebView.AnonymousClass1.getMin(this.setMax, this.getMin, create);
        this.IsOverlapping = min;
        this.toIntRange = isScrap.getMin(d.AnonymousClass2.AnonymousClass1.length(merchantReviewFormModule, min));
        setMax setmax = new setMax(r5);
        this.isInside = setmax;
        createWebChromeClient length2 = createWebChromeClient.length(setmax);
        this.toFloatRange = length2;
        this.equals = isScrap.getMin(f.AnonymousClass3.setMax(merchantReviewFormModule, length2));
    }

    public static final class setMin {
        public MerchantReviewFormModule getMin;
        public PrepareException.AnonymousClass1 length;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMax implements b.C0007b<GriverSecurity.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverSecurity.AnonymousClass1 onQueueTitleChanged = this.getMin.onQueueTitleChanged();
            if (onQueueTitleChanged != null) {
                return onQueueTitleChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<getResponseString> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getResponseString IMediaControllerCallback = this.setMax.IMediaControllerCallback();
            if (IMediaControllerCallback != null) {
                return IMediaControllerCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(MerchantReviewDialogFragment merchantReviewDialogFragment) {
        NavigationBarUtil.OnNavigationStateListener.getMin(merchantReviewDialogFragment, this.toIntRange.get());
        NavigationBarUtil.OnNavigationStateListener.setMax(merchantReviewDialogFragment, this.equals.get());
    }
}
