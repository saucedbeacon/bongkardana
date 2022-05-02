package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Reflection;

public final class ClassicTypeCheckerContextKt {
    /* access modifiers changed from: private */
    public static final String errorMessage(Object obj) {
        StringBuilder sb = new StringBuilder("ClassicTypeCheckerContext couldn't handle ");
        sb.append(Reflection.getOrCreateKotlinClass(obj.getClass()));
        sb.append(' ');
        sb.append(obj);
        return sb.toString();
    }
}
