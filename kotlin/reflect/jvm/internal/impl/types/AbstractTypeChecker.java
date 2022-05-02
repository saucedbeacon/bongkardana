package kotlin.reflect.jvm.internal.impl.types;

import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AbstractTypeChecker {
    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            iArr[TypeVariance.INV.ordinal()] = 1;
            iArr[TypeVariance.OUT.ordinal()] = 2;
            iArr[TypeVariance.IN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AbstractTypeCheckerContext.LowerCapturedTypePolicy.values().length];
            iArr2[AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[AbstractTypeCheckerContext.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[AbstractTypeCheckerContext.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private AbstractTypeChecker() {
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.isSubtypeOf(abstractTypeCheckerContext, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public final boolean isSubtypeOf(@NotNull AbstractTypeCheckerContext abstractTypeCheckerContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        Intrinsics.checkNotNullParameter(abstractTypeCheckerContext, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "subType");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "superType");
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (!abstractTypeCheckerContext.customIsSubtypeOf(kotlinTypeMarker, kotlinTypeMarker2)) {
            return false;
        }
        return completeIsSubTypeOf(abstractTypeCheckerContext, abstractTypeCheckerContext.prepareType(abstractTypeCheckerContext.refineType(kotlinTypeMarker)), abstractTypeCheckerContext.prepareType(abstractTypeCheckerContext.refineType(kotlinTypeMarker2)), z);
    }

    public final boolean equalTypes(@NotNull AbstractTypeCheckerContext abstractTypeCheckerContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2) {
        Intrinsics.checkNotNullParameter(abstractTypeCheckerContext, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "a");
        Intrinsics.checkNotNullParameter(kotlinTypeMarker2, "b");
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (isCommonDenotableType(abstractTypeCheckerContext, kotlinTypeMarker) && isCommonDenotableType(abstractTypeCheckerContext, kotlinTypeMarker2)) {
            KotlinTypeMarker refineType = abstractTypeCheckerContext.refineType(kotlinTypeMarker);
            KotlinTypeMarker refineType2 = abstractTypeCheckerContext.refineType(kotlinTypeMarker2);
            SimpleTypeMarker lowerBoundIfFlexible = abstractTypeCheckerContext.lowerBoundIfFlexible(refineType);
            if (!abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(refineType), abstractTypeCheckerContext.typeConstructor(refineType2))) {
                return false;
            }
            if (abstractTypeCheckerContext.argumentsCount(lowerBoundIfFlexible) == 0) {
                return abstractTypeCheckerContext.hasFlexibleNullability(refineType) || abstractTypeCheckerContext.hasFlexibleNullability(refineType2) || abstractTypeCheckerContext.isMarkedNullable(lowerBoundIfFlexible) == abstractTypeCheckerContext.isMarkedNullable(abstractTypeCheckerContext.lowerBoundIfFlexible(refineType2));
            }
        }
        return isSubtypeOf$default(this, abstractTypeCheckerContext, kotlinTypeMarker, kotlinTypeMarker2, false, 8, (Object) null) && isSubtypeOf$default(this, abstractTypeCheckerContext, kotlinTypeMarker2, kotlinTypeMarker, false, 8, (Object) null);
    }

    private final boolean completeIsSubTypeOf(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        Boolean checkSubtypeForSpecialCases = checkSubtypeForSpecialCases(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
        if (checkSubtypeForSpecialCases != null) {
            boolean booleanValue = checkSubtypeForSpecialCases.booleanValue();
            abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z);
            return booleanValue;
        }
        Boolean addSubtypeConstraint = abstractTypeCheckerContext.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z);
        if (addSubtypeConstraint != null) {
            return addSubtypeConstraint.booleanValue();
        }
        return isSubtypeOfForSingleClassifierType(abstractTypeCheckerContext, abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker), abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker2));
    }

    private final Boolean checkSubtypeForIntegerLiteralType(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        if (!abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && !abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return null;
        }
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker) && abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker)) {
            if (checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(abstractTypeCheckerContext, this, simpleTypeMarker, simpleTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (abstractTypeCheckerContext.isIntegerLiteralType(simpleTypeMarker2) && (checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeInIntersectionComponents(abstractTypeCheckerContext, simpleTypeMarker) || checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(abstractTypeCheckerContext, this, simpleTypeMarker2, simpleTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (isSubtypeOf$default(r11, r10, r13, r5, false, 8, (java.lang.Object) null) != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext r10, kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r11, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r12, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r13, boolean r14) {
        /*
            java.util.Collection r12 = r10.possibleIntegerTypes(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L_0x0014
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004c
        L_0x0014:
            java.util.Iterator r12 = r12.iterator()
        L_0x0018:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r12.next()
            r5 = r0
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r5 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r5
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r0 = r10.typeConstructor(r5)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r2 = r10.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r9 = 1
            if (r0 != 0) goto L_0x0048
            if (r14 == 0) goto L_0x0046
            r4 = r13
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r11
            r3 = r10
            boolean r0 = isSubtypeOf$default(r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            if (r0 == 0) goto L_0x0018
            return r9
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, boolean):boolean");
    }

    private static final boolean checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeInIntersectionComponents(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker) {
        boolean z;
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker);
        if (typeConstructor instanceof IntersectionTypeConstructorMarker) {
            Iterable supertypes = abstractTypeCheckerContext.supertypes(typeConstructor);
            if (!(supertypes instanceof Collection) || !((Collection) supertypes).isEmpty()) {
                Iterator it = supertypes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SimpleTypeMarker asSimpleType = abstractTypeCheckerContext.asSimpleType((KotlinTypeMarker) it.next());
                    if (Intrinsics.areEqual((Object) asSimpleType == null ? null : Boolean.valueOf(abstractTypeCheckerContext.isIntegerLiteralType(asSimpleType)), (Object) Boolean.TRUE)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasNothingSupertype(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy;
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext.typeConstructor(simpleTypeMarker);
        if (abstractTypeCheckerContext.isClassTypeConstructor(typeConstructor)) {
            return abstractTypeCheckerContext.isNothingConstructor(typeConstructor);
        }
        if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker))) {
            return true;
        }
        abstractTypeCheckerContext.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker pop = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(pop, "current");
                if (supertypesSet.add(pop)) {
                    if (abstractTypeCheckerContext.isClassType(pop)) {
                        supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy != null) {
                        for (KotlinTypeMarker transformType : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                            SimpleTypeMarker transformType2 = supertypesPolicy.transformType(abstractTypeCheckerContext, transformType);
                            if (abstractTypeCheckerContext.isNothingConstructor(abstractTypeCheckerContext.typeConstructor(transformType2))) {
                                abstractTypeCheckerContext.clear();
                                return true;
                            }
                            supertypesDeque.add(transformType2);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(simpleTypeMarker);
                sb.append(". Supertypes = ");
                sb.append(CollectionsKt.joinToString$default(supertypesSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        abstractTypeCheckerContext.clear();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011d, code lost:
        if ((r1.getVariance(r5) == kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV) != false) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext r18, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r19, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = RUN_SLOW_ASSERTIONS
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0068
            boolean r4 = r18.isSingleClassifierType(r19)
            if (r4 != 0) goto L_0x002a
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r18.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r19)
            boolean r4 = r1.isIntersection(r4)
            if (r4 != 0) goto L_0x002a
            r4 = r2
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4
            boolean r4 = r1.isAllowedTypeVariable(r4)
            if (r4 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r4 = 0
            goto L_0x002b
        L_0x002a:
            r4 = 1
        L_0x002b:
            boolean r7 = kotlin._Assertions.ENABLED
            if (r7 == 0) goto L_0x0040
            if (r4 == 0) goto L_0x0032
            goto L_0x0040
        L_0x0032:
            java.lang.String r1 = "Not singleClassifierType and not intersection subType: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x0040:
            boolean r4 = r1.isSingleClassifierType(r3)
            if (r4 != 0) goto L_0x0052
            r4 = r3
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4
            boolean r4 = r1.isAllowedTypeVariable(r4)
            if (r4 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r4 = 0
            goto L_0x0053
        L_0x0052:
            r4 = 1
        L_0x0053:
            boolean r7 = kotlin._Assertions.ENABLED
            if (r7 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            java.lang.String r1 = "Not singleClassifierType superType: "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x0068:
            kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker r4 = kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker.INSTANCE
            boolean r4 = r4.isPossibleSubtype(r1, r2, r3)
            if (r4 != 0) goto L_0x0071
            return r5
        L_0x0071:
            r4 = r2
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r4
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r7 = r1.lowerBoundIfFlexible(r4)
            r8 = r3
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r8
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r9 = r1.upperBoundIfFlexible(r8)
            java.lang.Boolean r7 = r0.checkSubtypeForIntegerLiteralType(r1, r7, r9)
            if (r7 == 0) goto L_0x0097
            boolean r7 = r7.booleanValue()
            r5 = 0
            r6 = 4
            r9 = 0
            r1 = r18
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r6
            r6 = r9
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext.addSubtypeConstraint$default(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x0097:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r1.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r3)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r7 = r18.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r19)
            boolean r7 = r1.areEqualTypeConstructors(r7, r4)
            if (r7 == 0) goto L_0x00ac
            int r7 = r1.parametersCount(r4)
            if (r7 != 0) goto L_0x00ac
            return r6
        L_0x00ac:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r7 = r1.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r3)
            boolean r7 = r1.isAnyConstructor(r7)
            if (r7 == 0) goto L_0x00b7
            return r6
        L_0x00b7:
            java.util.List r7 = r0.findCorrespondingSupertypes(r1, r2, r4)
            int r8 = r7.size()
            if (r8 == 0) goto L_0x01c2
            if (r8 == r6) goto L_0x01b3
            kotlin.reflect.jvm.internal.impl.types.model.ArgumentList r8 = new kotlin.reflect.jvm.internal.impl.types.model.ArgumentList
            int r9 = r1.parametersCount(r4)
            r8.<init>(r9)
            int r9 = r1.parametersCount(r4)
            if (r9 <= 0) goto L_0x0177
            r10 = 0
            r11 = 0
        L_0x00d4:
            int r12 = r10 + 1
            if (r11 != 0) goto L_0x00e7
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r11 = r1.getParameter(r4, r10)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r11 = r1.getVariance((kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker) r11)
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r13 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.OUT
            if (r11 == r13) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r11 = 0
            goto L_0x00e8
        L_0x00e7:
            r11 = 1
        L_0x00e8:
            if (r11 != 0) goto L_0x016b
            r13 = r7
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r13, r15)
            r14.<init>(r15)
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.Iterator r13 = r13.iterator()
        L_0x00fe:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x015b
            java.lang.Object r15 = r13.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r15 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r15
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r5 = r1.getArgumentOrNull(r15, r10)
            if (r5 == 0) goto L_0x0120
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r6 = r1.getVariance((kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker) r5)
            r16 = r4
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r4 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.INV
            if (r6 != r4) goto L_0x011c
            r4 = 1
            goto L_0x011d
        L_0x011c:
            r4 = 0
        L_0x011d:
            if (r4 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0120:
            r16 = r4
        L_0x0122:
            r5 = 0
        L_0x0123:
            if (r5 == 0) goto L_0x0131
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r1.getType(r5)
            r14.add(r4)
            r4 = r16
            r5 = 0
            r6 = 1
            goto L_0x00fe
        L_0x0131:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Incorrect type: "
            r1.<init>(r4)
            r1.append(r15)
            java.lang.String r4 = ", subType: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", superType: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x015b:
            r16 = r4
            java.util.List r14 = (java.util.List) r14
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r4 = r1.intersectTypes(r14)
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = r1.asTypeArgument(r4)
            r8.add(r4)
            goto L_0x016d
        L_0x016b:
            r16 = r4
        L_0x016d:
            if (r12 < r9) goto L_0x0170
            goto L_0x0178
        L_0x0170:
            r10 = r12
            r4 = r16
            r5 = 0
            r6 = 1
            goto L_0x00d4
        L_0x0177:
            r11 = 0
        L_0x0178:
            if (r11 != 0) goto L_0x0184
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r8 = (kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker) r8
            boolean r2 = r0.isSubtypeForSameConstructor(r1, r8, r3)
            if (r2 == 0) goto L_0x0184
            r2 = 1
            return r2
        L_0x0184:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0196
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0194
            goto L_0x0196
        L_0x0194:
            r1 = 0
            goto L_0x01b2
        L_0x0196:
            java.util.Iterator r2 = r7.iterator()
        L_0x019a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0194
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r4 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r4
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r4 = r1.asArgumentList(r4)
            boolean r4 = r0.isSubtypeForSameConstructor(r1, r4, r3)
            if (r4 == 0) goto L_0x019a
            r4 = 1
            return r4
        L_0x01b2:
            return r1
        L_0x01b3:
            java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r7)
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r2 = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r2
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker r2 = r1.asArgumentList(r2)
            boolean r1 = r0.isSubtypeForSameConstructor(r1, r2, r3)
            return r1
        L_0x01c2:
            boolean r1 = r17.hasNothingSupertype(r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.isSubtypeOfForSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):boolean");
    }

    public final boolean isSubtypeForSameConstructor(@NotNull AbstractTypeCheckerContext abstractTypeCheckerContext, @NotNull TypeArgumentListMarker typeArgumentListMarker, @NotNull SimpleTypeMarker simpleTypeMarker) {
        boolean z;
        AbstractTypeCheckerContext abstractTypeCheckerContext2 = abstractTypeCheckerContext;
        TypeArgumentListMarker typeArgumentListMarker2 = typeArgumentListMarker;
        SimpleTypeMarker simpleTypeMarker2 = simpleTypeMarker;
        Intrinsics.checkNotNullParameter(abstractTypeCheckerContext2, "<this>");
        Intrinsics.checkNotNullParameter(typeArgumentListMarker2, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(simpleTypeMarker2, "superType");
        TypeConstructorMarker typeConstructor = abstractTypeCheckerContext2.typeConstructor(simpleTypeMarker2);
        int parametersCount = abstractTypeCheckerContext2.parametersCount(typeConstructor);
        if (parametersCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                TypeArgumentMarker argument = abstractTypeCheckerContext2.getArgument(simpleTypeMarker2, i);
                if (!abstractTypeCheckerContext2.isStarProjection(argument)) {
                    KotlinTypeMarker type = abstractTypeCheckerContext2.getType(argument);
                    TypeArgumentMarker typeArgumentMarker = abstractTypeCheckerContext2.get(typeArgumentListMarker2, i);
                    boolean z2 = abstractTypeCheckerContext2.getVariance(typeArgumentMarker) == TypeVariance.INV;
                    if (!_Assertions.ENABLED || z2) {
                        KotlinTypeMarker type2 = abstractTypeCheckerContext2.getType(typeArgumentMarker);
                        TypeVariance effectiveVariance = effectiveVariance(abstractTypeCheckerContext2.getVariance(abstractTypeCheckerContext2.getParameter(typeConstructor, i)), abstractTypeCheckerContext2.getVariance(argument));
                        if (effectiveVariance == null) {
                            return abstractTypeCheckerContext.isErrorTypeEqualsToAnything();
                        }
                        if (abstractTypeCheckerContext.argumentsDepth <= 100) {
                            abstractTypeCheckerContext2.argumentsDepth = abstractTypeCheckerContext.argumentsDepth + 1;
                            int i3 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
                            if (i3 == 1) {
                                z = equalTypes(abstractTypeCheckerContext2, type2, type);
                            } else if (i3 == 2) {
                                z = isSubtypeOf$default(this, abstractTypeCheckerContext, type2, type, false, 8, (Object) null);
                            } else if (i3 == 3) {
                                z = isSubtypeOf$default(this, abstractTypeCheckerContext, type, type2, false, 8, (Object) null);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            abstractTypeCheckerContext2.argumentsDepth = abstractTypeCheckerContext.argumentsDepth - 1;
                            if (!z) {
                                return false;
                            }
                        } else {
                            throw new IllegalStateException(Intrinsics.stringPlus("Arguments depth is too high. Some related argument: ", type2).toString());
                        }
                    } else {
                        throw new AssertionError(Intrinsics.stringPlus("Incorrect sub argument: ", typeArgumentMarker));
                    }
                }
                if (i2 >= parametersCount) {
                    break;
                }
                i = i2;
            }
        }
        return true;
    }

    private final boolean isCommonDenotableType(AbstractTypeCheckerContext abstractTypeCheckerContext, KotlinTypeMarker kotlinTypeMarker) {
        return abstractTypeCheckerContext.isDenotable(abstractTypeCheckerContext.typeConstructor(kotlinTypeMarker)) && !abstractTypeCheckerContext.isDynamic(kotlinTypeMarker) && !abstractTypeCheckerContext.isDefinitelyNotNullType(kotlinTypeMarker) && Intrinsics.areEqual((Object) abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.lowerBoundIfFlexible(kotlinTypeMarker)), (Object) abstractTypeCheckerContext.typeConstructor(abstractTypeCheckerContext.upperBoundIfFlexible(kotlinTypeMarker)));
    }

    @Nullable
    public final TypeVariance effectiveVariance(@NotNull TypeVariance typeVariance, @NotNull TypeVariance typeVariance2) {
        Intrinsics.checkNotNullParameter(typeVariance, "declared");
        Intrinsics.checkNotNullParameter(typeVariance2, "useSite");
        if (typeVariance == TypeVariance.INV) {
            return typeVariance2;
        }
        if (typeVariance2 == TypeVariance.INV || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Boolean checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext r12, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r13, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r14) {
        /*
            r11 = this;
            r7 = r13
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r7 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r7
            boolean r0 = r12.isError(r7)
            r8 = 0
            if (r0 != 0) goto L_0x00f1
            r0 = r14
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r0
            boolean r1 = r12.isError(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x00f1
        L_0x0015:
            boolean r1 = r12.isStubType(r13)
            if (r1 != 0) goto L_0x00e8
            boolean r1 = r12.isStubType(r14)
            if (r1 == 0) goto L_0x0023
            goto L_0x00e8
        L_0x0023:
            kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker r1 = r12.asDefinitelyNotNullType(r14)
            if (r1 != 0) goto L_0x002b
            r1 = r14
            goto L_0x002f
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r1 = r12.original(r1)
        L_0x002f:
            kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker r1 = r12.asCapturedType(r1)
            r9 = 0
            if (r1 != 0) goto L_0x0038
            r2 = r9
            goto L_0x003c
        L_0x0038:
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r2 = r12.lowerType(r1)
        L_0x003c:
            r10 = 1
            if (r1 == 0) goto L_0x008b
            if (r2 == 0) goto L_0x008b
            boolean r3 = r12.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14)
            if (r3 == 0) goto L_0x004d
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = r12.withNullability((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r2, (boolean) r10)
        L_0x004b:
            r3 = r0
            goto L_0x0059
        L_0x004d:
            boolean r0 = r12.isDefinitelyNotNullType(r0)
            if (r0 == 0) goto L_0x0058
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r0 = r12.makeDefinitelyNotNullOrNotNull(r2)
            goto L_0x004b
        L_0x0058:
            r3 = r2
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext$LowerCapturedTypePolicy r13 = r12.getLowerCapturedTypePolicy(r13, r1)
            int[] r0 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.WhenMappings.$EnumSwitchMapping$1
            int r13 = r13.ordinal()
            r13 = r0[r13]
            if (r13 == r10) goto L_0x007b
            r0 = 2
            if (r13 == r0) goto L_0x006b
            goto L_0x008b
        L_0x006b:
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r11
            r1 = r12
            r2 = r7
            boolean r13 = isSubtypeOf$default(r0, r1, r2, r3, r4, r5, r6)
            if (r13 == 0) goto L_0x008b
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L_0x007b:
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r11
            r1 = r12
            r2 = r7
            boolean r12 = isSubtypeOf$default(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x008b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r13 = r12.typeConstructor((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14)
            boolean r0 = r12.isIntersection(r13)
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r12.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14)
            r0 = r0 ^ r10
            boolean r1 = kotlin._Assertions.ENABLED
            if (r1 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00a1
            goto L_0x00af
        L_0x00a1:
            java.lang.String r12 = "Intersection type should not be marked nullable!: "
            java.lang.String r12 = kotlin.jvm.internal.Intrinsics.stringPlus(r12, r14)
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>(r12)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            throw r13
        L_0x00af:
            java.util.Collection r13 = r12.supertypes(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r14 = r13 instanceof java.util.Collection
            if (r14 == 0) goto L_0x00c2
            r14 = r13
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00e1
        L_0x00c2:
            java.util.Iterator r13 = r13.iterator()
        L_0x00c6:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00e1
            java.lang.Object r14 = r13.next()
            r3 = r14
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r3
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r11
            r1 = r12
            r2 = r7
            boolean r14 = isSubtypeOf$default(r0, r1, r2, r3, r4, r5, r6)
            if (r14 != 0) goto L_0x00c6
            goto L_0x00e2
        L_0x00e1:
            r8 = 1
        L_0x00e2:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)
            return r12
        L_0x00e7:
            return r9
        L_0x00e8:
            boolean r12 = r12.isStubTypeEqualsToAnything()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L_0x00f1:
            boolean r0 = r12.isErrorTypeEqualsToAnything()
            if (r0 == 0) goto L_0x00fa
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L_0x00fa:
            boolean r0 = r12.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r13)
            if (r0 == 0) goto L_0x0109
            boolean r0 = r12.isMarkedNullable((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14)
            if (r0 != 0) goto L_0x0109
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L_0x0109:
            kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker r0 = kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker.INSTANCE
            r1 = r12
            kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r1 = (kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext) r1
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r13 = r12.withNullability((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r13, (boolean) r8)
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r13 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r13
            kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker r12 = r12.withNullability((kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) r14, (boolean) r8)
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r12 = (kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) r12
            boolean r12 = r0.strictEqualTypes(r1, r13, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.checkSubtypeForSpecialCases(kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker):java.lang.Boolean");
    }

    private final List<SimpleTypeMarker> collectAllSupertypesWithGivenTypeConstructor(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy;
        List<SimpleTypeMarker> fastCorrespondingSupertypes = abstractTypeCheckerContext.fastCorrespondingSupertypes(simpleTypeMarker, typeConstructorMarker);
        if (fastCorrespondingSupertypes != null) {
            return fastCorrespondingSupertypes;
        }
        if (!abstractTypeCheckerContext.isClassTypeConstructor(typeConstructorMarker) && abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (!abstractTypeCheckerContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            List<SimpleTypeMarker> smartList = new SmartList<>();
            abstractTypeCheckerContext.initialize();
            ArrayDeque<SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
            Intrinsics.checkNotNull(supertypesDeque);
            Set<SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
            Intrinsics.checkNotNull(supertypesSet);
            supertypesDeque.push(simpleTypeMarker);
            while (!supertypesDeque.isEmpty()) {
                if (supertypesSet.size() <= 1000) {
                    SimpleTypeMarker pop = supertypesDeque.pop();
                    Intrinsics.checkNotNullExpressionValue(pop, "current");
                    if (supertypesSet.add(pop)) {
                        SimpleTypeMarker captureFromArguments = abstractTypeCheckerContext.captureFromArguments(pop, CaptureStatus.FOR_SUBTYPING);
                        if (captureFromArguments == null) {
                            captureFromArguments = pop;
                        }
                        if (abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(captureFromArguments), typeConstructorMarker)) {
                            smartList.add(captureFromArguments);
                            supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                        } else if (abstractTypeCheckerContext.argumentsCount(captureFromArguments) == 0) {
                            supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                        } else {
                            supertypesPolicy = abstractTypeCheckerContext.substitutionSupertypePolicy(captureFromArguments);
                        }
                        if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                            supertypesPolicy = null;
                        }
                        if (supertypesPolicy != null) {
                            for (KotlinTypeMarker transformType : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                                supertypesDeque.add(supertypesPolicy.transformType(abstractTypeCheckerContext, transformType));
                            }
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                    sb.append(simpleTypeMarker);
                    sb.append(". Supertypes = ");
                    sb.append(CollectionsKt.joinToString$default(supertypesSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            abstractTypeCheckerContext.clear();
            return smartList;
        } else if (!abstractTypeCheckerContext.areEqualTypeConstructors(abstractTypeCheckerContext.typeConstructor(simpleTypeMarker), typeConstructorMarker)) {
            return CollectionsKt.emptyList();
        } else {
            SimpleTypeMarker captureFromArguments2 = abstractTypeCheckerContext.captureFromArguments(simpleTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (captureFromArguments2 != null) {
                simpleTypeMarker = captureFromArguments2;
            }
            return CollectionsKt.listOf(simpleTypeMarker);
        }
    }

    private final List<SimpleTypeMarker> collectAndFilter(AbstractTypeCheckerContext abstractTypeCheckerContext, SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(abstractTypeCheckerContext, collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker));
    }

    private final List<SimpleTypeMarker> selectOnlyPureKotlinSupertypes(AbstractTypeCheckerContext abstractTypeCheckerContext, List<? extends SimpleTypeMarker> list) {
        if (list.size() < 2) {
            return list;
        }
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TypeArgumentListMarker asArgumentList = abstractTypeCheckerContext.asArgumentList((SimpleTypeMarker) next);
            TypeSystemContext typeSystemContext = abstractTypeCheckerContext;
            int size = typeSystemContext.size(asArgumentList);
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!(abstractTypeCheckerContext.asFlexibleType(abstractTypeCheckerContext.getType(typeSystemContext.get(asArgumentList, i))) == null)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<SimpleTypeMarker> list2 = (List) arrayList;
        return list2.isEmpty() ^ true ? list2 : list;
    }

    @NotNull
    public final List<SimpleTypeMarker> findCorrespondingSupertypes(@NotNull AbstractTypeCheckerContext abstractTypeCheckerContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        AbstractTypeCheckerContext.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkNotNullParameter(abstractTypeCheckerContext, "<this>");
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "subType");
        Intrinsics.checkNotNullParameter(typeConstructorMarker, "superConstructor");
        if (abstractTypeCheckerContext.isClassType(simpleTypeMarker)) {
            return collectAndFilter(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker);
        }
        if (!abstractTypeCheckerContext.isClassTypeConstructor(typeConstructorMarker) && !abstractTypeCheckerContext.isIntegerLiteralTypeConstructor(typeConstructorMarker)) {
            return collectAllSupertypesWithGivenTypeConstructor(abstractTypeCheckerContext, simpleTypeMarker, typeConstructorMarker);
        }
        SmartList<SimpleTypeMarker> smartList = new SmartList<>();
        abstractTypeCheckerContext.initialize();
        ArrayDeque<SimpleTypeMarker> supertypesDeque = abstractTypeCheckerContext.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<SimpleTypeMarker> supertypesSet = abstractTypeCheckerContext.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(simpleTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            if (supertypesSet.size() <= 1000) {
                SimpleTypeMarker pop = supertypesDeque.pop();
                Intrinsics.checkNotNullExpressionValue(pop, "current");
                if (supertypesSet.add(pop)) {
                    if (abstractTypeCheckerContext.isClassType(pop)) {
                        smartList.add(pop);
                        supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE;
                    } else {
                        supertypesPolicy = AbstractTypeCheckerContext.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                    }
                    if (!(!Intrinsics.areEqual((Object) supertypesPolicy, (Object) AbstractTypeCheckerContext.SupertypesPolicy.None.INSTANCE))) {
                        supertypesPolicy = null;
                    }
                    if (supertypesPolicy != null) {
                        for (KotlinTypeMarker transformType : abstractTypeCheckerContext.supertypes(abstractTypeCheckerContext.typeConstructor(pop))) {
                            supertypesDeque.add(supertypesPolicy.transformType(abstractTypeCheckerContext, transformType));
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Too many supertypes for type: ");
                sb.append(simpleTypeMarker);
                sb.append(". Supertypes = ");
                sb.append(CollectionsKt.joinToString$default(supertypesSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        abstractTypeCheckerContext.clear();
        Collection arrayList = new ArrayList();
        for (SimpleTypeMarker simpleTypeMarker2 : smartList) {
            Intrinsics.checkNotNullExpressionValue(simpleTypeMarker2, "it");
            CollectionsKt.addAll(arrayList, collectAndFilter(abstractTypeCheckerContext, simpleTypeMarker2, typeConstructorMarker));
        }
        return (List) arrayList;
    }
}
