package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AnnotationsImpl implements Annotations {
    @NotNull
    private final List<AnnotationDescriptor> annotations;

    public AnnotationsImpl(@NotNull List<? extends AnnotationDescriptor> list) {
        Intrinsics.checkNotNullParameter(list, "annotations");
        this.annotations = list;
    }

    @Nullable
    public final AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.findAnnotation(this, fqName);
    }

    public final boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    public final boolean isEmpty() {
        return this.annotations.isEmpty();
    }

    @NotNull
    public final Iterator<AnnotationDescriptor> iterator() {
        return this.annotations.iterator();
    }

    @NotNull
    public final String toString() {
        return this.annotations.toString();
    }
}
