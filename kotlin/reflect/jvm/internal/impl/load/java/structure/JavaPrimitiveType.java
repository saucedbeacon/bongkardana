package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import org.jetbrains.annotations.Nullable;

public interface JavaPrimitiveType extends JavaType {
    @Nullable
    PrimitiveType getType();
}
