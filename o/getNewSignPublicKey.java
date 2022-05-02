package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import o.OptionPickerDialog;
import o.PrepareException;
import o.UpdateMode;
import o.b;
import o.getSelectedIndex;

public final class getNewSignPublicKey implements UpdateMode.AnonymousClass1 {
    private b.C0007b<getSelectedIndex.length> IsOverlapping;
    private b.C0007b<onStopBleScan> equals;
    private b.C0007b<getScheme> getMax;
    private b.C0007b<onDisconnect> getMin;
    private b.C0007b<BLETraceMonitor> isInside;
    private b.C0007b<getSelectedIndex.setMax> length;
    private b.C0007b<appxLoadFailed> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<setOnOptionPickListener> toFloatRange;

    public /* synthetic */ getNewSignPublicKey(BottomSheetOnBoardingModule bottomSheetOnBoardingModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(bottomSheetOnBoardingModule, r2);
    }

    private getNewSignPublicKey(BottomSheetOnBoardingModule bottomSheetOnBoardingModule, PrepareException.AnonymousClass1 r4) {
        this.setMin = r4;
        this.length = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        this.setMax = new getMax(r4);
        this.getMax = new setMin(r4);
        length length2 = new length(r4);
        this.getMin = length2;
        this.isInside = onDeviceFound.create(this.setMax, this.getMax, length2);
        onDisconnectBLE create = onDisconnectBLE.create(this.setMax, this.getMax, this.getMin);
        this.equals = create;
        onSelected min = onSelected.setMin(this.length, this.isInside, create);
        this.toFloatRange = min;
        this.IsOverlapping = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMin;
        public BottomSheetOnBoardingModule setMin;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class getMax implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.getMin.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMax(BottomSheetOnBoardingActivity bottomSheetOnBoardingActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(bottomSheetOnBoardingActivity, IPostMessageService$Stub$Proxy);
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
                            matchInfo.length(bottomSheetOnBoardingActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            OptionPickerDialog.AnonymousClass2.getMax(bottomSheetOnBoardingActivity, this.IsOverlapping.get());
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
