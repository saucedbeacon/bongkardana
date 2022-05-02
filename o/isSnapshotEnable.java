package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.feeds.UserFeedsModule;
import id.dana.feeds.views.UserFeedsActivity;
import o.BLEBridgeExtension;
import o.PrepareException;
import o.b;
import o.getScaleY;

public final class isSnapshotEnable implements UpdateStep {
    private b.C0007b<getTranslateX> IsOverlapping;
    private b.C0007b<APWebViewListener> equals;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<getScaleY.getMin> getMin;
    private b.C0007b<getScaleY.length> isInside;
    private b.C0007b<getScheme> length;
    private b.C0007b<doUpdateVisitedHistory> setMax;
    private b.C0007b<appxLoadFailed> setMin;
    private b.C0007b<onReceivedHttpAuthRequest> toIntRange;

    public /* synthetic */ isSnapshotEnable(UserFeedsModule userFeedsModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(userFeedsModule, r2);
    }

    private isSnapshotEnable(UserFeedsModule userFeedsModule, PrepareException.AnonymousClass1 r5) {
        this.getMax = r5;
        this.getMin = isScrap.getMin(getPivotY.length(userFeedsModule));
        this.setMin = new length(r5);
        this.length = new getMin(r5);
        getMax getmax = new getMax(r5);
        this.setMax = getmax;
        this.equals = getRequestMap.create(this.setMin, this.length, getmax);
        onScaleChanged create = onScaleChanged.create(this.setMin, this.length, this.setMax);
        this.toIntRange = create;
        b.C0007b<getTranslateX> min = isScrap.getMin(setTranslateX.setMin(this.getMin, this.equals, create, readBLECharacteristicValue.getMax()));
        this.IsOverlapping = min;
        this.isInside = isScrap.getMin(getPivotX.getMax(userFeedsModule, min));
    }

    public static final class setMax {
        public PrepareException.AnonymousClass1 length;
        public UserFeedsModule setMax;

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
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<doUpdateVisitedHistory> {
        private final PrepareException.AnonymousClass1 getMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            doUpdateVisitedHistory ICustomTabsCallback = this.getMin.ICustomTabsCallback();
            if (ICustomTabsCallback != null) {
                return ICustomTabsCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(UserFeedsActivity userFeedsActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(userFeedsActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.getMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.getMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(userFeedsActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            BLEBridgeExtension.AnonymousClass7.length(userFeedsActivity, this.isInside.get());
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
