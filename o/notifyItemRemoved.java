package o;

import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0000¨\u0006\u0007"}, d2 = {"isAssignableFrom", "", "T", "", "R", "Lkotlin/reflect/KClass;", "kClass", "security_release"}, k = 2, mv = {1, 1, 16})
public final class notifyItemRemoved {
    public static final <T, R> boolean getMin(@NotNull KClass<T> kClass, @NotNull KClass<R> kClass2) {
        Intrinsics.checkParameterIsNotNull(kClass, "$this$isAssignableFrom");
        Intrinsics.checkParameterIsNotNull(kClass2, "kClass");
        return JvmClassMappingKt.getJavaObjectType(kClass).isAssignableFrom(JvmClassMappingKt.getJavaObjectType(kClass2));
    }
}
