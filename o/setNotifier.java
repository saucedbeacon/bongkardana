package o;

import java.util.concurrent.Callable;

public final class setNotifier {
    public static volatile RedDotDrawable<Callable<hasCornerMarking>, hasCornerMarking> getMax;
    public static volatile RedDotDrawable<hasCornerMarking, hasCornerMarking> length;

    public static hasCornerMarking setMax(Callable<hasCornerMarking> callable) {
        try {
            hasCornerMarking call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }

    public static <T, R> R length(RedDotDrawable<T, R> redDotDrawable, T t) {
        try {
            return redDotDrawable.apply(t);
        } catch (Throwable th) {
            throw utAvaiable.getMin(th);
        }
    }
}
