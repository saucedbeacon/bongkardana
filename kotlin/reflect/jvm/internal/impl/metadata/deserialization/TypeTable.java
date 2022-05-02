package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

public final class TypeTable {
    @NotNull
    private final List<ProtoBuf.Type> types;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TypeTable(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable r6) {
        /*
            r5 = this;
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r5.<init>()
            java.util.List r0 = r6.getTypeList()
            boolean r1 = r6.hasFirstNullable()
            if (r1 == 0) goto L_0x005d
            int r0 = r6.getFirstNullable()
            java.util.List r6 = r6.getTypeList()
            java.lang.String r1 = "typeTable.typeList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            java.util.Iterator r6 = r6.iterator()
        L_0x0033:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r6.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L_0x0044
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x0044:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3
            if (r2 < r0) goto L_0x0055
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder r2 = r3.toBuilder()
            r3 = 1
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder r2 = r2.setNullable(r3)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = r2.build()
        L_0x0055:
            r1.add(r3)
            r2 = r4
            goto L_0x0033
        L_0x005a:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
        L_0x005d:
            java.lang.String r6 = "run {\n        val originalTypes = typeTable.typeList\n        if (typeTable.hasFirstNullable()) {\n            val firstNullable = typeTable.firstNullable\n            typeTable.typeList.mapIndexed { i, type ->\n                if (i >= firstNullable) {\n                    type.toBuilder().setNullable(true).build()\n                } else type\n            }\n        } else originalTypes\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            r5.types = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable.<init>(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable):void");
    }

    @NotNull
    public final ProtoBuf.Type get(int i) {
        return this.types.get(i);
    }
}
