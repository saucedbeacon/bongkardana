package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.LogContextImpl;
import retrofit2.http.Streaming;

final class setAppLogAppendWorker extends LogContextImpl.AnonymousClass2.getMax {
    setAppLogAppendWorker() {
    }

    public final LogContextImpl.AnonymousClass2<NotSendableException, ?> setMin(Type type, Annotation[] annotationArr) {
        if (type == NotSendableException.class) {
            if (ProcessInfoImpl.getMin(annotationArr, (Class<? extends Annotation>) Streaming.class)) {
                return setMin.setMax;
            }
            return getMax.setMax;
        } else if (type == Void.class) {
            return getMin.setMax;
        } else {
            return null;
        }
    }

    public final LogContextImpl.AnonymousClass2<?, getPart> length(Type type) {
        if (getPart.class.isAssignableFrom(ProcessInfoImpl.length(type))) {
            return setMax.getMax;
        }
        return null;
    }

    static final class getMin implements LogContextImpl.AnonymousClass2<NotSendableException, Void> {
        static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object getMax(Object obj) throws IOException {
            ((NotSendableException) obj).close();
            return null;
        }
    }

    static final class setMax implements LogContextImpl.AnonymousClass2<getPart, getPart> {
        static final setMax getMax = new setMax();

        setMax() {
        }

        public final /* bridge */ /* synthetic */ Object getMax(Object obj) throws IOException {
            return (getPart) obj;
        }
    }

    static final class setMin implements LogContextImpl.AnonymousClass2<NotSendableException, NotSendableException> {
        static final setMin setMax = new setMin();

        setMin() {
        }

        public final /* bridge */ /* synthetic */ Object getMax(Object obj) throws IOException {
            return (NotSendableException) obj;
        }
    }

    static final class getMax implements LogContextImpl.AnonymousClass2<NotSendableException, NotSendableException> {
        static final getMax setMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object getMax(Object obj) throws IOException {
            return setMax((NotSendableException) obj);
        }

        private static NotSendableException setMax(NotSendableException notSendableException) throws IOException {
            try {
                return ProcessInfoImpl.setMin(notSendableException);
            } finally {
                notSendableException.close();
            }
        }
    }

    static final class length implements LogContextImpl.AnonymousClass2<Object, String> {
        static final length getMin = new length();

        length() {
        }

        public final /* synthetic */ Object getMax(Object obj) throws IOException {
            return obj.toString();
        }
    }
}
