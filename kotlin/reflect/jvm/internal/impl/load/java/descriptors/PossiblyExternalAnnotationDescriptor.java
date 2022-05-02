package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

public interface PossiblyExternalAnnotationDescriptor extends AnnotationDescriptor {
    boolean isIdeExternalAnnotation();
}
