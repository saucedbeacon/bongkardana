package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

public final class DeserializationComponentsForJava {
    @NotNull
    private final DeserializationComponents components;

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull JavaClassDataFinder javaClassDataFinder, @NotNull BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull NotFoundClasses notFoundClasses, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull ContractDeserializer contractDeserializer, @NotNull NewKotlinTypeChecker newKotlinTypeChecker) {
        AdditionalClassPartsProvider additionalClassPartsProvider;
        StorageManager storageManager2 = storageManager;
        JavaClassDataFinder javaClassDataFinder2 = javaClassDataFinder;
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl2 = binaryClassAnnotationAndConstantLoaderImpl;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(deserializationConfiguration, "configuration");
        Intrinsics.checkNotNullParameter(javaClassDataFinder2, "classDataFinder");
        Intrinsics.checkNotNullParameter(binaryClassAnnotationAndConstantLoaderImpl2, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider2, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(newKotlinTypeChecker, "kotlinTypeChecker");
        KotlinBuiltIns builtIns = moduleDescriptor.getBuiltIns();
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = null;
        JvmBuiltIns jvmBuiltIns = builtIns instanceof JvmBuiltIns ? (JvmBuiltIns) builtIns : null;
        ClassDataFinder classDataFinder = javaClassDataFinder2;
        AnnotationAndConstantLoader annotationAndConstantLoader = binaryClassAnnotationAndConstantLoaderImpl2;
        PackageFragmentProvider packageFragmentProvider = lazyJavaPackageFragmentProvider2;
        LocalClassifierTypeSettings localClassifierTypeSettings = LocalClassifierTypeSettings.Default.INSTANCE;
        FlexibleTypeDeserializer flexibleTypeDeserializer = JavaFlexibleTypeDeserializer.INSTANCE;
        Iterable emptyList = CollectionsKt.emptyList();
        if (jvmBuiltIns == null) {
            additionalClassPartsProvider = null;
        } else {
            additionalClassPartsProvider = jvmBuiltIns.getCustomizer();
        }
        AdditionalClassPartsProvider additionalClassPartsProvider2 = additionalClassPartsProvider == null ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider;
        jvmBuiltInsCustomizer = jvmBuiltIns != null ? jvmBuiltIns.getCustomizer() : jvmBuiltInsCustomizer;
        DeserializationComponents deserializationComponents = r0;
        DeserializationComponents deserializationComponents2 = new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, emptyList, notFoundClasses, contractDeserializer, additionalClassPartsProvider2, jvmBuiltInsCustomizer == null ? PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : jvmBuiltInsCustomizer, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY(), newKotlinTypeChecker, new SamConversionResolverImpl(storageManager2, CollectionsKt.emptyList()), (PlatformDependentTypeTransformer) null, 262144, (DefaultConstructorMarker) null);
        this.components = deserializationComponents;
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.components;
    }
}
