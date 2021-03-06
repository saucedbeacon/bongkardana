package o;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import o.APSecuritySdk;
import o.DeviceTokenClient;
import o.ReportResult;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\b\u0010\r\u001a\u00020\bH\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "()V", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "reschedule", "", "now", "", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "unpark", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public abstract class BugTrackMessageService extends DeviceTokenClient.InitResultListener {
    /* access modifiers changed from: protected */
    @NotNull
    public abstract Thread length();

    /* access modifiers changed from: protected */
    public final void values() {
        Thread length = length();
        if (Thread.currentThread() != length && processHandshake.setMin == null) {
            LockSupport.unpark(length);
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax(long j, @NotNull ReportResult.getMax getmax) {
        if (getApdidToken.setMax()) {
            if (!(this != APSecuritySdk.AnonymousClass1.getMin)) {
                throw new AssertionError();
            }
        }
        APSecuritySdk.AnonymousClass1.getMin.length(j, getmax);
    }
}
