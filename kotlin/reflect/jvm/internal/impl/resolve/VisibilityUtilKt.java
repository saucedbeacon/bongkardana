package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import org.jetbrains.annotations.NotNull;

public final class VisibilityUtilKt {
    @NotNull
    public static final CallableMemberDescriptor findMemberWithMaxVisibility(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        Integer compare;
        Intrinsics.checkNotNullParameter(collection, "descriptors");
        boolean z = !collection.isEmpty();
        if (!_Assertions.ENABLED || z) {
            CallableMemberDescriptor callableMemberDescriptor = null;
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                if (callableMemberDescriptor == null || ((compare = DescriptorVisibilities.compare(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && compare.intValue() < 0)) {
                    callableMemberDescriptor = callableMemberDescriptor2;
                }
            }
            Intrinsics.checkNotNull(callableMemberDescriptor);
            return callableMemberDescriptor;
        }
        throw new AssertionError("Assertion failed");
    }
}
