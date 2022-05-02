package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements Function1<Name, ClassDescriptorBase> {
    final /* synthetic */ LazyJavaResolverContext $c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.$c = lazyJavaResolverContext;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase invoke(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.Name r18) {
        /*
            r17 = this;
            r0 = r17
            r3 = r18
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r1 = r0.this$0
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r1 = r1.nestedClassIndex
            java.lang.Object r1 = r1.invoke()
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r3)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r1 = r0.this$0
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r1 = r1.enumEntryIndex
            java.lang.Object r1 = r1.invoke()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r3)
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField) r1
            if (r1 == 0) goto L_0x0075
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r2 = r0.$c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r2 = r2.getStorageManager()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1 r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r5 = r0.this$0
            r4.<init>(r5)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r4 = r2.createLazyValue(r4)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r2 = r0.$c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r2 = r2.getStorageManager()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r5 = r0.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = r5.getOwnerDescriptor()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r6 = r0.$c
            r7 = r1
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner r7 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner) r7
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(r6, r7)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r7 = r0.$c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r7 = r7.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory r7 = r7.getSourceElementFactory()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement) r1
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement r1 = r7.source(r1)
            r7 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r7 = (kotlin.reflect.jvm.internal.impl.descriptors.SourceElement) r7
            r1 = r2
            r2 = r5
            r3 = r18
            r5 = r6
            r6 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.create(r1, r2, r3, r4, r5, r6)
        L_0x0075:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase) r2
            return r2
        L_0x0078:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r1 = r0.$c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r1 = r1.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder r1 = r1.getFinder()
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$Request r9 = new kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$Request
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r4 = r0.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = r4.getOwnerDescriptor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) r4
            kotlin.reflect.jvm.internal.impl.name.ClassId r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.reflect.jvm.internal.impl.name.ClassId r4 = r4.createNestedClassId(r3)
            java.lang.String r3 = "ownerDescriptor.classId!!.createNestedClassId(name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r3 = r0.this$0
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r6 = r3.jClass
            r7 = 2
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r13 = r1.findClass(r9)
            if (r13 != 0) goto L_0x00b0
            goto L_0x00d6
        L_0x00b0:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r1 = r0.$c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r2 = r0.this$0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = r2.getOwnerDescriptor()
            r12 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r12 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r12
            r14 = 0
            r15 = 8
            r16 = 0
            r10 = r3
            r11 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r1 = r1.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker r1 = r1.getJavaClassesTracker()
            r2 = r3
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor) r2
            r1.reportClass(r2)
            r2 = r3
        L_0x00d6:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1.invoke(kotlin.reflect.jvm.internal.impl.name.Name):kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase");
    }
}
