package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies != null) {
            return findClassAcrossModuleDependencies;
        }
        return notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE), FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2.INSTANCE)));
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            FqName packageFqName = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
            List<Name> pathSegments = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object first = CollectionsKt.first(pathSegments);
            Intrinsics.checkNotNullExpressionValue(first, "segments.first()");
            ClassifierDescriptor contributedClassifier = memberScope.getContributedClassifier((Name) first, NoLookupLocation.FROM_DESERIALIZATION);
            if (contributedClassifier == null) {
                return null;
            }
            for (Name next : pathSegments.subList(1, pathSegments.size())) {
                if (!(contributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) contributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(next, "name");
                ClassifierDescriptor contributedClassifier2 = unsubstitutedInnerClassesScope.getContributedClassifier(next, NoLookupLocation.FROM_DESERIALIZATION);
                ClassDescriptor classDescriptor = contributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier2 : null;
                if (classDescriptor == null) {
                    return null;
                }
                contributedClassifier = classDescriptor;
            }
            return contributedClassifier;
        }
        FqName packageFqName2 = classId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName2, "classId.packageFqName");
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(packageFqName2);
        List<Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "classId.relativeClassName.pathSegments()");
        MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
        Object first2 = CollectionsKt.first(pathSegments2);
        Intrinsics.checkNotNullExpressionValue(first2, "segments.first()");
        ClassifierDescriptor contributedClassifier3 = memberScope2.getContributedClassifier((Name) first2, NoLookupLocation.FROM_DESERIALIZATION);
        if (contributedClassifier3 != null) {
            Iterator<Name> it = pathSegments2.subList(1, pathSegments2.size()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Name next2 = it.next();
                if (!(contributedClassifier3 instanceof ClassDescriptor)) {
                    break;
                }
                MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) contributedClassifier3).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(next2, "name");
                ClassifierDescriptor contributedClassifier4 = unsubstitutedInnerClassesScope2.getContributedClassifier(next2, NoLookupLocation.FROM_DESERIALIZATION);
                ClassDescriptor classDescriptor2 = contributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier4 : null;
                if (classDescriptor2 == null) {
                    break;
                }
                contributedClassifier3 = classDescriptor2;
            }
        }
        contributedClassifier3 = null;
        if (contributedClassifier3 != null) {
            return contributedClassifier3;
        }
        FqName packageFqName3 = classId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName3, "classId.packageFqName");
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(packageFqName3);
        List<Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments3, "classId.relativeClassName.pathSegments()");
        MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
        Object first3 = CollectionsKt.first(pathSegments3);
        Intrinsics.checkNotNullExpressionValue(first3, "segments.first()");
        ClassifierDescriptor contributedClassifier5 = memberScope3.getContributedClassifier((Name) first3, NoLookupLocation.FROM_DESERIALIZATION);
        if (contributedClassifier5 == null) {
            return null;
        }
        for (Name next3 : pathSegments3.subList(1, pathSegments3.size())) {
            if (!(contributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) contributedClassifier5).getUnsubstitutedInnerClassesScope();
            Intrinsics.checkNotNullExpressionValue(next3, "name");
            ClassifierDescriptor contributedClassifier6 = unsubstitutedInnerClassesScope3.getContributedClassifier(next3, NoLookupLocation.FROM_DESERIALIZATION);
            ClassDescriptor classDescriptor3 = contributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) contributedClassifier6 : null;
            if (classDescriptor3 == null) {
                return null;
            }
            contributedClassifier5 = classDescriptor3;
        }
        return contributedClassifier5;
    }
}
