package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaTypeEnhancement {
    @NotNull
    private final JavaResolverSettings javaResolverSettings;

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings2) {
        Intrinsics.checkNotNullParameter(javaResolverSettings2, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings2;
    }

    static class Result {
        private final int subtreeSize;
        @NotNull
        private final KotlinType type;
        private final boolean wereChanges;

        public Result(@NotNull KotlinType kotlinType, int i, boolean z) {
            Intrinsics.checkNotNullParameter(kotlinType, "type");
            this.type = kotlinType;
            this.subtreeSize = i;
            this.wereChanges = z;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        @NotNull
        public KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }

        @Nullable
        public final KotlinType getTypeIfChanged() {
            KotlinType type2 = getType();
            if (getWereChanges()) {
                return type2;
            }
            return null;
        }
    }

    static final class SimpleResult extends Result {
        @NotNull
        private final SimpleType type;

        @NotNull
        public final SimpleType getType() {
            return this.type;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SimpleResult(@NotNull SimpleType simpleType, int i, boolean z) {
            super(simpleType, i, z);
            Intrinsics.checkNotNullParameter(simpleType, "type");
            this.type = simpleType;
        }
    }

    @Nullable
    public final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> function1) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(function1, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), function1, 0).getTypeIfChanged();
    }

    private final KotlinType buildEnhancementByFlexibleTypeBounds(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType enhancement = TypeWithEnhancementKt.getEnhancement(kotlinType2);
        KotlinType enhancement2 = TypeWithEnhancementKt.getEnhancement(kotlinType);
        if (enhancement2 == null) {
            if (enhancement == null) {
                return null;
            }
            enhancement2 = enhancement;
        }
        if (enhancement == null) {
            return enhancement2;
        }
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
        return KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(enhancement2), FlexibleTypesKt.upperIfFlexible(enhancement));
    }

    private final Result enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i) {
        UnwrappedType unwrappedType2;
        KotlinType kotlinType = unwrappedType;
        boolean z = false;
        if (KotlinTypeKt.isError(kotlinType)) {
            return new Result(kotlinType, 1, false);
        }
        if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
            int i2 = i;
            boolean z2 = unwrappedType instanceof RawType;
            SimpleResult enhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function12, i2, TypeComponentPosition.FLEXIBLE_LOWER, z2);
            SimpleResult enhanceInflexible2 = enhanceInflexible(flexibleType.getUpperBound(), function12, i2, TypeComponentPosition.FLEXIBLE_UPPER, z2);
            boolean z3 = enhanceInflexible.getSubtreeSize() == enhanceInflexible2.getSubtreeSize();
            if (!_Assertions.ENABLED || z3) {
                if (enhanceInflexible.getWereChanges() || enhanceInflexible2.getWereChanges()) {
                    z = true;
                }
                KotlinType buildEnhancementByFlexibleTypeBounds = buildEnhancementByFlexibleTypeBounds(enhanceInflexible.getType(), enhanceInflexible2.getType());
                if (z) {
                    if (unwrappedType instanceof RawTypeImpl) {
                        unwrappedType2 = new RawTypeImpl(enhanceInflexible.getType(), enhanceInflexible2.getType());
                    } else {
                        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
                        unwrappedType2 = KotlinTypeFactory.flexibleType(enhanceInflexible.getType(), enhanceInflexible2.getType());
                    }
                    unwrappedType = TypeWithEnhancementKt.wrapEnhancement(unwrappedType2, buildEnhancementByFlexibleTypeBounds);
                }
                return new Result(unwrappedType, enhanceInflexible.getSubtreeSize(), z);
            }
            StringBuilder sb = new StringBuilder("Different tree sizes of bounds: lower = (");
            sb.append(flexibleType.getLowerBound());
            sb.append(", ");
            sb.append(enhanceInflexible.getSubtreeSize());
            sb.append("), upper = (");
            sb.append(flexibleType.getUpperBound());
            sb.append(", ");
            sb.append(enhanceInflexible2.getSubtreeSize());
            sb.append(')');
            throw new AssertionError(sb.toString());
        } else if (unwrappedType instanceof SimpleType) {
            return enhanceInflexible$default(this, (SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE, false, 8, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, int i2, Object obj) {
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i, typeComponentPosition, (i2 & 8) != 0 ? false : z);
    }

    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z) {
        TypeProjection typeProjection;
        SimpleType simpleType2 = simpleType;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        TypeComponentPosition typeComponentPosition2 = typeComponentPosition;
        if (!TypeComponentPositionKt.shouldEnhance(typeComponentPosition) && simpleType.getArguments().isEmpty()) {
            return new SimpleResult(simpleType2, 1, false);
        }
        ClassifierDescriptor declarationDescriptor = simpleType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return new SimpleResult(simpleType2, 1, false);
        }
        JavaTypeQualifiers invoke = function12.invoke(Integer.valueOf(i));
        EnhancementResult access$enhanceMutability = TypeEnhancementKt.enhanceMutability(declarationDescriptor, invoke, typeComponentPosition2);
        ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) access$enhanceMutability.component1();
        Annotations component2 = access$enhanceMutability.component2();
        TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "enhancedClassifier.typeConstructor");
        int i2 = i + 1;
        boolean z2 = component2 != null;
        Iterable arguments = simpleType.getArguments();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        int i3 = 0;
        for (Object next : arguments) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection2 = (TypeProjection) next;
            if (typeProjection2.isStarProjection()) {
                int i5 = i2 + 1;
                if (function12.invoke(Integer.valueOf(i2)).getNullability() != NullabilityQualifier.NOT_NULL || z) {
                    typeProjection = TypeUtils.makeStarProjection(classifierDescriptor.getTypeConstructor().getParameters().get(i3));
                    Intrinsics.checkNotNullExpressionValue(typeProjection, "{\n                    TypeUtils.makeStarProjection(enhancedClassifier.typeConstructor.parameters[localArgIndex])\n                }");
                } else {
                    KotlinType makeNotNullable = TypeUtilsKt.makeNotNullable(typeProjection2.getType().unwrap());
                    Variance projectionKind = typeProjection2.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind, "arg.projectionKind");
                    typeProjection = TypeUtilsKt.createProjection(makeNotNullable, projectionKind, typeConstructor.getParameters().get(i3));
                }
                i2 = i5;
            } else {
                Result enhancePossiblyFlexible = enhancePossiblyFlexible(typeProjection2.getType().unwrap(), function12, i2);
                z2 = z2 || enhancePossiblyFlexible.getWereChanges();
                i2 += enhancePossiblyFlexible.getSubtreeSize();
                KotlinType type = enhancePossiblyFlexible.getType();
                Variance projectionKind2 = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type, projectionKind2, typeConstructor.getParameters().get(i3));
            }
            arrayList.add(typeProjection);
            i3 = i4;
        }
        List list = (List) arrayList;
        EnhancementResult access$getEnhancedNullability = TypeEnhancementKt.getEnhancedNullability(simpleType2, invoke, typeComponentPosition2);
        boolean booleanValue = ((Boolean) access$getEnhancedNullability.component1()).booleanValue();
        Annotations component22 = access$getEnhancedNullability.component2();
        int i6 = i2 - i;
        if (!(z2 || component22 != null)) {
            return new SimpleResult(simpleType2, i6, false);
        }
        boolean z3 = false;
        Annotations access$compositeAnnotationsOrSingle = TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((T[]) new Annotations[]{simpleType.getAnnotations(), component2, component22}));
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(access$compositeAnnotationsOrSingle, typeConstructor, list, booleanValue, (KotlinTypeRefiner) null, 16, (Object) null);
        if (invoke.isNotNullTypeParameter()) {
            simpleType$default = notNullTypeParameter(simpleType$default);
        }
        if (component22 != null && invoke.isNullabilityQualifierForWarning()) {
            z3 = true;
        }
        return new SimpleResult((SimpleType) (z3 ? TypeWithEnhancementKt.wrapEnhancement(simpleType2, simpleType$default) : simpleType$default), i6, true);
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        if (this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter()) {
            return SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true);
        }
        return new NotNullTypeParameter(simpleType);
    }
}
