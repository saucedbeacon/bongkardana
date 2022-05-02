package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.ListBasedJavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaType extends ListBasedJavaAnnotationOwner {

    public static final class DefaultImpls {
        @Nullable
        public static JavaAnnotation findAnnotation(@NotNull JavaType javaType, @NotNull FqName fqName) {
            return ListBasedJavaAnnotationOwner.DefaultImpls.findAnnotation(javaType, fqName);
        }
    }
}
