package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class invalidateOptionsMenu {
    int getMax = -1;
    private WeakReference<View> getMin;
    Runnable setMax = null;
    Runnable setMin = null;

    public invalidateOptionsMenu(View view) {
        this.getMin = new WeakReference<>(view);
    }

    static class setMax implements supportInvalidateOptionsMenu {
        invalidateOptionsMenu getMax;
        boolean length;

        setMax(invalidateOptionsMenu invalidateoptionsmenu) {
            this.getMax = invalidateoptionsmenu;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.supportInvalidateOptionsMenu} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void setMin(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.length = r0
                o.invalidateOptionsMenu r0 = r3.getMax
                int r0 = r0.getMax
                r1 = 0
                if (r0 < 0) goto L_0x000e
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000e:
                o.invalidateOptionsMenu r0 = r3.getMax
                java.lang.Runnable r0 = r0.setMax
                if (r0 == 0) goto L_0x001f
                o.invalidateOptionsMenu r0 = r3.getMax
                java.lang.Runnable r0 = r0.setMax
                o.invalidateOptionsMenu r2 = r3.getMax
                r2.setMax = r1
                r0.run()
            L_0x001f:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof o.supportInvalidateOptionsMenu
                if (r2 == 0) goto L_0x002c
                r1 = r0
                o.supportInvalidateOptionsMenu r1 = (o.supportInvalidateOptionsMenu) r1
            L_0x002c:
                if (r1 == 0) goto L_0x0031
                r1.setMin(r4)
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.invalidateOptionsMenu.setMax.setMin(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.supportInvalidateOptionsMenu} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void length(android.view.View r4) {
            /*
                r3 = this;
                o.invalidateOptionsMenu r0 = r3.getMax
                int r0 = r0.getMax
                r1 = 0
                if (r0 < 0) goto L_0x0013
                o.invalidateOptionsMenu r0 = r3.getMax
                int r0 = r0.getMax
                r4.setLayerType(r0, r1)
                o.invalidateOptionsMenu r0 = r3.getMax
                r2 = -1
                r0.getMax = r2
            L_0x0013:
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 16
                if (r0 >= r2) goto L_0x001d
                boolean r0 = r3.length
                if (r0 != 0) goto L_0x0043
            L_0x001d:
                o.invalidateOptionsMenu r0 = r3.getMax
                java.lang.Runnable r0 = r0.setMin
                if (r0 == 0) goto L_0x002e
                o.invalidateOptionsMenu r0 = r3.getMax
                java.lang.Runnable r0 = r0.setMin
                o.invalidateOptionsMenu r2 = r3.getMax
                r2.setMin = r1
                r0.run()
            L_0x002e:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof o.supportInvalidateOptionsMenu
                if (r2 == 0) goto L_0x003b
                r1 = r0
                o.supportInvalidateOptionsMenu r1 = (o.supportInvalidateOptionsMenu) r1
            L_0x003b:
                if (r1 == 0) goto L_0x0040
                r1.length(r4)
            L_0x0040:
                r4 = 1
                r3.length = r4
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.invalidateOptionsMenu.setMax.length(android.view.View):void");
        }

        public void getMin(View view) {
            Object tag = view.getTag(2113929216);
            supportInvalidateOptionsMenu supportinvalidateoptionsmenu = tag instanceof supportInvalidateOptionsMenu ? (supportInvalidateOptionsMenu) tag : null;
            if (supportinvalidateoptionsmenu != null) {
                supportinvalidateoptionsmenu.getMin(view);
            }
        }
    }

    public final invalidateOptionsMenu getMin(long j) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final invalidateOptionsMenu getMin(float f) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final invalidateOptionsMenu setMin(float f) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public final invalidateOptionsMenu getMax(float f) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final long getMin() {
        View view = this.getMin.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public final invalidateOptionsMenu setMin(Interpolator interpolator) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final invalidateOptionsMenu setMin(long j) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final invalidateOptionsMenu setMax(float f) {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public final void getMax() {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void setMax() {
        View view = this.getMin.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final invalidateOptionsMenu length(supportInvalidateOptionsMenu supportinvalidateoptionsmenu) {
        View view = this.getMin.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                setMax(view, supportinvalidateoptionsmenu);
            } else {
                view.setTag(2113929216, supportinvalidateoptionsmenu);
                setMax(view, new setMax(this));
            }
        }
        return this;
    }

    private void setMax(final View view, final supportInvalidateOptionsMenu supportinvalidateoptionsmenu) {
        if (supportinvalidateoptionsmenu != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    supportinvalidateoptionsmenu.getMin(view);
                }

                public void onAnimationEnd(Animator animator) {
                    supportinvalidateoptionsmenu.length(view);
                }

                public void onAnimationStart(Animator animator) {
                    supportinvalidateoptionsmenu.setMin(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final invalidateOptionsMenu setMax(final supportRequestWindowFeature supportrequestwindowfeature) {
        final View view = this.getMin.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            AnonymousClass1 r1 = null;
            if (supportrequestwindowfeature != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        supportrequestwindowfeature.setMin();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }
}
