package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;

final class DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2 extends Lambda implements Function0<Map<Name, ? extends TypeAliasDescriptor>> {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    @NotNull
    public final Map<Name, TypeAliasDescriptor> invoke() {
        Iterable access$getAllTypeAliases = this.this$0.getAllTypeAliases();
        Map<Name, TypeAliasDescriptor> linkedHashMap = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(access$getAllTypeAliases, 10)), 16));
        for (Object next : access$getAllTypeAliases) {
            Name name = ((TypeAliasDescriptor) next).getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            linkedHashMap.put(name, next);
        }
        return linkedHashMap;
    }
}
