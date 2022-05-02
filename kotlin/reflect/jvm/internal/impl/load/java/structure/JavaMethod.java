package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    @Nullable
    JavaAnnotationArgument getAnnotationParameterDefaultValue();

    boolean getHasAnnotationParameterDefaultValue();

    @NotNull
    JavaType getReturnType();

    @NotNull
    List<JavaValueParameter> getValueParameters();

    public static final class DefaultImpls {
        public static boolean getHasAnnotationParameterDefaultValue(@NotNull JavaMethod javaMethod) {
            Intrinsics.checkNotNullParameter(javaMethod, "this");
            return javaMethod.getAnnotationParameterDefaultValue() != null;
        }
    }
}
