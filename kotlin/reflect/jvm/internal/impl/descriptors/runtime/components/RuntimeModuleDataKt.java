package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.JavaTypeEnhancementState;
import org.jetbrains.annotations.NotNull;

public final class RuntimeModuleDataKt {
    public static /* synthetic */ LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentFromClassLoaderProvider$default(ClassLoader classLoader, ModuleDescriptor moduleDescriptor, StorageManager storageManager, NotFoundClasses notFoundClasses, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, int i, Object obj) {
        PackagePartProvider packagePartProvider2;
        if ((i & 128) != 0) {
            packagePartProvider2 = PackagePartProvider.Empty.INSTANCE;
        } else {
            packagePartProvider2 = packagePartProvider;
        }
        return makeLazyJavaPackageFragmentFromClassLoaderProvider(classLoader, moduleDescriptor, storageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, moduleClassResolver, packagePartProvider2);
    }

    @NotNull
    public static final LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentFromClassLoaderProvider(@NotNull ClassLoader classLoader, @NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider) {
        ClassLoader classLoader2 = classLoader;
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        StorageManager storageManager2 = storageManager;
        KotlinClassFinder kotlinClassFinder2 = kotlinClassFinder;
        Intrinsics.checkNotNullParameter(classLoader2, "classLoader");
        Intrinsics.checkNotNullParameter(moduleDescriptor2, "module");
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(moduleClassResolver, "singleModuleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = r11;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = new AnnotationTypeQualifierResolver(storageManager2, JavaTypeEnhancementState.DISABLED_JSR_305);
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.DISABLED_JSR_305;
        SignaturePropagator signaturePropagator = SignaturePropagator.DO_NOTHING;
        SignaturePropagator signaturePropagator2 = signaturePropagator;
        Intrinsics.checkNotNullExpressionValue(signaturePropagator, "DO_NOTHING");
        ErrorReporter errorReporter = RuntimeErrorReporter.INSTANCE;
        JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
        JavaResolverCache javaResolverCache2 = javaResolverCache;
        Intrinsics.checkNotNullExpressionValue(javaResolverCache, "EMPTY");
        JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver3 = annotationTypeQualifierResolver2;
        SamConversionResolver samConversionResolverImpl = new SamConversionResolverImpl(storageManager2, CollectionsKt.emptyList());
        JavaSourceElementFactory javaSourceElementFactory = RuntimeSourceElementFactory.INSTANCE;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver4 = annotationTypeQualifierResolver3;
        JavaResolverComponents javaResolverComponents = r1;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver5 = annotationTypeQualifierResolver4;
        SupertypeLoopChecker supertypeLoopChecker = SupertypeLoopChecker.EMPTY.INSTANCE;
        ModuleDescriptor moduleDescriptor3 = moduleDescriptor2;
        LookupTracker lookupTracker = LookupTracker.DO_NOTHING.INSTANCE;
        JavaClassFinder reflectJavaClassFinder = new ReflectJavaClassFinder(classLoader2);
        ReflectionTypes reflectionTypes = r3;
        ReflectionTypes reflectionTypes2 = new ReflectionTypes(moduleDescriptor3, notFoundClasses);
        SignatureEnhancement signatureEnhancement = r0;
        SignatureEnhancement signatureEnhancement2 = new SignatureEnhancement(annotationTypeQualifierResolver5, JavaTypeEnhancementState.DISABLED_JSR_305, new JavaTypeEnhancement(JavaResolverSettings.Default.INSTANCE));
        JavaClassFinder javaClassFinder = reflectJavaClassFinder;
        StorageManager storageManager3 = storageManager;
        KotlinClassFinder kotlinClassFinder3 = kotlinClassFinder2;
        JavaResolverComponents javaResolverComponents2 = new JavaResolverComponents(storageManager3, javaClassFinder, kotlinClassFinder3, deserializedDescriptorResolver, signaturePropagator2, errorReporter, javaResolverCache2, javaPropertyInitializerEvaluator, samConversionResolverImpl, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, JavaClassesTracker.Default.INSTANCE, JavaResolverSettings.Default.INSTANCE, NewKotlinTypeChecker.Companion.getDefault(), javaTypeEnhancementState);
        return new LazyJavaPackageFragmentProvider(javaResolverComponents);
    }

    @NotNull
    public static final DeserializationComponentsForJava makeDeserializationComponentsForJava(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
        StorageManager storageManager2 = storageManager;
        KotlinClassFinder kotlinClassFinder2 = kotlinClassFinder;
        DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider2, "lazyJavaPackageFragmentProvider");
        Intrinsics.checkNotNullParameter(kotlinClassFinder2, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
        JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(kotlinClassFinder2, deserializedDescriptorResolver2);
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, storageManager, kotlinClassFinder2);
        return new DeserializationComponentsForJava(storageManager2, moduleDescriptor, DeserializationConfiguration.Default.INSTANCE, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider2, notFoundClasses, RuntimeErrorReporter.INSTANCE, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT(), NewKotlinTypeChecker.Companion.getDefault());
    }
}
