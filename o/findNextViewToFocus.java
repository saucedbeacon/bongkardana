package o;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.otaliastudios.cameraview.CameraLogger;
import o.exceptionLabel;

public abstract class findNextViewToFocus {
    private static final CameraLogger length;
    private static final String setMin;
    private int IsOverlapping;
    private final length getMax;
    @VisibleForTesting(otherwise = 4)
    exceptionLabel.setMax getMin;
    protected Exception setMax;
    private final Object toIntRange = new Object();

    public interface length {
        void IPostMessageService$Stub$Proxy();

        void setMax(@Nullable exceptionLabel.setMax setmax, @Nullable Exception exc);

        void values();
    }

    /* access modifiers changed from: protected */
    public void length() {
    }

    /* access modifiers changed from: protected */
    public abstract void length(boolean z);

    /* access modifiers changed from: protected */
    public abstract void setMin();

    static {
        String simpleName = findNextViewToFocus.class.getSimpleName();
        setMin = simpleName;
        length = CameraLogger.setMin(simpleName);
    }

    findNextViewToFocus(@Nullable length length2) {
        this.getMax = length2;
        this.IsOverlapping = 0;
    }

    public final void setMax(@NonNull exceptionLabel.setMax setmax) {
        synchronized (this.toIntRange) {
            if (this.IsOverlapping != 0) {
                length.getMax(3, "start:", "called twice, or while stopping! Ignoring. state:", Integer.valueOf(this.IsOverlapping));
                return;
            }
            length.getMax(1, "start:", "Changed state to STATE_RECORDING");
            this.IsOverlapping = 1;
            this.getMin = setmax;
            setMin();
        }
    }

    public final void setMin(boolean z) {
        synchronized (this.toIntRange) {
            if (this.IsOverlapping == 0) {
                length.getMax(3, "stop:", "called twice, or called before start! Ignoring. isCameraShutdown:", Boolean.valueOf(z));
                return;
            }
            length.getMax(1, "stop:", "Changed state to STATE_STOPPING");
            this.IsOverlapping = 2;
            length(z);
        }
    }

    public final boolean getMax() {
        boolean z;
        synchronized (this.toIntRange) {
            z = this.IsOverlapping != 0;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        length();
        length.getMax(1, "dispatchResult:", "About to dispatch result:", r7.getMin, r7.setMax);
        r0 = r7.getMax;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        r0.setMax(r7.getMin, r7.setMax);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        r7.getMin = null;
        r7.setMax = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.toIntRange
            monitor-enter(r0)
            boolean r1 = r7.getMax()     // Catch:{ all -> 0x005c }
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L_0x001d
            com.otaliastudios.cameraview.CameraLogger r1 = length     // Catch:{ all -> 0x005c }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "dispatchResult:"
            r5[r2] = r6     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "Called, but not recording! Aborting."
            r5[r4] = r2     // Catch:{ all -> 0x005c }
            r1.getMax(r3, r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x001d:
            com.otaliastudios.cameraview.CameraLogger r1 = length     // Catch:{ all -> 0x005c }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "dispatchResult:"
            r5[r2] = r6     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "Changed state to STATE_IDLE."
            r5[r4] = r6     // Catch:{ all -> 0x005c }
            r1.getMax(r4, r5)     // Catch:{ all -> 0x005c }
            r7.IsOverlapping = r2     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            r7.length()
            com.otaliastudios.cameraview.CameraLogger r0 = length
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "dispatchResult:"
            r1[r2] = r5
            java.lang.String r2 = "About to dispatch result:"
            r1[r4] = r2
            o.exceptionLabel$setMax r2 = r7.getMin
            r1[r3] = r2
            r2 = 3
            java.lang.Exception r3 = r7.setMax
            r1[r2] = r3
            r0.getMax(r4, r1)
            o.findNextViewToFocus$length r0 = r7.getMax
            if (r0 == 0) goto L_0x0056
            o.exceptionLabel$setMax r1 = r7.getMin
            java.lang.Exception r2 = r7.setMax
            r0.setMax(r1, r2)
        L_0x0056:
            r0 = 0
            r7.getMin = r0
            r7.setMax = r0
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findNextViewToFocus.getMin():void");
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public final void isInside() {
        length.getMax(1, "dispatchVideoRecordingStart:", "About to dispatch.");
        length length2 = this.getMax;
        if (length2 != null) {
            length2.IPostMessageService$Stub$Proxy();
        }
    }

    /* access modifiers changed from: protected */
    @CallSuper
    public final void toIntRange() {
        length.getMax(1, "dispatchVideoRecordingEnd:", "About to dispatch.");
        length length2 = this.getMax;
        if (length2 != null) {
            length2.values();
        }
    }
}
