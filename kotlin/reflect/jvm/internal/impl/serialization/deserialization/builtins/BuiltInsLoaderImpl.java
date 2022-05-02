package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    @NotNull
    private final BuiltInsResourceLoader resourceLoader = new BuiltInsResourceLoader();

    @NotNull
    public final PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "builtInsModule");
        Intrinsics.checkNotNullParameter(iterable, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AdditionalClassPartsProvider additionalClassPartsProvider2 = additionalClassPartsProvider;
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider2, "additionalClassPartsProvider");
        return createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider2, z, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.resourceLoader));
    }

    public static /* synthetic */ PackageFragmentProvider createBuiltInPackageFragmentProvider$default(BuiltInsLoaderImpl builtInsLoaderImpl, StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set set, Iterable iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, Function1 function1, int i, Object obj) {
        AdditionalClassPartsProvider additionalClassPartsProvider2;
        if ((i & 32) != 0) {
            additionalClassPartsProvider2 = AdditionalClassPartsProvider.None.INSTANCE;
        } else {
            additionalClassPartsProvider2 = additionalClassPartsProvider;
        }
        return builtInsLoaderImpl.createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, set, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider2, z, function1);
    }

    @NotNull
    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Set<FqName> set, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, @NotNull Function1<? super String, ? extends InputStream> function1) {
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        Set<FqName> set2 = set;
        Function1<? super String, ? extends InputStream> function12 = function1;
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor2, "module");
        Intrinsics.checkNotNullParameter(set2, "packageFqNames");
        Intrinsics.checkNotNullParameter(iterable, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(function12, "loadResource");
        Iterable<FqName> iterable2 = set2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (FqName fqName : iterable2) {
            String builtInsFilePath = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName);
            InputStream inputStream = (InputStream) function12.invoke(builtInsFilePath);
            if (inputStream != null) {
                arrayList.add(BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, moduleDescriptor, inputStream, z));
            } else {
                throw new IllegalStateException(Intrinsics.stringPlus("Resource not found in classpath: ", builtInsFilePath));
            }
        }
        List<BuiltInsPackageFragmentImpl> list = (List) arrayList;
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(list);
        NotFoundClasses notFoundClasses = r2;
        NotFoundClasses notFoundClasses2 = new NotFoundClasses(storageManager2, moduleDescriptor2);
        PackageFragmentProvider packageFragmentProvider = packageFragmentProviderImpl;
        ClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProvider);
        AnnotationAndConstantLoader annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor2, notFoundClasses2, BuiltInSerializerProtocol.INSTANCE);
        ErrorReporter errorReporter = ErrorReporter.DO_NOTHING;
        ErrorReporter errorReporter2 = errorReporter;
        Intrinsics.checkNotNullExpressionValue(errorReporter, "DO_NOTHING");
        PackageFragmentProvider packageFragmentProvider2 = packageFragmentProvider;
        DeserializationComponents deserializationComponents = r0;
        DeserializationComponents deserializationComponents2 = deserializationComponents;
        DeserializationComponents deserializationComponents3 = new DeserializationComponents(storageManager, moduleDescriptor, DeserializationConfiguration.Default.INSTANCE, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProvider, LocalClassifierTypeSettings.Default.INSTANCE, errorReporter2, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, iterable, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry(), (NewKotlinTypeChecker) null, new SamConversionResolverImpl(storageManager2, CollectionsKt.emptyList()), (PlatformDependentTypeTransformer) null, 327680, (DefaultConstructorMarker) null);
        for (BuiltInsPackageFragmentImpl initialize : list) {
            initialize.initialize(deserializationComponents2);
        }
        return packageFragmentProvider2;
    }
}
