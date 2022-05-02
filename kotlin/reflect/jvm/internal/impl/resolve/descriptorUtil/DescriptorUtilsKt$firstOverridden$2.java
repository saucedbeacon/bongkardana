package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorUtilsKt$firstOverridden$2 extends DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor> {
    final /* synthetic */ Function1<CallableMemberDescriptor, Boolean> $predicate;
    final /* synthetic */ Ref.ObjectRef<CallableMemberDescriptor> $result;

    DescriptorUtilsKt$firstOverridden$2(Ref.ObjectRef<CallableMemberDescriptor> objectRef, Function1<? super CallableMemberDescriptor, Boolean> function1) {
        this.$result = objectRef;
        this.$predicate = function1;
    }

    public final boolean beforeChildren(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "current");
        return this.$result.element == null;
    }

    public final void afterChildren(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "current");
        if (this.$result.element == null && this.$predicate.invoke(callableMemberDescriptor).booleanValue()) {
            this.$result.element = callableMemberDescriptor;
        }
    }

    @Nullable
    public final CallableMemberDescriptor result() {
        return (CallableMemberDescriptor) this.$result.element;
    }
}
