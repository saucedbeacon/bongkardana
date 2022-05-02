package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor2, @NotNull PropertyDescriptor propertyDescriptor) {
        super(classDescriptor, Annotations.Companion.getEMPTY(), simpleFunctionDescriptor.getModality(), simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor2 != null, propertyDescriptor.getName(), simpleFunctionDescriptor.getSource(), (PropertyDescriptor) null, CallableMemberDescriptor.Kind.DECLARATION, false, (Pair<CallableDescriptor.UserDataKey<?>, ?>) null);
        Intrinsics.checkNotNullParameter(classDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(simpleFunctionDescriptor, "getterMethod");
        Intrinsics.checkNotNullParameter(propertyDescriptor, "overriddenProperty");
    }
}
