package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    private static final Set<String> PUBLIC_METHOD_NAMES_IN_OBJECT = SetsKt.setOf("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    /* access modifiers changed from: private */
    @Nullable
    public final ClassDescriptor additionalSupertypeClassDescriptor;
    @NotNull
    private final Annotations annotations;
    /* access modifiers changed from: private */
    @NotNull
    public final LazyJavaResolverContext c;
    @NotNull
    private final NotNullLazyValue<List<TypeParameterDescriptor>> declaredParameters;
    @NotNull
    private final InnerClassesScopeWrapper innerClassesScope;
    private final boolean isInner;
    @NotNull
    private final JavaClass jClass;
    @NotNull
    private final ClassKind kind;
    @NotNull
    private final Modality modality;
    @NotNull
    private final LazyJavaResolverContext outerContext;
    @NotNull
    private final ScopesHolderForClass<LazyJavaClassMemberScope> scopeHolder;
    @NotNull
    private final LazyJavaStaticClassScope staticScope;
    @NotNull
    private final LazyJavaClassTypeConstructor typeConstructor;
    /* access modifiers changed from: private */
    @NotNull
    public final LazyJavaClassMemberScope unsubstitutedMemberScope;
    @NotNull
    private final Visibility visibility;

    @Nullable
    public final ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Nullable
    public final ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public final boolean isActual() {
        return false;
    }

    public final boolean isCompanionObject() {
        return false;
    }

    public final boolean isData() {
        return false;
    }

    public final boolean isExpect() {
        return false;
    }

    public final boolean isFun() {
        return false;
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean isValue() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i & 8) != 0 ? null : classDescriptor);
    }

    @NotNull
    public final JavaClass getJClass() {
        return this.jClass;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LazyJavaClassDescriptor(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r18, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r19) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            r8 = r18
            java.lang.String r0 = "outerContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "containingDeclaration"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "jClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r1 = r16.getStorageManager()
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r18.getName()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r16.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory r0 = r0.getSourceElementFactory()
            r4 = r8
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement r4 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement) r4
            kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement r0 = r0.source(r4)
            r4 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r4 = (kotlin.reflect.jvm.internal.impl.descriptors.SourceElement) r4
            r5 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.outerContext = r7
            r6.jClass = r8
            r0 = r19
            r6.additionalSupertypeClassDescriptor = r0
            r1 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor) r1
            r2 = r8
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner r2 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner) r2
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r16
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.childForClassOrPackage$default(r0, r1, r2, r3, r4, r5)
            r6.c = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r0.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache r0 = r0.getJavaResolverCache()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r1 = r6.jClass
            r2 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
            r0.recordClass(r1, r2)
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r0 = r0.getLightClassOriginKind()
            r1 = 1
            if (r0 != 0) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            boolean r4 = kotlin._Assertions.ENABLED
            if (r4 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0071
            goto L_0x0083
        L_0x0071:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r15.getJClass()
            java.lang.String r1 = "Creating LazyJavaClassDescriptor for light class "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0083:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            boolean r0 = r0.isAnnotationType()
            if (r0 == 0) goto L_0x008e
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            goto L_0x00a6
        L_0x008e:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L_0x0099
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            goto L_0x00a6
        L_0x0099:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L_0x00a4
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            goto L_0x00a6
        L_0x00a4:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
        L_0x00a6:
            r6.kind = r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            boolean r0 = r0.isAnnotationType()
            if (r0 != 0) goto L_0x00e3
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L_0x00b9
            goto L_0x00e3
        L_0x00b9:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality$Companion r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r4 = r6.jClass
            boolean r4 = r4.isSealed()
            if (r4 != 0) goto L_0x00d6
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r4 = r6.jClass
            boolean r4 = r4.isAbstract()
            if (r4 != 0) goto L_0x00d6
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r4 = r6.jClass
            boolean r4 = r4.isInterface()
            if (r4 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r4 = 0
            goto L_0x00d7
        L_0x00d6:
            r4 = 1
        L_0x00d7:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r5 = r6.jClass
            boolean r5 = r5.isFinal()
            r5 = r5 ^ r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r0.convertFromFlags(r3, r4, r5)
            goto L_0x00e5
        L_0x00e3:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
        L_0x00e5:
            r6.modality = r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r0 = r0.getVisibility()
            r6.visibility = r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r0.getOuterClass()
            if (r0 == 0) goto L_0x0101
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r0 = r6.jClass
            boolean r0 = r0.isStatic()
            if (r0 != 0) goto L_0x0101
            r0 = 1
            goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            r6.isInner = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor
            r0.<init>(r15)
            r6.typeConstructor = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r8 = r6.c
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r10 = r6.jClass
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = r6.additionalSupertypeClassDescriptor
            if (r4 == 0) goto L_0x0117
            r11 = 1
            goto L_0x0118
        L_0x0117:
            r11 = 0
        L_0x0118:
            r12 = 0
            r13 = 16
            r14 = 0
            r7 = r0
            r9 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r6.unsubstitutedMemberScope = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$Companion r0 = kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass.Companion
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r1 = r6.c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r1 = r1.getStorageManager()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r3 = r6.c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r3 = r3.getComponents()
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker r3 = r3.getKotlinTypeChecker()
            kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner r3 = r3.getKotlinTypeRefiner()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1 r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1
            r4.<init>(r15)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass r0 = r0.create(r2, r1, r3, r4)
            r6.scopeHolder = r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper r0 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r1 = r6.unsubstitutedMemberScope
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) r1
            r0.<init>(r1)
            r6.innerClassesScope = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r1 = r6.c
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r2 = r6.jClass
            r0.<init>(r1, r2, r15)
            r6.staticScope = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r0 = r6.c
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r1 = r6.jClass
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner) r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt.resolveAnnotations(r0, r1)
            r6.annotations = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r0 = r6.c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r0 = r0.getStorageManager()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1 r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            r1.<init>(r15)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r0 = r0.createLazyValue(r1)
            r6.declaredParameters = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):void");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final ClassKind getKind() {
        return this.kind;
    }

    @NotNull
    public final Modality getModality() {
        return this.modality;
    }

    @NotNull
    public final DescriptorVisibility getVisibility() {
        if (!Intrinsics.areEqual((Object) this.visibility, (Object) DescriptorVisibilities.PRIVATE) || this.jClass.getOuterClass() != null) {
            return UtilsKt.toDescriptorVisibility(this.visibility);
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "{\n            JavaDescriptorVisibilities.PACKAGE_VISIBILITY\n        }");
        return descriptorVisibility;
    }

    public final boolean isInner() {
        return this.isInner;
    }

    @NotNull
    public final TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final LazyJavaClassMemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.scopeHolder.getScope(kotlinTypeRefiner);
    }

    @NotNull
    public final MemberScope getUnsubstitutedInnerClassesScope() {
        return this.innerClassesScope;
    }

    @NotNull
    public final MemberScope getStaticScope() {
        return this.staticScope;
    }

    @NotNull
    public final LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        return (LazyJavaClassMemberScope) super.getUnsubstitutedMemberScope();
    }

    @NotNull
    public final List<ClassConstructorDescriptor> getConstructors() {
        return (List) this.unsubstitutedMemberScope.getConstructors$descriptors_jvm().invoke();
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return (List) this.declaredParameters.invoke();
    }

    @NotNull
    public final Collection<ClassDescriptor> getSealedSubclasses() {
        if (this.modality != Modality.SEALED) {
            return CollectionsKt.emptyList();
        }
        JavaTypeAttributes attributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, (TypeParameterDescriptor) null, 3, (Object) null);
        Collection arrayList = new ArrayList();
        for (JavaClassifierType transformJavaType : this.jClass.getPermittedTypes()) {
            ClassifierDescriptor declarationDescriptor = this.c.getTypeResolver().transformJavaType(transformJavaType, attributes$default).getConstructor().getDeclarationDescriptor();
            ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public final String toString() {
        return Intrinsics.stringPlus("Lazy Java class ", DescriptorUtilsKt.getFqNameUnsafe(this));
    }

    final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {
        @NotNull
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters = this.this$0.c.getStorageManager().createLazyValue(new LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1(this.this$0));
        final /* synthetic */ LazyJavaClassDescriptor this$0;

        public final boolean isDenotable() {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LazyJavaClassTypeConstructor(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            super(lazyJavaClassDescriptor.c.getStorageManager());
            Intrinsics.checkNotNullParameter(lazyJavaClassDescriptor, "this$0");
            this.this$0 = lazyJavaClassDescriptor;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        @NotNull
        public final Collection<KotlinType> computeSupertypes() {
            Object obj;
            Collection<JavaClassifierType> supertypes = this.this$0.getJClass().getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            ArrayList arrayList2 = new ArrayList(0);
            KotlinType purelyImplementedSupertype = getPurelyImplementedSupertype();
            Iterator<JavaClassifierType> it = supertypes.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType transformJavaType = this.this$0.c.getTypeResolver().transformJavaType(next, JavaTypeResolverKt.toAttributes$default(TypeUsage.SUPERTYPE, false, (TypeParameterDescriptor) null, 3, (Object) null));
                if (this.this$0.c.getComponents().getSettings().getTypeEnhancementImprovements()) {
                    transformJavaType = this.this$0.c.getComponents().getSignatureEnhancement().enhanceSuperType(transformJavaType, this.this$0.c);
                }
                if (transformJavaType.getConstructor().getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                TypeConstructor constructor = transformJavaType.getConstructor();
                if (purelyImplementedSupertype != null) {
                    obj = purelyImplementedSupertype.getConstructor();
                }
                if (!Intrinsics.areEqual((Object) constructor, obj) && !KotlinBuiltIns.isAnyOrNullableAny(transformJavaType)) {
                    arrayList.add(transformJavaType);
                }
            }
            Collection collection = arrayList;
            ClassDescriptor access$getAdditionalSupertypeClassDescriptor$p = this.this$0.additionalSupertypeClassDescriptor;
            if (access$getAdditionalSupertypeClassDescriptor$p != null) {
                obj = MappingUtilKt.createMappedTypeParametersSubstitution(access$getAdditionalSupertypeClassDescriptor$p, this.this$0).buildSubstitutor().substitute(access$getAdditionalSupertypeClassDescriptor$p.getDefaultType(), Variance.INVARIANT);
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection, obj);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(collection, purelyImplementedSupertype);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = this.this$0.c.getComponents().getErrorReporter();
                ClassDescriptor declarationDescriptor = getDeclarationDescriptor();
                Iterable<JavaType> iterable = arrayList2;
                Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (JavaType javaType : iterable) {
                    arrayList3.add(((JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter.reportIncompleteHierarchy(declarationDescriptor, (List) arrayList3);
            }
            return collection.isEmpty() ^ true ? CollectionsKt.toList(arrayList) : CollectionsKt.listOf(this.this$0.c.getModule().getBuiltIns().getAnyType());
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.Collection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.List} */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            if ((!r0.isRoot() && r0.startsWith(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_NAME)) != false) goto L_0x001d;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType getPurelyImplementedSupertype() {
            /*
                r8 = this;
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = r8.getPurelyImplementsFqNameFromAnnotation()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x001c
                boolean r3 = r0.isRoot()
                if (r3 != 0) goto L_0x0018
                kotlin.reflect.jvm.internal.impl.name.Name r3 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_NAME
                boolean r3 = r0.startsWith(r3)
                if (r3 == 0) goto L_0x0018
                r3 = 1
                goto L_0x0019
            L_0x0018:
                r3 = 0
            L_0x0019:
                if (r3 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r0 = r2
            L_0x001d:
                if (r0 != 0) goto L_0x0030
                kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider r3 = kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider.INSTANCE
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r4 = r8.this$0
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r4
                kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r4)
                kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.getPurelyImplementedInterface(r4)
                if (r3 != 0) goto L_0x0031
                return r2
            L_0x0030:
                r3 = r0
            L_0x0031:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r4 = r8.this$0
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = r4.c
                kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r4 = r4.getModule()
                kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r5 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER
                kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation r5 = (kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation) r5
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.resolveTopLevelClass(r4, r3, r5)
                if (r3 != 0) goto L_0x0046
                return r2
            L_0x0046:
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r3.getTypeConstructor()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r5 = r8.this$0
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r5.getTypeConstructor()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L_0x009a
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r7)
                r0.<init>(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r1 = r5.iterator()
            L_0x007a:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0097
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
                kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r4 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
                kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r2.getDefaultType()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L_0x007a
            L_0x0097:
                java.util.List r0 = (java.util.List) r0
                goto L_0x00dc
            L_0x009a:
                if (r6 != r1) goto L_0x00eb
                if (r4 <= r1) goto L_0x00eb
                if (r0 != 0) goto L_0x00eb
                kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r0 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
                kotlin.reflect.jvm.internal.impl.types.Variance r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                java.lang.Object r5 = kotlin.collections.CollectionsKt.single(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r5
                kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.getDefaultType()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r5
                r0.<init>(r2, r5)
                kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
                r2.<init>(r1, r4)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r7)
                r1.<init>(r4)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r2 = r2.iterator()
            L_0x00c9:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x00d9
                r4 = r2
                kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4
                r4.nextInt()
                r1.add(r0)
                goto L_0x00c9
            L_0x00d9:
                r0 = r1
                java.util.List r0 = (java.util.List) r0
            L_0x00dc:
                kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r1 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.INSTANCE
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r1.getEMPTY()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(r1, r3, r0)
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
                return r0
            L_0x00eb:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype():kotlin.reflect.jvm.internal.impl.types.KotlinType");
        }

        private final FqName getPurelyImplementsFqNameFromAnnotation() {
            Annotations annotations = this.this$0.getAnnotations();
            FqName fqName = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            Intrinsics.checkNotNullExpressionValue(fqName, "PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
            if (findAnnotation == null) {
                return null;
            }
            Object singleOrNull = CollectionsKt.singleOrNull(findAnnotation.getAllValueArguments().values());
            StringValue stringValue = singleOrNull instanceof StringValue ? (StringValue) singleOrNull : null;
            String str = stringValue == null ? null : (String) stringValue.getValue();
            if (str != null && FqNamesUtilKt.isValidJavaFqName(str)) {
                return new FqName(str);
            }
            return null;
        }

        @NotNull
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            return this.this$0.c.getComponents().getSupertypeLoopChecker();
        }

        @NotNull
        public final ClassDescriptor getDeclarationDescriptor() {
            return this.this$0;
        }

        @NotNull
        public final String toString() {
            String asString = this.this$0.getName().asString();
            Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
            return asString;
        }
    }

    @NotNull
    public final LazyJavaClassDescriptor copy$descriptors_jvm(@NotNull JavaResolverCache javaResolverCache, @Nullable ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        LazyJavaResolverContext replaceComponents = ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "containingDeclaration");
        return new LazyJavaClassDescriptor(replaceComponents, containingDeclaration, this.jClass, classDescriptor);
    }
}
