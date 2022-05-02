package o;

import io.reactivex.internal.functions.Functions;
import o.TitleBarRightButtonView;

public final class setDotsBackground {
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void length(o.TitleBarRightButtonView.AnonymousClass4<? extends T> r3, o.GriverProgressBar<? super T> r4) {
        /*
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            o.setRefreshingWithNotify r1 = new o.setRefreshingWithNotify
            r1.<init>(r0)
            r4.onSubscribe(r1)
            r3.subscribe(r1)
        L_0x0010:
            boolean r3 = r1.isDisposed()
            if (r3 != 0) goto L_0x0039
            java.lang.Object r3 = r0.poll()
            if (r3 != 0) goto L_0x0029
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r3 = move-exception
            r1.dispose()
            r4.onError(r3)
            return
        L_0x0029:
            boolean r2 = r1.isDisposed()
            if (r2 != 0) goto L_0x0039
            java.lang.Object r2 = o.setRefreshingWithNotify.TERMINATED
            if (r3 == r2) goto L_0x0039
            boolean r3 = io.reactivex.internal.util.NotificationLite.acceptFull((java.lang.Object) r3, r4)
            if (r3 == 0) goto L_0x0010
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDotsBackground.length(o.TitleBarRightButtonView$4, o.GriverProgressBar):void");
    }

    public static <T> void setMin(TitleBarRightButtonView.AnonymousClass4<? extends T> r2, RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler) {
        setRefreshAnimation.getMax(redDotManager, "onNext is null");
        setRefreshAnimation.getMax(redDotManager2, "onError is null");
        setRefreshAnimation.getMax(removestatedidchangehandler, "onComplete is null");
        length(r2, new enableSecondFloor(redDotManager, redDotManager2, removestatedidchangehandler, Functions.length()));
    }
}
