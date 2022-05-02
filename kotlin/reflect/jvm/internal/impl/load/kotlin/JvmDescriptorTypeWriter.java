package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JvmDescriptorTypeWriter<T> {
    @Nullable
    private T jvmCurrentType;
    private int jvmCurrentTypeArrayLevel;
    @NotNull
    private final JvmTypeFactory<T> jvmTypeFactory;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.jvmCurrentType == null) {
            this.jvmCurrentTypeArrayLevel++;
        }
    }

    public void writeClass(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "objectType");
        writeJvmTypeAsIs(t);
    }

    /* access modifiers changed from: protected */
    public final void writeJvmTypeAsIs(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "type");
        if (this.jvmCurrentType == null) {
            int i = this.jvmCurrentTypeArrayLevel;
            if (i > 0) {
                t = this.jvmTypeFactory.createFromString(Intrinsics.stringPlus(StringsKt.repeat("[", i), this.jvmTypeFactory.toString(t)));
            }
            this.jvmCurrentType = t;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T t) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(t, "type");
        writeJvmTypeAsIs(t);
    }
}
