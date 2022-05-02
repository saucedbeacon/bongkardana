package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;

public final class JvmBuiltInsCustomizer$getJdkMethodStatus$2 extends DFS.AbstractNodeHandler<ClassDescriptor, JvmBuiltInsCustomizer.JDKMemberStatus> {
    final /* synthetic */ String $jvmDescriptor;
    final /* synthetic */ Ref.ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> $result;

    JvmBuiltInsCustomizer$getJdkMethodStatus$2(String str, Ref.ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> objectRef) {
        this.$jvmDescriptor = str;
        this.$result = objectRef;
    }

    public final boolean beforeChildren(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "javaClassDescriptor");
        String signature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, classDescriptor, this.$jvmDescriptor);
        if (JvmBuiltInsSignatures.INSTANCE.getHIDDEN_METHOD_SIGNATURES().contains(signature)) {
            this.$result.element = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
        } else if (JvmBuiltInsSignatures.INSTANCE.getVISIBLE_METHOD_SIGNATURES().contains(signature)) {
            this.$result.element = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
        } else if (JvmBuiltInsSignatures.INSTANCE.getDROP_LIST_METHOD_SIGNATURES().contains(signature)) {
            this.$result.element = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
        }
        return this.$result.element == null;
    }

    @NotNull
    public final JvmBuiltInsCustomizer.JDKMemberStatus result() {
        JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) this.$result.element;
        return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
    }
}
