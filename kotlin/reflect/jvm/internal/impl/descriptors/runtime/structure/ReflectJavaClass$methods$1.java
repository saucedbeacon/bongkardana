package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

final class ReflectJavaClass$methods$1 extends Lambda implements Function1<Method, Boolean> {
    final /* synthetic */ ReflectJavaClass this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReflectJavaClass$methods$1(ReflectJavaClass reflectJavaClass) {
        super(1);
        this.this$0 = reflectJavaClass;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Method) obj));
    }

    public final boolean invoke(Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!this.this$0.isEnum()) {
            return true;
        }
        ReflectJavaClass reflectJavaClass = this.this$0;
        Intrinsics.checkNotNullExpressionValue(method, FirebaseAnalytics.Param.METHOD);
        if (reflectJavaClass.isEnumValuesOrValueOf(method)) {
            return false;
        }
        return true;
    }
}
