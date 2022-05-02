package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.nearbyme.di.module.PhotoGalleryModule;
import id.dana.nearbyme.merchantdetail.mediaviewer.MerchantPhotoGalleryActivity;
import o.APExpansion;
import o.GriverBaseFragment;
import o.GriverDialog;
import o.PrepareException;
import o.b;
import o.f;
import o.negativeListener;

public final class GriverScreenOrientationProxyImpl implements GriverWebEngineImpl {
    private b.C0007b<isRAndAbove> IsOverlapping;
    private b.C0007b<setStorageProxy> getMax;
    private b.C0007b<negativeListener.length> getMin;
    private b.C0007b<GriverBaseFragment.Main> isInside;
    private final PrepareException.AnonymousClass1 length;
    private b.C0007b<APExpansion.AnonymousClass1> setMax;
    private b.C0007b<negativeString> setMin;
    private b.C0007b<negativeListener.getMax> toIntRange;

    public /* synthetic */ GriverScreenOrientationProxyImpl(PhotoGalleryModule photoGalleryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(photoGalleryModule, r2);
    }

    private GriverScreenOrientationProxyImpl(PhotoGalleryModule photoGalleryModule, PrepareException.AnonymousClass1 r4) {
        this.length = r4;
        this.setMin = isScrap.getMin(onPrepared.length(photoGalleryModule));
        this.getMin = isScrap.getMin(f.AnonymousClass6.getMax(photoGalleryModule));
        this.getMax = new length(r4);
        setMin setmin = new setMin(r4);
        this.setMax = setmin;
        AppInfoUtils create = AppInfoUtils.create(this.getMax, setmin);
        this.IsOverlapping = create;
        GriverDialog.DialogParam max = GriverDialog.DialogParam.setMax(this.setMin, this.getMin, create);
        this.isInside = max;
        this.toIntRange = isScrap.getMin(f.AnonymousClass7.setMin(photoGalleryModule, max));
    }

    public static final class getMin {
        public PhotoGalleryModule length;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class length implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.getMin.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<APExpansion.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            APExpansion.AnonymousClass1 intRange = this.getMin.toIntRange();
            if (intRange != null) {
                return intRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(MerchantPhotoGalleryActivity merchantPhotoGalleryActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(merchantPhotoGalleryActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.length.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.length.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.length.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(merchantPhotoGalleryActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            align.setMax(merchantPhotoGalleryActivity, this.toIntRange.get());
                            return;
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
