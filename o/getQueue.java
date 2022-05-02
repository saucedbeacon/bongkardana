package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class getQueue implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private boolean IsOverlapping;
    private final int[] equals = new int[2];
    private Runnable getMax;
    private final int getMin;
    private final float length;
    private final int setMax;
    final View setMin;
    private Runnable toFloatRange;
    private int toIntRange;

    public abstract onRepeatModeChanged length();

    public void onViewAttachedToWindow(View view) {
    }

    public getQueue(View view) {
        this.setMin = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.length = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.setMax = tapTimeout;
        this.getMin = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.IsOverlapping;
        if (z2) {
            z = setMax(motionEvent) || !setMin();
        } else {
            z = length(motionEvent) && getMax();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.setMin.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.IsOverlapping = z;
        return z || z2;
    }

    public void onViewDetachedFromWindow(View view) {
        this.IsOverlapping = false;
        this.toIntRange = -1;
        Runnable runnable = this.getMax;
        if (runnable != null) {
            this.setMin.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean getMax() {
        onRepeatModeChanged length2 = length();
        if (length2 == null || length2.getMin()) {
            return true;
        }
        length2.b_();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setMin() {
        onRepeatModeChanged length2 = length();
        if (length2 == null || !length2.getMin()) {
            return true;
        }
        length2.length();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean length(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.setMin
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.toIntRange
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.length
            boolean r6 = getMax(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.setMax()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.setMax()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.toIntRange = r6
            java.lang.Runnable r6 = r5.getMax
            if (r6 != 0) goto L_0x0052
            o.getQueue$setMax r6 = new o.getQueue$setMax
            r6.<init>()
            r5.getMax = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.getMax
            int r1 = r5.setMax
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.toFloatRange
            if (r6 != 0) goto L_0x0065
            o.getQueue$setMin r6 = new o.getQueue$setMin
            r6.<init>()
            r5.toFloatRange = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.toFloatRange
            int r1 = r5.getMin
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getQueue.length(android.view.MotionEvent):boolean");
    }

    private void setMax() {
        Runnable runnable = this.toFloatRange;
        if (runnable != null) {
            this.setMin.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.getMax;
        if (runnable2 != null) {
            this.setMin.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: package-private */
    public void getMin() {
        setMax();
        View view = this.setMin;
        if (view.isEnabled() && !view.isLongClickable() && getMax()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.IsOverlapping = true;
        }
    }

    private boolean setMax(MotionEvent motionEvent) {
        setVolumeTo setvolumeto;
        View view = this.setMin;
        onRepeatModeChanged length2 = length();
        if (length2 != null && length2.getMin() && (setvolumeto = (setVolumeTo) length2.c_()) != null && setvolumeto.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            setMax(view, obtainNoHistory);
            length(setvolumeto, obtainNoHistory);
            boolean onForwardedEvent = setvolumeto.onForwardedEvent(obtainNoHistory, this.toIntRange);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (!onForwardedEvent || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean getMax(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean length(View view, MotionEvent motionEvent) {
        int[] iArr = this.equals;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    private boolean setMax(View view, MotionEvent motionEvent) {
        int[] iArr = this.equals;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    class setMax implements Runnable {
        setMax() {
        }

        public final void run() {
            ViewParent parent = getQueue.this.setMin.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class setMin implements Runnable {
        setMin() {
        }

        public final void run() {
            getQueue.this.getMin();
        }
    }
}
