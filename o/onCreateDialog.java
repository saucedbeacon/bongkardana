package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public class onCreateDialog {
    private static final Interpolator onNavigationEvent = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private int[] FastBitmap$CoordinateSystem;
    private OverScroller Grayscale$Algorithm;
    private final Runnable ICustomTabsCallback = new Runnable() {
        public final void run() {
            onCreateDialog.this.getMin(0);
        }
    };
    private float[] IsOverlapping;
    private boolean Mean$Arithmetic;
    private final ViewGroup b;
    private float[] equals;
    public int getMax;
    public int getMin;
    private int[] hashCode;
    private VelocityTracker invoke;
    private final setMin invokeSuspend;
    private float[] isInside;
    public int length;
    public float setMax;
    public int setMin;
    private int[] toDoubleRange;
    private int toFloatRange = -1;
    public View toIntRange;
    private int toString;
    private float valueOf;
    private float[] values;

    public static abstract class setMin {
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return 0;
        }

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(@NonNull View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, @Px int i3, @Px int i4) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i);
    }

    public static onCreateDialog getMin(@NonNull ViewGroup viewGroup, @NonNull setMin setmin) {
        return new onCreateDialog(viewGroup.getContext(), viewGroup, setmin);
    }

    private onCreateDialog(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull setMin setmin) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (setmin != null) {
            this.b = viewGroup;
            this.invokeSuspend = setmin;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.getMin = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.length = viewConfiguration.getScaledTouchSlop();
            this.valueOf = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.setMax = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.Grayscale$Algorithm = new OverScroller(context, onNavigationEvent);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void getMin(@NonNull View view, int i) {
        if (view.getParent() == this.b) {
            this.toIntRange = view;
            this.toFloatRange = i;
            this.invokeSuspend.onViewCaptured(view, i);
            getMin(1);
            return;
        }
        StringBuilder sb = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.b);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setMin() {
        this.toFloatRange = -1;
        float[] fArr = this.isInside;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.IsOverlapping, 0.0f);
            Arrays.fill(this.equals, 0.0f);
            Arrays.fill(this.values, 0.0f);
            Arrays.fill(this.hashCode, 0);
            Arrays.fill(this.FastBitmap$CoordinateSystem, 0);
            Arrays.fill(this.toDoubleRange, 0);
            this.toString = 0;
        }
        VelocityTracker velocityTracker = this.invoke;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.invoke = null;
        }
    }

    public final void setMax() {
        setMin();
        if (this.setMin == 2) {
            int currX = this.Grayscale$Algorithm.getCurrX();
            int currY = this.Grayscale$Algorithm.getCurrY();
            this.Grayscale$Algorithm.abortAnimation();
            int currX2 = this.Grayscale$Algorithm.getCurrX();
            int currY2 = this.Grayscale$Algorithm.getCurrY();
            this.invokeSuspend.onViewPositionChanged(this.toIntRange, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        getMin(0);
    }

    public final boolean setMax(@NonNull View view, int i, int i2) {
        this.toIntRange = view;
        this.toFloatRange = -1;
        boolean min = getMin(i, i2, 0, 0);
        if (!min && this.setMin == 0 && this.toIntRange != null) {
            this.toIntRange = null;
        }
        return min;
    }

    public final boolean getMax(int i, int i2) {
        if (this.Mean$Arithmetic) {
            return getMin(i, i2, (int) this.invoke.getXVelocity(this.toFloatRange), (int) this.invoke.getYVelocity(this.toFloatRange));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private boolean getMin(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.toIntRange.getLeft();
        int top = this.toIntRange.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.Grayscale$Algorithm.abortAnimation();
            getMin(0);
            return false;
        }
        View view = this.toIntRange;
        int i7 = (int) this.setMax;
        int i8 = (int) this.valueOf;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.setMax;
        int i10 = (int) this.valueOf;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i10) {
            i4 = i4 > 0 ? i10 : -i10;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i3 != 0) {
            f = (float) abs5;
            f2 = (float) i11;
        } else {
            f = (float) abs3;
            f2 = (float) i12;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f4 = (float) abs6;
            f3 = (float) i11;
        } else {
            f4 = (float) abs4;
            f3 = (float) i12;
        }
        this.Grayscale$Algorithm.startScroll(left, top, i5, i6, (int) ((((float) setMax(i5, i3, this.invokeSuspend.getViewHorizontalDragRange(view))) * f5) + (((float) setMax(i6, i4, this.invokeSuspend.getViewVerticalDragRange(view))) * (f4 / f3))));
        getMin(2);
        return true;
    }

    private int setMax(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.b.getWidth();
        float f = (float) (width / 2);
        float sin = f + (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    public final boolean getMin() {
        if (this.setMin == 2) {
            boolean computeScrollOffset = this.Grayscale$Algorithm.computeScrollOffset();
            int currX = this.Grayscale$Algorithm.getCurrX();
            int currY = this.Grayscale$Algorithm.getCurrY();
            int left = currX - this.toIntRange.getLeft();
            int top = currY - this.toIntRange.getTop();
            if (left != 0) {
                ViewCompat.toFloatRange(this.toIntRange, left);
            }
            if (top != 0) {
                ViewCompat.equals(this.toIntRange, top);
            }
            if (!(left == 0 && top == 0)) {
                this.invokeSuspend.onViewPositionChanged(this.toIntRange, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.Grayscale$Algorithm.getFinalX() && currY == this.Grayscale$Algorithm.getFinalY()) {
                this.Grayscale$Algorithm.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.b.post(this.ICustomTabsCallback);
            }
        }
        if (this.setMin == 2) {
            return true;
        }
        return false;
    }

    private void setMin(float f, float f2) {
        this.Mean$Arithmetic = true;
        this.invokeSuspend.onViewReleased(this.toIntRange, f, f2);
        this.Mean$Arithmetic = false;
        if (this.setMin == 1) {
            getMin(0);
        }
    }

    private void setMin(int i) {
        if (this.isInside != null && length(i)) {
            this.isInside[i] = 0.0f;
            this.IsOverlapping[i] = 0.0f;
            this.equals[i] = 0.0f;
            this.values[i] = 0.0f;
            this.hashCode[i] = 0;
            this.FastBitmap$CoordinateSystem[i] = 0;
            this.toDoubleRange[i] = 0;
            this.toString = ((1 << i) ^ -1) & this.toString;
        }
    }

    private void getMax(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (setMax(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.equals[pointerId] = x;
                this.values[pointerId] = y;
            }
        }
    }

    private boolean length(int i) {
        return ((1 << i) & this.toString) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(int i) {
        this.b.removeCallbacks(this.ICustomTabsCallback);
        if (this.setMin != i) {
            this.setMin = i;
            this.invokeSuspend.onViewDragStateChanged(i);
            if (this.setMin == 0) {
                this.toIntRange = null;
            }
        }
    }

    private boolean setMax(View view, int i) {
        if (view == this.toIntRange && this.toFloatRange == i) {
            return true;
        }
        if (view == null || !this.invokeSuspend.tryCaptureView(view, i)) {
            return false;
        }
        this.toFloatRange = i;
        getMin(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMax(@androidx.annotation.NonNull android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.setMin()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.invoke
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.invoke = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.invoke
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x00fe
            if (r2 == r6) goto L_0x00fa
            if (r2 == r4) goto L_0x0072
            r7 = 3
            if (r2 == r7) goto L_0x00fa
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0033
            goto L_0x012f
        L_0x0033:
            int r1 = r1.getPointerId(r3)
            r0.setMin(r1)
            goto L_0x012f
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.getMax((float) r7, (float) r1, (int) r2)
            int r3 = r0.setMin
            if (r3 != 0) goto L_0x0061
            int[] r1 = r0.hashCode
            r1 = r1[r2]
            int r3 = r0.getMax
            r4 = r1 & r3
            if (r4 == 0) goto L_0x012f
            o.onCreateDialog$setMin r4 = r0.invokeSuspend
            r1 = r1 & r3
            r4.onEdgeTouched(r1, r2)
            goto L_0x012f
        L_0x0061:
            if (r3 != r4) goto L_0x012f
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.setMax((int) r3, (int) r1)
            android.view.View r3 = r0.toIntRange
            if (r1 != r3) goto L_0x012f
            r0.setMax((android.view.View) r1, (int) r2)
            goto L_0x012f
        L_0x0072:
            float[] r2 = r0.isInside
            if (r2 == 0) goto L_0x012f
            float[] r2 = r0.IsOverlapping
            if (r2 == 0) goto L_0x012f
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007f:
            if (r3 >= r2) goto L_0x00f6
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.setMax((int) r4)
            if (r7 == 0) goto L_0x00f3
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.isInside
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.IsOverlapping
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.setMax((int) r7, (int) r8)
            if (r7 == 0) goto L_0x00af
            boolean r8 = r0.getMax((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00af
            r8 = 1
            goto L_0x00b0
        L_0x00af:
            r8 = 0
        L_0x00b0:
            if (r8 == 0) goto L_0x00e4
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            o.onCreateDialog$setMin r14 = r0.invokeSuspend
            int r12 = r14.clampViewPositionHorizontal(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            o.onCreateDialog$setMin r5 = r0.invokeSuspend
            int r5 = r5.clampViewPositionVertical(r7, r15, r14)
            o.onCreateDialog$setMin r14 = r0.invokeSuspend
            int r14 = r14.getViewHorizontalDragRange(r7)
            o.onCreateDialog$setMin r15 = r0.invokeSuspend
            int r15 = r15.getViewVerticalDragRange(r7)
            if (r14 == 0) goto L_0x00de
            if (r14 <= 0) goto L_0x00e4
            if (r12 != r11) goto L_0x00e4
        L_0x00de:
            if (r15 == 0) goto L_0x00f6
            if (r15 <= 0) goto L_0x00e4
            if (r5 == r13) goto L_0x00f6
        L_0x00e4:
            r0.setMin(r9, r10, r4)
            int r5 = r0.setMin
            if (r5 == r6) goto L_0x00f6
            if (r8 == 0) goto L_0x00f3
            boolean r4 = r0.setMax((android.view.View) r7, (int) r4)
            if (r4 != 0) goto L_0x00f6
        L_0x00f3:
            int r3 = r3 + 1
            goto L_0x007f
        L_0x00f6:
            r16.getMax((android.view.MotionEvent) r17)
            goto L_0x012f
        L_0x00fa:
            r16.setMin()
            goto L_0x012f
        L_0x00fe:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.getMax((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.setMax((int) r2, (int) r3)
            android.view.View r3 = r0.toIntRange
            if (r2 != r3) goto L_0x011f
            int r3 = r0.setMin
            if (r3 != r4) goto L_0x011f
            r0.setMax((android.view.View) r2, (int) r1)
        L_0x011f:
            int[] r2 = r0.hashCode
            r2 = r2[r1]
            int r3 = r0.getMax
            r4 = r2 & r3
            if (r4 == 0) goto L_0x012f
            o.onCreateDialog$setMin r4 = r0.invokeSuspend
            r2 = r2 & r3
            r4.onEdgeTouched(r2, r1)
        L_0x012f:
            int r1 = r0.setMin
            if (r1 != r6) goto L_0x0134
            return r6
        L_0x0134:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCreateDialog.setMax(android.view.MotionEvent):boolean");
    }

    public final void getMin(@NonNull MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            setMin();
        }
        if (this.invoke == null) {
            this.invoke = VelocityTracker.obtain();
        }
        this.invoke.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View max = setMax((int) x, (int) y);
            getMax(x, y, pointerId);
            setMax(max, pointerId);
            int i3 = this.hashCode[pointerId];
            int i4 = this.getMax;
            if ((i3 & i4) != 0) {
                this.invokeSuspend.onEdgeTouched(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.setMin == 1) {
                getMax();
            }
            setMin();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.setMin == 1) {
                    setMin(0.0f, 0.0f);
                }
                setMin();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                getMax(x2, y2, pointerId2);
                if (this.setMin == 0) {
                    setMax(setMax((int) x2, (int) y2), pointerId2);
                    int i5 = this.hashCode[pointerId2];
                    int i6 = this.getMax;
                    if ((i5 & i6) != 0) {
                        this.invokeSuspend.onEdgeTouched(i5 & i6, pointerId2);
                    }
                } else if (setMin((int) x2, (int) y2)) {
                    setMax(this.toIntRange, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.setMin == 1 && pointerId3 == this.toFloatRange) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.toFloatRange) {
                            View max2 = setMax((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.toIntRange;
                            if (max2 == view && setMax(view, pointerId4)) {
                                i = this.toFloatRange;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        getMax();
                    }
                }
                setMin(pointerId3);
            }
        } else if (this.setMin != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (setMax(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.isInside[pointerId5];
                    float f2 = y3 - this.IsOverlapping[pointerId5];
                    setMin(f, f2, pointerId5);
                    if (this.setMin == 1) {
                        break;
                    }
                    View max3 = setMax((int) x3, (int) y3);
                    if (getMax(max3, f, f2) && setMax(max3, pointerId5)) {
                        break;
                    }
                }
                i2++;
            }
            getMax(motionEvent);
        } else if (setMax(this.toFloatRange)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.toFloatRange);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.equals;
            int i7 = this.toFloatRange;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.values[i7]);
            int left = this.toIntRange.getLeft() + i8;
            int top = this.toIntRange.getTop() + i9;
            int left2 = this.toIntRange.getLeft();
            int top2 = this.toIntRange.getTop();
            if (i8 != 0) {
                left = this.invokeSuspend.clampViewPositionHorizontal(this.toIntRange, left, i8);
                ViewCompat.toFloatRange(this.toIntRange, left - left2);
            }
            int i10 = left;
            if (i9 != 0) {
                top = this.invokeSuspend.clampViewPositionVertical(this.toIntRange, top, i9);
                ViewCompat.equals(this.toIntRange, top - top2);
            }
            int i11 = top;
            if (!(i8 == 0 && i9 == 0)) {
                this.invokeSuspend.onViewPositionChanged(this.toIntRange, i10, i11, i10 - left2, i11 - top2);
            }
            getMax(motionEvent);
        }
    }

    private void setMin(float f, float f2, int i) {
        boolean length2 = length(f, f2, i, 1);
        if (length(f2, f, i, 4)) {
            length2 |= true;
        }
        if (length(f, f2, i, 2)) {
            length2 |= true;
        }
        if (length(f2, f, i, 8)) {
            length2 |= true;
        }
        if (length2) {
            int[] iArr = this.FastBitmap$CoordinateSystem;
            iArr[i] = iArr[i] | length2;
            this.invokeSuspend.onEdgeDragStarted(length2 ? 1 : 0, i);
        }
    }

    private boolean length(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.hashCode[i] & i2) != i2 || (this.getMax & i2) == 0 || (this.toDoubleRange[i] & i2) == i2 || (this.FastBitmap$CoordinateSystem[i] & i2) == i2)) {
            int i3 = this.length;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.invokeSuspend.onEdgeLock(i2)) {
                    int[] iArr = this.toDoubleRange;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.FastBitmap$CoordinateSystem[i] & i2) != 0 || abs <= ((float) this.length)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean getMax(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.invokeSuspend.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.invokeSuspend.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.length) : z2 && Math.abs(f2) > ((float) this.length);
        }
        int i = this.length;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    public final boolean length() {
        int length2 = this.isInside.length;
        for (int i = 0; i < length2; i++) {
            if (getMax(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean getMax(int i) {
        if (!length(i)) {
            return false;
        }
        float f = this.equals[i] - this.isInside[i];
        float f2 = this.values[i] - this.IsOverlapping[i];
        int i2 = this.length;
        if ((f * f) + (f2 * f2) > ((float) (i2 * i2))) {
            return true;
        }
        return false;
    }

    private void getMax() {
        this.invoke.computeCurrentVelocity(1000, this.valueOf);
        float xVelocity = this.invoke.getXVelocity(this.toFloatRange);
        float f = this.setMax;
        float f2 = this.valueOf;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.invoke.getYVelocity(this.toFloatRange);
        float f4 = this.setMax;
        float f5 = this.valueOf;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            f3 = abs2 > f5 ? yVelocity > 0.0f ? f5 : -f5 : yVelocity;
        }
        setMin(xVelocity, f3);
    }

    private boolean setMin(int i, int i2) {
        return getMin(this.toIntRange, i, i2);
    }

    public static boolean getMin(@Nullable View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final View setMax(int i, int i2) {
        for (int childCount = this.b.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.b.getChildAt(this.invokeSuspend.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private boolean setMax(int i) {
        return length(i);
    }

    public static onCreateDialog getMin(@NonNull ViewGroup viewGroup, float f, @NonNull setMin setmin) {
        onCreateDialog oncreatedialog = new onCreateDialog(viewGroup.getContext(), viewGroup, setmin);
        oncreatedialog.length = (int) (((float) oncreatedialog.length) * (1.0f / f));
        return oncreatedialog;
    }

    private void getMax(float f, float f2, int i) {
        float[] fArr = this.isInside;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            float[] fArr6 = this.isInside;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.IsOverlapping;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.equals;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.values;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.hashCode;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.FastBitmap$CoordinateSystem;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.toDoubleRange;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.isInside = fArr2;
            this.IsOverlapping = fArr3;
            this.equals = fArr4;
            this.values = fArr5;
            this.hashCode = iArr;
            this.FastBitmap$CoordinateSystem = iArr2;
            this.toDoubleRange = iArr3;
        }
        float[] fArr10 = this.isInside;
        this.equals[i] = f;
        fArr10[i] = f;
        float[] fArr11 = this.IsOverlapping;
        this.values[i] = f2;
        fArr11[i] = f2;
        int[] iArr7 = this.hashCode;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.b.getLeft() + this.getMin) {
            i2 = 1;
        }
        if (i5 < this.b.getTop() + this.getMin) {
            i2 |= 4;
        }
        if (i4 > this.b.getRight() - this.getMin) {
            i2 |= 2;
        }
        if (i5 > this.b.getBottom() - this.getMin) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.toString |= 1 << i;
    }
}
