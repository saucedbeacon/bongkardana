package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmPackageScope implements MemberScope {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    /* access modifiers changed from: private */
    @NotNull
    public final LazyJavaResolverContext c;
    @NotNull
    private final LazyJavaPackageScope javaScope;
    @NotNull
    private final NotNullLazyValue kotlinScopes$delegate = this.c.getStorageManager().createLazyValue(new JvmPackageScope$kotlinScopes$2(this));
    /* access modifiers changed from: private */
    @NotNull
    public final LazyJavaPackageFragment packageFragment;

    public JvmPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "c");
        Intrinsics.checkNotNullParameter(javaPackage, "jPackage");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragment, "packageFragment");
        this.c = lazyJavaResolverContext;
        this.packageFragment = lazyJavaPackageFragment;
        this.javaScope = new LazyJavaPackageScope(this.c, javaPackage, this.packageFragment);
    }

    @NotNull
    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.javaScope;
    }

    private final MemberScope[] getKotlinScopes() {
        return (MemberScope[]) StorageKt.getValue(this.kotlinScopes$delegate, (Object) this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Nullable
    public final ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        ClassDescriptor contributedClassifier = this.javaScope.getContributedClassifier(name, lookupLocation);
        if (contributedClassifier != null) {
            return contributedClassifier;
        }
        MemberScope[] kotlinScopes = getKotlinScopes();
        ClassifierDescriptor classifierDescriptor = null;
        int i = 0;
        int length = kotlinScopes.length;
        while (i < length) {
            MemberScope memberScope = kotlinScopes[i];
            i++;
            ClassifierDescriptor contributedClassifier2 = memberScope.getContributedClassifier(name, lookupLocation);
            if (contributedClassifier2 != null) {
                if (!(contributedClassifier2 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) contributedClassifier2).isExpect()) {
                    return contributedClassifier2;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier2;
                }
            }
        }
        return classifierDescriptor;
    }

    @NotNull
    public final Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection contributedVariables = lazyJavaPackageScope.getContributedVariables(name, lookupLocation);
        int length = kotlinScopes.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = kotlinScopes[i];
            i++;
            contributedVariables = ScopeUtilsKt.concat(contributedVariables, memberScope.getContributedVariables(name, lookupLocation));
        }
        return contributedVariables == null ? SetsKt.emptySet() : contributedVariables;
    }

    @NotNull
    public final Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name, lookupLocation);
        int length = kotlinScopes.length;
        int i = 0;
        while (i < length) {
            MemberScope memberScope = kotlinScopes[i];
            i++;
            contributedFunctions = ScopeUtilsKt.concat(contributedFunctions, memberScope.getContributedFunctions(name, lookupLocation));
        }
        return contributedFunctions == null ? SetsKt.emptySet() : contributedFunctions;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r0 = r5.javaScope
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope[] r1 = r5.getKotlinScopes()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope) r0
            java.util.Collection r0 = r0.getContributedDescriptors(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0018:
            if (r3 >= r2) goto L_0x0027
            r4 = r1[r3]
            int r3 = r3 + 1
            java.util.Collection r4 = r4.getContributedDescriptors(r6, r7)
            java.util.Collection r0 = kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt.concat(r0, r4)
            goto L_0x0018
        L_0x0027:
            if (r0 != 0) goto L_0x0030
            java.util.Set r6 = kotlin.collections.SetsKt.emptySet()
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JvmPackageScope.getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter, kotlin.jvm.functions.Function1):java.util.Collection");
    }

    @NotNull
    public final Set<Name> getFunctionNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope functionNames : kotlinScopes) {
            CollectionsKt.addAll(linkedHashSet, functionNames.getFunctionNames());
        }
        Set<Name> set = (Set) linkedHashSet;
        set.addAll(getJavaScope$descriptors_jvm().getFunctionNames());
        return set;
    }

    @NotNull
    public final Set<Name> getVariableNames() {
        MemberScope[] kotlinScopes = getKotlinScopes();
        Collection linkedHashSet = new LinkedHashSet();
        for (MemberScope variableNames : kotlinScopes) {
            CollectionsKt.addAll(linkedHashSet, variableNames.getVariableNames());
        }
        Set<Name> set = (Set) linkedHashSet;
        set.addAll(getJavaScope$descriptors_jvm().getVariableNames());
        return set;
    }

    @Nullable
    public final Set<Name> getClassifierNames() {
        Set<Name> flatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(ArraysKt.asIterable((T[]) getKotlinScopes()));
        if (flatMapClassifierNamesOrNull == null) {
            return null;
        }
        flatMapClassifierNamesOrNull.addAll(getJavaScope$descriptors_jvm().getClassifierNames());
        return flatMapClassifierNamesOrNull;
    }

    public final void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lookupLocation, "location");
        UtilsKt.record(this.c.getComponents().getLookupTracker(), lookupLocation, (PackageFragmentDescriptor) this.packageFragment, name);
    }
}
