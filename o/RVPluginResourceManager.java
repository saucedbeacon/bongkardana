package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.AddOutletReceiverModule;
import id.dana.sendmoney.external.outlet.AddOutletReceiverActivity;
import o.CompressImageBridgeExtension;
import o.ImageInfoBridgeExtension;
import o.PrepareException;
import o.b;

public final class RVPluginResourceManager implements StepCreator {
    private b.C0007b<trimFilePath> IsOverlapping;
    private b.C0007b<ImageInfoBridgeExtension.AnonymousClass1.setMin> equals;
    private b.C0007b<stopRangingBeaconsInRegion> getMax;
    private b.C0007b<getScheme> getMin;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<fromInt> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<ImageInfoBridgeExtension.AnonymousClass1.getMin> toIntRange;

    public /* synthetic */ RVPluginResourceManager(AddOutletReceiverModule addOutletReceiverModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(addOutletReceiverModule, r2);
    }

    private RVPluginResourceManager(AddOutletReceiverModule addOutletReceiverModule, PrepareException.AnonymousClass1 r4) {
        this.setMin = r4;
        this.length = new getMin(r4);
        this.getMin = new setMin(r4);
        setMax setmax = new setMax(r4);
        this.setMax = setmax;
        this.getMax = startRangingBeaconsInRegion.create(this.length, this.getMin, setmax);
        b.C0007b<ImageInfoBridgeExtension.AnonymousClass1.getMin> min = isScrap.getMin(ordinal.getMin(addOutletReceiverModule));
        this.toIntRange = min;
        CompressImageBridgeExtension.AnonymousClass1 max = CompressImageBridgeExtension.AnonymousClass1.getMax(this.getMax, min);
        this.IsOverlapping = max;
        this.equals = isScrap.getMin(TypeReference.getMin(addOutletReceiverModule, max));
    }

    public static final class getMax {
        public AddOutletReceiverModule getMax;
        public PrepareException.AnonymousClass1 setMin;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class getMin implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<fromInt> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            fromInt onNavigationEvent = this.setMin.onNavigationEvent();
            if (onNavigationEvent != null) {
                return onNavigationEvent;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(AddOutletReceiverActivity addOutletReceiverActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(addOutletReceiverActivity, IPostMessageService$Stub$Proxy);
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
                            matchInfo.length(addOutletReceiverActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            compressImage.length(addOutletReceiverActivity, this.equals.get());
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
