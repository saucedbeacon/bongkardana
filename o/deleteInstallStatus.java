package o;

import android.content.Context;
import id.dana.di.modules.ConfirmPinModule;
import id.dana.di.modules.TncSummaryModules;
import id.dana.onboarding.confirmpin.ConfirmPinFragment;
import o.AppxPrerunChecker;
import o.CycledLeScannerForJellyBeanMr2;
import o.CycledLeScannerForLollipop;
import o.PrepareException;
import o.SensorBridgeExtension;
import o.ToolUtils;
import o.b;

public final class deleteInstallStatus implements AppxPrerunChecker.AnonymousClass2 {
    private b.C0007b<SensorBridgeExtension.AnonymousClass4.length> FastBitmap$CoordinateSystem;
    private b.C0007b<CycledLeScannerForJellyBeanMr2.AnonymousClass1> Grayscale$Algorithm;
    private b.C0007b<getPerformanceTracker> IsOverlapping;
    private b.C0007b<SensorServiceManager> equals;
    private b.C0007b<appxLoadFailed> getMax;
    private b.C0007b<SensorBridgeExtension.AnonymousClass4.getMax> getMin;
    private b.C0007b<CycledLeScannerForLollipop.AnonymousClass2> hashCode;
    private b.C0007b<ToolUtils.setMin> invokeSuspend;
    private b.C0007b<setHardwareEqualityEnforced> isInside;
    private b.C0007b<Context> length;
    private b.C0007b<getScheme> setMax;
    private b.C0007b<setDistanceCalculator> setMin;
    private b.C0007b<ToolUtils.length> toDoubleRange;
    private b.C0007b<getCommonResources> toFloatRange;
    private b.C0007b<GriverCreateDialogParam> toIntRange;
    private b.C0007b<CycledLeScannerForLollipop.AnonymousClass3> toString;
    private b.C0007b<getResourceId> valueOf;
    private b.C0007b<CycledLeScannerForLollipop> values;

    public /* synthetic */ deleteInstallStatus(ConfirmPinModule confirmPinModule, TncSummaryModules tncSummaryModules, PrepareException.AnonymousClass1 r3, byte b) {
        this(confirmPinModule, tncSummaryModules, r3);
    }

    private deleteInstallStatus(ConfirmPinModule confirmPinModule, TncSummaryModules tncSummaryModules, PrepareException.AnonymousClass1 r8) {
        this.length = new length(r8);
        this.getMin = isScrap.getMin(writeReference.getMin(confirmPinModule));
        this.getMax = new isInside(r8);
        this.setMax = new getMax(r8);
        toIntRange tointrange = new toIntRange(r8);
        this.setMin = tointrange;
        this.isInside = getRunningAverageRssi.create(this.getMax, this.setMax, tointrange);
        this.IsOverlapping = new getMin(r8);
        setMax setmax = new setMax(r8);
        this.toFloatRange = setmax;
        GVLoadingView create = GVLoadingView.create(this.getMax, this.setMax, setmax);
        this.toIntRange = create;
        SensorBridgeExtension.AnonymousClass1 max = SensorBridgeExtension.AnonymousClass1.setMax(this.length, this.getMin, this.isInside, this.IsOverlapping, create);
        this.equals = max;
        this.FastBitmap$CoordinateSystem = isScrap.getMin(incrementIndent.setMax(confirmPinModule, max));
        this.toDoubleRange = isScrap.getMin(openFileChooser.getMax(tncSummaryModules));
        IsOverlapping isOverlapping = new IsOverlapping(r8);
        this.values = isOverlapping;
        this.toString = CycledLeScannerForLollipop.AnonymousClass1.create(this.getMax, this.setMax, isOverlapping);
        this.hashCode = onScanResult.create(this.values);
        CycledLeScannerForLollipop.AnonymousClass4 create2 = CycledLeScannerForLollipop.AnonymousClass4.create(this.getMax, this.setMax, this.values);
        this.Grayscale$Algorithm = create2;
        IconfontConstants min = IconfontConstants.getMin(this.toDoubleRange, this.toString, this.hashCode, create2);
        this.valueOf = min;
        this.invokeSuspend = isScrap.getMin(onShowFileChooser.length(tncSummaryModules, min));
    }

    public static final class setMin {
        public ConfirmPinModule getMax;
        public PrepareException.AnonymousClass1 length;
        public TncSummaryModules setMax;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
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

    static class isInside implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.setMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<setDistanceCalculator> {
        private final PrepareException.AnonymousClass1 length;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setDistanceCalculator valueOf = this.length.valueOf();
            if (valueOf != null) {
                return valueOf;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.getMin.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.length.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<CycledLeScannerForLollipop> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            CycledLeScannerForLollipop ITrustedWebActivityCallback$Stub = this.setMin.ITrustedWebActivityCallback$Stub();
            if (ITrustedWebActivityCallback$Stub != null) {
                return ITrustedWebActivityCallback$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(ConfirmPinFragment confirmPinFragment) {
        SensorBridgeExtension.AnonymousClass3.getMax(confirmPinFragment, this.FastBitmap$CoordinateSystem.get());
        SensorBridgeExtension.AnonymousClass3.length(confirmPinFragment, this.invokeSuspend.get());
    }
}
