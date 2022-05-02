package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* synthetic */ class MemberDeserializer$containsSuspendFunctionType$1 extends PropertyReference1 {
    public static final MemberDeserializer$containsSuspendFunctionType$1 INSTANCE = new MemberDeserializer$containsSuspendFunctionType$1();

    @NotNull
    public final String getName() {
        return "isSuspendFunctionType";
    }

    @NotNull
    public final String getSignature() {
        return "isSuspendFunctionType(Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    /* synthetic */ MemberDeserializer$containsSuspendFunctionType$1() {
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        return Boolean.valueOf(FunctionTypesKt.isSuspendFunctionType((KotlinType) obj));
    }

    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinPackage(FunctionTypesKt.class, "deserialization");
    }
}
