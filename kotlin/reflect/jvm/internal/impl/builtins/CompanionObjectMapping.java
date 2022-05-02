package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class CompanionObjectMapping {
    @NotNull
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();
    @NotNull
    private static final Set<ClassId> classIds;

    private CompanionObjectMapping() {
    }

    @NotNull
    public final Set<ClassId> getClassIds() {
        return classIds;
    }

    static {
        Iterable<PrimitiveType> iterable = PrimitiveType.NUMBER_TYPES;
        StandardNames standardNames = StandardNames.INSTANCE;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (PrimitiveType primitiveFqName : iterable) {
            arrayList.add(StandardNames.getPrimitiveFqName(primitiveFqName));
        }
        FqName safe = StandardNames.FqNames.string.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "string.toSafe()");
        FqName safe2 = StandardNames.FqNames._boolean.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe2, "_boolean.toSafe()");
        FqName safe3 = StandardNames.FqNames._enum.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe3, "_enum.toSafe()");
        Collection linkedHashSet = new LinkedHashSet();
        for (FqName fqName : CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus((List) arrayList, safe), safe2), safe3)) {
            linkedHashSet.add(ClassId.topLevel(fqName));
        }
        classIds = (Set) linkedHashSet;
    }

    @NotNull
    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return classIds;
    }
}
