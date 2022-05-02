package o;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
final /* synthetic */ class PageDestroyPoint extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new PageDestroyPoint();

    PageDestroyPoint() {
        super(Pair.class, "first", "getFirst()Ljava/lang/Object;", 0);
    }

    @Nullable
    public final Object get(@Nullable Object obj) {
        return ((Pair) obj).getFirst();
    }
}
