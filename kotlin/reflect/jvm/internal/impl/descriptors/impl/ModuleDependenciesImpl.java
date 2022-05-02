package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ModuleDependenciesImpl implements ModuleDependencies {
    @NotNull
    private final List<ModuleDescriptorImpl> allDependencies;
    @NotNull
    private final Set<ModuleDescriptorImpl> allExpectedByDependencies;
    @NotNull
    private final List<ModuleDescriptorImpl> directExpectedByDependencies;
    @NotNull
    private final Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible;

    public ModuleDependenciesImpl(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set, @NotNull List<ModuleDescriptorImpl> list2, @NotNull Set<ModuleDescriptorImpl> set2) {
        Intrinsics.checkNotNullParameter(list, "allDependencies");
        Intrinsics.checkNotNullParameter(set, "modulesWhoseInternalsAreVisible");
        Intrinsics.checkNotNullParameter(list2, "directExpectedByDependencies");
        Intrinsics.checkNotNullParameter(set2, "allExpectedByDependencies");
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.directExpectedByDependencies = list2;
        this.allExpectedByDependencies = set2;
    }

    @NotNull
    public final List<ModuleDescriptorImpl> getAllDependencies() {
        return this.allDependencies;
    }

    @NotNull
    public final Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }

    @NotNull
    public final List<ModuleDescriptorImpl> getDirectExpectedByDependencies() {
        return this.directExpectedByDependencies;
    }
}
