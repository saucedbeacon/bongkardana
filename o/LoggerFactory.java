package o;

import java.lang.reflect.Type;
import o.LogContextImpl;

final class LoggerFactory extends LogContextImpl.AppendWorker.setMin {
    static final LogContextImpl.AppendWorker.setMin setMin = new LoggerFactory();

    LoggerFactory() {
    }

    public final LogContextImpl.AppendWorker<?, ?> length(Type type) {
        if (ProcessInfoImpl.length(type) != initLater.class) {
            return null;
        }
        final Type max = ProcessInfoImpl.getMax(type);
        return new LogContextImpl.AppendWorker<Object, initLater<?>>() {
            public final /* bridge */ /* synthetic */ Object setMax(initLater initlater) {
                return initlater;
            }

            public final Type getMin() {
                return max;
            }
        };
    }
}
