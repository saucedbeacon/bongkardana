package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;

public final class TypeIntersector {
    @NotNull
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    private TypeIntersector() {
    }

    @NotNull
    public final SimpleType intersectTypes$descriptors(@NotNull List<? extends SimpleType> list) {
        Intrinsics.checkNotNullParameter(list, "types");
        boolean z = list.size() > 1;
        if (!_Assertions.ENABLED || z) {
            ArrayList arrayList = new ArrayList();
            for (SimpleType simpleType : list) {
                if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                    Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                    Intrinsics.checkNotNullExpressionValue(supertypes, "type.constructor.supertypes");
                    Iterable<KotlinType> iterable = supertypes;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (KotlinType kotlinType : iterable) {
                        Intrinsics.checkNotNullExpressionValue(kotlinType, "it");
                        SimpleType upperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                        if (simpleType.isMarkedNullable()) {
                            upperIfFlexible = upperIfFlexible.makeNullableAsSpecified(true);
                        }
                        arrayList2.add(upperIfFlexible);
                    }
                    arrayList.addAll((List) arrayList2);
                } else {
                    arrayList.add(simpleType);
                }
            }
            Iterable<UnwrappedType> iterable2 = arrayList;
            ResultNullability resultNullability = ResultNullability.START;
            for (UnwrappedType combine : iterable2) {
                resultNullability = resultNullability.combine(combine);
            }
            Collection linkedHashSet = new LinkedHashSet();
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                SimpleType simpleType2 = (SimpleType) it.next();
                if (resultNullability == ResultNullability.NOT_NULL) {
                    if (simpleType2 instanceof NewCapturedType) {
                        simpleType2 = SpecialTypesKt.withNotNullProjection((NewCapturedType) simpleType2);
                    }
                    simpleType2 = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleType2, false, 1, (Object) null);
                }
                linkedHashSet.add(simpleType2);
            }
            return intersectTypesWithoutIntersectionType((LinkedHashSet) linkedHashSet);
        }
        throw new AssertionError(Intrinsics.stringPlus("Size should be at least 2, but it is ", Integer.valueOf(list.size())));
    }

    private final SimpleType intersectTypesWithoutIntersectionType(Set<? extends SimpleType> set) {
        if (set.size() == 1) {
            return (SimpleType) CollectionsKt.single(set);
        }
        Function0 typeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 = new TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1(set);
        Collection collection = set;
        Collection<SimpleType> filterTypes = filterTypes(collection, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
        boolean z = !filterTypes.isEmpty();
        if (!_Assertions.ENABLED || z) {
            SimpleType findIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(filterTypes);
            if (findIntersectionType != null) {
                return findIntersectionType;
            }
            Collection<SimpleType> filterTypes2 = filterTypes(filterTypes, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(NewKotlinTypeChecker.Companion.getDefault()));
            boolean isEmpty = true ^ filterTypes2.isEmpty();
            if (_Assertions.ENABLED && !isEmpty) {
                throw new AssertionError(typeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1.invoke());
            } else if (filterTypes2.size() < 2) {
                return (SimpleType) CollectionsKt.single(filterTypes2);
            } else {
                return new IntersectionTypeConstructor(collection).createType();
            }
        } else {
            throw new AssertionError(typeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1.invoke());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x000e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[EDGE_INSN: B:25:0x0057->B:16:0x0057 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.SimpleType> filterTypes(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> r8, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.types.SimpleType, ? super kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r8 = r0.iterator()
            java.lang.String r1 = "filteredTypes.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
        L_0x000e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r1 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r1
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0056
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r3
            if (r3 == r1) goto L_0x0052
            java.lang.String r6 = "lower"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.lang.String r6 = "upper"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            java.lang.Object r3 = r9.invoke(r3, r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r3 == 0) goto L_0x002c
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x000e
            r8.remove()
            goto L_0x000e
        L_0x005d:
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.filterTypes(java.util.Collection, kotlin.jvm.functions.Function2):java.util.Collection");
    }

    /* access modifiers changed from: private */
    public final boolean isStrictSupertype(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    enum ResultNullability {
        ;

        @NotNull
        public abstract ResultNullability combine(@NotNull UnwrappedType unwrappedType);

        static final class START extends ResultNullability {
            START(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            @NotNull
            public final ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                Intrinsics.checkNotNullParameter(unwrappedType, "nextType");
                return getResultNullability(unwrappedType);
            }
        }

        static final class ACCEPT_NULL extends ResultNullability {
            ACCEPT_NULL(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            @NotNull
            public final ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                Intrinsics.checkNotNullParameter(unwrappedType, "nextType");
                return getResultNullability(unwrappedType);
            }
        }

        static final class UNKNOWN extends ResultNullability {
            UNKNOWN(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }

            @NotNull
            public final ResultNullability combine(@NotNull UnwrappedType unwrappedType) {
                Intrinsics.checkNotNullParameter(unwrappedType, "nextType");
                ResultNullability resultNullability = getResultNullability(unwrappedType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        static final class NOT_NULL extends ResultNullability {
            @NotNull
            public final NOT_NULL combine(@NotNull UnwrappedType unwrappedType) {
                Intrinsics.checkNotNullParameter(unwrappedType, "nextType");
                return this;
            }

            NOT_NULL(String str, int i) {
                super(str, i, (DefaultConstructorMarker) null);
            }
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final ResultNullability getResultNullability(@NotNull UnwrappedType unwrappedType) {
            Intrinsics.checkNotNullParameter(unwrappedType, "<this>");
            if (unwrappedType.isMarkedNullable()) {
                return ACCEPT_NULL;
            }
            if (NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }
}
