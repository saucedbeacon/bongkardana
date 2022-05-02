package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class DeserializedDescriptorResolver$createKotlinPackagePartScope$2 extends Lambda implements Function0<Collection<? extends Name>> {
    public static final DeserializedDescriptorResolver$createKotlinPackagePartScope$2 INSTANCE = new DeserializedDescriptorResolver$createKotlinPackagePartScope$2();

    DeserializedDescriptorResolver$createKotlinPackagePartScope$2() {
        super(0);
    }

    @NotNull
    public final Collection<Name> invoke() {
        return CollectionsKt.emptyList();
    }
}
