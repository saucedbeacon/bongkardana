package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectJavaAnnotationOwnerKt {
    @NotNull
    public static final List<ReflectJavaAnnotation> getAnnotations(@NotNull Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Collection arrayList = new ArrayList(annotationArr.length);
        for (Annotation reflectJavaAnnotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(reflectJavaAnnotation));
        }
        return (List) arrayList;
    }

    @Nullable
    public static final ReflectJavaAnnotation findAnnotation(@NotNull Annotation[] annotationArr, @NotNull FqName fqName) {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (Intrinsics.areEqual((Object) ReflectClassUtilKt.getClassId(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation))).asSingleFqName(), (Object) fqName)) {
                break;
            }
            i++;
        }
        if (annotation == null) {
            return null;
        }
        return new ReflectJavaAnnotation(annotation);
    }
}
