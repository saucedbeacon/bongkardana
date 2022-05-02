package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.jetbrains.annotations.NotNull;

final class DeserializedMemberScope$NoReorderImplementation$propertiesByName$2 extends Lambda implements Function0<Map<Name, ? extends List<? extends PropertyDescriptor>>> {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeserializedMemberScope$NoReorderImplementation$propertiesByName$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    @NotNull
    public final Map<Name, List<PropertyDescriptor>> invoke() {
        Map<Name, List<PropertyDescriptor>> linkedHashMap = new LinkedHashMap<>();
        for (Object next : this.this$0.getAllProperties()) {
            Name name = ((PropertyDescriptor) next).getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            List<PropertyDescriptor> list = linkedHashMap.get(name);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(name, list);
            }
            list.add(next);
        }
        return linkedHashMap;
    }
}
