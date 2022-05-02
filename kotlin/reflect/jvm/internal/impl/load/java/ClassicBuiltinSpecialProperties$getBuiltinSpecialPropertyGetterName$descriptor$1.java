package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import org.jetbrains.annotations.NotNull;

final class ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    final /* synthetic */ ClassicBuiltinSpecialProperties this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1(ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties) {
        super(1);
        this.this$0 = classicBuiltinSpecialProperties;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "it");
        return this.this$0.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor);
    }
}
