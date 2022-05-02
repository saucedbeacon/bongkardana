package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
final class RuntimeTypeMapperKt$signature$1 extends Lambda implements Function1<Class<?>, CharSequence> {
    public static final RuntimeTypeMapperKt$signature$1 INSTANCE = new RuntimeTypeMapperKt$signature$1();

    RuntimeTypeMapperKt$signature$1() {
        super(1);
    }

    @NotNull
    public final CharSequence invoke(Class<?> cls) {
        Intrinsics.checkNotNullExpressionValue(cls, "it");
        return ReflectClassUtilKt.getDesc(cls);
    }
}
