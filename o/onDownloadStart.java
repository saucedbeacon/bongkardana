package o;

import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.UserStatementModule;
import id.dana.statement.StatementActivity;
import o.AUTextView;
import o.PrepareException;
import o.Stats;
import o.b;
import o.getSelectedIndex;

public final class onDownloadStart implements afterWriter {
    private b.C0007b<getScheme> FastBitmap$CoordinateSystem;
    private b.C0007b<BLETraceMonitor> Grayscale$Algorithm;
    private b.C0007b<getBetweenScanPeriod> IsOverlapping;
    private b.C0007b<onDisconnect> Mean$Arithmetic;
    private b.C0007b<setLoggingEnabled> equals;
    private b.C0007b<clearSamples> getMax;
    private b.C0007b<setSampleIntervalMillis> getMin;
    private b.C0007b<appxLoadFailed> hashCode;
    private b.C0007b<setOnOptionPickListener> invoke;
    private b.C0007b<getSelectedIndex.length> invokeSuspend;
    private b.C0007b<getCallbackPackageName> isInside;
    private b.C0007b<getBackgroundFlag> length;
    private final PrepareException.AnonymousClass1 setMax;
    private b.C0007b<AUTextView.OnVisibilityChangeListener.getMax> setMin;
    private b.C0007b<AUTextView.OnVisibilityChangeListener.setMax> toDoubleRange;
    private b.C0007b<setDefaultFontSize> toFloatRange;
    private b.C0007b<setLongScanForcingEnabled> toIntRange;
    private b.C0007b<getSelectedIndex.setMax> toString;
    private b.C0007b<onStopBleScan> valueOf;
    private b.C0007b<AUDefaultTheme> values;

    public /* synthetic */ onDownloadStart(UserStatementModule userStatementModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(userStatementModule, bottomSheetOnBoardingModule, r3);
    }

    private onDownloadStart(UserStatementModule userStatementModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, PrepareException.AnonymousClass1 r11) {
        this.setMax = r11;
        this.setMin = isScrap.getMin(getExtendedInfo.length(userStatementModule));
        IsOverlapping isOverlapping = new IsOverlapping(r11);
        this.length = isOverlapping;
        this.getMin = clearSample.create(isOverlapping);
        this.getMax = Stats.Sample.create(this.length);
        this.equals = Stats.create(this.length);
        this.toIntRange = createScanner.create(this.length);
        this.isInside = setHistoricalLoggingEnabled.create(this.length);
        getMax getmax = new getMax(r11);
        this.toFloatRange = getmax;
        getScanPeriod create = getScanPeriod.create(getmax);
        this.IsOverlapping = create;
        b.C0007b<AUDefaultTheme> min = isScrap.getMin(getInstence.getMax(this.setMin, this.getMin, this.getMax, this.equals, this.toIntRange, this.isInside, create));
        this.values = min;
        this.toDoubleRange = isScrap.getMin(getMiniProgramInfo.length(userStatementModule, min));
        this.toString = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        this.hashCode = new getMin(r11);
        this.FastBitmap$CoordinateSystem = new length(r11);
        setMax setmax = new setMax(r11);
        this.Mean$Arithmetic = setmax;
        this.Grayscale$Algorithm = onDeviceFound.create(this.hashCode, this.FastBitmap$CoordinateSystem, setmax);
        onDisconnectBLE create2 = onDisconnectBLE.create(this.hashCode, this.FastBitmap$CoordinateSystem, this.Mean$Arithmetic);
        this.valueOf = create2;
        onSelected min2 = onSelected.setMin(this.toString, this.Grayscale$Algorithm, create2);
        this.invoke = min2;
        this.invokeSuspend = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min2));
    }

    public static final class setMin {
        public BottomSheetOnBoardingModule getMin;
        public UserStatementModule length;
        public PrepareException.AnonymousClass1 setMax;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class IsOverlapping implements b.C0007b<getBackgroundFlag> {
        private final PrepareException.AnonymousClass1 getMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getBackgroundFlag onMetadataChanged = this.getMax.onMetadataChanged();
            if (onMetadataChanged != null) {
                return onMetadataChanged;
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

    static class length implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.setMin.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(StatementActivity statementActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(statementActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.setMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(statementActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            AUTextView.AnonymousClass1.getMax(statementActivity, this.toDoubleRange.get());
                            AUTextView.AnonymousClass1.length(statementActivity, this.invokeSuspend.get());
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
