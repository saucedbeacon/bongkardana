package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import org.jetbrains.annotations.NotNull;

final class ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 extends Lambda implements Function0<CompositePackageFragmentProvider> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(0);
        this.this$0 = moduleDescriptorImpl;
    }

    @NotNull
    public final CompositePackageFragmentProvider invoke() {
        ModuleDependencies access$getDependencies$p = this.this$0.dependencies;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        if (access$getDependencies$p != null) {
            List<ModuleDescriptorImpl> allDependencies = access$getDependencies$p.getAllDependencies();
            boolean contains = allDependencies.contains(this.this$0);
            ModuleDescriptorImpl moduleDescriptorImpl2 = this.this$0;
            if (!_Assertions.ENABLED || contains) {
                Iterable<ModuleDescriptorImpl> iterable = allDependencies;
                ModuleDescriptorImpl moduleDescriptorImpl3 = this.this$0;
                for (ModuleDescriptorImpl moduleDescriptorImpl4 : iterable) {
                    boolean access$isInitialized = moduleDescriptorImpl4.isInitialized();
                    if (_Assertions.ENABLED && !access$isInitialized) {
                        StringBuilder sb = new StringBuilder("Dependency module ");
                        sb.append(moduleDescriptorImpl4.getId());
                        sb.append(" was not initialized by the time contents of dependent module ");
                        sb.append(moduleDescriptorImpl3.getId());
                        sb.append(" were queried");
                        throw new AssertionError(sb.toString());
                    }
                }
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ModuleDescriptorImpl access$getPackageFragmentProviderForModuleContent$p : iterable) {
                    PackageFragmentProvider access$getPackageFragmentProviderForModuleContent$p2 = access$getPackageFragmentProviderForModuleContent$p.packageFragmentProviderForModuleContent;
                    Intrinsics.checkNotNull(access$getPackageFragmentProviderForModuleContent$p2);
                    arrayList.add(access$getPackageFragmentProviderForModuleContent$p2);
                }
                return new CompositePackageFragmentProvider((List) arrayList);
            }
            StringBuilder sb2 = new StringBuilder("Module ");
            sb2.append(moduleDescriptorImpl2.getId());
            sb2.append(" is not contained in his own dependencies, this is probably a misconfiguration");
            throw new AssertionError(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("Dependencies of module ");
        sb3.append(moduleDescriptorImpl.getId());
        sb3.append(" were not set before querying module content");
        throw new AssertionError(sb3.toString());
    }
}
