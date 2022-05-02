package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin._Assertions;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {
    @NotNull
    private final Function1<ModuleDescriptor, KotlinType> computeType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "value");
        Intrinsics.checkNotNullParameter(function1, "computeType");
        this.computeType = function1;
    }

    @NotNull
    public final KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        KotlinType invoke = this.computeType.invoke(moduleDescriptor);
        boolean z = KotlinBuiltIns.isArray(invoke) || KotlinBuiltIns.isPrimitiveArray(invoke) || KotlinBuiltIns.isUnsignedArrayType(invoke);
        if (!_Assertions.ENABLED || z) {
            return invoke;
        }
        StringBuilder sb = new StringBuilder("Type should be an array, but was ");
        sb.append(invoke);
        sb.append(": ");
        sb.append(getValue());
        throw new AssertionError(sb.toString());
    }
}
