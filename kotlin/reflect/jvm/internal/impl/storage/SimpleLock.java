package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface SimpleLock {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    void lock();

    void unlock();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DefaultSimpleLock simpleLock(@Nullable Runnable runnable, @Nullable Function1<? super InterruptedException, Unit> function1) {
            if (runnable == null || function1 == null) {
                return new DefaultSimpleLock((Lock) null, 1, (DefaultConstructorMarker) null);
            }
            return new CancellableSimpleLock(runnable, function1);
        }
    }
}
