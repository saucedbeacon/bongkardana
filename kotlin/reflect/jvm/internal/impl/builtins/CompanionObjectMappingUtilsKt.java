package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(@NotNull CompanionObjectMapping companionObjectMapping, @NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(companionObjectMapping, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!DescriptorUtils.isCompanionObject(classDescriptor)) {
            return false;
        }
        Iterable classIds = companionObjectMapping.getClassIds();
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        return CollectionsKt.contains(classIds, classId == null ? null : classId.getOuterClassId());
    }
}
