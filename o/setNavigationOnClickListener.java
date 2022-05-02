package o;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.CallSuper;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getCollapseContentDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020\u0000H\u0017J\b\u0010%\u001a\u00020\u0000H\u0017J\b\u0010\r\u001a\u00020\u0000H\u0017J\b\u0010&\u001a\u00020\u0000H\u0017J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fH\u0017J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0012\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020)H\u0017J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0011¢\u0006\u0002\b+R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006,"}, d2 = {"Lcom/andrognito/flashbar/anim/BaseFlashAnimBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DEFAULT_ALPHA_END", "", "getDEFAULT_ALPHA_END", "()F", "DEFAULT_ALPHA_START", "getDEFAULT_ALPHA_START", "DEFAULT_DURATION", "", "alpha", "", "getAlpha", "()Z", "setAlpha", "(Z)V", "duration", "getDuration", "()J", "setDuration", "(J)V", "interpolator", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "accelerate", "accelerateDecelerate", "decelerate", "millis", "id", "", "withView", "withView$flashbar_release", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public abstract class setNavigationOnClickListener {
    private boolean equals;
    @Nullable
    private View getMax;
    private long getMin;
    private final long length;
    private final float setMax = 1.0f;
    private final float setMin = 0.2f;
    @Nullable
    private Interpolator toFloatRange;
    private final Context toIntRange;

    public setNavigationOnClickListener(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        this.toIntRange = context;
        long integer = (long) context.getResources().getInteger(getCollapseContentDescription.setMin.getMax);
        this.length = integer;
        this.getMin = integer;
    }

    /* access modifiers changed from: protected */
    public final float getMin() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    public final float setMin() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final View setMax() {
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final long getMax() {
        return this.getMin;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Interpolator length() {
        return this.toFloatRange;
    }

    /* access modifiers changed from: protected */
    public final void setMax(@Nullable Interpolator interpolator) {
        this.toFloatRange = interpolator;
    }

    /* access modifiers changed from: protected */
    public final boolean toIntRange() {
        return this.equals;
    }

    @NotNull
    @CallSuper
    public setNavigationOnClickListener getMin(long j) {
        setNavigationOnClickListener setnavigationonclicklistener = this;
        if (setnavigationonclicklistener.getMin >= 0) {
            setnavigationonclicklistener.getMin = j;
            return setnavigationonclicklistener;
        }
        throw new IllegalArgumentException("Duration must not be negative".toString());
    }

    @NotNull
    @CallSuper
    public setNavigationOnClickListener toFloatRange() {
        setNavigationOnClickListener setnavigationonclicklistener = this;
        setnavigationonclicklistener.toFloatRange = new AccelerateDecelerateInterpolator();
        return setnavigationonclicklistener;
    }

    @NotNull
    @CallSuper
    public setNavigationOnClickListener IsOverlapping() {
        setNavigationOnClickListener setnavigationonclicklistener = this;
        setnavigationonclicklistener.equals = true;
        return setnavigationonclicklistener;
    }

    @NotNull
    @CallSuper
    public setNavigationOnClickListener getMin(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        setNavigationOnClickListener setnavigationonclicklistener = this;
        setnavigationonclicklistener.getMax = view;
        return setnavigationonclicklistener;
    }
}
