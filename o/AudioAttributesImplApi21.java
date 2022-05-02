package o;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AudioAttributesImplApi21 {
    private static final setMin ALWAYS_TRUE;
    public static final Callable<Boolean> CALLABLE_ALWAYS_TRUE;
    public static final getChildren<Object> PREDICATE_ALWAYS_TRUE;

    static {
        setMin setmin = new setMin(Boolean.TRUE);
        ALWAYS_TRUE = setmin;
        CALLABLE_ALWAYS_TRUE = setmin;
        PREDICATE_ALWAYS_TRUE = setmin;
    }

    static final class setMin implements Callable<Boolean>, getChildren<Object> {
        private final Boolean value;

        setMin(Boolean bool) {
            this.value = bool;
        }

        public final Boolean call() {
            return this.value;
        }

        public final boolean test(Object obj) throws Exception {
            return this.value.booleanValue();
        }
    }

    private AudioAttributesImplApi21() {
        throw new AssertionError("No instances.");
    }
}
