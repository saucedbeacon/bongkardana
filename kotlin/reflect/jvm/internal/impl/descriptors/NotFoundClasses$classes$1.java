package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

final class NotFoundClasses$classes$1 extends Lambda implements Function1<NotFoundClasses.ClassRequest, ClassDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    @NotNull
    public final ClassDescriptor invoke(@NotNull NotFoundClasses.ClassRequest classRequest) {
        ClassDescriptor classDescriptor;
        ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor;
        Intrinsics.checkNotNullParameter(classRequest, "$dstr$classId$typeParametersCount");
        ClassId component1 = classRequest.component1();
        List<Integer> component2 = classRequest.component2();
        if (!component1.isLocal()) {
            ClassId outerClassId = component1.getOuterClassId();
            if (outerClassId == null) {
                classDescriptor = null;
            } else {
                classDescriptor = this.this$0.getClass(outerClassId, CollectionsKt.drop(component2, 1));
            }
            if (classDescriptor == null) {
                MemoizedFunctionToNotNull access$getPackageFragments$p = this.this$0.packageFragments;
                FqName packageFqName = component1.getPackageFqName();
                Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
                classOrPackageFragmentDescriptor = (ClassOrPackageFragmentDescriptor) access$getPackageFragments$p.invoke(packageFqName);
            } else {
                classOrPackageFragmentDescriptor = classDescriptor;
            }
            boolean isNestedClass = component1.isNestedClass();
            StorageManager access$getStorageManager$p = this.this$0.storageManager;
            DeclarationDescriptor declarationDescriptor = classOrPackageFragmentDescriptor;
            Name shortClassName = component1.getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "classId.shortClassName");
            Integer num = (Integer) CollectionsKt.firstOrNull(component2);
            return new NotFoundClasses.MockClassDescriptor(access$getStorageManager$p, declarationDescriptor, shortClassName, isNestedClass, num == null ? 0 : num.intValue());
        }
        throw new UnsupportedOperationException(Intrinsics.stringPlus("Unresolved local class: ", component1));
    }
}
