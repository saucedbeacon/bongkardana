package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {
    @Nullable
    AnnotatedElement getElement();

    public static final class DefaultImpls {
        public static boolean isDeprecatedInJavaDoc(@NotNull ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            Intrinsics.checkNotNullParameter(reflectJavaAnnotationOwner, "this");
            return false;
        }

        @NotNull
        public static List<ReflectJavaAnnotation> getAnnotations(@NotNull ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            Intrinsics.checkNotNullParameter(reflectJavaAnnotationOwner, "this");
            AnnotatedElement element = reflectJavaAnnotationOwner.getElement();
            Annotation[] declaredAnnotations = element == null ? null : element.getDeclaredAnnotations();
            return declaredAnnotations == null ? CollectionsKt.emptyList() : ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations);
        }

        @Nullable
        public static ReflectJavaAnnotation findAnnotation(@NotNull ReflectJavaAnnotationOwner reflectJavaAnnotationOwner, @NotNull FqName fqName) {
            Annotation[] declaredAnnotations;
            Intrinsics.checkNotNullParameter(reflectJavaAnnotationOwner, "this");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            AnnotatedElement element = reflectJavaAnnotationOwner.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
                return null;
            }
            return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
        }
    }
}
