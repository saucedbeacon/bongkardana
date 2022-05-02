package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializationComponents {
    @NotNull
    private final AdditionalClassPartsProvider additionalClassPartsProvider;
    @NotNull
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader;
    @NotNull
    private final ClassDataFinder classDataFinder;
    @NotNull
    private final ClassDeserializer classDeserializer;
    @NotNull
    private final DeserializationConfiguration configuration;
    @NotNull
    private final ContractDeserializer contractDeserializer;
    @NotNull
    private final ErrorReporter errorReporter;
    @NotNull
    private final ExtensionRegistryLite extensionRegistryLite;
    @NotNull
    private final Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories;
    @NotNull
    private final FlexibleTypeDeserializer flexibleTypeDeserializer;
    @NotNull
    private final NewKotlinTypeChecker kotlinTypeChecker;
    @NotNull
    private final LocalClassifierTypeSettings localClassifierTypeSettings;
    @NotNull
    private final LookupTracker lookupTracker;
    @NotNull
    private final ModuleDescriptor moduleDescriptor;
    @NotNull
    private final NotFoundClasses notFoundClasses;
    @NotNull
    private final PackageFragmentProvider packageFragmentProvider;
    @NotNull
    private final PlatformDependentDeclarationFilter platformDependentDeclarationFilter;
    @NotNull
    private final PlatformDependentTypeTransformer platformDependentTypeTransformer;
    @NotNull
    private final SamConversionResolver samConversionResolver;
    @NotNull
    private final StorageManager storageManager;

    public DeserializationComponents(@NotNull StorageManager storageManager2, @NotNull ModuleDescriptor moduleDescriptor2, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull ClassDataFinder classDataFinder2, @NotNull AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader2, @NotNull PackageFragmentProvider packageFragmentProvider2, @NotNull LocalClassifierTypeSettings localClassifierTypeSettings2, @NotNull ErrorReporter errorReporter2, @NotNull LookupTracker lookupTracker2, @NotNull FlexibleTypeDeserializer flexibleTypeDeserializer2, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull NotFoundClasses notFoundClasses2, @NotNull ContractDeserializer contractDeserializer2, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider2, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter2, @NotNull ExtensionRegistryLite extensionRegistryLite2, @NotNull NewKotlinTypeChecker newKotlinTypeChecker, @NotNull SamConversionResolver samConversionResolver2, @NotNull PlatformDependentTypeTransformer platformDependentTypeTransformer2) {
        StorageManager storageManager3 = storageManager2;
        ModuleDescriptor moduleDescriptor3 = moduleDescriptor2;
        DeserializationConfiguration deserializationConfiguration2 = deserializationConfiguration;
        ClassDataFinder classDataFinder3 = classDataFinder2;
        AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader3 = annotationAndConstantLoader2;
        PackageFragmentProvider packageFragmentProvider3 = packageFragmentProvider2;
        LocalClassifierTypeSettings localClassifierTypeSettings3 = localClassifierTypeSettings2;
        ErrorReporter errorReporter3 = errorReporter2;
        LookupTracker lookupTracker3 = lookupTracker2;
        FlexibleTypeDeserializer flexibleTypeDeserializer3 = flexibleTypeDeserializer2;
        Iterable<? extends ClassDescriptorFactory> iterable2 = iterable;
        NotFoundClasses notFoundClasses3 = notFoundClasses2;
        ContractDeserializer contractDeserializer3 = contractDeserializer2;
        AdditionalClassPartsProvider additionalClassPartsProvider3 = additionalClassPartsProvider2;
        ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite2;
        Intrinsics.checkNotNullParameter(storageManager3, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor3, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(deserializationConfiguration2, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder3, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader3, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider3, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings3, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter3, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker3, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer3, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(iterable2, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses3, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer3, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider3, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter2, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite2, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(newKotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver2, "samConversionResolver");
        Intrinsics.checkNotNullParameter(platformDependentTypeTransformer2, "platformDependentTypeTransformer");
        this.storageManager = storageManager3;
        this.moduleDescriptor = moduleDescriptor3;
        this.configuration = deserializationConfiguration2;
        this.classDataFinder = classDataFinder3;
        this.annotationAndConstantLoader = annotationAndConstantLoader3;
        this.packageFragmentProvider = packageFragmentProvider3;
        this.localClassifierTypeSettings = localClassifierTypeSettings3;
        this.errorReporter = errorReporter3;
        this.lookupTracker = lookupTracker3;
        this.flexibleTypeDeserializer = flexibleTypeDeserializer3;
        this.fictitiousClassDescriptorFactories = iterable2;
        this.notFoundClasses = notFoundClasses3;
        this.contractDeserializer = contractDeserializer3;
        this.additionalClassPartsProvider = additionalClassPartsProvider3;
        this.platformDependentDeclarationFilter = platformDependentDeclarationFilter2;
        this.extensionRegistryLite = extensionRegistryLite2;
        this.kotlinTypeChecker = newKotlinTypeChecker;
        this.samConversionResolver = samConversionResolver2;
        this.platformDependentTypeTransformer = platformDependentTypeTransformer2;
        this.classDeserializer = new ClassDeserializer(this);
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    @NotNull
    public final DeserializationConfiguration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final ClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    @NotNull
    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    @NotNull
    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    @NotNull
    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    @NotNull
    public final NotFoundClasses getNotFoundClasses() {
        return this.notFoundClasses;
    }

    @NotNull
    public final ContractDeserializer getContractDeserializer() {
        return this.contractDeserializer;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DeserializationComponents(kotlin.reflect.jvm.internal.impl.storage.StorageManager r23, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r24, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration r25, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder r26, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader r27, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider r28, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings r29, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter r30, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker r31, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer r32, java.lang.Iterable r33, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r34, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer r35, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider r36, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter r37, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r38, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker r39, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver r40, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x000d
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider$None r1 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider r1 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider) r1
            r16 = r1
            goto L_0x000f
        L_0x000d:
            r16 = r36
        L_0x000f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x001a
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter$All r1 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.All.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter r1 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter) r1
            r17 = r1
            goto L_0x001c
        L_0x001a:
            r17 = r37
        L_0x001c:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002c
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker$Companion r1 = kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker.Companion
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl r1 = r1.getDefault()
            kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker r1 = (kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker) r1
            r19 = r1
            goto L_0x002e
        L_0x002c:
            r19 = r39
        L_0x002e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003a
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer$None r0 = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer.None.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer r0 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer) r0
            r21 = r0
            goto L_0x003c
        L_0x003a:
            r21 = r41
        L_0x003c:
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r18 = r38
            r20 = r40
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents.<init>(kotlin.reflect.jvm.internal.impl.storage.StorageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider, kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter, kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker, kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker, kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver, kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    @NotNull
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.kotlinTypeChecker;
    }

    @NotNull
    public final PlatformDependentTypeTransformer getPlatformDependentTypeTransformer() {
        return this.platformDependentTypeTransformer;
    }

    @NotNull
    public final ClassDeserializer getClassDeserializer() {
        return this.classDeserializer;
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.classDeserializer, classId, (ClassData) null, 2, (Object) null);
    }

    @NotNull
    public final DeserializationContext createContext(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        Intrinsics.checkNotNullParameter(versionRequirementTable2, "versionRequirementTable");
        BinaryVersion binaryVersion2 = binaryVersion;
        Intrinsics.checkNotNullParameter(binaryVersion2, "metadataVersion");
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable2, binaryVersion2, deserializedContainerSource, (TypeDeserializer) null, CollectionsKt.emptyList());
    }
}
