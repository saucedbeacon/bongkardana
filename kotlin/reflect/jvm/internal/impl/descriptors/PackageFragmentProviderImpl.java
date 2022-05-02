package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {
    @NotNull
    private final Collection<PackageFragmentDescriptor> packageFragments;

    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> collection) {
        Intrinsics.checkNotNullParameter(collection, "packageFragments");
        this.packageFragments = collection;
    }

    public final void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(collection, "packageFragments");
        for (Object next : this.packageFragments) {
            if (Intrinsics.areEqual((Object) ((PackageFragmentDescriptor) next).getFqName(), (Object) fqName)) {
                collection.add(next);
            }
        }
    }

    @NotNull
    public final List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Collection arrayList = new ArrayList();
        for (Object next : this.packageFragments) {
            if (Intrinsics.areEqual((Object) ((PackageFragmentDescriptor) next).getFqName(), (Object) fqName)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public final Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(function1, "nameFilter");
        return SequencesKt.toList(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(this.packageFragments), PackageFragmentProviderImpl$getSubPackagesOf$1.INSTANCE), new PackageFragmentProviderImpl$getSubPackagesOf$2(fqName)));
    }
}
