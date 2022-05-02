package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractScopeAdapter implements MemberScope {
    /* access modifiers changed from: protected */
    @NotNull
    public abstract MemberScope getWorkerScope();

    @NotNull
    public final MemberScope getActualScope() {
        AbstractScopeAdapter abstractScopeAdapter = this;
        while (abstractScopeAdapter.getWorkerScope() instanceof AbstractScopeAdapter) {
            abstractScopeAdapter = (AbstractScopeAdapter) abstractScopeAdapter.getWorkerScope();
        }
        return abstractScopeAdapter.getWorkerScope();
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        return getWorkerScope().getContributedFunctions(name, lookupLocation);
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        return getWorkerScope().getContributedClassifier(name, lookupLocation);
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        return getWorkerScope().getContributedVariables(name, lookupLocation);
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(function1, "nameFilter");
        return getWorkerScope().getContributedDescriptors(descriptorKindFilter, function1);
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        return getWorkerScope().getFunctionNames();
    }

    @NotNull
    public Set<Name> getVariableNames() {
        return getWorkerScope().getVariableNames();
    }

    @Nullable
    public Set<Name> getClassifierNames() {
        return getWorkerScope().getClassifierNames();
    }

    public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        getWorkerScope().recordLookup(name, lookupLocation);
    }
}
