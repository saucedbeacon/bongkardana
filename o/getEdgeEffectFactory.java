package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.markers.AutoFocusTrigger;
import o.calculateDyToMakeVisible;

public final class getEdgeEffectFactory implements ensureBottomGlow {
    @VisibleForTesting
    View getMax;
    @VisibleForTesting
    View getMin;

    @Nullable
    public final View setMin(@NonNull Context context, @NonNull ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(calculateDyToMakeVisible.setMin.cameraview_layout_focus_marker, viewGroup, false);
        this.getMax = inflate.findViewById(calculateDyToMakeVisible.length.setMax);
        this.getMin = inflate.findViewById(calculateDyToMakeVisible.length.getMin);
        return inflate;
    }

    public final void getMin(@NonNull AutoFocusTrigger autoFocusTrigger) {
        if (autoFocusTrigger != AutoFocusTrigger.METHOD) {
            this.getMax.clearAnimation();
            this.getMin.clearAnimation();
            this.getMax.setScaleX(1.36f);
            this.getMax.setScaleY(1.36f);
            this.getMax.setAlpha(1.0f);
            this.getMin.setScaleX(0.0f);
            this.getMin.setScaleY(0.0f);
            this.getMin.setAlpha(1.0f);
            setMin(this.getMax, 1.0f, 1.0f, 300, 0, (Animator.AnimatorListener) null);
            setMin(this.getMin, 1.0f, 1.0f, 300, 0, (Animator.AnimatorListener) null);
        }
    }

    public final void getMax(@NonNull AutoFocusTrigger autoFocusTrigger, boolean z) {
        if (autoFocusTrigger != AutoFocusTrigger.METHOD) {
            if (z) {
                setMin(this.getMax, 1.0f, 0.0f, 500, 0, (Animator.AnimatorListener) null);
                setMin(this.getMin, 1.0f, 0.0f, 500, 0, (Animator.AnimatorListener) null);
                return;
            }
            setMin(this.getMin, 0.0f, 0.0f, 500, 0, (Animator.AnimatorListener) null);
            setMin(this.getMax, 1.36f, 1.0f, 500, 0, new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    getEdgeEffectFactory.setMin(getEdgeEffectFactory.this.getMax, 1.36f, 0.0f, 200, 1000, (Animator.AnimatorListener) null);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static void setMin(@NonNull View view, float f, float f2, long j, long j2, @Nullable Animator.AnimatorListener animatorListener) {
        view.animate().scaleX(f).scaleY(f).alpha(f2).setDuration(j).setStartDelay(j2).setListener(animatorListener).start();
    }
}
