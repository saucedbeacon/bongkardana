package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import o.setAlpha;

public final class isStateful {
    public static length length(@NonNull Context context, @NonNull Fragment fragment, boolean z, boolean z2) {
        int i;
        int i2;
        int nextTransition = fragment.getNextTransition();
        if (z2) {
            if (z) {
                i = fragment.getPopEnterAnim();
            } else {
                i = fragment.getPopExitAnim();
            }
        } else if (z) {
            i = fragment.getEnterAnim();
        } else {
            i = fragment.getExitAnim();
        }
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        if (!(fragment.mContainer == null || fragment.mContainer.getTag(setAlpha.getMax.setMax) == null)) {
            fragment.mContainer.setTag(setAlpha.getMax.setMax, (Object) null);
        }
        if (fragment.mContainer != null && fragment.mContainer.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, i);
        if (onCreateAnimation != null) {
            return new length(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, i);
        if (onCreateAnimator != null) {
            return new length(onCreateAnimator);
        }
        if (i == 0 && nextTransition != 0) {
            if (nextTransition != 4097) {
                if (nextTransition == 4099) {
                    i2 = z ? setAlpha.length.getMax : setAlpha.length.setMax;
                } else if (nextTransition != 8194) {
                    i = -1;
                } else {
                    i2 = z ? setAlpha.length.length : setAlpha.length.getMin;
                }
            } else if (z) {
                i2 = setAlpha.length.setMin;
            } else {
                i2 = setAlpha.length.equals;
            }
            i = i2;
        }
        if (i != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
                    if (loadAnimation != null) {
                        return new length(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (loadAnimator != null) {
                        return new length(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                        if (loadAnimation2 != null) {
                            return new length(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    public static class length {
        public final Animation length;
        public final Animator setMin;

        length(Animation animation) {
            this.length = animation;
            this.setMin = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        length(Animator animator) {
            this.length = null;
            this.setMin = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class getMax extends AnimationSet implements Runnable {
        private boolean getMax;
        private final View getMin;
        private final ViewGroup length;
        private boolean setMax = true;
        private boolean setMin;

        public getMax(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.length = viewGroup;
            this.getMin = view;
            addAnimation(animation);
            this.length.post(this);
        }

        public final boolean getTransformation(long j, @NonNull Transformation transformation) {
            this.setMax = true;
            if (!this.setMin) {
                if (!super.getTransformation(j, transformation)) {
                    this.setMin = true;
                    getMenuInflater.getMin(this.length, this);
                }
                return true;
            } else if (!this.getMax) {
                return true;
            } else {
                return false;
            }
        }

        public final boolean getTransformation(long j, @NonNull Transformation transformation, float f) {
            this.setMax = true;
            if (!this.setMin) {
                if (!super.getTransformation(j, transformation, f)) {
                    this.setMin = true;
                    getMenuInflater.getMin(this.length, this);
                }
                return true;
            } else if (!this.getMax) {
                return true;
            } else {
                return false;
            }
        }

        public final void run() {
            if (this.setMin || !this.setMax) {
                this.length.endViewTransition(this.getMin);
                this.getMax = true;
                return;
            }
            this.setMax = false;
            this.length.post(this);
        }
    }
}
