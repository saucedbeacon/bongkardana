package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.SavingTopUpHistoryModule;
import id.dana.savings.activity.SavingHistoryActivity;
import o.Beacon;
import o.PrepareException;
import o.SightCameraView;
import o.b;
import o.isEnableFrameData;

public final class inBlackList implements getFloatValue {
    private b.C0007b<SightCameraView.TakePictureListener> IsOverlapping;
    private b.C0007b<getBluetoothName> getMax;
    private b.C0007b<isEnableFrameData.getMin> getMin;
    private b.C0007b<isEnableFrameData.getMax> isInside;
    private b.C0007b<toStringBuilder> length;
    private b.C0007b<Context> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<Beacon.Builder> toFloatRange;

    public /* synthetic */ inBlackList(SavingTopUpHistoryModule savingTopUpHistoryModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(savingTopUpHistoryModule, r2);
    }

    private inBlackList(SavingTopUpHistoryModule savingTopUpHistoryModule, PrepareException.AnonymousClass1 r4) {
        this.setMin = r4;
        this.setMax = new length(r4);
        this.getMin = isScrap.getMin(HttpResponse.getMin(savingTopUpHistoryModule));
        this.getMax = new setMax(r4);
        getMin getmin = new getMin(r4);
        this.length = getmin;
        setId2 create = setId2.create(this.getMax, getmin);
        this.toFloatRange = create;
        b.C0007b<SightCameraView.TakePictureListener> min = isScrap.getMin(SightCameraView.TakePictureMPListener.getMax(this.setMax, this.getMin, create));
        this.IsOverlapping = min;
        this.isInside = isScrap.getMin(setUploadRequest.setMin(savingTopUpHistoryModule, min));
    }

    public static final class getMax {
        public PrepareException.AnonymousClass1 setMax;
        public SavingTopUpHistoryModule setMin;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.length.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<getBluetoothName> {
        private final PrepareException.AnonymousClass1 setMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getBluetoothName onCaptioningEnabledChanged = this.setMax.onCaptioningEnabledChanged();
            if (onCaptioningEnabledChanged != null) {
                return onCaptioningEnabledChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<toStringBuilder> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            toStringBuilder IMediaControllerCallback$Stub = this.getMin.IMediaControllerCallback$Stub();
            if (IMediaControllerCallback$Stub != null) {
                return IMediaControllerCallback$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(SavingHistoryActivity savingHistoryActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(savingHistoryActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.setMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(savingHistoryActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            zoom.setMax(savingHistoryActivity, this.isInside.get());
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
