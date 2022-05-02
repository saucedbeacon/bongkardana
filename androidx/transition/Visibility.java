package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.NonNull;
import o.dismissPopups;
import o.hasIcon;
import o.onStartNestedScroll;
import o.setActionBarHideOffset;
import o.setMenu;

public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};
    private int mMode = 3;

    @SuppressLint({"UniqueConstants"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public Animator onAppear(ViewGroup viewGroup, View view, hasIcon hasicon, hasIcon hasicon2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, hasIcon hasicon, hasIcon hasicon2) {
        return null;
    }

    static class setMax {
        ViewGroup IsOverlapping;
        boolean getMax;
        int getMin;
        boolean length;
        ViewGroup setMax;
        int setMin;

        setMax() {
        }
    }

    public Visibility() {
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setActionBarHideOffset.setMin);
        int i = NonNull.setMin((XmlResourceParser) attributeSet, "transitionVisibilityMode") ? obtainStyledAttributes.getInt(0, 0) : 0;
        obtainStyledAttributes.recycle();
        if (i != 0) {
            setMode(i);
        }
    }

    public void setMode(int i) {
        if ((i & -4) == 0) {
            this.mMode = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public int getMode() {
        return this.mMode;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    private void captureValues(hasIcon hasicon) {
        hasicon.setMax.put(PROPNAME_VISIBILITY, Integer.valueOf(hasicon.setMin.getVisibility()));
        hasicon.setMax.put(PROPNAME_PARENT, hasicon.setMin.getParent());
        int[] iArr = new int[2];
        hasicon.setMin.getLocationOnScreen(iArr);
        hasicon.setMax.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    public void captureStartValues(@androidx.annotation.NonNull hasIcon hasicon) {
        captureValues(hasicon);
    }

    public void captureEndValues(@androidx.annotation.NonNull hasIcon hasicon) {
        captureValues(hasicon);
    }

    public boolean isVisible(hasIcon hasicon) {
        if (hasicon == null) {
            return false;
        }
        int intValue = ((Integer) hasicon.setMax.get(PROPNAME_VISIBILITY)).intValue();
        View view = (View) hasicon.setMax.get(PROPNAME_PARENT);
        if (intValue != 0 || view == null) {
            return false;
        }
        return true;
    }

    private setMax getVisibilityChangeInfo(hasIcon hasicon, hasIcon hasicon2) {
        setMax setmax = new setMax();
        setmax.length = false;
        setmax.getMax = false;
        if (hasicon == null || !hasicon.setMax.containsKey(PROPNAME_VISIBILITY)) {
            setmax.setMin = -1;
            setmax.setMax = null;
        } else {
            setmax.setMin = ((Integer) hasicon.setMax.get(PROPNAME_VISIBILITY)).intValue();
            setmax.setMax = (ViewGroup) hasicon.setMax.get(PROPNAME_PARENT);
        }
        if (hasicon2 == null || !hasicon2.setMax.containsKey(PROPNAME_VISIBILITY)) {
            setmax.getMin = -1;
            setmax.IsOverlapping = null;
        } else {
            setmax.getMin = ((Integer) hasicon2.setMax.get(PROPNAME_VISIBILITY)).intValue();
            setmax.IsOverlapping = (ViewGroup) hasicon2.setMax.get(PROPNAME_PARENT);
        }
        if (hasicon == null || hasicon2 == null) {
            if (hasicon == null && setmax.getMin == 0) {
                setmax.getMax = true;
                setmax.length = true;
            } else if (hasicon2 == null && setmax.setMin == 0) {
                setmax.getMax = false;
                setmax.length = true;
            }
        } else if (setmax.setMin == setmax.getMin && setmax.setMax == setmax.IsOverlapping) {
            return setmax;
        } else {
            if (setmax.setMin != setmax.getMin) {
                if (setmax.setMin == 0) {
                    setmax.getMax = false;
                    setmax.length = true;
                } else if (setmax.getMin == 0) {
                    setmax.getMax = true;
                    setmax.length = true;
                }
            } else if (setmax.IsOverlapping == null) {
                setmax.getMax = false;
                setmax.length = true;
            } else if (setmax.setMax == null) {
                setmax.getMax = true;
                setmax.length = true;
            }
        }
        return setmax;
    }

    @Nullable
    public Animator createAnimator(@androidx.annotation.NonNull ViewGroup viewGroup, @Nullable hasIcon hasicon, @Nullable hasIcon hasicon2) {
        setMax visibilityChangeInfo = getVisibilityChangeInfo(hasicon, hasicon2);
        if (!visibilityChangeInfo.length) {
            return null;
        }
        if (visibilityChangeInfo.setMax == null && visibilityChangeInfo.IsOverlapping == null) {
            return null;
        }
        if (visibilityChangeInfo.getMax) {
            return onAppear(viewGroup, hasicon, visibilityChangeInfo.setMin, hasicon2, visibilityChangeInfo.getMin);
        }
        return onDisappear(viewGroup, hasicon, visibilityChangeInfo.setMin, hasicon2, visibilityChangeInfo.getMin);
    }

    public Animator onAppear(ViewGroup viewGroup, hasIcon hasicon, int i, hasIcon hasicon2, int i2) {
        if ((this.mMode & 1) != 1 || hasicon2 == null) {
            return null;
        }
        if (hasicon == null) {
            View view = (View) hasicon2.setMin.getParent();
            if (getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).length) {
                return null;
            }
        }
        return onAppear(viewGroup, hasicon2.setMin, hasicon, hasicon2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.mCanRemoveViews != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator onDisappear(final android.view.ViewGroup r11, o.hasIcon r12, int r13, o.hasIcon r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.mMode
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.setMin
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.setMin
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = o.onNestedPreFling.setMin.setMin
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = 1
            goto L_0x0089
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x003b
        L_0x0032:
            r3 = r2
            r6 = 0
            r2 = r1
            goto L_0x003e
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r3 = r1
            r6 = 0
            goto L_0x003e
        L_0x003b:
            r2 = r1
            r3 = r2
            r6 = 1
        L_0x003e:
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0081
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            o.hasIcon r7 = r10.getTransitionValues(r6, r5)
            o.hasIcon r8 = r10.getMatchedTransitionValues(r6, r5)
            androidx.transition.Visibility$setMax r7 = r10.getVisibilityChangeInfo(r7, r8)
            boolean r7 = r7.length
            if (r7 != 0) goto L_0x006a
            android.view.View r2 = o.setHideOnContentScrollEnabled.getMin(r11, r13, r6)
            goto L_0x0085
        L_0x006a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0085
            r6 = -1
            if (r7 == r6) goto L_0x0085
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0085
            boolean r6 = r10.mCanRemoveViews
            if (r6 == 0) goto L_0x0085
        L_0x0081:
            r2 = r3
            r6 = 0
            r3 = r13
            goto L_0x0089
        L_0x0085:
            r6 = 0
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0089:
            if (r3 == 0) goto L_0x00db
            if (r6 != 0) goto L_0x00bd
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.setMax
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            o.hasLogo r15 = o.setMenu.length(r11)
            r15.setMax(r3)
        L_0x00bd:
            android.animation.Animator r12 = r10.onDisappear(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00da
            if (r12 != 0) goto L_0x00cd
            o.hasLogo r11 = o.setMenu.length(r11)
            r11.getMin(r3)
            goto L_0x00da
        L_0x00cd:
            int r14 = o.onNestedPreFling.setMin.setMin
            r13.setTag(r14, r3)
            androidx.transition.Visibility$1 r14 = new androidx.transition.Visibility$1
            r14.<init>(r11, r3, r13)
            r10.addListener(r14)
        L_0x00da:
            return r12
        L_0x00db:
            if (r2 == 0) goto L_0x0103
            int r13 = r2.getVisibility()
            o.dismissPopups.length(r2, r4)
            android.animation.Animator r11 = r10.onDisappear(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00ff
            androidx.transition.Visibility$length r12 = new androidx.transition.Visibility$length
            r12.<init>(r2, r15)
            r11.addListener(r12)
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 19
            if (r13 < r14) goto L_0x00fb
            r11.addPauseListener(r12)
        L_0x00fb:
            r10.addListener(r12)
            goto L_0x0102
        L_0x00ff:
            o.dismissPopups.length(r2, r13)
        L_0x0102:
            return r11
        L_0x0103:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.onDisappear(android.view.ViewGroup, o.hasIcon, int, o.hasIcon, int):android.animation.Animator");
    }

    public boolean isTransitionRequired(hasIcon hasicon, hasIcon hasicon2) {
        if (hasicon == null && hasicon2 == null) {
            return false;
        }
        if (hasicon != null && hasicon2 != null && hasicon2.setMax.containsKey(PROPNAME_VISIBILITY) != hasicon.setMax.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        setMax visibilityChangeInfo = getVisibilityChangeInfo(hasicon, hasicon2);
        if (!visibilityChangeInfo.length || (visibilityChangeInfo.setMin != 0 && visibilityChangeInfo.getMin != 0)) {
            return false;
        }
        return true;
    }

    static class length extends AnimatorListenerAdapter implements Transition.getMax, onStartNestedScroll.getMin {
        private final int getMax;
        private final ViewGroup getMin;
        private final boolean length;
        boolean setMax = false;
        private final View setMin;
        private boolean toIntRange;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onTransitionCancel(@androidx.annotation.NonNull Transition transition) {
        }

        public final void onTransitionStart(@androidx.annotation.NonNull Transition transition) {
        }

        length(View view, int i) {
            this.setMin = view;
            this.getMax = i;
            this.getMin = (ViewGroup) view.getParent();
            this.length = true;
            getMax(true);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.setMax) {
                dismissPopups.length(this.setMin, this.getMax);
            }
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.setMax) {
                dismissPopups.length(this.setMin, 0);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.setMax = true;
        }

        public final void onAnimationEnd(Animator animator) {
            setMax();
        }

        public final void onTransitionEnd(@androidx.annotation.NonNull Transition transition) {
            setMax();
            transition.removeListener(this);
        }

        public final void onTransitionPause(@androidx.annotation.NonNull Transition transition) {
            getMax(false);
        }

        public final void onTransitionResume(@androidx.annotation.NonNull Transition transition) {
            getMax(true);
        }

        private void setMax() {
            if (!this.setMax) {
                dismissPopups.length(this.setMin, this.getMax);
                ViewGroup viewGroup = this.getMin;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            getMax(false);
        }

        private void getMax(boolean z) {
            ViewGroup viewGroup;
            if (this.length && this.toIntRange != z && (viewGroup = this.getMin) != null) {
                this.toIntRange = z;
                setMenu.getMax(viewGroup, z);
            }
        }
    }
}
