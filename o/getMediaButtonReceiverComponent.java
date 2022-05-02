package o;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.client.android.R;

public class getMediaButtonReceiverComponent {
    private static final String length = getMediaButtonReceiverComponent.class.getSimpleName();
    /* access modifiers changed from: private */
    public final Object IsOverlapping = new Object();
    /* access modifiers changed from: private */
    public Handler equals;
    public Rect getMax;
    public ContiguousPagedList$FetchState getMin;
    private final layoutForPredictiveAnimations hashCode = new layoutForPredictiveAnimations() {
        public final void length(getRecycleChildrenOnDetach getrecyclechildrenondetach) {
            synchronized (getMediaButtonReceiverComponent.this.IsOverlapping) {
                if (getMediaButtonReceiverComponent.this.toIntRange) {
                    getMediaButtonReceiverComponent.this.equals.obtainMessage(R.id.zxing_decode, getrecyclechildrenondetach).sendToTarget();
                }
            }
        }

        public final void setMax() {
            synchronized (getMediaButtonReceiverComponent.this.IsOverlapping) {
                if (getMediaButtonReceiverComponent.this.toIntRange) {
                    getMediaButtonReceiverComponent.this.equals.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            }
        }
    };
    private final Handler.Callback isInside = new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == R.id.zxing_decode) {
                getMediaButtonReceiverComponent.setMax(getMediaButtonReceiverComponent.this, (getRecycleChildrenOnDetach) message.obj);
                return true;
            } else if (message.what != R.id.zxing_preview_failed) {
                return true;
            } else {
                getMediaButtonReceiverComponent.getMax(getMediaButtonReceiverComponent.this);
                return true;
            }
        }
    };
    private getReverseLayout setMax;
    private HandlerThread setMin;
    private Handler toFloatRange;
    /* access modifiers changed from: private */
    public boolean toIntRange = false;

    public getMediaButtonReceiverComponent(getReverseLayout getreverselayout, ContiguousPagedList$FetchState contiguousPagedList$FetchState, Handler handler) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.setMax = getreverselayout;
            this.getMin = contiguousPagedList$FetchState;
            this.toFloatRange = handler;
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final void getMin() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            HandlerThread handlerThread = new HandlerThread(length);
            this.setMin = handlerThread;
            handlerThread.start();
            this.equals = new Handler(this.setMin.getLooper(), this.isInside);
            this.toIntRange = true;
            getReverseLayout getreverselayout = this.setMax;
            getreverselayout.toFloatRange.post(new setReverseLayout(getreverselayout, this.hashCode));
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final void setMax() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            synchronized (this.IsOverlapping) {
                this.toIntRange = false;
                this.equals.removeCallbacksAndMessages((Object) null);
                this.setMin.quit();
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void setMax(o.getMediaButtonReceiverComponent r19, o.getRecycleChildrenOnDetach r20) {
        /*
            r0 = r19
            r1 = r20
            android.graphics.Rect r2 = r0.getMax
            r1.getMin = r2
            android.graphics.Rect r2 = r0.getMax
            r3 = 0
            if (r2 != 0) goto L_0x0010
            r4 = r3
            goto L_0x00cd
        L_0x0010:
            o.isAutoMeasureEnabled r2 = r1.getMax
            int r4 = r1.setMax
            r5 = 90
            if (r4 == r5) goto L_0x0049
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 == r5) goto L_0x0035
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x0021
            goto L_0x005d
        L_0x0021:
            o.isAutoMeasureEnabled r4 = new o.isAutoMeasureEnabled
            byte[] r5 = r2.setMax
            int r6 = r2.getMax
            int r7 = r2.length
            byte[] r5 = o.isAutoMeasureEnabled.getMax(r5, r6, r7)
            int r6 = r2.length
            int r2 = r2.getMax
            r4.<init>(r5, r6, r2)
            goto L_0x005c
        L_0x0035:
            o.isAutoMeasureEnabled r4 = new o.isAutoMeasureEnabled
            byte[] r5 = r2.setMax
            int r6 = r2.getMax
            int r7 = r2.length
            byte[] r5 = o.isAutoMeasureEnabled.getMin(r5, r6, r7)
            int r6 = r2.getMax
            int r2 = r2.length
            r4.<init>(r5, r6, r2)
            goto L_0x005c
        L_0x0049:
            o.isAutoMeasureEnabled r4 = new o.isAutoMeasureEnabled
            byte[] r5 = r2.setMax
            int r6 = r2.getMax
            int r7 = r2.length
            byte[] r5 = o.isAutoMeasureEnabled.length(r5, r6, r7)
            int r6 = r2.length
            int r2 = r2.getMax
            r4.<init>(r5, r6, r2)
        L_0x005c:
            r2 = r4
        L_0x005d:
            android.graphics.Rect r4 = r1.getMin
            int r5 = r1.setMin
            int r6 = r4.width()
            int r6 = r6 / r5
            int r7 = r4.height()
            int r7 = r7 / r5
            int r8 = r4.top
            int r9 = r6 * r7
            byte[] r9 = new byte[r9]
            r10 = 0
            r11 = 1
            if (r5 != r11) goto L_0x008b
            int r5 = r2.getMax
            int r8 = r8 * r5
            int r4 = r4.left
            int r8 = r8 + r4
        L_0x007c:
            if (r10 >= r7) goto L_0x00ae
            int r4 = r10 * r6
            byte[] r5 = r2.setMax
            java.lang.System.arraycopy(r5, r8, r9, r4, r6)
            int r4 = r2.getMax
            int r8 = r8 + r4
            int r10 = r10 + 1
            goto L_0x007c
        L_0x008b:
            int r12 = r2.getMax
            int r8 = r8 * r12
            int r4 = r4.left
            int r8 = r8 + r4
            r4 = 0
        L_0x0093:
            if (r4 >= r7) goto L_0x00ae
            int r12 = r4 * r6
            r14 = r8
            r13 = 0
        L_0x0099:
            if (r13 >= r6) goto L_0x00a6
            byte[] r15 = r2.setMax
            byte r15 = r15[r14]
            r9[r12] = r15
            int r14 = r14 + r5
            int r12 = r12 + r11
            int r13 = r13 + 1
            goto L_0x0099
        L_0x00a6:
            int r12 = r2.getMax
            int r12 = r12 * r5
            int r8 = r8 + r12
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00ae:
            o.isAutoMeasureEnabled r2 = new o.isAutoMeasureEnabled
            r2.<init>(r9, r6, r7)
            com.google.zxing.PlanarYUVLuminanceSource r4 = new com.google.zxing.PlanarYUVLuminanceSource
            byte[] r11 = r2.setMin()
            int r12 = r2.getMax
            int r13 = r2.length
            r14 = 0
            r15 = 0
            int r5 = r2.getMax
            int r2 = r2.length
            r18 = 0
            r10 = r4
            r16 = r5
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x00cd:
            if (r4 == 0) goto L_0x00d5
            o.ContiguousPagedList$FetchState r2 = r0.getMin
            com.google.zxing.Result r3 = r2.getMin((com.google.zxing.LuminanceSource) r4)
        L_0x00d5:
            if (r3 == 0) goto L_0x00f4
            android.os.Handler r2 = r0.toFloatRange
            if (r2 == 0) goto L_0x0101
            o.performLoadChildren r2 = new o.performLoadChildren
            r2.<init>(r3, r1)
            android.os.Handler r3 = r0.toFloatRange
            int r4 = com.google.zxing.client.android.R.id.zxing_decode_succeeded
            android.os.Message r2 = android.os.Message.obtain(r3, r4, r2)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.setData(r3)
            r2.sendToTarget()
            goto L_0x0101
        L_0x00f4:
            android.os.Handler r2 = r0.toFloatRange
            if (r2 == 0) goto L_0x0101
            int r3 = com.google.zxing.client.android.R.id.zxing_decode_failed
            android.os.Message r2 = android.os.Message.obtain(r2, r3)
            r2.sendToTarget()
        L_0x0101:
            android.os.Handler r2 = r0.toFloatRange
            if (r2 == 0) goto L_0x011d
            o.ContiguousPagedList$FetchState r2 = r0.getMin
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List<com.google.zxing.ResultPoint> r2 = r2.setMax
            r3.<init>(r2)
            java.util.List r1 = o.performLoadChildren.getMin(r3, r1)
            android.os.Handler r2 = r0.toFloatRange
            int r3 = com.google.zxing.client.android.R.id.zxing_possible_result_points
            android.os.Message r1 = android.os.Message.obtain(r2, r3, r1)
            r1.sendToTarget()
        L_0x011d:
            o.getReverseLayout r1 = r0.setMax
            o.layoutForPredictiveAnimations r0 = r0.hashCode
            android.os.Handler r2 = r1.toFloatRange
            o.setReverseLayout r3 = new o.setReverseLayout
            r3.<init>(r1, r0)
            r2.post(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMediaButtonReceiverComponent.setMax(o.getMediaButtonReceiverComponent, o.getRecycleChildrenOnDetach):void");
    }

    static /* synthetic */ void getMax(getMediaButtonReceiverComponent getmediabuttonreceivercomponent) {
        getReverseLayout getreverselayout = getmediabuttonreceivercomponent.setMax;
        getreverselayout.toFloatRange.post(new setReverseLayout(getreverselayout, getmediabuttonreceivercomponent.hashCode));
    }
}
