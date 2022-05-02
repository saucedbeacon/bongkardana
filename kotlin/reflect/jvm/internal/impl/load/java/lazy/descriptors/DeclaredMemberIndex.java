package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DeclaredMemberIndex {
    @Nullable
    JavaField findFieldByName(@NotNull Name name);

    @NotNull
    Collection<JavaMethod> findMethodsByName(@NotNull Name name);

    @Nullable
    JavaRecordComponent findRecordComponentByName(@NotNull Name name);

    @NotNull
    Set<Name> getFieldNames();

    @NotNull
    Set<Name> getMethodNames();

    @NotNull
    Set<Name> getRecordComponentNames();

    public static final class Empty implements DeclaredMemberIndex {
        @NotNull
        public static final Empty INSTANCE = new Empty();

        @Nullable
        public final JavaField findFieldByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Nullable
        public final JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        private Empty() {
        }

        @NotNull
        public final List<JavaMethod> findMethodsByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt.emptyList();
        }

        @NotNull
        public final Set<Name> getMethodNames() {
            return SetsKt.emptySet();
        }

        @NotNull
        public final Set<Name> getFieldNames() {
            return SetsKt.emptySet();
        }

        @NotNull
        public final Set<Name> getRecordComponentNames() {
            return SetsKt.emptySet();
        }
    }
}
