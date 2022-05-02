package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.Nullable;

final class DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1 extends Lambda implements Function2<DeclarationDescriptor, DeclarationDescriptor, Boolean> {
    public static final DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1 INSTANCE = new DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1();

    DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1() {
        super(2);
    }

    public final boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
