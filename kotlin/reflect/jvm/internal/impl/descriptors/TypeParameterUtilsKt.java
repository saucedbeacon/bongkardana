package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeParameterUtilsKt {
    @NotNull
    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> list;
        DeclarationDescriptor declarationDescriptor;
        TypeConstructor typeConstructor;
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "declaredTypeParameters");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        DeclarationDescriptor declarationDescriptor2 = classifierDescriptorWithTypeParameters;
        List<R> list2 = SequencesKt.toList(SequencesKt.flatMap(SequencesKt.filter(SequencesKt.takeWhile(DescriptorUtilsKt.getParents(declarationDescriptor2), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.INSTANCE), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2.INSTANCE), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3.INSTANCE));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(declarationDescriptor2).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                declarationDescriptor = null;
                break;
            }
            declarationDescriptor = it.next();
            if (declarationDescriptor instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (!(classDescriptor == null || (typeConstructor = classDescriptor.getTypeConstructor()) == null)) {
            list = typeConstructor.getParameters();
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (!list2.isEmpty() || !list.isEmpty()) {
            Iterable<TypeParameterDescriptor> plus = CollectionsKt.plus(list2, list);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : plus) {
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "it");
                arrayList.add(capturedCopyForInnerDeclaration(typeParameterDescriptor, declarationDescriptor2, declaredTypeParameters.size()));
            }
            return CollectionsKt.plus(declaredTypeParameters, (List) arrayList);
        }
        List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "declaredTypeParameters");
        return declaredTypeParameters2;
    }

    private static final CapturedTypeParameterDescriptor capturedCopyForInnerDeclaration(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i) {
        return new CapturedTypeParameterDescriptor(typeParameterDescriptor, declarationDescriptor, i);
    }

    @Nullable
    public static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return buildPossiblyInnerType(kotlinType, declarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) declarationDescriptor : null, 0);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType buildPossiblyInnerType(kotlin.reflect.jvm.internal.impl.types.KotlinType r5, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0095
            r1 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r1
            boolean r2 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(r1)
            if (r2 == 0) goto L_0x000e
            goto L_0x0095
        L_0x000e:
            java.util.List r2 = r6.getDeclaredTypeParameters()
            int r2 = r2.size()
            int r2 = r2 + r7
            boolean r3 = r6.isInner()
            if (r3 != 0) goto L_0x0078
            java.util.List r3 = r5.getArguments()
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0030
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(r1)
            if (r1 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            boolean r3 = kotlin._Assertions.ENABLED
            if (r3 == 0) goto L_0x0062
            if (r1 == 0) goto L_0x0038
            goto L_0x0062
        L_0x0038:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.List r7 = r5.getArguments()
            int r7 = r7.size()
            int r7 = r7 - r2
            r6.append(r7)
            java.lang.String r7 = " trailing arguments were found in "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " type"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r5)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x0062:
            kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r1 = new kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType
            java.util.List r2 = r5.getArguments()
            java.util.List r5 = r5.getArguments()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x0078:
            java.util.List r1 = r5.getArguments()
            java.util.List r7 = r1.subList(r7, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r1 = new kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r6.getContainingDeclaration()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
            if (r4 == 0) goto L_0x008d
            r0 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) r0
        L_0x008d:
            kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType r5 = buildPossiblyInnerType(r5, r0, r2)
            r1.<init>(r6, r7, r5)
            return r1
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.buildPossiblyInnerType(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters, int):kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType");
    }
}
