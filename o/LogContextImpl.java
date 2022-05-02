package o;

import android.os.Handler;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public final class LogContextImpl {
    private final boolean getMin;
    public final Handler setMin;

    /* renamed from: o.LogContextImpl$2  reason: invalid class name */
    public interface AnonymousClass2<F, T> {

        /* renamed from: o.LogContextImpl$2$getMax */
        public static abstract class getMax {
            @Nullable
            public AnonymousClass2<?, getPart> length(Type type) {
                return null;
            }

            @Nullable
            public AnonymousClass2<NotSendableException, ?> setMin(Type type, Annotation[] annotationArr) {
                return null;
            }
        }

        T getMax(F f) throws IOException;
    }

    public interface AppendWorker<R, T> {

        public static abstract class setMin {
            @Nullable
            public abstract AppendWorker<?, ?> length(Type type);
        }

        Type getMin();

        T setMax(initLater<R> initlater);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public boolean getMin = false;
        Handler setMax = null;
    }

    /* synthetic */ LogContextImpl(getMin getmin, byte b) {
        this(getmin);
    }

    private LogContextImpl(getMin getmin) {
        this.setMin = getmin.setMax;
        this.getMin = getmin.getMin;
    }

    public final boolean length() {
        return this.getMin;
    }
}
