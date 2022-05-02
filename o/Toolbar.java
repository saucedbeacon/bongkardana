package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class Toolbar extends ValueAnimator {
    private final Set<Animator.AnimatorListener> length = new CopyOnWriteArraySet();
    private final Set<ValueAnimator.AnimatorUpdateListener> setMin = new CopyOnWriteArraySet();

    public interface LayoutParams {
        public static final LayoutParams length = new LayoutParams() {
            public final List<InetAddress> setMax(String str) {
                if (str != null) {
                    return Arrays.asList(InetAddress.getAllByName(str));
                }
                throw new UnknownHostException("hostname == null");
            }
        };

        List<InetAddress> setMax(String str);
    }

    public interface SavedState extends Cloneable {
        getPreventCornerOverlap setMax();
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.setMin.add(animatorUpdateListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.setMin.remove(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.setMin.clear();
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.length.add(animatorListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.length.remove(animatorListener);
    }

    public void removeAllListeners() {
        this.length.clear();
    }

    /* access modifiers changed from: package-private */
    public final void getMax(boolean z) {
        for (Animator.AnimatorListener next : this.length) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax() {
        for (Animator.AnimatorListener onAnimationRepeat : this.length) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void length(boolean z) {
        for (Animator.AnimatorListener next : this.length) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax() {
        for (Animator.AnimatorListener onAnimationCancel : this.length) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public final void length() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.setMin) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }
}
