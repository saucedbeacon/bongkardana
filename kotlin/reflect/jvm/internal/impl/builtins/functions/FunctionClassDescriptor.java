package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public static final ClassId functionClassId = new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, Name.identifier("Function"));
    /* access modifiers changed from: private */
    @NotNull
    public static final ClassId kFunctionClassId = new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, Name.identifier("KFunction"));
    private final int arity;
    /* access modifiers changed from: private */
    @NotNull
    public final PackageFragmentDescriptor containingDeclaration;
    @NotNull
    private final FunctionClassKind functionKind;
    @NotNull
    private final FunctionClassScope memberScope = new FunctionClassScope(this.storageManager, this);
    /* access modifiers changed from: private */
    @NotNull
    public final List<TypeParameterDescriptor> parameters;
    /* access modifiers changed from: private */
    @NotNull
    public final StorageManager storageManager;
    @NotNull
    private final FunctionTypeConstructor typeConstructor = new FunctionTypeConstructor(this);

    @Nullable
    public final Void getCompanionObjectDescriptor() {
        return null;
    }

    @Nullable
    public final Void getUnsubstitutedPrimaryConstructor() {
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

    public final boolean isExternal() {
        return false;
    }

    public final boolean isFun() {
        return false;
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean isInner() {
        return false;
    }

    public final boolean isValue() {
        return false;
    }

    @NotNull
    public final FunctionClassKind getFunctionKind() {
        return this.functionKind;
    }

    public final int getArity() {
        return this.arity;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(@NotNull StorageManager storageManager2, @NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull FunctionClassKind functionClassKind, int i) {
        super(storageManager2, functionClassKind.numberedClassName(i));
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionClassKind, "functionKind");
        this.storageManager = storageManager2;
        this.containingDeclaration = packageFragmentDescriptor;
        this.functionKind = functionClassKind;
        this.arity = i;
        ArrayList arrayList = new ArrayList();
        Iterable intRange = new IntRange(1, this.arity);
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator it = intRange.iterator();
        while (it.hasNext()) {
            _init_$typeParameter(arrayList, this, Variance.IN_VARIANCE, Intrinsics.stringPlus("P", Integer.valueOf(((IntIterator) it).nextInt())));
            arrayList2.add(Unit.INSTANCE);
        }
        _init_$typeParameter(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.parameters = CollectionsKt.toList(arrayList);
    }

    private static final void _init_$typeParameter(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor, Annotations.Companion.getEMPTY(), false, variance, Name.identifier(str), arrayList.size(), functionClassDescriptor.storageManager));
    }

    @NotNull
    public final PackageFragmentDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @NotNull
    public final MemberScope.Empty getStaticScope() {
        return MemberScope.Empty.INSTANCE;
    }

    @NotNull
    public final TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final FunctionClassScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.memberScope;
    }

    @NotNull
    public final List<ClassConstructorDescriptor> getConstructors() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @NotNull
    public final Modality getModality() {
        return Modality.ABSTRACT;
    }

    @NotNull
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "PUBLIC");
        return descriptorVisibility;
    }

    @NotNull
    public final Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @NotNull
    public final SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(sourceElement, "NO_SOURCE");
        return sourceElement;
    }

    @NotNull
    public final List<ClassDescriptor> getSealedSubclasses() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.parameters;
    }

    final class FunctionTypeConstructor extends AbstractClassTypeConstructor {
        final /* synthetic */ FunctionClassDescriptor this$0;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                iArr[FunctionClassKind.Function.ordinal()] = 1;
                iArr[FunctionClassKind.KFunction.ordinal()] = 2;
                iArr[FunctionClassKind.SuspendFunction.ordinal()] = 3;
                iArr[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final boolean isDenotable() {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FunctionTypeConstructor(FunctionClassDescriptor functionClassDescriptor) {
            super(functionClassDescriptor.storageManager);
            Intrinsics.checkNotNullParameter(functionClassDescriptor, "this$0");
            this.this$0 = functionClassDescriptor;
        }

        @NotNull
        public final Collection<KotlinType> computeSupertypes() {
            List list;
            int i = WhenMappings.$EnumSwitchMapping$0[this.this$0.getFunctionKind().ordinal()];
            if (i == 1) {
                list = CollectionsKt.listOf(FunctionClassDescriptor.functionClassId);
            } else if (i == 2) {
                list = CollectionsKt.listOf(FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, FunctionClassKind.Function.numberedClassName(this.this$0.getArity())));
            } else if (i == 3) {
                list = CollectionsKt.listOf(FunctionClassDescriptor.functionClassId);
            } else if (i == 4) {
                list = CollectionsKt.listOf(FunctionClassDescriptor.kFunctionClassId, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE, FunctionClassKind.SuspendFunction.numberedClassName(this.this$0.getArity())));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ModuleDescriptor containingDeclaration = this.this$0.containingDeclaration.getContainingDeclaration();
            Iterable<ClassId> iterable = list;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ClassId classId : iterable) {
                ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (findClassAcrossModuleDependencies != null) {
                    Iterable<TypeParameterDescriptor> takeLast = CollectionsKt.takeLast(getParameters(), findClassAcrossModuleDependencies.getTypeConstructor().getParameters().size());
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(takeLast, 10));
                    for (TypeParameterDescriptor defaultType : takeLast) {
                        arrayList2.add(new TypeProjectionImpl(defaultType.getDefaultType()));
                    }
                    KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
                    arrayList.add(KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), findClassAcrossModuleDependencies, (List) arrayList2));
                } else {
                    StringBuilder sb = new StringBuilder("Built-in class ");
                    sb.append(classId);
                    sb.append(" not found");
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            return CollectionsKt.toList((List) arrayList);
        }

        @NotNull
        public final List<TypeParameterDescriptor> getParameters() {
            return this.this$0.parameters;
        }

        @NotNull
        public final FunctionClassDescriptor getDeclarationDescriptor() {
            return this.this$0;
        }

        @NotNull
        public final String toString() {
            return getDeclarationDescriptor().toString();
        }

        @NotNull
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }
    }

    @NotNull
    public final String toString() {
        String asString = getName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
        return asString;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
