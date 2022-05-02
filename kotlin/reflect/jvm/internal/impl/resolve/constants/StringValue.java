package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

public final class StringValue extends ConstantValue<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringValue(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "value");
    }

    @NotNull
    public final SimpleType getType(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        SimpleType stringType = moduleDescriptor.getBuiltIns().getStringType();
        Intrinsics.checkNotNullExpressionValue(stringType, "module.builtIns.stringType");
        return stringType;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("\"");
        sb.append((String) getValue());
        sb.append(Typography.quote);
        return sb.toString();
    }
}
