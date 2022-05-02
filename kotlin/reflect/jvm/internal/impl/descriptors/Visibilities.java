package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Visibilities {
    @NotNull
    private static final Public DEFAULT_VISIBILITY = Public.INSTANCE;
    @NotNull
    public static final Visibilities INSTANCE = new Visibilities();
    @NotNull
    private static final Map<Visibility, Integer> ORDERED_VISIBILITIES;

    public static final class Private extends Visibility {
        @NotNull
        public static final Private INSTANCE = new Private();

        private Private() {
            super("private", false);
        }
    }

    private Visibilities() {
    }

    public static final class PrivateToThis extends Visibility {
        @NotNull
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        @NotNull
        public final String getInternalDisplayName() {
            return "private/*private to this*/";
        }

        private PrivateToThis() {
            super("private_to_this", false);
        }
    }

    public static final class Protected extends Visibility {
        @NotNull
        public static final Protected INSTANCE = new Protected();

        private Protected() {
            super("protected", true);
        }
    }

    public static final class Internal extends Visibility {
        @NotNull
        public static final Internal INSTANCE = new Internal();

        private Internal() {
            super("internal", false);
        }
    }

    public static final class Public extends Visibility {
        @NotNull
        public static final Public INSTANCE = new Public();

        private Public() {
            super("public", true);
        }
    }

    public static final class Local extends Visibility {
        @NotNull
        public static final Local INSTANCE = new Local();

        private Local() {
            super("local", false);
        }
    }

    public static final class Inherited extends Visibility {
        @NotNull
        public static final Inherited INSTANCE = new Inherited();

        private Inherited() {
            super("inherited", false);
        }
    }

    public static final class InvisibleFake extends Visibility {
        @NotNull
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        private InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    public static final class Unknown extends Visibility {
        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super("unknown", false);
        }
    }

    static {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(PrivateToThis.INSTANCE, 0);
        createMapBuilder.put(Private.INSTANCE, 0);
        createMapBuilder.put(Internal.INSTANCE, 1);
        createMapBuilder.put(Protected.INSTANCE, 1);
        createMapBuilder.put(Public.INSTANCE, 2);
        ORDERED_VISIBILITIES = MapsKt.build(createMapBuilder);
    }

    @Nullable
    public final Integer compareLocal$compiler_common(@NotNull Visibility visibility, @NotNull Visibility visibility2) {
        Intrinsics.checkNotNullParameter(visibility, "first");
        Intrinsics.checkNotNullParameter(visibility2, "second");
        if (visibility == visibility2) {
            return 0;
        }
        Integer num = ORDERED_VISIBILITIES.get(visibility);
        Integer num2 = ORDERED_VISIBILITIES.get(visibility2);
        if (num == null || num2 == null || Intrinsics.areEqual((Object) num, (Object) num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
