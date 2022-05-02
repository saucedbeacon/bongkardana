package o;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class utAvaiable {
    public static final Throwable setMax = new getMax();

    public static RuntimeException getMin(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static <T> boolean length(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == setMax) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    public static <T> Throwable setMin(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = setMax;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static String getMax(long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }

    static final class getMax extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public final Throwable fillInStackTrace() {
            return this;
        }

        getMax() {
            super("No further exceptions");
        }
    }
}
