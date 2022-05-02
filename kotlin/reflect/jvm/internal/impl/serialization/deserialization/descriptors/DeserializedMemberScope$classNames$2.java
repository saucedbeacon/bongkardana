package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class DeserializedMemberScope$classNames$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ Function0<Collection<Name>> $classNames;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeserializedMemberScope$classNames$2(Function0<? extends Collection<Name>> function0) {
        super(0);
        this.$classNames = function0;
    }

    @NotNull
    public final Set<Name> invoke() {
        return CollectionsKt.toSet(this.$classNames.invoke());
    }
}
