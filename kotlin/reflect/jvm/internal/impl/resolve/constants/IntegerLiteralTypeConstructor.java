package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IntegerLiteralTypeConstructor implements TypeConstructor {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public final ModuleDescriptor module;
    @NotNull
    private final Set<KotlinType> possibleTypes;
    @NotNull
    private final Lazy supertypes$delegate;
    /* access modifiers changed from: private */
    @NotNull
    public final SimpleType type;
    /* access modifiers changed from: private */
    public final long value;

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, moduleDescriptor, set);
    }

    @Nullable
    public final ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    public final boolean isDenotable() {
        return false;
    }

    public static final class Companion {

        enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final SimpleType findIntersectionType(@NotNull Collection<? extends SimpleType> collection) {
            Intrinsics.checkNotNullParameter(collection, "types");
            return findCommonSuperTypeOrIntersectionType(collection, Mode.INTERSECTION_TYPE);
        }

        private final SimpleType findCommonSuperTypeOrIntersectionType(Collection<? extends SimpleType> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = fold((SimpleType) next, (SimpleType) it.next(), mode);
                }
                return (SimpleType) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final SimpleType fold(SimpleType simpleType, SimpleType simpleType2, Mode mode) {
            if (!(simpleType == null || simpleType2 == null)) {
                TypeConstructor constructor = simpleType.getConstructor();
                TypeConstructor constructor2 = simpleType2.getConstructor();
                boolean z = constructor instanceof IntegerLiteralTypeConstructor;
                if (z && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                    return fold((IntegerLiteralTypeConstructor) constructor, (IntegerLiteralTypeConstructor) constructor2, mode);
                }
                if (z) {
                    return fold((IntegerLiteralTypeConstructor) constructor, simpleType2);
                }
                if (constructor2 instanceof IntegerLiteralTypeConstructor) {
                    return fold((IntegerLiteralTypeConstructor) constructor2, simpleType);
                }
            }
            return null;
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set set;
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                set = CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else if (i == 2) {
                set = CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            IntegerLiteralTypeConstructor integerLiteralTypeConstructor3 = new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.value, integerLiteralTypeConstructor.module, set, (DefaultConstructorMarker) null);
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
            return KotlinTypeFactory.integerLiteralType(Annotations.Companion.getEMPTY(), integerLiteralTypeConstructor3, false);
        }

        private final SimpleType fold(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, SimpleType simpleType) {
            if (integerLiteralTypeConstructor.getPossibleTypes().contains(simpleType)) {
                return simpleType;
            }
            return null;
        }
    }

    @NotNull
    public final Set<KotlinType> getPossibleTypes() {
        return this.possibleTypes;
    }

    private IntegerLiteralTypeConstructor(long j, ModuleDescriptor moduleDescriptor, Set<? extends KotlinType> set) {
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.INSTANCE;
        this.type = KotlinTypeFactory.integerLiteralType(Annotations.Companion.getEMPTY(), this, false);
        this.supertypes$delegate = LazyKt.lazy(new IntegerLiteralTypeConstructor$supertypes$2(this));
        this.value = j;
        this.module = moduleDescriptor;
        this.possibleTypes = set;
    }

    /* access modifiers changed from: private */
    public final boolean isContainsOnlyUnsignedTypes() {
        Iterable<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(this.module);
        if (!(allSignedLiteralTypes instanceof Collection) || !((Collection) allSignedLiteralTypes).isEmpty()) {
            for (KotlinType contains : allSignedLiteralTypes) {
                if (!(!getPossibleTypes().contains(contains))) {
                    return false;
                }
            }
        }
        return true;
    }

    private final List<KotlinType> getSupertypes() {
        return (List) this.supertypes$delegate.getValue();
    }

    @NotNull
    public final List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* renamed from: getSupertypes  reason: collision with other method in class */
    public final Collection<KotlinType> m1353getSupertypes() {
        return getSupertypes();
    }

    @NotNull
    public final KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @NotNull
    public final TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public final String toString() {
        return Intrinsics.stringPlus("IntegerLiteralType", valueToString());
    }

    public final boolean checkConstructor(@NotNull TypeConstructor typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "constructor");
        Iterable<KotlinType> iterable = this.possibleTypes;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (KotlinType constructor : iterable) {
            if (Intrinsics.areEqual((Object) constructor.getConstructor(), (Object) typeConstructor)) {
                return true;
            }
        }
        return false;
    }

    private final String valueToString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(CollectionsKt.joinToString$default(this.possibleTypes, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, IntegerLiteralTypeConstructor$valueToString$1.INSTANCE, 30, (Object) null));
        sb.append(']');
        return sb.toString();
    }
}
