package o;

import android.os.Handler;
import android.os.Looper;
import org.greenrobot.eventbus.EventBusException;

public final class onStatisticEvent extends Handler implements initializeKeyboard {
    private final onInput eventBus;
    private boolean handlerActive;
    private final int maxMillisInsideHandleMessage;
    private final isShowKeyboard queue = new isShowKeyboard();

    protected onStatisticEvent(onInput oninput, Looper looper, int i) {
        super(looper);
        this.eventBus = oninput;
        this.maxMillisInsideHandleMessage = i;
    }

    public final void enqueue(initializeNoneKeyboard initializenonekeyboard, Object obj) {
        switchKeyboard obtainPendingPost = switchKeyboard.obtainPendingPost(initializenonekeyboard, obj);
        synchronized (this) {
            this.queue.enqueue(obtainPendingPost);
            if (!this.handlerActive) {
                this.handlerActive = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        r7.handlerActive = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            r8 = 0
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0048 }
        L_0x0005:
            o.isShowKeyboard r2 = r7.queue     // Catch:{ all -> 0x0048 }
            o.switchKeyboard r2 = r2.poll()     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x0021
            monitor-enter(r7)     // Catch:{ all -> 0x0048 }
            o.isShowKeyboard r2 = r7.queue     // Catch:{ all -> 0x001e }
            o.switchKeyboard r2 = r2.poll()     // Catch:{ all -> 0x001e }
            if (r2 != 0) goto L_0x001c
            r7.handlerActive = r8     // Catch:{ all -> 0x001e }
            monitor-exit(r7)     // Catch:{ all -> 0x001e }
            r7.handlerActive = r8
            return
        L_0x001c:
            monitor-exit(r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0021:
            o.onInput r3 = r7.eventBus     // Catch:{ all -> 0x0048 }
            r3.invokeSubscriber(r2)     // Catch:{ all -> 0x0048 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0048 }
            long r2 = r2 - r0
            int r4 = r7.maxMillisInsideHandleMessage     // Catch:{ all -> 0x0048 }
            long r4 = (long) r4     // Catch:{ all -> 0x0048 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0005
            android.os.Message r0 = r7.obtainMessage()     // Catch:{ all -> 0x0048 }
            boolean r0 = r7.sendMessage(r0)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0040
            r8 = 1
            r7.handlerActive = r8
            return
        L_0x0040:
            org.greenrobot.eventbus.EventBusException r0 = new org.greenrobot.eventbus.EventBusException     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "Could not send handler message"
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7.handlerActive = r8
            goto L_0x004d
        L_0x004c:
            throw r0
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onStatisticEvent.handleMessage(android.os.Message):void");
    }
}
