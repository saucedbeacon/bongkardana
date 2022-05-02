package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;

final class JvmBuiltInsCustomizer$isMutabilityViolation$1 implements DFS.Neighbors<CallableMemberDescriptor> {
    public static final JvmBuiltInsCustomizer$isMutabilityViolation$1 INSTANCE = new JvmBuiltInsCustomizer$isMutabilityViolation$1();

    JvmBuiltInsCustomizer$isMutabilityViolation$1() {
    }

    @NotNull
    public final Iterable<CallableMemberDescriptor> getNeighbors(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.getOriginal().getOverriddenDescriptors();
    }
}
