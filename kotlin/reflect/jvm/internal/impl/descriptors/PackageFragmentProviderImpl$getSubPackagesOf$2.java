package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements Function1<FqName, Boolean> {
    final /* synthetic */ FqName $fqName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PackageFragmentProviderImpl$getSubPackagesOf$2(FqName fqName) {
        super(1);
        this.$fqName = fqName;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((FqName) obj));
    }

    public final boolean invoke(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "it");
        return !fqName.isRoot() && Intrinsics.areEqual((Object) fqName.parent(), (Object) this.$fqName);
    }
}
