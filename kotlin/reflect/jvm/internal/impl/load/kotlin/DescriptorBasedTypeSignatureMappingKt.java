package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

public final class DescriptorBasedTypeSignatureMappingKt {
    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3<Object, Object, Object, Unit> function3, int i, Object obj) {
        if ((i & 32) != 0) {
            function3 = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T>, java.lang.Object, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        if (r2.isForAnnotationParameter() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r11) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r10 = r10.getJavaLangClassType();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0137, code lost:
        r11 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r11;
        r13 = r11.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "descriptor.original");
        r13 = r12.getPredefinedTypeForClass(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        if (r13 != null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014e, code lost:
        if (r11.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        r11 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r11.getContainingDeclaration();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0156, code lost:
        r11 = r11.getOriginal();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "enumClassIfEnumEntry.original");
        r10 = r10.createObjectType(computeInternalName(r11, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0168, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0169, code lost:
        r14.invoke(r9, r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016c, code lost:
        return r10;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T mapType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> r12, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter<T> r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.Unit> r14) {
        /*
            r2 = r11
        L_0x0001:
            java.lang.String r11 = "kotlinType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            java.lang.String r11 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r11)
            java.lang.String r11 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r11)
            java.lang.String r11 = "typeMappingConfiguration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r11)
            java.lang.String r11 = "writeGenericType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r11)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = r12.preprocessType(r9)
            if (r11 == 0) goto L_0x0022
            r9 = r11
            goto L_0x0001
        L_0x0022:
            boolean r11 = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(r9)
            if (r11 == 0) goto L_0x0033
            boolean r11 = r12.releaseCoroutines()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r9 = kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(r9, r11)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r9
            goto L_0x0001
        L_0x0033:
            kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext r11 = kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE
            kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext r11 = (kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext) r11
            r0 = r9
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r0
            java.lang.Object r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.mapBuiltInType(r11, r0, r10, r2)
            if (r11 == 0) goto L_0x004c
            boolean r12 = r2.getNeedPrimitiveBoxing()
            java.lang.Object r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.boxTypeIfNeeded(r10, r11, r12)
            r14.invoke(r9, r10, r2)
            return r10
        L_0x004c:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r11 = r9.getConstructor()
            boolean r1 = r11 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r1 == 0) goto L_0x0069
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r11 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r11
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = r11.getAlternativeType()
            if (r9 != 0) goto L_0x0064
            java.util.Collection r9 = r11.getSupertypes()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = r12.commonSupertype(r9)
        L_0x0064:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(r9)
            goto L_0x0001
        L_0x0069:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r11 = r11.getDeclarationDescriptor()
            if (r11 == 0) goto L_0x01b2
            r1 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r1
            boolean r3 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.isError(r1)
            if (r3 == 0) goto L_0x0089
            java.lang.String r14 = "error/NonExistentClass"
            java.lang.Object r10 = r10.createObjectType(r14)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r11 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r11
            r12.processErrorType(r9, r11)
            if (r13 == 0) goto L_0x0088
            r13.writeClass(r10)
        L_0x0088:
            return r10
        L_0x0089:
            boolean r3 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r3 == 0) goto L_0x0102
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(r9)
            if (r4 == 0) goto L_0x0102
            java.util.List r11 = r9.getArguments()
            int r11 = r11.size()
            r0 = 1
            if (r11 != r0) goto L_0x00fa
            java.util.List r9 = r9.getArguments()
            r11 = 0
            java.lang.Object r9 = r9.get(r11)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r9 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r9
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r9.getType()
            java.lang.String r11 = "memberProjection.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
            kotlin.reflect.jvm.internal.impl.types.Variance r11 = r9.getProjectionKind()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r11 != r1) goto L_0x00cc
            java.lang.String r9 = "java/lang/Object"
            java.lang.Object r9 = r10.createObjectType(r9)
            if (r13 == 0) goto L_0x00eb
            r13.writeArrayType()
            r13.writeClass(r9)
            r13.writeArrayEnd()
            goto L_0x00eb
        L_0x00cc:
            if (r13 == 0) goto L_0x00d1
            r13.writeArrayType()
        L_0x00d1:
            kotlin.reflect.jvm.internal.impl.types.Variance r9 = r9.getProjectionKind()
            java.lang.String r11 = "memberProjection.projectionKind"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r11)
            kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r5 = r2.toGenericArgumentMode(r9, r0)
            r4 = r10
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object r9 = mapType(r3, r4, r5, r6, r7, r8)
            if (r13 == 0) goto L_0x00eb
            r13.writeArrayEnd()
        L_0x00eb:
            java.lang.String r9 = r10.toString(r9)
            java.lang.String r11 = "["
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r11, r9)
            java.lang.Object r9 = r10.createFromString(r9)
            return r9
        L_0x00fa:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "arrays must have one type argument"
            r9.<init>(r10)
            throw r9
        L_0x0102:
            if (r3 == 0) goto L_0x016d
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClass(r1)
            if (r1 == 0) goto L_0x0123
            boolean r1 = r2.getNeedInlineClassWrapping()
            if (r1 != 0) goto L_0x0123
            kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext r1 = kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext.INSTANCE
            kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext r1 = (kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext) r1
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt.computeExpandedTypeForInlineClass(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
            if (r0 == 0) goto L_0x0123
            kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r2 = r2.wrapInlineClassesMode()
            r9 = r0
            goto L_0x0001
        L_0x0123:
            boolean r13 = r2.isForAnnotationParameter()
            if (r13 == 0) goto L_0x0137
            r13 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r13 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r13
            boolean r13 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass(r13)
            if (r13 == 0) goto L_0x0137
            java.lang.Object r10 = r10.getJavaLangClassType()
            goto L_0x0169
        L_0x0137:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r11 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r11
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r13 = r11.getOriginal()
            java.lang.String r0 = "descriptor.original"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            java.lang.Object r13 = r12.getPredefinedTypeForClass(r13)
            if (r13 != 0) goto L_0x0168
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r13 = r11.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r13 != r0) goto L_0x0156
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r11 = r11.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r11 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r11
        L_0x0156:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r11 = r11.getOriginal()
            java.lang.String r13 = "enumClassIfEnumEntry.original"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r13)
            java.lang.String r11 = computeInternalName(r11, r12)
            java.lang.Object r10 = r10.createObjectType(r11)
            goto L_0x0169
        L_0x0168:
            r10 = r13
        L_0x0169:
            r14.invoke(r9, r10, r2)
            return r10
        L_0x016d:
            boolean r0 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
            if (r0 == 0) goto L_0x0192
            r9 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r9
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound(r9)
            kotlin.jvm.functions.Function3 r5 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getDO_NOTHING_3()
            r4 = 0
            r1 = r10
            r3 = r12
            java.lang.Object r9 = mapType(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x0191
            kotlin.reflect.jvm.internal.impl.name.Name r10 = r11.getName()
            java.lang.String r11 = "descriptor.getName()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            r13.writeTypeVariable(r10, r9)
        L_0x0191:
            return r9
        L_0x0192:
            boolean r0 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r2.getMapTypeAliases()
            if (r0 == 0) goto L_0x01a6
            kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor r11 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) r11
            kotlin.reflect.jvm.internal.impl.types.SimpleType r9 = r11.getExpandedType()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r9
            goto L_0x0001
        L_0x01a6:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r11 = "Unknown type "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r11, r9)
            r10.<init>(r9)
            throw r10
        L_0x01b2:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r11 = "no descriptor for type constructor of "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r11, r9)
            r10.<init>(r9)
            goto L_0x01bf
        L_0x01be:
            throw r10
        L_0x01bf:
            goto L_0x01be
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.DescriptorBasedTypeSignatureMappingKt.mapType(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter, kotlin.jvm.functions.Function3):java.lang.Object");
    }

    public static final boolean hasVoidReturnType(@NotNull CallableDescriptor callableDescriptor) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "descriptor");
        if (callableDescriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        if (!KotlinBuiltIns.isUnit(returnType)) {
            return false;
        }
        KotlinType returnType2 = callableDescriptor.getReturnType();
        Intrinsics.checkNotNull(returnType2);
        if (TypeUtils.isNullableType(returnType2) || (callableDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    @NotNull
    public static final String computeInternalName(@NotNull ClassDescriptor classDescriptor, @NotNull TypeMappingConfiguration<?> typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(classDescriptor, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(classDescriptor);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "klass.containingDeclaration");
        String identifier = SpecialNames.safeIdentifier(classDescriptor.getName()).getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "safeIdentifier(klass.name).identifier");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            StringBuilder sb = new StringBuilder();
            String asString = fqName.asString();
            Intrinsics.checkNotNullExpressionValue(asString, "fqName.asString()");
            sb.append(StringsKt.replace$default(asString, '.', '/', false, 4, (Object) null));
            sb.append('/');
            sb.append(identifier);
            return sb.toString();
        }
        ClassDescriptor classDescriptor2 = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor2 != null) {
            String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor2);
            if (predefinedInternalNameForClass == null) {
                predefinedInternalNameForClass = computeInternalName(classDescriptor2, typeMappingConfiguration);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(predefinedInternalNameForClass);
            sb2.append(Typography.dollar);
            sb2.append(identifier);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("Unexpected container: ");
        sb3.append(containingDeclaration);
        sb3.append(" for ");
        sb3.append(classDescriptor);
        throw new IllegalArgumentException(sb3.toString());
    }
}
