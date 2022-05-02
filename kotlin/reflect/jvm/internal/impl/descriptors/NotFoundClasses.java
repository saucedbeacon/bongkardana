package kotlin.reflect.jvm.internal.impl.descriptors;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import id.dana.data.constant.BranchLinkConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NotFoundClasses {
    @NotNull
    private final MemoizedFunctionToNotNull<ClassRequest, ClassDescriptor> classes = this.storageManager.createMemoizedFunction(new NotFoundClasses$classes$1(this));
    /* access modifiers changed from: private */
    @NotNull
    public final ModuleDescriptor module;
    /* access modifiers changed from: private */
    @NotNull
    public final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> packageFragments;
    /* access modifiers changed from: private */
    @NotNull
    public final StorageManager storageManager;

    public NotFoundClasses(@NotNull StorageManager storageManager2, @NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        this.storageManager = storageManager2;
        this.module = moduleDescriptor;
        this.packageFragments = storageManager2.createMemoizedFunction(new NotFoundClasses$packageFragments$1(this));
    }

    static final class ClassRequest {
        @NotNull
        private final ClassId classId;
        @NotNull
        private final List<Integer> typeParametersCount;

        @NotNull
        public final ClassId component1() {
            return this.classId;
        }

        @NotNull
        public final List<Integer> component2() {
            return this.typeParametersCount;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClassRequest)) {
                return false;
            }
            ClassRequest classRequest = (ClassRequest) obj;
            return Intrinsics.areEqual((Object) this.classId, (Object) classRequest.classId) && Intrinsics.areEqual((Object) this.typeParametersCount, (Object) classRequest.typeParametersCount);
        }

        public final int hashCode() {
            return (this.classId.hashCode() * 31) + this.typeParametersCount.hashCode();
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ClassRequest(classId=");
            sb.append(this.classId);
            sb.append(", typeParametersCount=");
            sb.append(this.typeParametersCount);
            sb.append(')');
            return sb.toString();
        }

        public ClassRequest(@NotNull ClassId classId2, @NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(classId2, "classId");
            Intrinsics.checkNotNullParameter(list, "typeParametersCount");
            this.classId = classId2;
            this.typeParametersCount = list;
        }
    }

    public static final class MockClassDescriptor extends ClassDescriptorBase {
        @NotNull
        private final List<TypeParameterDescriptor> declaredTypeParameters;
        private final boolean isInner;
        @NotNull
        private final ClassTypeConstructorImpl typeConstructor;

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

        public final boolean isExternal() {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(@NotNull StorageManager storageManager, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Name name, boolean z, int i) {
            super(storageManager, declarationDescriptor, name, SourceElement.NO_SOURCE, false);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(declarationDescriptor, BranchLinkConstant.PathTarget.CONTAINER);
            Intrinsics.checkNotNullParameter(name, "name");
            this.isInner = z;
            Iterable until = RangesKt.until(0, i);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, Annotations.Companion.getEMPTY(), false, Variance.INVARIANT, Name.identifier(Intrinsics.stringPlus(DiskFormatter.TB, Integer.valueOf(nextInt))), nextInt, storageManager));
            }
            this.declaredTypeParameters = (List) arrayList;
            this.typeConstructor = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), SetsKt.setOf(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @NotNull
        public final ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @NotNull
        public final Modality getModality() {
            return Modality.FINAL;
        }

        @NotNull
        public final DescriptorVisibility getVisibility() {
            DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
            Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "PUBLIC");
            return descriptorVisibility;
        }

        @NotNull
        public final ClassTypeConstructorImpl getTypeConstructor() {
            return this.typeConstructor;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.declaredTypeParameters;
        }

        public final boolean isInner() {
            return this.isInner;
        }

        @NotNull
        public final Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final MemberScope.Empty getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
        }

        @NotNull
        public final MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @NotNull
        public final Collection<ClassConstructorDescriptor> getConstructors() {
            return SetsKt.emptySet();
        }

        @NotNull
        public final Collection<ClassDescriptor> getSealedSubclasses() {
            return CollectionsKt.emptyList();
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("class ");
            sb.append(getName());
            sb.append(" (not found)");
            return sb.toString();
        }
    }

    @NotNull
    public final ClassDescriptor getClass(@NotNull ClassId classId, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(list, "typeParametersCount");
        return this.classes.invoke(new ClassRequest(classId, list));
    }
}
