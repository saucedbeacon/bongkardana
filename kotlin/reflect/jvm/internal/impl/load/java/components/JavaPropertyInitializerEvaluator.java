package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaPropertyInitializerEvaluator {
    @Nullable
    ConstantValue<?> getInitializerConstant(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {
        @NotNull
        public static final DoNothing INSTANCE = new DoNothing();

        @Nullable
        public final ConstantValue<?> getInitializerConstant(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor) {
            Intrinsics.checkNotNullParameter(javaField, "field");
            Intrinsics.checkNotNullParameter(propertyDescriptor, "descriptor");
            return null;
        }

        private DoNothing() {
        }
    }
}
