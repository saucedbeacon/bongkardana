package o;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class setNeutralButton {
    private final getMax getMin;

    interface getMax {
        boolean length(MotionEvent motionEvent);
    }

    static class getMin implements getMax {
        private static final int hashCode = ViewConfiguration.getDoubleTapTimeout();
        private static final int isInside = ViewConfiguration.getTapTimeout();
        private boolean FastBitmap$CoordinateSystem;
        private boolean Grayscale$Algorithm;
        private int IsOverlapping;
        private float Mean$Arithmetic;
        private float b;
        private int equals;
        private boolean getCause;
        boolean getMax;
        MotionEvent getMin;
        private MotionEvent invoke;
        private float invokeSuspend;
        boolean length;
        private VelocityTracker onNavigationEvent;
        GestureDetector.OnDoubleTapListener setMax;
        final GestureDetector.OnGestureListener setMin;
        private final Handler toDoubleRange;
        private int toFloatRange;
        private int toIntRange;
        private boolean toString;
        private float valueOf;
        private boolean values;

        class setMin extends Handler {
            setMin() {
            }

            setMin(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    getMin.this.setMin.onShowPress(getMin.this.getMin);
                } else if (i == 2) {
                    getMin.this.setMax();
                } else if (i != 3) {
                    throw new RuntimeException("Unknown message ".concat(String.valueOf(message)));
                } else if (getMin.this.setMax == null) {
                } else {
                    if (!getMin.this.length) {
                        getMin.this.setMax.onSingleTapConfirmed(getMin.this.getMin);
                    } else {
                        getMin.this.getMax = true;
                    }
                }
            }
        }

        getMin(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.toDoubleRange = new setMin(handler);
            } else {
                this.toDoubleRange = new setMin();
            }
            this.setMin = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                setMin((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            length(context);
        }

        private void length(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.setMin != null) {
                this.getCause = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.IsOverlapping = viewConfiguration.getScaledMinimumFlingVelocity();
                this.equals = viewConfiguration.getScaledMaximumFlingVelocity();
                this.toFloatRange = scaledTouchSlop * scaledTouchSlop;
                this.toIntRange = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        public void setMin(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.setMax = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean length(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.onNavigationEvent
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.onNavigationEvent = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.onNavigationEvent
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003e
                if (r5 == r8) goto L_0x003b
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003b:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003e:
                if (r4 == 0) goto L_0x0043
                int r4 = r6 + -1
                goto L_0x0044
            L_0x0043:
                r4 = r6
            L_0x0044:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bb
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x012d
                if (r0 == r4) goto L_0x00b8
                if (r0 == r5) goto L_0x00b3
                r2 = 5
                if (r0 == r2) goto L_0x00a6
                if (r0 == r1) goto L_0x005a
                goto L_0x024c
            L_0x005a:
                r12.valueOf = r9
                r12.invokeSuspend = r9
                r12.Mean$Arithmetic = r10
                r12.b = r10
                android.view.VelocityTracker r0 = r12.onNavigationEvent
                int r1 = r12.equals
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.onNavigationEvent
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.onNavigationEvent
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x007f:
                if (r4 >= r6) goto L_0x024c
                if (r4 == r0) goto L_0x00a3
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.onNavigationEvent
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.onNavigationEvent
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a3
                android.view.VelocityTracker r13 = r12.onNavigationEvent
                r13.clear()
                goto L_0x024c
            L_0x00a3:
                int r4 = r4 + 1
                goto L_0x007f
            L_0x00a6:
                r12.valueOf = r9
                r12.invokeSuspend = r9
                r12.Mean$Arithmetic = r10
                r12.b = r10
                r12.setMin()
                goto L_0x024c
            L_0x00b3:
                r12.length()
                goto L_0x024c
            L_0x00b8:
                boolean r0 = r12.toString
                if (r0 != 0) goto L_0x024c
                float r0 = r12.valueOf
                float r0 = r0 - r9
                float r1 = r12.Mean$Arithmetic
                float r1 = r1 - r10
                boolean r6 = r12.Grayscale$Algorithm
                if (r6 == 0) goto L_0x00cf
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.setMax
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024c
            L_0x00cf:
                boolean r6 = r12.values
                if (r6 == 0) goto L_0x010d
                float r6 = r12.invokeSuspend
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.b
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.toFloatRange
                if (r6 <= r7) goto L_0x0104
                android.view.GestureDetector$OnGestureListener r7 = r12.setMin
                android.view.MotionEvent r8 = r12.getMin
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.valueOf = r9
                r12.Mean$Arithmetic = r10
                r12.values = r3
                android.os.Handler r0 = r12.toDoubleRange
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.toDoubleRange
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.toDoubleRange
                r0.removeMessages(r4)
                goto L_0x0105
            L_0x0104:
                r13 = 0
            L_0x0105:
                int r0 = r12.toFloatRange
                if (r6 <= r0) goto L_0x01b8
                r12.FastBitmap$CoordinateSystem = r3
                goto L_0x01b8
            L_0x010d:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x011f
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024c
            L_0x011f:
                android.view.GestureDetector$OnGestureListener r2 = r12.setMin
                android.view.MotionEvent r3 = r12.getMin
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.valueOf = r9
                r12.Mean$Arithmetic = r10
                goto L_0x024c
            L_0x012d:
                r12.length = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.Grayscale$Algorithm
                if (r1 == 0) goto L_0x013f
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.setMax
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x0197
            L_0x013f:
                boolean r1 = r12.toString
                if (r1 == 0) goto L_0x014b
                android.os.Handler r13 = r12.toDoubleRange
                r13.removeMessages(r5)
                r12.toString = r3
                goto L_0x018d
            L_0x014b:
                boolean r1 = r12.values
                if (r1 == 0) goto L_0x0162
                android.view.GestureDetector$OnGestureListener r1 = r12.setMin
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.getMax
                if (r5 == 0) goto L_0x0160
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.setMax
                if (r5 == 0) goto L_0x0160
                r5.onSingleTapConfirmed(r13)
            L_0x0160:
                r13 = r1
                goto L_0x0197
            L_0x0162:
                android.view.VelocityTracker r1 = r12.onNavigationEvent
                int r5 = r13.getPointerId(r3)
                int r6 = r12.equals
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.IsOverlapping
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x018f
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.IsOverlapping
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x018d
                goto L_0x018f
            L_0x018d:
                r13 = 0
                goto L_0x0197
            L_0x018f:
                android.view.GestureDetector$OnGestureListener r5 = r12.setMin
                android.view.MotionEvent r7 = r12.getMin
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x0197:
                android.view.MotionEvent r1 = r12.invoke
                if (r1 == 0) goto L_0x019e
                r1.recycle()
            L_0x019e:
                r12.invoke = r0
                android.view.VelocityTracker r0 = r12.onNavigationEvent
                if (r0 == 0) goto L_0x01aa
                r0.recycle()
                r0 = 0
                r12.onNavigationEvent = r0
            L_0x01aa:
                r12.Grayscale$Algorithm = r3
                r12.getMax = r3
                android.os.Handler r0 = r12.toDoubleRange
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.toDoubleRange
                r0.removeMessages(r4)
            L_0x01b8:
                r3 = r13
                goto L_0x024c
            L_0x01bb:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.setMax
                if (r0 == 0) goto L_0x01f7
                android.os.Handler r0 = r12.toDoubleRange
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01cc
                android.os.Handler r1 = r12.toDoubleRange
                r1.removeMessages(r5)
            L_0x01cc:
                android.view.MotionEvent r1 = r12.getMin
                if (r1 == 0) goto L_0x01ef
                android.view.MotionEvent r6 = r12.invoke
                if (r6 == 0) goto L_0x01ef
                if (r0 == 0) goto L_0x01ef
                boolean r0 = r12.getMax(r1, r6, r13)
                if (r0 == 0) goto L_0x01ef
                r12.Grayscale$Algorithm = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.setMax
                android.view.MotionEvent r1 = r12.getMin
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.setMax
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01f8
            L_0x01ef:
                android.os.Handler r0 = r12.toDoubleRange
                int r1 = hashCode
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01f7:
                r0 = 0
            L_0x01f8:
                r12.valueOf = r9
                r12.invokeSuspend = r9
                r12.Mean$Arithmetic = r10
                r12.b = r10
                android.view.MotionEvent r1 = r12.getMin
                if (r1 == 0) goto L_0x0207
                r1.recycle()
            L_0x0207:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.getMin = r1
                r12.values = r2
                r12.FastBitmap$CoordinateSystem = r2
                r12.length = r2
                r12.toString = r3
                r12.getMax = r3
                boolean r1 = r12.getCause
                if (r1 == 0) goto L_0x0235
                android.os.Handler r1 = r12.toDoubleRange
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.toDoubleRange
                android.view.MotionEvent r3 = r12.getMin
                long r5 = r3.getDownTime()
                int r3 = isInside
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = android.view.ViewConfiguration.getLongPressTimeout()
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0235:
                android.os.Handler r1 = r12.toDoubleRange
                android.view.MotionEvent r3 = r12.getMin
                long r3 = r3.getDownTime()
                int r5 = isInside
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.setMin
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setNeutralButton.getMin.length(android.view.MotionEvent):boolean");
        }

        private void length() {
            this.toDoubleRange.removeMessages(1);
            this.toDoubleRange.removeMessages(2);
            this.toDoubleRange.removeMessages(3);
            this.onNavigationEvent.recycle();
            this.onNavigationEvent = null;
            this.Grayscale$Algorithm = false;
            this.length = false;
            this.values = false;
            this.FastBitmap$CoordinateSystem = false;
            this.getMax = false;
            if (this.toString) {
                this.toString = false;
            }
        }

        private void setMin() {
            this.toDoubleRange.removeMessages(1);
            this.toDoubleRange.removeMessages(2);
            this.toDoubleRange.removeMessages(3);
            this.Grayscale$Algorithm = false;
            this.values = false;
            this.FastBitmap$CoordinateSystem = false;
            this.getMax = false;
            if (this.toString) {
                this.toString = false;
            }
        }

        private boolean getMax(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.FastBitmap$CoordinateSystem || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) hashCode)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.toIntRange) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void setMax() {
            this.toDoubleRange.removeMessages(3);
            this.getMax = false;
            this.toString = true;
            this.setMin.onLongPress(this.getMin);
        }
    }

    static class length implements getMax {
        private final GestureDetector length;

        length(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.length = new GestureDetector(context, onGestureListener, handler);
        }

        public boolean length(MotionEvent motionEvent) {
            return this.length.onTouchEvent(motionEvent);
        }
    }

    public setNeutralButton(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public setNeutralButton(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.getMin = new length(context, onGestureListener, handler);
        } else {
            this.getMin = new getMin(context, onGestureListener, handler);
        }
    }

    public final boolean setMin(MotionEvent motionEvent) {
        return this.getMin.length(motionEvent);
    }
}
