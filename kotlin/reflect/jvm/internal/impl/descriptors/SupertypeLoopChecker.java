package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

public interface SupertypeLoopChecker {
    @NotNull
    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function12);

    public static final class EMPTY implements SupertypeLoopChecker {
        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        @NotNull
        public final Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function12) {
            Intrinsics.checkNotNullParameter(typeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(collection, "superTypes");
            Intrinsics.checkNotNullParameter(function1, "neighbors");
            Intrinsics.checkNotNullParameter(function12, "reportLoop");
            return collection;
        }

        private EMPTY() {
        }
    }
}
