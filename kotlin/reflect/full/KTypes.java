package kotlin.reflect.full;

import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"isSubtypeOf", "", "Lkotlin/reflect/KType;", "other", "isSupertypeOf", "withNullability", "nullable", "kotlin-reflection"}, k = 2, mv = {1, 4, 1})
@JvmName(name = "KTypes")
public final class KTypes {
    @NotNull
    @SinceKotlin(version = "1.1")
    public static final KType withNullability(@NotNull KType kType, boolean z) {
        Intrinsics.checkNotNullParameter(kType, "$this$withNullability");
        return ((KTypeImpl) kType).makeNullableAsSpecified$kotlin_reflection(z);
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSubtypeOf(@NotNull KType kType, @NotNull KType kType2) {
        Intrinsics.checkNotNullParameter(kType, "$this$isSubtypeOf");
        Intrinsics.checkNotNullParameter(kType2, H5ResourceHandlerUtil.OTHER);
        return TypeUtilsKt.isSubtypeOf(((KTypeImpl) kType).getType(), ((KTypeImpl) kType2).getType());
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSupertypeOf(@NotNull KType kType, @NotNull KType kType2) {
        Intrinsics.checkNotNullParameter(kType, "$this$isSupertypeOf");
        Intrinsics.checkNotNullParameter(kType2, H5ResourceHandlerUtil.OTHER);
        return isSubtypeOf(kType2, kType);
    }
}
