package kotlin.reflect.jvm.internal.impl.descriptors;

public final class ConstUtilKt {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(r1) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean canBeUsedForConstVal(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(r1)
            if (r0 != 0) goto L_0x0013
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(r1)
            if (r0 == 0) goto L_0x0019
        L_0x0013:
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(r1)
            if (r0 == 0) goto L_0x0022
        L_0x0019:
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r1)
            if (r1 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            return r1
        L_0x0022:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.ConstUtilKt.canBeUsedForConstVal(kotlin.reflect.jvm.internal.impl.types.KotlinType):boolean");
    }
}
