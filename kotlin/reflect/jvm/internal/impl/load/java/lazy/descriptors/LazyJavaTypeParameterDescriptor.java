package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    @NotNull
    private final LazyJavaAnnotations annotations = new LazyJavaAnnotations(this.c, this.javaTypeParameter, false, 4, (DefaultConstructorMarker) null);
    @NotNull
    private final LazyJavaResolverContext c;
    @NotNull
    private final JavaTypeParameter javaTypeParameter;

    public final void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LazyJavaTypeParameterDescriptor(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter r18, int r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r20) {
        /*
            r16 = this;
            r9 = r16
            r10 = r17
            r11 = r18
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "javaTypeParameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "containingDeclaration"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r1 = r17.getStorageManager()
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r18.getName()
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r7 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r17.getComponents()
            kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker r8 = r0.getSupertypeLoopChecker()
            r5 = 0
            r0 = r16
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.c = r10
            r9.javaTypeParameter = r11
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r11 = r9.c
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter r1 = r9.javaTypeParameter
            r12 = r1
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner r12 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner) r12
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r9.annotations = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor.<init>(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, int, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor):void");
    }

    @NotNull
    public final LazyJavaAnnotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<KotlinType> resolveUpperBounds() {
        return computeNotEnhancedBounds();
    }

    private final List<KotlinType> computeNotEnhancedBounds() {
        Collection<JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            SimpleType anyType = this.c.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkNotNullExpressionValue(anyType, "c.module.builtIns.anyType");
            SimpleType nullableAnyType = this.c.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "c.module.builtIns.nullableAnyType");
            return CollectionsKt.listOf(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Iterable<JavaClassifierType> iterable = upperBounds;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (JavaClassifierType transformJavaType : iterable) {
            arrayList.add(this.c.getTypeResolver().transformJavaType(transformJavaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, this, 1, (Object) null)));
        }
        return (List) arrayList;
    }

    @NotNull
    public final List<KotlinType> processBoundsWithoutCycles(@NotNull List<? extends KotlinType> list) {
        Intrinsics.checkNotNullParameter(list, "bounds");
        return this.c.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, list, this.c);
    }
}
