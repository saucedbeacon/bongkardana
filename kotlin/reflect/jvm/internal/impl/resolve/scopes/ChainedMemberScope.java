package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import id.dana.data.constant.BranchLinkConstant;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ChainedMemberScope implements MemberScope {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    private final String debugName;
    /* access modifiers changed from: private */
    @NotNull
    public final MemberScope[] scopes;

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }

    private ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.debugName = str;
        this.scopes = memberScopeArr;
    }

    @Nullable
    public final ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        ClassifierDescriptor classifierDescriptor = null;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier(name, lookupLocation);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) contributedClassifier).isExpect()) {
                    return contributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @NotNull
    public final Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name, lookupLocation);
        }
        Collection<PropertyDescriptor> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedVariables(name, lookupLocation));
        }
        if (collection == null) {
            return SetsKt.emptySet();
        }
        return collection;
    }

    @NotNull
    public final Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name, lookupLocation);
        }
        Collection<SimpleFunctionDescriptor> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedFunctions(name, lookupLocation));
        }
        if (collection == null) {
            return SetsKt.emptySet();
        }
        return collection;
    }

    @NotNull
    public final Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(descriptorKindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(function1, "nameFilter");
        MemberScope[] memberScopeArr = this.scopes;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.emptyList();
        }
        int i = 0;
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(descriptorKindFilter, function1);
        }
        Collection<DeclarationDescriptor> collection = null;
        int length2 = memberScopeArr.length;
        while (i < length2) {
            MemberScope memberScope = memberScopeArr[i];
            i++;
            collection = ScopeUtilsKt.concat(collection, memberScope.getContributedDescriptors(descriptorKindFilter, function1));
        }
        if (collection == null) {
            return SetsKt.emptySet();
        }
        return collection;
    }

    @NotNull
    public final Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArr = this.scopes;
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope functionNames : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, functionNames.getFunctionNames());
        }
        return (Set) linkedHashSet;
    }

    @NotNull
    public final Set<Name> getVariableNames() {
        MemberScope[] memberScopeArr = this.scopes;
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope variableNames : memberScopeArr) {
            CollectionsKt.addAll(linkedHashSet, variableNames.getVariableNames());
        }
        return (Set) linkedHashSet;
    }

    @Nullable
    public final Set<Name> getClassifierNames() {
        return MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt.asIterable((T[]) this.scopes));
    }

    public final void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        for (MemberScope recordLookup : this.scopes) {
            recordLookup.recordLookup(name, lookupLocation);
        }
    }

    @NotNull
    public final String toString() {
        return this.debugName;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final MemberScope create(@NotNull String str, @NotNull Iterable<? extends MemberScope> iterable) {
            Intrinsics.checkNotNullParameter(str, "debugName");
            Intrinsics.checkNotNullParameter(iterable, BranchLinkConstant.OauthParams.SCOPES);
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : iterable) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.addAll(smartList, (T[]) ((ChainedMemberScope) memberScope).scopes);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(str, smartList);
        }

        @NotNull
        public final MemberScope createOrSingle$descriptors(@NotNull String str, @NotNull List<? extends MemberScope> list) {
            Intrinsics.checkNotNullParameter(str, "debugName");
            Intrinsics.checkNotNullParameter(list, BranchLinkConstant.OauthParams.SCOPES);
            int size = list.size();
            if (size == 0) {
                return MemberScope.Empty.INSTANCE;
            }
            if (size == 1) {
                return (MemberScope) list.get(0);
            }
            Object[] array = list.toArray(new MemberScope[0]);
            if (array != null) {
                return new ChainedMemberScope(str, (MemberScope[]) array, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
