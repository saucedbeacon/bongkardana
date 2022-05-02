package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnim;", "", "compositeAnim", "Landroid/animation/AnimatorSet;", "(Landroid/animation/AnimatorSet;)V", "start", "", "listener", "Lcom/andrognito/flashbar/anim/FlashAnim$InternalAnimListener;", "start$flashbar_release", "Companion", "InternalAnimListener", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class setCollapseContentDescription {
    public static final getMin setMin = new getMin((byte) 0);
    private final AnimatorSet length;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnim$InternalAnimListener;", "", "onStart", "", "onStop", "onUpdate", "progress", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface setMin {
        void getMin();

        void setMax();

        void setMin();
    }

    public setCollapseContentDescription(@NotNull AnimatorSet animatorSet) {
        Intrinsics.checkParameterIsNotNull(animatorSet, "compositeAnim");
        this.length = animatorSet;
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/andrognito/flashbar/anim/FlashAnim$Companion;", "", "()V", "with", "Lcom/andrognito/flashbar/anim/FlashAnimRetriever;", "context", "Landroid/content/Context;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void setMax(@Nullable setMin setmin) {
        if (setmin != null) {
            Animator animator = this.length.getChildAnimations().get(0);
            if (animator != null) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                objectAnimator.addListener(new length(setmin, objectAnimator));
                objectAnimator.addUpdateListener(new getMax(setmin));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.animation.ObjectAnimator");
            }
        }
        this.length.start();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/andrognito/flashbar/anim/FlashAnim$start$1", "Landroid/animation/Animator$AnimatorListener;", "(Lcom/andrognito/flashbar/anim/FlashAnim$InternalAnimListener;Landroid/animation/ObjectAnimator;)V", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class length implements Animator.AnimatorListener {
        final /* synthetic */ setMin getMax;
        final /* synthetic */ ObjectAnimator length;

        public final void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
        }

        public final void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
        }

        length(setMin setmin, ObjectAnimator objectAnimator) {
            this.getMax = setmin;
            this.length = objectAnimator;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
            this.getMax.setMax();
            this.length.removeAllListeners();
            this.length.removeAllUpdateListeners();
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animator");
            this.getMax.setMin();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    static final class getMax implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ setMin setMax;

        getMax(setMin setmin) {
            this.setMax = setmin;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            setMin setmin = this.setMax;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            valueAnimator.getAnimatedFraction();
            setmin.getMin();
        }
    }

    @JvmStatic
    @NotNull
    public static final ensureMenuView setMin(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        return new ensureMenuView(context);
    }
}
