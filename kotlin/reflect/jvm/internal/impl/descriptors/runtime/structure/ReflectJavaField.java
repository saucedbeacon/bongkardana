package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import org.jetbrains.annotations.NotNull;

public final class ReflectJavaField extends ReflectJavaMember implements JavaField {
    @NotNull
    private final Field member;

    public final boolean getHasConstantNotNullInitializer() {
        return false;
    }

    public ReflectJavaField(@NotNull Field field) {
        Intrinsics.checkNotNullParameter(field, "member");
        this.member = field;
    }

    @NotNull
    public final Field getMember() {
        return this.member;
    }

    public final boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @NotNull
    public final ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Type genericType = getMember().getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "member.genericType");
        return factory.create(genericType);
    }
}
