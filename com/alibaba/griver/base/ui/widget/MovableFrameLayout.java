package com.alibaba.griver.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class MovableFrameLayout extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f9178a;
    private boolean b;
    private Helper c;
    /* access modifiers changed from: private */
    public float d;

    public MovableFrameLayout(Context context) {
        super(context);
        a();
    }

    public MovableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MovableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public void setMovable(boolean z) {
        this.f9178a = z;
        if (!z) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
    }

    public void setFullScreen(boolean z) {
        this.b = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f9178a) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            int action = motionEvent.getAction();
            if (action == 0) {
                requestDisallowInterceptTouchEvent(true);
            } else if (action == 1 || action == 3 || action == 4) {
                requestDisallowInterceptTouchEvent(false);
            }
        }
        if (!this.f9178a || !this.c.onTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    private void a() {
        this.c = new Helper();
        this.d = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f9178a = true;
    }

    class Helper {

        /* renamed from: a  reason: collision with root package name */
        private float f9179a;
        private float b;
        private boolean c;

        private Helper() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            if (r0 != 4) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                com.alibaba.griver.base.ui.widget.MovableFrameLayout r0 = com.alibaba.griver.base.ui.widget.MovableFrameLayout.this
                boolean r0 = r0.f9178a
                r1 = 1
                if (r0 == 0) goto L_0x0076
                int r0 = r7.getAction()
                float r2 = r7.getRawX()
                float r7 = r7.getRawY()
                r3 = 0
                if (r0 == 0) goto L_0x006c
                if (r0 == r1) goto L_0x005a
                r4 = 2
                if (r0 == r4) goto L_0x0024
                r7 = 3
                if (r0 == r7) goto L_0x005a
                r7 = 4
                if (r0 == r7) goto L_0x005a
                goto L_0x0076
            L_0x0024:
                float r0 = r6.f9179a
                float r0 = r2 - r0
                int r0 = (int) r0
                float r3 = r6.b
                float r3 = r7 - r3
                int r3 = (int) r3
                boolean r4 = r6.c
                if (r4 == 0) goto L_0x0036
                r6.a(r2, r7, r0, r3)
                goto L_0x0076
            L_0x0036:
                int r4 = java.lang.Math.abs(r0)
                float r4 = (float) r4
                com.alibaba.griver.base.ui.widget.MovableFrameLayout r5 = com.alibaba.griver.base.ui.widget.MovableFrameLayout.this
                float r5 = r5.d
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x0054
                int r4 = java.lang.Math.abs(r3)
                float r4 = (float) r4
                com.alibaba.griver.base.ui.widget.MovableFrameLayout r5 = com.alibaba.griver.base.ui.widget.MovableFrameLayout.this
                float r5 = r5.d
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 < 0) goto L_0x0076
            L_0x0054:
                r6.a(r2, r7, r0, r3)
                r6.c = r1
                goto L_0x0076
            L_0x005a:
                boolean r7 = r6.c
                if (r7 == 0) goto L_0x006b
                r7 = 0
                r6.f9179a = r7
                r6.b = r7
                r6.c = r3
                com.alibaba.griver.base.ui.widget.MovableFrameLayout r7 = com.alibaba.griver.base.ui.widget.MovableFrameLayout.this
                r7.requestDisallowInterceptTouchEvent(r3)
                goto L_0x0076
            L_0x006b:
                return r3
            L_0x006c:
                com.alibaba.griver.base.ui.widget.MovableFrameLayout r0 = com.alibaba.griver.base.ui.widget.MovableFrameLayout.this
                r0.requestDisallowInterceptTouchEvent(r1)
                r6.f9179a = r2
                r6.b = r7
                return r3
            L_0x0076:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.ui.widget.MovableFrameLayout.Helper.onTouchEvent(android.view.MotionEvent):boolean");
        }

        private void a(float f, float f2, int i, int i2) {
            this.f9179a = f;
            this.b = f2;
            a(i, i2);
        }

        private void a(int i, int i2) {
            float translationX = MovableFrameLayout.this.getTranslationX() + ((float) i);
            float translationY = MovableFrameLayout.this.getTranslationY() + ((float) i2);
            if (((float) MovableFrameLayout.this.getLeft()) + translationX >= 0.0f && (!(MovableFrameLayout.this.getParent() instanceof View) || ((float) MovableFrameLayout.this.getRight()) + translationX <= ((float) ((View) MovableFrameLayout.this.getParent()).getWidth()))) {
                MovableFrameLayout.this.setTranslationX(translationX);
            }
            if (((float) MovableFrameLayout.this.getTop()) + translationY < 0.0f) {
                return;
            }
            if (!(MovableFrameLayout.this.getParent() instanceof View) || ((float) MovableFrameLayout.this.getBottom()) + translationY <= ((float) ((View) MovableFrameLayout.this.getParent()).getHeight())) {
                MovableFrameLayout.this.setTranslationY(translationY);
            }
        }
    }
}
