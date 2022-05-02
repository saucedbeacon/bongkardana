package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.NullDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SignatureEnhancement {
    /* access modifiers changed from: private */
    @NotNull
    public final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    @NotNull
    private final JavaTypeEnhancementState javaTypeEnhancementState;
    /* access modifiers changed from: private */
    @NotNull
    public final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(@NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver2, @NotNull JavaTypeEnhancementState javaTypeEnhancementState2, @NotNull JavaTypeEnhancement javaTypeEnhancement) {
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver2, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState2, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaTypeEnhancement, "typeEnhancement");
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver2;
        this.javaTypeEnhancementState = javaTypeEnhancementState2;
        this.typeEnhancement = javaTypeEnhancement;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r3.equals("NEVER") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r3.equals("MAYBE") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r3, boolean r4) {
        /*
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(r3)
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue
            r1 = 0
            if (r0 == 0) goto L_0x000c
            kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) r3
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 != 0) goto L_0x0017
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r3.<init>(r0, r4)
            return r3
        L_0x0017:
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r3.getEnumEntryName()
            java.lang.String r3 = r3.asString()
            int r0 = r3.hashCode()
            switch(r0) {
                case 73135176: goto L_0x0051;
                case 74175084: goto L_0x0048;
                case 433141802: goto L_0x0037;
                case 1933739535: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0062
        L_0x0027:
            java.lang.String r0 = "ALWAYS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r3.<init>(r0, r4)
            return r3
        L_0x0037:
            java.lang.String r0 = "UNKNOWN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0040
            goto L_0x0062
        L_0x0040:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r3.<init>(r0, r4)
            return r3
        L_0x0048:
            java.lang.String r0 = "NEVER"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x005a
            goto L_0x0062
        L_0x0051:
            java.lang.String r0 = "MAYBE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x005a
            goto L_0x0062
        L_0x005a:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r3.<init>(r0, r4)
            return r3
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.extractNullabilityTypeFromArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    @Nullable
    public final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull AnnotationDescriptor annotationDescriptor, boolean z, boolean z2) {
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations;
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations2 = extractNullabilityFromKnownAnnotations(annotationDescriptor, z, z2);
        if (extractNullabilityFromKnownAnnotations2 != null) {
            return extractNullabilityFromKnownAnnotations2;
        }
        AnnotationDescriptor resolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel resolveJsr305AnnotationState = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
        if (!resolveJsr305AnnotationState.isIgnore() && (extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(resolveTypeQualifierAnnotation, z, z2)) != null) {
            return NullabilityQualifierWithMigrationStatus.copy$default(extractNullabilityFromKnownAnnotations, (NullabilityQualifier) null, resolveJsr305AnnotationState.isWarning(), 1, (Object) null);
        }
        return null;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(AnnotationDescriptor annotationDescriptor, boolean z, boolean z2) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        boolean z3 = (annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || z2) && !z;
        NullabilityQualifierWithMigrationStatus jspecifyMigrationStatus = jspecifyMigrationStatus(fqName);
        if (jspecifyMigrationStatus == null && (jspecifyMigrationStatus = commonMigrationStatus(fqName, annotationDescriptor, z3)) == null) {
            return null;
        }
        return (jspecifyMigrationStatus.isForWarningOnly() || !(annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) ? jspecifyMigrationStatus : NullabilityQualifierWithMigrationStatus.copy$default(jspecifyMigrationStatus, (NullabilityQualifier) null, true, 1, (Object) null);
    }

    private final NullabilityQualifierWithMigrationStatus jspecifyMigrationStatus(FqName fqName) {
        if (this.javaTypeEnhancementState.getJspecifyReportLevel() == ReportLevel.IGNORE) {
            return null;
        }
        boolean z = this.javaTypeEnhancementState.getJspecifyReportLevel() == ReportLevel.WARN;
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJSPECIFY_NULLABLE())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJSPECIFY_NULLNESS_UNKNOWN())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z);
        }
        return null;
    }

    private final NullabilityQualifierWithMigrationStatus commonMigrationStatus(FqName fqName, AnnotationDescriptor annotationDescriptor, boolean z) {
        if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z);
        }
        if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
            return extractNullabilityTypeFromArgument(annotationDescriptor, z);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION()) && this.javaTypeEnhancementState.getEnableCompatqualCheckerFrameworkAnnotations()) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION()) && this.javaTypeEnhancementState.getEnableCompatqualCheckerFrameworkAnnotations()) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true);
        }
        if (Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true);
        }
        return null;
    }

    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Collection<? extends D> collection) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "c");
        Intrinsics.checkNotNullParameter(collection, "platformSignatures");
        Iterable<CallableMemberDescriptor> iterable = collection;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (CallableMemberDescriptor enhanceSignature : iterable) {
            arrayList.add(enhanceSignature(enhanceSignature, lazyJavaResolverContext));
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D r17, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            r9 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor r9 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r9.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r10 = 1
            if (r0 != r1) goto L_0x0024
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r9.getOriginal()
            java.util.Collection r0 = r0.getOverriddenDescriptors()
            int r0 = r0.size()
            if (r0 != r10) goto L_0x0024
            return r8
        L_0x0024:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r17.getAnnotations()
            r1 = r18
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(r1, r0)
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor
            r11 = 0
            if (r0 == 0) goto L_0x0058
            r0 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r1 = r0.getGetter()
            if (r1 != 0) goto L_0x003e
            r1 = r11
            goto L_0x0046
        L_0x003e:
            boolean r1 = r1.isDefault()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x0046:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0058
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r0 = r0.getGetter()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            goto L_0x0059
        L_0x0058:
            r0 = r8
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = r9.getExtensionReceiverParameter()
            if (r1 == 0) goto L_0x0082
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r1 != 0) goto L_0x0065
            r1 = r11
            goto L_0x0066
        L_0x0065:
            r1 = r0
        L_0x0066:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            if (r1 != 0) goto L_0x006c
            r1 = r11
            goto L_0x0074
        L_0x006c:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> r2 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER
            java.lang.Object r1 = r1.getUserData(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
        L_0x0074:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r1 = r7.partsForValueParameter(r8, r1, r4, r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance$default(r1, r11, r10, r11)
            r12 = r1
            goto L_0x0083
        L_0x0082:
            r12 = r11
        L_0x0083:
            boolean r1 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            if (r1 == 0) goto L_0x008b
            r1 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r1 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r1
            goto L_0x008c
        L_0x008b:
            r1 = r11
        L_0x008c:
            r13 = 0
            if (r1 != 0) goto L_0x0091
        L_0x008f:
            r14 = r11
            goto L_0x00b2
        L_0x0091:
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r1.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            r5 = 3
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r1, r13, r13, r5, r11)
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt.signature(r2, r3, r1)
            if (r1 != 0) goto L_0x00a7
            goto L_0x008f
        L_0x00a7:
            java.util.Map r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE()
            java.lang.Object r1 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo) r1
            r14 = r1
        L_0x00b2:
            if (r14 == 0) goto L_0x010b
            java.util.List r1 = r14.getParametersInfo()
            int r1 = r1.size()
            java.util.List r2 = r9.getValueParameters()
            int r2 = r2.size()
            if (r1 != r2) goto L_0x00c8
            r1 = 1
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            boolean r2 = kotlin._Assertions.ENABLED
            if (r2 == 0) goto L_0x010b
            if (r1 == 0) goto L_0x00d0
            goto L_0x010b
        L_0x00d0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Predefined enhancement info for "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " has "
            r0.append(r1)
            java.util.List r1 = r14.getParametersInfo()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            java.util.List r1 = r9.getValueParameters()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x010b:
            java.util.List r1 = r0.getValueParameters()
            java.lang.String r2 = "annotationOwnerForMember.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r15 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r15)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0127:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0197
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1
            r5.<init>(r3)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r5 = r7.partsForValueParameter(r8, r3, r4, r5)
            if (r14 != 0) goto L_0x0142
        L_0x0140:
            r6 = r11
            goto L_0x0153
        L_0x0142:
            java.util.List r6 = r14.getParametersInfo()
            if (r6 != 0) goto L_0x0149
            goto L_0x0140
        L_0x0149:
            int r10 = r3.getIndex()
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r6, r10)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r6 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) r6
        L_0x0153:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r5 = r5.enhance(r6)
            boolean r6 = r5.getWereChanges()
            if (r6 == 0) goto L_0x0162
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r5.getType()
            goto L_0x016b
        L_0x0162:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r3.getType()
            java.lang.String r10 = "p.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
        L_0x016b:
            java.lang.String r10 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r10)
            boolean r6 = r7.hasDefaultValueInAnnotation(r3, r6)
            boolean r10 = r5.getWereChanges()
            if (r10 != 0) goto L_0x0183
            boolean r3 = r3.declaresDefaultValue()
            if (r6 == r3) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r3 = 0
            goto L_0x0184
        L_0x0183:
            r3 = 1
        L_0x0184:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult
            kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = r5.getType()
            boolean r5 = r5.getContainsFunctionN()
            r10.<init>(r11, r6, r3, r5)
            r2.add(r10)
            r10 = 1
            r11 = 0
            goto L_0x0127
        L_0x0197:
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r2 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated) r2
            r3 = 1
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
            if (r0 != 0) goto L_0x01a4
            r0 = 0
            goto L_0x01a5
        L_0x01a4:
            r0 = r8
        L_0x01a5:
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r0
            if (r0 != 0) goto L_0x01ab
            r0 = 0
            goto L_0x01b3
        L_0x01ab:
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01b3:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x01be
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD
            goto L_0x01c0
        L_0x01be:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE
        L_0x01c0:
            r5 = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE
            r6 = r0
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r0 = r16
            r1 = r17
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r0.parts(r1, r2, r3, r4, r5, r6)
            if (r14 != 0) goto L_0x01d2
            r1 = 0
            goto L_0x01d6
        L_0x01d2:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r1 = r14.getReturnTypeInfo()
        L_0x01d6:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r0 = r0.enhance(r1)
            if (r12 != 0) goto L_0x01de
            r1 = 0
            goto L_0x01e6
        L_0x01de:
            boolean r1 = r12.getContainsFunctionN()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x01e6:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 != 0) goto L_0x021e
            boolean r1 = r0.getContainsFunctionN()
            if (r1 != 0) goto L_0x021e
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0218
            java.util.Iterator r1 = r1.iterator()
        L_0x0204:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0218
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) r2
            boolean r2 = r2.getContainsFunctionN()
            if (r2 == 0) goto L_0x0204
            r1 = 1
            goto L_0x0219
        L_0x0218:
            r1 = 0
        L_0x0219:
            if (r1 == 0) goto L_0x021c
            goto L_0x021e
        L_0x021c:
            r1 = 0
            goto L_0x021f
        L_0x021e:
            r1 = 1
        L_0x021f:
            if (r12 != 0) goto L_0x0223
            r2 = 0
            goto L_0x022b
        L_0x0223:
            boolean r2 = r12.getWereChanges()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
        L_0x022b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 != 0) goto L_0x0262
            boolean r2 = r0.getWereChanges()
            if (r2 != 0) goto L_0x0262
            r2 = r10
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x025c
            java.util.Iterator r2 = r2.iterator()
        L_0x0249:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x025c
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) r3
            boolean r3 = r3.getWereChanges()
            if (r3 == 0) goto L_0x0249
            r13 = 1
        L_0x025c:
            if (r13 != 0) goto L_0x0262
            if (r1 == 0) goto L_0x0261
            goto L_0x0262
        L_0x0261:
            return r8
        L_0x0262:
            if (r1 == 0) goto L_0x0275
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey r1 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationKt.getDEPRECATED_FUNCTION_KEY()
            kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN r2 = new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN
            r3 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            r2.<init>(r3)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            goto L_0x0276
        L_0x0275:
            r1 = 0
        L_0x0276:
            if (r12 != 0) goto L_0x027a
            r11 = 0
            goto L_0x027e
        L_0x027a:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = r12.getType()
        L_0x027e:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r15)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r3 = r10.iterator()
        L_0x028f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02ac
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) r4
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData r5 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r4.getType()
            boolean r4 = r4.getHasDefaultValue()
            r5.<init>(r6, r4)
            r2.add(r5)
            goto L_0x028f
        L_0x02ac:
            java.util.List r2 = (java.util.List) r2
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor r0 = r9.enhance(r11, r2, r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull List<? extends KotlinType> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor, "typeParameter");
        Intrinsics.checkNotNullParameter(list, "bounds");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, HummerConstants.CONTEXT);
        Iterable<KotlinType> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (KotlinType kotlinType : iterable) {
            if (!TypeUtilsKt.contains(kotlinType, SignatureEnhancement$enhanceTypeParameterBounds$1$1.INSTANCE)) {
                kotlinType = SignatureParts.enhance$default(new SignatureParts(this, typeParameterDescriptor, kotlinType, CollectionsKt.emptyList(), false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, true), (TypeEnhancementInfo) null, 1, (Object) null).getType();
            }
            arrayList.add(kotlinType);
        }
        return (List) arrayList;
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType kotlinType, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, HummerConstants.CONTEXT);
        return SignatureParts.enhance$default(new SignatureParts((Annotated) null, kotlinType, CollectionsKt.emptyList(), false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, false, 64, (DefaultConstructorMarker) null), (TypeEnhancementInfo) null, 1, (Object) null).getType();
    }

    private final boolean hasDefaultValueInAnnotation(ValueParameterDescriptor valueParameterDescriptor, KotlinType kotlinType) {
        boolean z;
        AnnotationDefaultValue defaultValueFromAnnotation = UtilKt.getDefaultValueFromAnnotation(valueParameterDescriptor);
        if (defaultValueFromAnnotation instanceof StringDefaultValue) {
            z = UtilsKt.lexicalCastFrom(kotlinType, ((StringDefaultValue) defaultValueFromAnnotation).getValue()) != null;
        } else if (Intrinsics.areEqual((Object) defaultValueFromAnnotation, (Object) NullDefaultValue.INSTANCE)) {
            z = TypeUtils.acceptsNullable(kotlinType);
        } else if (defaultValueFromAnnotation == null) {
            z = valueParameterDescriptor.declaresDefaultValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return z && valueParameterDescriptor.getOverriddenDescriptors().isEmpty();
    }

    final class SignatureParts {
        @NotNull
        private final AnnotationQualifierApplicabilityType containerApplicabilityType;
        @NotNull
        private final LazyJavaResolverContext containerContext;
        @NotNull
        private final Collection<KotlinType> fromOverridden;
        @NotNull
        private final KotlinType fromOverride;
        private final boolean isCovariant;
        @Nullable
        private final Annotated typeContainer;
        private final boolean typeParameterBounds;

        public SignatureParts(@Nullable SignatureEnhancement signatureEnhancement, @NotNull Annotated annotated, @NotNull KotlinType kotlinType, Collection<? extends KotlinType> collection, @NotNull boolean z, @NotNull LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
            Intrinsics.checkNotNullParameter(signatureEnhancement, "this$0");
            Intrinsics.checkNotNullParameter(kotlinType, "fromOverride");
            Intrinsics.checkNotNullParameter(collection, "fromOverridden");
            Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "containerContext");
            Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "containerApplicabilityType");
            SignatureEnhancement.this = signatureEnhancement;
            this.typeContainer = annotated;
            this.fromOverride = kotlinType;
            this.fromOverridden = collection;
            this.isCovariant = z;
            this.containerContext = lazyJavaResolverContext;
            this.containerApplicabilityType = annotationQualifierApplicabilityType;
            this.typeParameterBounds = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SignatureParts(Annotated annotated, KotlinType kotlinType, Collection collection, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(SignatureEnhancement.this, annotated, kotlinType, collection, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i & 64) != 0 ? false : z2);
        }

        private final boolean isForVarargParameter() {
            Annotated annotated = this.typeContainer;
            KotlinType kotlinType = null;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            if (valueParameterDescriptor != null) {
                kotlinType = valueParameterDescriptor.getVarargElementType();
            }
            return kotlinType != null;
        }

        public static /* synthetic */ PartEnhancementResult enhance$default(SignatureParts signatureParts, TypeEnhancementInfo typeEnhancementInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = null;
            }
            return signatureParts.enhance(typeEnhancementInfo);
        }

        @NotNull
        public final PartEnhancementResult enhance(@Nullable TypeEnhancementInfo typeEnhancementInfo) {
            Function1<Integer, JavaTypeQualifiers> function1;
            Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride();
            PartEnhancementResult partEnhancementResult = null;
            if (typeEnhancementInfo == null) {
                function1 = null;
            } else {
                function1 = new SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1(typeEnhancementInfo, computeIndexedQualifiersForOverride);
            }
            boolean contains = TypeUtils.contains(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.INSTANCE);
            JavaTypeEnhancement access$getTypeEnhancement$p = SignatureEnhancement.this.typeEnhancement;
            KotlinType kotlinType = this.fromOverride;
            if (function1 != null) {
                computeIndexedQualifiersForOverride = function1;
            }
            KotlinType enhance = access$getTypeEnhancement$p.enhance(kotlinType, computeIndexedQualifiersForOverride);
            if (enhance != null) {
                partEnhancementResult = new PartEnhancementResult(enhance, true, contains);
            }
            return partEnhancementResult == null ? new PartEnhancementResult(this.fromOverride, false, contains) : partEnhancementResult;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType r12) {
            /*
                r11 = this;
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(r12)
                if (r0 == 0) goto L_0x0018
                kotlin.reflect.jvm.internal.impl.types.FlexibleType r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(r12)
                kotlin.Pair r1 = new kotlin.Pair
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r0.getLowerBound()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.getUpperBound()
                r1.<init>(r2, r0)
                goto L_0x001d
            L_0x0018:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r12, r12)
            L_0x001d:
                java.lang.Object r0 = r1.component1()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
                java.lang.Object r1 = r1.component2()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                boolean r3 = r0.isMarkedNullable()
                r4 = 0
                if (r3 == 0) goto L_0x0038
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L_0x0036:
                r5 = r3
                goto L_0x0042
            L_0x0038:
                boolean r3 = r1.isMarkedNullable()
                if (r3 != 0) goto L_0x0041
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x0036
            L_0x0041:
                r5 = r4
            L_0x0042:
                boolean r0 = r2.isReadOnly((kotlin.reflect.jvm.internal.impl.types.KotlinType) r0)
                if (r0 == 0) goto L_0x004b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L_0x0055
            L_0x004b:
                boolean r0 = r2.isMutable((kotlin.reflect.jvm.internal.impl.types.KotlinType) r1)
                if (r0 == 0) goto L_0x0054
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                goto L_0x0055
            L_0x0054:
                r0 = r4
            L_0x0055:
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12 = r12.unwrap()
                boolean r6 = r12 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter
                r7 = 0
                r8 = 8
                r9 = 0
                r3 = r10
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
            if ((r12.getAffectsTypeParameterBasedTypes() || !kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(r10)) != false) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
            if (r0.getQualifier() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f5, code lost:
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) java.lang.Boolean.TRUE) != false) goto L_0x00f7;
         */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType r10, boolean r11, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r12, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r13, boolean r14) {
            /*
                r9 = this;
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r0 = r9.containerContext
                kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r0 = r0.getComponents()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings r0 = r0.getSettings()
                boolean r0 = r0.getTypeEnhancementImprovements()
                r1 = 0
                r2 = 1
                if (r11 == 0) goto L_0x006c
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r3 = r9.typeContainer
                if (r3 == 0) goto L_0x006c
                boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
                if (r4 != 0) goto L_0x006c
                if (r0 == 0) goto L_0x006c
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r3.getAnnotations()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r3 = r3.iterator()
            L_0x002f:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x005b
                java.lang.Object r6 = r3.next()
                r7 = r6
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) r7
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver r8 = r4.annotationTypeQualifierResolver
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$TypeQualifierWithApplicability r7 = r8.resolveAnnotation(r7)
                if (r7 == 0) goto L_0x0054
                java.util.List r7 = r7.component2()
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r8 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
                boolean r7 = r7.contains(r8)
                if (r7 != 0) goto L_0x0054
                r7 = 1
                goto L_0x0055
            L_0x0054:
                r7 = 0
            L_0x0055:
                if (r7 == 0) goto L_0x002f
                r5.add(r6)
                goto L_0x002f
            L_0x005b:
                java.util.List r5 = (java.util.List) r5
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r3.create(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r10.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(r3, r4)
                goto L_0x0083
            L_0x006c:
                if (r11 == 0) goto L_0x007f
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r3 = r9.typeContainer
                if (r3 == 0) goto L_0x007f
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r3.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r10.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(r3, r4)
                goto L_0x0083
            L_0x007f:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r10.getAnnotations()
            L_0x0083:
                r4 = 0
                if (r11 == 0) goto L_0x0096
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r11 = r9.containerContext
                kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType r11 = r11.getDefaultTypeQualifiers()
                if (r11 != 0) goto L_0x0090
                r12 = r4
                goto L_0x0096
            L_0x0090:
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r12 = r9.containerApplicabilityType
                kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r12 = r11.get(r12)
            L_0x0096:
                if (r12 == 0) goto L_0x00ab
                boolean r11 = r12.getAffectsTypeParameterBasedTypes()
                if (r11 != 0) goto L_0x00a7
                boolean r11 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(r10)
                if (r11 != 0) goto L_0x00a5
                goto L_0x00a7
            L_0x00a5:
                r11 = 0
                goto L_0x00a8
            L_0x00a7:
                r11 = 1
            L_0x00a8:
                if (r11 == 0) goto L_0x00ab
                goto L_0x00ac
            L_0x00ab:
                r12 = r4
            L_0x00ac:
                kotlin.Pair r11 = r9.nullabilityInfoBoundsForTypeParameterUsage(r10)
                java.lang.Object r5 = r11.component1()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus) r5
                java.lang.Object r11 = r11.component2()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                boolean r6 = r9.typeParameterBounds
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r0 = r9.extractNullability(r3, r0, r6)
                if (r0 == 0) goto L_0x00cb
                if (r14 != 0) goto L_0x00cb
                goto L_0x00cc
            L_0x00cb:
                r0 = r4
            L_0x00cc:
                if (r0 != 0) goto L_0x00d3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r13 = r9.computeNullabilityInfoInTheAbsenceOfExplicitAnnotation(r5, r12, r13)
                goto L_0x00d4
            L_0x00d3:
                r13 = r0
            L_0x00d4:
                if (r0 == 0) goto L_0x00e1
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r11 = r0.getQualifier()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                if (r11 != r12) goto L_0x00df
                goto L_0x00f7
            L_0x00df:
                r11 = 0
                goto L_0x00f8
            L_0x00e1:
                if (r11 != 0) goto L_0x00f7
                if (r12 != 0) goto L_0x00e7
                r11 = r4
                goto L_0x00ef
            L_0x00e7:
                boolean r11 = r12.getMakesTypeParameterNotNull()
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            L_0x00ef:
                java.lang.Boolean r12 = java.lang.Boolean.TRUE
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
                if (r11 == 0) goto L_0x00df
            L_0x00f7:
                r11 = 1
            L_0x00f8:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                if (r13 != 0) goto L_0x00fe
                r14 = r4
                goto L_0x0102
            L_0x00fe:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r14 = r13.getQualifier()
            L_0x0102:
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                java.lang.Object r0 = extractQualifiersFromAnnotations$ifPresent(r0, r3, r5)
                java.util.List r5 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                java.lang.Object r3 = extractQualifiersFromAnnotations$ifPresent(r5, r3, r6)
                java.lang.Object r0 = extractQualifiersFromAnnotations$uniqueNotNull(r0, r3)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r0
                if (r11 == 0) goto L_0x0125
                boolean r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(r10)
                if (r10 == 0) goto L_0x0125
                r1 = 1
            L_0x0125:
                if (r13 != 0) goto L_0x0128
                goto L_0x0130
            L_0x0128:
                boolean r10 = r13.isForWarningOnly()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            L_0x0130:
                java.lang.Boolean r10 = java.lang.Boolean.TRUE
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r10)
                r12.<init>(r14, r0, r1, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final <T> T extractQualifiersFromAnnotations$ifPresent(java.util.List<kotlin.reflect.jvm.internal.impl.name.FqName> r3, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4, T r5) {
            /*
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                boolean r0 = r3 instanceof java.util.Collection
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0011
                r0 = r3
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x002d
            L_0x0011:
                java.util.Iterator r3 = r3.iterator()
            L_0x0015:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x002d
                java.lang.Object r0 = r3.next()
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = (kotlin.reflect.jvm.internal.impl.name.FqName) r0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r0 = r4.findAnnotation(r0)
                if (r0 == 0) goto L_0x0029
                r0 = 1
                goto L_0x002a
            L_0x0029:
                r0 = 0
            L_0x002a:
                if (r0 == 0) goto L_0x0015
                goto L_0x002e
            L_0x002d:
                r1 = 0
            L_0x002e:
                if (r1 == 0) goto L_0x0031
                return r5
            L_0x0031:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations$ifPresent(java.util.List, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, java.lang.Object):java.lang.Object");
        }

        private static final <T> T extractQualifiersFromAnnotations$uniqueNotNull(T t, T t2) {
            if (t == null || t2 == null || Intrinsics.areEqual((Object) t, (Object) t2)) {
                return t == null ? t2 : t;
            }
            return null;
        }

        private final NullabilityQualifierWithMigrationStatus computeNullabilityInfoInTheAbsenceOfExplicitAnnotation(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers, TypeParameterDescriptor typeParameterDescriptor) {
            NullabilityQualifier nullabilityQualifier;
            NullabilityQualifierWithMigrationStatus nullabilityQualifier2;
            if (nullabilityQualifierWithMigrationStatus == null) {
                if (javaDefaultQualifiers == null || (nullabilityQualifier2 = javaDefaultQualifiers.getNullabilityQualifier()) == null) {
                    nullabilityQualifierWithMigrationStatus = null;
                } else {
                    nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(nullabilityQualifier2.getQualifier(), nullabilityQualifier2.isForWarningOnly());
                }
            }
            if (typeParameterDescriptor == null) {
                nullabilityQualifier = null;
            } else {
                nullabilityQualifier = boundsNullability(typeParameterDescriptor);
            }
            if (nullabilityQualifier == null) {
                return nullabilityQualifierWithMigrationStatus;
            }
            if (nullabilityQualifierWithMigrationStatus == null) {
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, (DefaultConstructorMarker) null);
            }
            return new NullabilityQualifierWithMigrationStatus(mostSpecific(nullabilityQualifier, nullabilityQualifierWithMigrationStatus.getQualifier()), false, 2, (DefaultConstructorMarker) null);
        }

        private final NullabilityQualifier mostSpecific(NullabilityQualifier nullabilityQualifier, NullabilityQualifier nullabilityQualifier2) {
            if (nullabilityQualifier == NullabilityQualifier.FORCE_FLEXIBILITY) {
                return nullabilityQualifier2;
            }
            if (nullabilityQualifier2 == NullabilityQualifier.FORCE_FLEXIBILITY) {
                return nullabilityQualifier;
            }
            if (nullabilityQualifier == NullabilityQualifier.NULLABLE) {
                return nullabilityQualifier2;
            }
            if (nullabilityQualifier2 == NullabilityQualifier.NULLABLE) {
                return nullabilityQualifier;
            }
            boolean z = nullabilityQualifier == nullabilityQualifier2 && nullabilityQualifier == NullabilityQualifier.NOT_NULL;
            if (!_Assertions.ENABLED || z) {
                return NullabilityQualifier.NOT_NULL;
            }
            StringBuilder sb = new StringBuilder("Expected everything is NOT_NULL, but ");
            sb.append(nullabilityQualifier);
            sb.append(" and ");
            sb.append(nullabilityQualifier2);
            sb.append(" are found");
            throw new AssertionError(sb.toString());
        }

        private final Pair<NullabilityQualifierWithMigrationStatus, Boolean> nullabilityInfoBoundsForTypeParameterUsage(KotlinType kotlinType) {
            ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
            TypeParameterDescriptor typeParameterDescriptor = declarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) declarationDescriptor : null;
            NullabilityQualifier boundsNullability = typeParameterDescriptor == null ? null : boundsNullability(typeParameterDescriptor);
            if (boundsNullability == null) {
                return new Pair<>(null, Boolean.FALSE);
            }
            boolean z = false;
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, (DefaultConstructorMarker) null);
            if (boundsNullability == NullabilityQualifier.NOT_NULL) {
                z = true;
            }
            return new Pair<>(nullabilityQualifierWithMigrationStatus, Boolean.valueOf(z));
        }

        private final NullabilityQualifier boundsNullability(TypeParameterDescriptor typeParameterDescriptor) {
            boolean z;
            boolean z2;
            if (!(typeParameterDescriptor instanceof LazyJavaTypeParameterDescriptor)) {
                return null;
            }
            LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) typeParameterDescriptor;
            List<KotlinType> upperBounds = lazyJavaTypeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "upperBounds");
            Iterable iterable = upperBounds;
            boolean z3 = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!KotlinTypeKt.isError((KotlinType) it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return null;
            }
            List<KotlinType> upperBounds2 = lazyJavaTypeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds2, "upperBounds");
            Iterable iterable2 = upperBounds2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!SignatureEnhancementKt.isNullabilityFlexible((KotlinType) it2.next())) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return null;
            }
            List<KotlinType> upperBounds3 = lazyJavaTypeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds3, "upperBounds");
            Iterable iterable3 = upperBounds3;
            if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                Iterator it3 = iterable3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    KotlinType kotlinType = (KotlinType) it3.next();
                    Intrinsics.checkNotNullExpressionValue(kotlinType, "it");
                    if (!KotlinTypeKt.isNullable(kotlinType)) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                return NullabilityQualifier.NOT_NULL;
            }
            return NullabilityQualifier.NULLABLE;
        }

        private final NullabilityQualifierWithMigrationStatus extractNullability(Annotations annotations, boolean z, boolean z2) {
            SignatureEnhancement signatureEnhancement = SignatureEnhancement.this;
            Iterator it = annotations.iterator();
            while (it.hasNext()) {
                NullabilityQualifierWithMigrationStatus extractNullability = signatureEnhancement.extractNullability((AnnotationDescriptor) it.next(), z, z2);
                if (extractNullability != null) {
                    return extractNullability;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiersForOverride() {
            /*
                r17 = this;
                r7 = r17
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r7.fromOverridden
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
                r1.<init>(r2)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x0017:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x002b
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                java.util.List r2 = r7.toIndexed(r2)
                r1.add(r2)
                goto L_0x0017
            L_0x002b:
                r8 = r1
                java.util.List r8 = (java.util.List) r8
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r7.fromOverride
                java.util.List r9 = r7.toIndexed(r0)
                boolean r0 = r7.isCovariant
                r11 = 1
                if (r0 == 0) goto L_0x006c
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r7.fromOverridden
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r1 = r0 instanceof java.util.Collection
                if (r1 == 0) goto L_0x004a
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x0067
            L_0x004a:
                java.util.Iterator r0 = r0.iterator()
            L_0x004e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0067
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker r2 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT
                kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r7.fromOverride
                boolean r1 = r2.equalTypes(r1, r3)
                r1 = r1 ^ r11
                if (r1 == 0) goto L_0x004e
                r0 = 1
                goto L_0x0068
            L_0x0067:
                r0 = 0
            L_0x0068:
                if (r0 == 0) goto L_0x006c
                r12 = 1
                goto L_0x006d
            L_0x006c:
                r12 = 0
            L_0x006d:
                if (r12 == 0) goto L_0x0071
                r13 = 1
                goto L_0x0076
            L_0x0071:
                int r0 = r9.size()
                r13 = r0
            L_0x0076:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] r14 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[r13]
                r15 = 0
            L_0x0079:
                if (r15 >= r13) goto L_0x00ee
                if (r15 != 0) goto L_0x007f
                r4 = 1
                goto L_0x0080
            L_0x007f:
                r4 = 0
            L_0x0080:
                if (r4 != 0) goto L_0x0087
                if (r12 != 0) goto L_0x0085
                goto L_0x0087
            L_0x0085:
                r0 = 0
                goto L_0x0088
            L_0x0087:
                r0 = 1
            L_0x0088:
                boolean r1 = kotlin._Assertions.ENABLED
                if (r1 == 0) goto L_0x0099
                if (r0 == 0) goto L_0x008f
                goto L_0x0099
            L_0x008f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Only head type constructors should be computed"
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x0099:
                java.lang.Object r0 = r9.get(r15)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r0
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r0.component1()
                kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r3 = r0.component2()
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5 = r0.component3()
                boolean r6 = r0.component4()
                r0 = r8
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r0 = r0.iterator()
            L_0x00bd:
                boolean r16 = r0.hasNext()
                if (r16 == 0) goto L_0x00df
                java.lang.Object r16 = r0.next()
                r10 = r16
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r10 = kotlin.collections.CollectionsKt.getOrNull(r10, r15)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r10 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r10
                if (r10 != 0) goto L_0x00d5
                r10 = 0
                goto L_0x00d9
            L_0x00d5:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = r10.getType()
            L_0x00d9:
                if (r10 == 0) goto L_0x00bd
                r2.add(r10)
                goto L_0x00bd
            L_0x00df:
                java.util.List r2 = (java.util.List) r2
                java.util.Collection r2 = (java.util.Collection) r2
                r0 = r17
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = r0.computeQualifiersForOverride(r1, r2, r3, r4, r5, r6)
                r14[r15] = r0
                int r15 = r15 + 1
                goto L_0x0079
            L_0x00ee:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                r0.<init>(r14)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride():kotlin.jvm.functions.Function1");
        }

        private final List<TypeAndDefaultQualifiers> toIndexed(KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            toIndexed$add(this, arrayList, kotlinType, this.containerContext, (TypeParameterDescriptor) null);
            return arrayList;
        }

        private static final void toIndexed$add(SignatureParts signatureParts, ArrayList<TypeAndDefaultQualifiers> arrayList, KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext, TypeParameterDescriptor typeParameterDescriptor) {
            JavaDefaultQualifiers javaDefaultQualifiers;
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
            LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, kotlinType.getAnnotations());
            JavaTypeQualifiersByElementType defaultTypeQualifiers = copyWithNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
            if (defaultTypeQualifiers == null) {
                javaDefaultQualifiers = null;
            } else {
                if (signatureParts.typeParameterBounds) {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
                } else {
                    annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
                }
                javaDefaultQualifiers = defaultTypeQualifiers.get(annotationQualifierApplicabilityType);
            }
            arrayList.add(new TypeAndDefaultQualifiers(kotlinType, javaDefaultQualifiers, typeParameterDescriptor, false));
            List<TypeParameterDescriptor> parameters = kotlinType.getConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "type.constructor.parameters");
            for (Pair pair : CollectionsKt.zip(kotlinType.getArguments(), parameters)) {
                TypeProjection typeProjection = (TypeProjection) pair.component1();
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) pair.component2();
                if (typeProjection.isStarProjection()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "arg.type");
                    arrayList.add(new TypeAndDefaultQualifiers(type, javaDefaultQualifiers, typeParameterDescriptor2, true));
                } else {
                    KotlinType type2 = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                    toIndexed$add(signatureParts, arrayList, type2, copyWithNewDefaultTypeQualifiers, typeParameterDescriptor2);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x014a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType r10, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r11, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r12, boolean r13, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r14, boolean r15) {
            /*
                r9 = this;
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r1)
                r0.<init>(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r1 = r11.iterator()
            L_0x0013:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0027
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r2 = r9.extractQualifiers(r2)
                r0.add(r2)
                goto L_0x0013
            L_0x0027:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r2 = r0.iterator()
            L_0x0036:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x004c
                java.lang.Object r3 = r2.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = r3.getMutability()
                if (r3 == 0) goto L_0x0036
                r1.add(r3)
                goto L_0x0036
            L_0x004c:
                java.util.List r1 = (java.util.List) r1
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r1 = kotlin.collections.CollectionsKt.toSet(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r3 = r0.iterator()
            L_0x005f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0075
                java.lang.Object r4 = r3.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r4
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.getNullability()
                if (r4 == 0) goto L_0x005f
                r2.add(r4)
                goto L_0x005f
            L_0x0075:
                java.util.List r2 = (java.util.List) r2
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Set r2 = kotlin.collections.CollectionsKt.toSet(r2)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Collection r3 = (java.util.Collection) r3
                java.util.Iterator r11 = r11.iterator()
            L_0x0088:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto L_0x00a6
                java.lang.Object r4 = r11.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r4
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.unwrapEnhancement(r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r4 = r9.extractQualifiers(r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.getNullability()
                if (r4 == 0) goto L_0x0088
                r3.add(r4)
                goto L_0x0088
            L_0x00a6:
                java.util.List r3 = (java.util.List) r3
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Set r11 = kotlin.collections.CollectionsKt.toSet(r3)
                r3 = r9
                r4 = r10
                r5 = r13
                r6 = r12
                r7 = r14
                r8 = r15
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = r3.extractQualifiersFromAnnotations(r4, r5, r6, r7, r8)
                boolean r12 = r10.isNullabilityQualifierForWarning()
                r14 = 1
                r12 = r12 ^ r14
                r15 = 0
                if (r12 == 0) goto L_0x00c3
                r12 = r10
                goto L_0x00c4
            L_0x00c3:
                r12 = r15
            L_0x00c4:
                if (r12 != 0) goto L_0x00c8
                r12 = r15
                goto L_0x00cc
            L_0x00c8:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r12 = r12.getNullability()
            L_0x00cc:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r10.getNullability()
                boolean r4 = r9.isCovariant
                r5 = 0
                if (r4 == 0) goto L_0x00d9
                if (r13 == 0) goto L_0x00d9
                r4 = 1
                goto L_0x00da
            L_0x00d9:
                r4 = 0
            L_0x00da:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnchancementUtilsKt.select(r2, r12, r4)
                if (r6 == 0) goto L_0x00f2
                boolean r7 = r9.isForVarargParameter()
                if (r7 == 0) goto L_0x00ee
                if (r13 == 0) goto L_0x00ee
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r13 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r6 != r13) goto L_0x00ee
                r13 = 1
                goto L_0x00ef
            L_0x00ee:
                r13 = 0
            L_0x00ef:
                if (r13 != 0) goto L_0x00f2
                r15 = r6
            L_0x00f2:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r13 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r7 = r10.getMutability()
                java.lang.Object r13 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnchancementUtilsKt.select(r1, r13, r6, r7, r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r13 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r13
                if (r3 != r12) goto L_0x010b
                boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r2)
                if (r12 != 0) goto L_0x0109
                goto L_0x010b
            L_0x0109:
                r12 = 0
                goto L_0x010c
            L_0x010b:
                r12 = 1
            L_0x010c:
                boolean r10 = r10.isNotNullTypeParameter()
                if (r10 != 0) goto L_0x0139
                r10 = r0
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L_0x0133
                java.util.Iterator r10 = r0.iterator()
            L_0x011f:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x0133
                java.lang.Object r0 = r10.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r0
                boolean r0 = r0.isNotNullTypeParameter()
                if (r0 == 0) goto L_0x011f
                r10 = 1
                goto L_0x0134
            L_0x0133:
                r10 = 0
            L_0x0134:
                if (r10 == 0) goto L_0x0137
                goto L_0x0139
            L_0x0137:
                r10 = 0
                goto L_0x013a
            L_0x0139:
                r10 = 1
            L_0x013a:
                if (r15 != 0) goto L_0x0147
                if (r12 == 0) goto L_0x0147
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnchancementUtilsKt.select(r11, r3, r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnchancementUtilsKt.createJavaTypeQualifiers(r11, r13, r14, r10)
                return r10
            L_0x0147:
                if (r15 != 0) goto L_0x014a
                goto L_0x014b
            L_0x014a:
                r14 = 0
            L_0x014b:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnchancementUtilsKt.createJavaTypeQualifiers(r15, r13, r14, r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.Collection, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers, boolean, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }
    }

    static class PartEnhancementResult {
        private final boolean containsFunctionN;
        @NotNull
        private final KotlinType type;
        private final boolean wereChanges;

        public PartEnhancementResult(@NotNull KotlinType kotlinType, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(kotlinType, "type");
            this.type = kotlinType;
            this.wereChanges = z;
            this.containsFunctionN = z2;
        }

        @NotNull
        public final KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }

        public final boolean getContainsFunctionN() {
            return this.containsFunctionN;
        }
    }

    static final class ValueParameterEnhancementResult extends PartEnhancementResult {
        private final boolean hasDefaultValue;

        public final boolean getHasDefaultValue() {
            return this.hasDefaultValue;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ValueParameterEnhancementResult(@NotNull KotlinType kotlinType, boolean z, boolean z2, boolean z3) {
            super(kotlinType, z2, z3);
            Intrinsics.checkNotNullParameter(kotlinType, "type");
            this.hasDefaultValue = z;
        }
    }

    private final SignatureParts partsForValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContext2;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        Annotated annotated = valueParameterDescriptor;
        if (valueParameterDescriptor == null || (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) {
            lazyJavaResolverContext2 = lazyJavaResolverContext;
        } else {
            lazyJavaResolverContext2 = copyWithNewDefaultTypeQualifiers;
        }
        return parts(callableMemberDescriptor, annotated, false, lazyJavaResolverContext2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    private final SignatureParts parts(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        Function1<? super CallableMemberDescriptor, ? extends KotlinType> function12 = function1;
        KotlinType kotlinType = (KotlinType) function12.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "this.overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = overriddenDescriptors;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (CallableMemberDescriptor callableMemberDescriptor3 : iterable) {
            Intrinsics.checkNotNullExpressionValue(callableMemberDescriptor3, "it");
            arrayList.add((KotlinType) function12.invoke(callableMemberDescriptor3));
        }
        return new SignatureParts(annotated, kotlinType, (List) arrayList, z, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, ((KotlinType) function12.invoke(callableMemberDescriptor)).getAnnotations()), annotationQualifierApplicabilityType, false, 64, (DefaultConstructorMarker) null);
    }
}
