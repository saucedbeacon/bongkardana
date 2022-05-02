package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaResolverContext {
    @NotNull
    private final JavaResolverComponents components;
    @NotNull
    private final Lazy defaultTypeQualifiers$delegate;
    @NotNull
    private final Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers;
    @NotNull
    private final TypeParameterResolver typeParameterResolver;
    @NotNull
    private final JavaTypeResolver typeResolver;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents javaResolverComponents, @NotNull TypeParameterResolver typeParameterResolver2, @NotNull Lazy<JavaTypeQualifiersByElementType> lazy) {
        Intrinsics.checkNotNullParameter(javaResolverComponents, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver2, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(lazy, "delegateForDefaultTypeQualifiers");
        this.components = javaResolverComponents;
        this.typeParameterResolver = typeParameterResolver2;
        this.delegateForDefaultTypeQualifiers = lazy;
        this.defaultTypeQualifiers$delegate = lazy;
        this.typeResolver = new JavaTypeResolver(this, typeParameterResolver2);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.components;
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.defaultTypeQualifiers$delegate.getValue();
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.components.getModule();
    }
}
