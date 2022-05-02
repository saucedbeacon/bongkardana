package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke", "kotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2$1$1"}, k = 3, mv = {1, 4, 1})
final class KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 extends Lambda implements Function0<Type> {
    final /* synthetic */ KotlinType $kotlinType;
    final /* synthetic */ KClassImpl$Data$supertypes$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(KotlinType kotlinType, KClassImpl$Data$supertypes$2 kClassImpl$Data$supertypes$2) {
        super(0);
        this.$kotlinType = kotlinType;
        this.this$0 = kClassImpl$Data$supertypes$2;
    }

    @NotNull
    public final Type invoke() {
        ClassifierDescriptor declarationDescriptor = this.$kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof ClassDescriptor) {
            Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            if (javaClass == null) {
                StringBuilder sb = new StringBuilder("Unsupported superclass of ");
                sb.append(this.this$0.this$0);
                sb.append(": ");
                sb.append(declarationDescriptor);
                throw new KotlinReflectionInternalError(sb.toString());
            } else if (Intrinsics.areEqual((Object) KClassImpl.this.getJClass().getSuperclass(), (Object) javaClass)) {
                Type genericSuperclass = KClassImpl.this.getJClass().getGenericSuperclass();
                Intrinsics.checkNotNullExpressionValue(genericSuperclass, "jClass.genericSuperclass");
                return genericSuperclass;
            } else {
                Class[] interfaces = KClassImpl.this.getJClass().getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "jClass.interfaces");
                int indexOf = ArraysKt.indexOf((T[]) interfaces, javaClass);
                if (indexOf >= 0) {
                    Type type = KClassImpl.this.getJClass().getGenericInterfaces()[indexOf];
                    Intrinsics.checkNotNullExpressionValue(type, "jClass.genericInterfaces[index]");
                    return type;
                }
                StringBuilder sb2 = new StringBuilder("No superclass of ");
                sb2.append(this.this$0.this$0);
                sb2.append(" in Java reflection for ");
                sb2.append(declarationDescriptor);
                throw new KotlinReflectionInternalError(sb2.toString());
            }
        } else {
            throw new KotlinReflectionInternalError("Supertype not a class: ".concat(String.valueOf(declarationDescriptor)));
        }
    }
}
