package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class DefaultSimpleLock implements SimpleLock {
    @NotNull
    private final Lock lock;

    public DefaultSimpleLock() {
        this((Lock) null, 1, (DefaultConstructorMarker) null);
    }

    public DefaultSimpleLock(@NotNull Lock lock2) {
        Intrinsics.checkNotNullParameter(lock2, "lock");
        this.lock = lock2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultSimpleLock(Lock lock2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock2);
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final Lock getLock() {
        return this.lock;
    }

    public void lock() {
        this.lock.lock();
    }

    public void unlock() {
        this.lock.unlock();
    }
}
