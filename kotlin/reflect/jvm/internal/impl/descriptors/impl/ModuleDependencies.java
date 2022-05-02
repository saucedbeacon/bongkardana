package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public interface ModuleDependencies {
    @NotNull
    List<ModuleDescriptorImpl> getAllDependencies();

    @NotNull
    List<ModuleDescriptorImpl> getDirectExpectedByDependencies();

    @NotNull
    Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible();
}
