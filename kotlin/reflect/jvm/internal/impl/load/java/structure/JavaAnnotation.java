package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaAnnotation extends JavaElement {

    public static final class DefaultImpls {
        public static boolean isFreshlySupportedTypeUseAnnotation(@NotNull JavaAnnotation javaAnnotation) {
            Intrinsics.checkNotNullParameter(javaAnnotation, "this");
            return false;
        }

        public static boolean isIdeExternalAnnotation(@NotNull JavaAnnotation javaAnnotation) {
            Intrinsics.checkNotNullParameter(javaAnnotation, "this");
            return false;
        }
    }

    @NotNull
    Collection<JavaAnnotationArgument> getArguments();

    @Nullable
    ClassId getClassId();

    boolean isFreshlySupportedTypeUseAnnotation();

    boolean isIdeExternalAnnotation();

    @Nullable
    JavaClass resolve();
}
