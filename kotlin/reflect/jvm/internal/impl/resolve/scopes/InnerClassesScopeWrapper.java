package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class InnerClassesScopeWrapper extends MemberScopeImpl {
    @NotNull
    private final MemberScope workerScope;

    public InnerClassesScopeWrapper(@NotNull MemberScope memberScope) {
        Intrinsics.checkNotNullParameter(memberScope, "workerScope");
        this.workerScope = memberScope;
    }

    @Nullable
    public final ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        ClassifierDescriptor contributedClassifier = this.workerScope.getContributedClassifier(name, lookupLocation);
        ClassifierDescriptor classifierDescriptor = null;
        if (contributedClassifier != null) {
            ClassDescriptor classDescriptor = contributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier : null;
            if (classDescriptor == null) {
                if (contributedClassifier instanceof TypeAliasDescriptor) {
                    classifierDescriptor = (TypeAliasDescriptor) contributedClassifier;
                }
                classifierDescriptor = (ClassifierDescriptorWithTypeParameters) classifierDescriptor;
            } else {
                classifierDescriptor = classDescriptor;
            }
        }
        return classifierDescriptor;
    }

    @NotNull
    public final List<ClassifierDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(function1, "nameFilter");
        DescriptorKindFilter restrictedToKindsOrNull = descriptorKindFilter.restrictedToKindsOrNull(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if (restrictedToKindsOrNull == null) {
            return CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (Object next : this.workerScope.getContributedDescriptors(restrictedToKindsOrNull, function1)) {
            if (next instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public final Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    @NotNull
    public final Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    @Nullable
    public final Set<Name> getClassifierNames() {
        return this.workerScope.getClassifierNames();
    }

    public final void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        this.workerScope.recordLookup(name, lookupLocation);
    }

    @NotNull
    public final String toString() {
        return Intrinsics.stringPlus("Classes from ", this.workerScope);
    }
}
