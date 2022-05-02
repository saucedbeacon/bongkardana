package o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0007J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0010¢\u0006\u0002\b\u001fR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnimIconBuilder;", "Lcom/andrognito/flashbar/anim/BaseFlashAnimBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DEFAULT_PULSE_END", "", "DEFAULT_PULSE_START", "pulse", "", "pulseEnd", "pulseStart", "accelerate", "accelerateDecelerate", "alpha", "build", "Lcom/andrognito/flashbar/anim/FlashAnim;", "build$flashbar_release", "decelerate", "duration", "millis", "", "interpolator", "Landroid/view/animation/Interpolator;", "id", "", "start", "end", "withView", "view", "Landroid/view/View;", "withView$flashbar_release", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class ensureMenu extends setNavigationOnClickListener {
    private float getMax;
    private float getMin;
    private boolean setMin;

    public final /* synthetic */ setNavigationOnClickListener getMin(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.getMin(view);
        return this;
    }

    @NotNull
    public final ensureMenu setMax(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.getMin(view);
        return this;
    }

    @NotNull
    public final setCollapseContentDescription equals() {
        if (setMax() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (this.setMin) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(setMax(), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{this.getMin, this.getMax}), PropertyValuesHolder.ofFloat("scaleY", new float[]{this.getMin, this.getMax})});
                Intrinsics.checkExpressionValueIsNotNull(ofPropertyValuesHolder, "scaleAnim");
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                linkedHashSet.add(ofPropertyValuesHolder);
            }
            if (toIntRange()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(setMax(), "alpha", new float[]{1.0f, 0.6f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alpha");
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                linkedHashSet.add(ofFloat);
            }
            animatorSet.playTogether(linkedHashSet);
            animatorSet.setDuration(getMax());
            animatorSet.setInterpolator(length());
            return new setCollapseContentDescription(animatorSet);
        }
        throw new IllegalArgumentException("Target view can not be null".toString());
    }

    public final /* bridge */ /* synthetic */ setNavigationOnClickListener getMin(long j) {
        super.getMin(j);
        return this;
    }

    public final /* bridge */ /* synthetic */ setNavigationOnClickListener toFloatRange() {
        super.toFloatRange();
        return this;
    }

    public final /* bridge */ /* synthetic */ setNavigationOnClickListener IsOverlapping() {
        super.IsOverlapping();
        return this;
    }
}
