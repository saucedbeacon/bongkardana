package o;

import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.ThreadConfined;
import java.util.concurrent.atomic.AtomicInteger;

@ThreadConfined("ANY")
public final class ViewCompat$ScrollIndicators {
    IconCompat<ViewCompat$FocusDirection> FastBitmap$CoordinateSystem;
    IconCompat<NestedScrollView> Grayscale$Algorithm;
    IconCompat<AccessibilityEventCompat$ContentChangeType> ICustomTabsCallback;
    public float IsOverlapping = 1.0f;
    IconCompat<dispatchNestedScroll> Mean$Arithmetic;
    IconCompat<getMaxScrollAmount> b;
    IconCompat<isFillViewport> create;
    boolean equals;
    public int extraCallback = 0;
    IconCompat<ContentLoadingProgressBar> getCause;
    public final AtomicInteger getMax = new AtomicInteger(0);
    public float getMin;
    public float hashCode = 0.0f;
    String invoke;
    IconCompat<openFile> invokeSuspend;
    public float isInside = 1.0f;
    public Object length;
    int onMessageChannelReady = 0;
    IconCompat<stopNestedScroll> onNavigationEvent;
    int onPostMessage;
    public int onRelationshipValidationResult = 0;
    public CharSequence setMax;
    @Nullable
    public SparseArray<Object> setMin;
    IconCompat<fullScroll> toDoubleRange;
    boolean toFloatRange = true;
    public ViewOutlineProvider toIntRange;
    IconCompat<GnssStatusCompat$ConstellationType> toString;
    IconCompat<getBridge> valueOf;
    IconCompat<FrameMetricsAggregator$MetricType> values;

    ViewCompat$ScrollIndicators() {
    }

    public final boolean setMax() {
        return this.equals;
    }

    public final boolean length() {
        return this.toFloatRange;
    }

    public final boolean getMax() {
        return (this.onPostMessage & 8388608) != 0;
    }

    public final boolean getMin() {
        return this.toString != null;
    }

    public final boolean setMin() {
        return (this.values == null && this.FastBitmap$CoordinateSystem == null && this.toDoubleRange == null && this.valueOf == null) ? false : true;
    }

    public final boolean isInside() {
        return (this.Grayscale$Algorithm == null && this.ICustomTabsCallback == null && this.Mean$Arithmetic == null && this.getCause == null && this.onNavigationEvent == null && this.invokeSuspend == null && this.create == null && this.b == null && this.invoke == null) ? false : true;
    }

    public final boolean toIntRange() {
        return (this.onPostMessage & 524288) != 0;
    }

    public final boolean toFloatRange() {
        return (this.onPostMessage & 1048576) != 0;
    }

    public final boolean equals() {
        return (this.onPostMessage & 2097152) != 0;
    }

    public final boolean setMax(ViewCompat$ScrollIndicators viewCompat$ScrollIndicators) {
        if (this == viewCompat$ScrollIndicators) {
            return true;
        }
        return viewCompat$ScrollIndicators != null && processorFinished.length(this.invoke, viewCompat$ScrollIndicators.invoke) && this.IsOverlapping == viewCompat$ScrollIndicators.IsOverlapping && processorFinished.length(this.values, viewCompat$ScrollIndicators.values) && this.equals == viewCompat$ScrollIndicators.equals && this.toFloatRange == viewCompat$ScrollIndicators.toFloatRange && processorFinished.length(this.setMax, viewCompat$ScrollIndicators.setMax) && processorFinished.length(this.invokeSuspend, viewCompat$ScrollIndicators.invokeSuspend) && this.extraCallback == viewCompat$ScrollIndicators.extraCallback && processorFinished.length(this.toString, viewCompat$ScrollIndicators.toString) && this.onRelationshipValidationResult == viewCompat$ScrollIndicators.onRelationshipValidationResult && processorFinished.length(this.valueOf, viewCompat$ScrollIndicators.valueOf) && processorFinished.length(this.FastBitmap$CoordinateSystem, viewCompat$ScrollIndicators.FastBitmap$CoordinateSystem) && processorFinished.length(this.Grayscale$Algorithm, viewCompat$ScrollIndicators.Grayscale$Algorithm) && processorFinished.length(this.ICustomTabsCallback, viewCompat$ScrollIndicators.ICustomTabsCallback) && processorFinished.length(this.Mean$Arithmetic, viewCompat$ScrollIndicators.Mean$Arithmetic) && processorFinished.length(this.getCause, viewCompat$ScrollIndicators.getCause) && processorFinished.length(this.toIntRange, viewCompat$ScrollIndicators.toIntRange) && processorFinished.length(this.onNavigationEvent, viewCompat$ScrollIndicators.onNavigationEvent) && this.hashCode == viewCompat$ScrollIndicators.hashCode && this.isInside == viewCompat$ScrollIndicators.isInside && this.onMessageChannelReady == viewCompat$ScrollIndicators.onMessageChannelReady && processorFinished.length(this.create, viewCompat$ScrollIndicators.create) && processorFinished.length(this.b, viewCompat$ScrollIndicators.b) && this.getMin == viewCompat$ScrollIndicators.getMin && processorFinished.length(this.toDoubleRange, viewCompat$ScrollIndicators.toDoubleRange) && processorFinished.length(this.length, viewCompat$ScrollIndicators.length) && processorFinished.length(this.setMin, viewCompat$ScrollIndicators.setMin);
    }

    public final void IsOverlapping() {
        int decrementAndGet = this.getMax.decrementAndGet();
        if (decrementAndGet < 0) {
            throw new IllegalStateException("Trying to release a recycled NodeInfo.");
        } else if (decrementAndGet <= 0 && !keyToDirection.ICustomTabsCallback$Default) {
            this.setMax = null;
            this.length = null;
            this.setMin = null;
            this.values = null;
            this.FastBitmap$CoordinateSystem = null;
            this.toString = null;
            this.toDoubleRange = null;
            this.valueOf = null;
            this.invoke = null;
            this.invokeSuspend = null;
            this.Grayscale$Algorithm = null;
            this.Mean$Arithmetic = null;
            this.ICustomTabsCallback = null;
            this.getCause = null;
            this.onNavigationEvent = null;
            this.create = null;
            this.b = null;
            this.onRelationshipValidationResult = 0;
            this.extraCallback = 0;
            this.onMessageChannelReady = 0;
            this.onPostMessage = 0;
            this.getMin = 0.0f;
            this.toIntRange = null;
            this.equals = false;
            this.toFloatRange = true;
            this.isInside = 1.0f;
            this.IsOverlapping = 1.0f;
            this.hashCode = 0.0f;
            NotificationCompatSideChannelService.getMin(this);
        }
    }
}
