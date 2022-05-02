package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {
    @NotNull
    private final KotlinTypeRefiner kotlinTypeRefiner;
    @NotNull
    private final OverridingUtil overridingUtil;

    public NewKotlinTypeCheckerImpl(@NotNull KotlinTypeRefiner kotlinTypeRefiner2) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner2, "kotlinTypeRefiner");
        this.kotlinTypeRefiner = kotlinTypeRefiner2;
        OverridingUtil createWithTypeRefiner = OverridingUtil.createWithTypeRefiner(getKotlinTypeRefiner());
        Intrinsics.checkNotNullExpressionValue(createWithTypeRefiner, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.overridingUtil = createWithTypeRefiner;
    }

    @NotNull
    public final KotlinTypeRefiner getKotlinTypeRefiner() {
        return this.kotlinTypeRefiner;
    }

    @NotNull
    public final OverridingUtil getOverridingUtil() {
        return this.overridingUtil;
    }

    public final boolean isSubtypeOf(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        Intrinsics.checkNotNullParameter(kotlinType, "subtype");
        Intrinsics.checkNotNullParameter(kotlinType2, "supertype");
        return isSubtypeOf(new ClassicTypeCheckerContext(true, false, false, getKotlinTypeRefiner(), 6, (DefaultConstructorMarker) null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public final boolean equalTypes(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        Intrinsics.checkNotNullParameter(kotlinType, "a");
        Intrinsics.checkNotNullParameter(kotlinType2, "b");
        return equalTypes(new ClassicTypeCheckerContext(false, false, false, getKotlinTypeRefiner(), 6, (DefaultConstructorMarker) null), kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public final boolean equalTypes(@NotNull ClassicTypeCheckerContext classicTypeCheckerContext, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        Intrinsics.checkNotNullParameter(classicTypeCheckerContext, "<this>");
        Intrinsics.checkNotNullParameter(unwrappedType, "a");
        Intrinsics.checkNotNullParameter(unwrappedType2, "b");
        return AbstractTypeChecker.INSTANCE.equalTypes(classicTypeCheckerContext, unwrappedType, unwrappedType2);
    }

    public final boolean isSubtypeOf(@NotNull ClassicTypeCheckerContext classicTypeCheckerContext, @NotNull UnwrappedType unwrappedType, @NotNull UnwrappedType unwrappedType2) {
        Intrinsics.checkNotNullParameter(classicTypeCheckerContext, "<this>");
        Intrinsics.checkNotNullParameter(unwrappedType, "subType");
        Intrinsics.checkNotNullParameter(unwrappedType2, "superType");
        return AbstractTypeChecker.isSubtypeOf$default(AbstractTypeChecker.INSTANCE, classicTypeCheckerContext, unwrappedType, unwrappedType2, false, 8, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: kotlin.reflect.jvm.internal.impl.types.UnwrappedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.reflect.jvm.internal.impl.types.KotlinType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.reflect.jvm.internal.impl.types.KotlinType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.reflect.jvm.internal.impl.types.UnwrappedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.reflect.jvm.internal.impl.types.KotlinType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlin.reflect.jvm.internal.impl.types.KotlinType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: kotlin.reflect.jvm.internal.impl.types.UnwrappedType} */
    /* JADX WARNING: type inference failed for: r6v3, types: [kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType transformToNewType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.SimpleType r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r1 = r18.getConstructor()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl
            r3 = 1
            r4 = 0
            r5 = 10
            r6 = 0
            if (r2 == 0) goto L_0x0099
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl r1 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorImpl) r1
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r2 = r1.getProjection()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = r2.getProjectionKind()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r7 != r8) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r3 = 0
        L_0x0024:
            if (r3 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r6
        L_0x0028:
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            r10 = r6
            goto L_0x0038
        L_0x002c:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r2.getType()
            if (r2 != 0) goto L_0x0033
            goto L_0x002a
        L_0x0033:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r6 = r2.unwrap()
            goto L_0x002a
        L_0x0038:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r2 = r1.getNewTypeConstructor()
            if (r2 != 0) goto L_0x007b
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r12 = r1.getProjection()
            java.util.Collection r2 = r1.getSupertypes()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x0057:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r4
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r4 = r4.unwrap()
            r3.add(r4)
            goto L_0x0057
        L_0x006b:
            r13 = r3
            java.util.List r13 = (java.util.List) r13
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r2 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r1.setNewTypeConstructor(r2)
        L_0x007b:
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType r2 = new kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r8 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor r9 = r1.getNewTypeConstructor()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r11 = r18.getAnnotations()
            boolean r12 = r18.isMarkedNullable()
            r13 = 0
            r14 = 32
            r15 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r2
            return r2
        L_0x0099:
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor
            if (r2 == 0) goto L_0x00ef
            kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueTypeConstructor) r1
            java.util.Collection r1 = r1.getSupertypes()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x00b4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00d1
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
            boolean r5 = r18.isMarkedNullable()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(r3, r5)
            java.lang.String r5 = "makeNullableAsSpecified(it, type.isMarkedNullable)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r2.add(r3)
            goto L_0x00b4
        L_0x00d1:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r18.getAnnotations()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r1 = (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) r1
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r18.getMemberScope()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(r2, r1, r3, r4, r0)
            return r0
        L_0x00ef:
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r2 == 0) goto L_0x0148
            boolean r2 = r18.isMarkedNullable()
            if (r2 == 0) goto L_0x0148
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r1 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r1
            java.util.Collection r0 = r1.getSupertypes()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r5)
            r2.<init>(r5)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r0 = r0.iterator()
        L_0x0110:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0125
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r4
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(r4)
            r2.add(r4)
            r4 = 1
            goto L_0x0110
        L_0x0125:
            java.util.List r2 = (java.util.List) r2
            if (r4 != 0) goto L_0x012a
            goto L_0x0140
        L_0x012a:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r1.getAlternativeType()
            if (r0 != 0) goto L_0x0131
            goto L_0x0135
        L_0x0131:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(r0)
        L_0x0135:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r6 = r0.setAlternative(r6)
        L_0x0140:
            if (r6 != 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r1 = r6
        L_0x0144:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.createType()
        L_0x0148:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl.transformToNewType(kotlin.reflect.jvm.internal.impl.types.SimpleType):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    @NotNull
    public final UnwrappedType transformToNewType(@NotNull UnwrappedType unwrappedType) {
        UnwrappedType unwrappedType2;
        Intrinsics.checkNotNullParameter(unwrappedType, "type");
        if (unwrappedType instanceof SimpleType) {
            unwrappedType2 = transformToNewType((SimpleType) unwrappedType);
        } else if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            SimpleType transformToNewType = transformToNewType(flexibleType.getLowerBound());
            SimpleType transformToNewType2 = transformToNewType(flexibleType.getUpperBound());
            if (transformToNewType == flexibleType.getLowerBound() && transformToNewType2 == flexibleType.getUpperBound()) {
                unwrappedType2 = unwrappedType;
            } else {
                KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
                unwrappedType2 = KotlinTypeFactory.flexibleType(transformToNewType, transformToNewType2);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedType2, unwrappedType);
    }
}
