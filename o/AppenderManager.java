package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.LogContextImpl;

public final class AppenderManager extends LogContextImpl.AnonymousClass2.getMax {
    private final Gson setMin;

    public AppenderManager(Gson gson) {
        this.setMin = gson;
    }

    public final LogContextImpl.AnonymousClass2<NotSendableException, ?> setMin(Type type, Annotation[] annotationArr) {
        return new appendEvent(this.setMin, this.setMin.getAdapter(TypeToken.get(type)));
    }

    public final LogContextImpl.AnonymousClass2<?, getPart> length(Type type) {
        return new addOnAppendLogListener(this.setMin, this.setMin.getAdapter(TypeToken.get(type)));
    }
}
