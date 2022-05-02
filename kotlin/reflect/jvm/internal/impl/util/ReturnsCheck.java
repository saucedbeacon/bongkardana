package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ReturnsCheck implements Check {
    @NotNull
    private final String description;
    @NotNull
    private final String name;
    @NotNull
    private final Function1<KotlinBuiltIns, KotlinType> type;

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.name = str;
        this.type = function1;
        this.description = Intrinsics.stringPlus("must return ", str);
    }

    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    @NotNull
    public String getDescription() {
        return this.description;
    }

    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.areEqual((Object) functionDescriptor.getReturnType(), (Object) this.type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    public static final class ReturnsBoolean extends ReturnsCheck {
        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", AnonymousClass1.INSTANCE, (DefaultConstructorMarker) null);
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {
        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        private ReturnsInt() {
            super("Int", AnonymousClass1.INSTANCE, (DefaultConstructorMarker) null);
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {
        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", AnonymousClass1.INSTANCE, (DefaultConstructorMarker) null);
        }
    }
}
