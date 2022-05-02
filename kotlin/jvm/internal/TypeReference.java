package kotlin.jvm.internal;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", "other", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
@SinceKotlin(version = "1.4")
public final class TypeReference implements KType {
    @NotNull
    private final List<KTypeProjection> arguments;
    @NotNull
    private final KClassifier classifier;
    private final boolean isMarkedNullable;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[KVariance.INVARIANT.ordinal()] = 1;
            $EnumSwitchMapping$0[KVariance.IN.ordinal()] = 2;
            $EnumSwitchMapping$0[KVariance.OUT.ordinal()] = 3;
        }
    }

    public TypeReference(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, boolean z) {
        Intrinsics.checkNotNullParameter(kClassifier, "classifier");
        Intrinsics.checkNotNullParameter(list, "arguments");
        this.classifier = kClassifier;
        this.arguments = list;
        this.isMarkedNullable = z;
    }

    @NotNull
    public final KClassifier getClassifier() {
        return this.classifier;
    }

    @NotNull
    public final List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    public final boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @NotNull
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) obj;
        return Intrinsics.areEqual((Object) getClassifier(), (Object) typeReference.getClassifier()) && Intrinsics.areEqual((Object) getArguments(), (Object) typeReference.getArguments()) && isMarkedNullable() == typeReference.isMarkedNullable();
    }

    public final int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Boolean.valueOf(isMarkedNullable()).hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(asString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    private final String asString() {
        String str;
        String str2;
        KClassifier classifier2 = getClassifier();
        Class cls = null;
        if (!(classifier2 instanceof KClass)) {
            classifier2 = null;
        }
        KClass kClass = (KClass) classifier2;
        if (kClass != null) {
            cls = JvmClassMappingKt.getJavaClass(kClass);
        }
        if (cls == null) {
            str = getClassifier().toString();
        } else if (cls.isArray()) {
            str = getArrayClassName(cls);
        } else {
            str = cls.getName();
        }
        String str3 = "";
        if (getArguments().isEmpty()) {
            str2 = str3;
        } else {
            str2 = CollectionsKt.joinToString$default(getArguments(), ", ", SimpleComparison.LESS_THAN_OPERATION, SimpleComparison.GREATER_THAN_OPERATION, 0, (CharSequence) null, new TypeReference$asString$args$1(this), 24, (Object) null);
        }
        if (isMarkedNullable()) {
            str3 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    private final String getArrayClassName(Class<?> cls) {
        if (Intrinsics.areEqual((Object) cls, (Object) boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.areEqual((Object) cls, (Object) double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* access modifiers changed from: private */
    public final String asString(KTypeProjection kTypeProjection) {
        String str;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        KType type = kTypeProjection.getType();
        if (!(type instanceof TypeReference)) {
            type = null;
        }
        TypeReference typeReference = (TypeReference) type;
        if (typeReference == null || (str = typeReference.asString()) == null) {
            str = String.valueOf(kTypeProjection.getType());
        }
        KVariance variance = kTypeProjection.getVariance();
        if (variance != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
            if (i == 1) {
                return str;
            }
            if (i == 2) {
                return "in ".concat(String.valueOf(str));
            }
            if (i == 3) {
                return "out ".concat(String.valueOf(str));
            }
        }
        throw new NoWhenBranchMatchedException();
    }
}
