package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import o.CheckResult;

public class BinderThread extends AnyThread {
    public int IMediaControllerCallback$Stub = 0;
    public int IMediaControllerCallback$Stub$Proxy = 0;
    public int IMediaSession = 0;
    private boolean getMin = false;
    public int onCaptioningEnabledChanged = 0;
    public int onExtrasChanged = 0;
    public int onQueueChanged = 0;
    public int onRepeatModeChanged = 0;
    protected CheckResult.setMax onSessionReady = new CheckResult.setMax();
    public int onShuffleModeChanged = 0;
    public int onShuffleModeChangedRemoved = 0;
    public int onVolumeInfoChanged = 0;
    CheckResult.getMax unregisterCallbackListener = null;

    public void getMax(int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public final void setMin(boolean z) {
        this.getMin = z;
    }

    public final boolean length() {
        return this.getMin;
    }

    public final void setMax() {
        for (int i = 0; i < this.onSessionDestroyed; i++) {
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i];
            if (constraintWidget != null) {
                constraintWidget.toDoubleRange();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange() {
        int i;
        int i2;
        CheckResult.getMax max = this.requestPostMessageChannel != null ? ((AnimRes) this.requestPostMessageChannel).setMax() : null;
        if (max == null) {
            return false;
        }
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.onSessionDestroyed) {
                return true;
            }
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i3];
            if (constraintWidget != null && !(constraintWidget instanceof AnimatorRes)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.extraCommand[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.extraCommand[1];
                if (!(dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.Mean$Arithmetic != 1 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.invoke != 1)) {
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    this.onSessionReady.getMin = dimensionBehaviour;
                    this.onSessionReady.setMax = dimensionBehaviour2;
                    CheckResult.setMax setmax = this.onSessionReady;
                    if (constraintWidget.areNotificationsEnabled == 8) {
                        i = 0;
                    } else {
                        i = constraintWidget.requestPostMessageChannelWithExtras;
                    }
                    setmax.IsOverlapping = i;
                    CheckResult.setMax setmax2 = this.onSessionReady;
                    if (constraintWidget.areNotificationsEnabled == 8) {
                        i2 = 0;
                    } else {
                        i2 = constraintWidget.postMessage;
                    }
                    setmax2.isInside = i2;
                    max.setMax(constraintWidget, this.onSessionReady);
                    constraintWidget.getMax(this.onSessionReady.toFloatRange);
                    constraintWidget.toFloatRange(this.onSessionReady.toIntRange);
                    int i4 = this.onSessionReady.equals;
                    constraintWidget.IPostMessageService$Stub = i4;
                    if (i4 <= 0) {
                        z = false;
                    }
                    constraintWidget.ICustomTabsCallback$Stub = z;
                }
            }
            i3++;
        }
    }

    /* access modifiers changed from: protected */
    public final void setMax(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.unregisterCallbackListener == null && this.requestPostMessageChannel != null) {
            this.unregisterCallbackListener = ((AnimRes) this.requestPostMessageChannel).setMax();
        }
        this.onSessionReady.getMin = dimensionBehaviour;
        this.onSessionReady.setMax = dimensionBehaviour2;
        this.onSessionReady.IsOverlapping = i;
        this.onSessionReady.isInside = i2;
        this.unregisterCallbackListener.setMax(constraintWidget, this.onSessionReady);
        constraintWidget.getMax(this.onSessionReady.toFloatRange);
        constraintWidget.toFloatRange(this.onSessionReady.toIntRange);
        constraintWidget.ICustomTabsCallback$Stub = this.onSessionReady.toDoubleRange;
        int i3 = this.onSessionReady.equals;
        constraintWidget.IPostMessageService$Stub = i3;
        constraintWidget.ICustomTabsCallback$Stub = i3 > 0;
    }

    public final void IsOverlapping() {
        for (int i = 0; i < this.onSessionDestroyed; i++) {
            ConstraintWidget constraintWidget = this.onPlaybackStateChanged[i];
            if (constraintWidget != null) {
                constraintWidget.toDoubleRange();
            }
        }
    }
}
