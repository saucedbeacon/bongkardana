package kotlin.reflect.jvm.internal.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

public final class SpecialJvmAnnotations {
    @NotNull
    public static final SpecialJvmAnnotations INSTANCE = new SpecialJvmAnnotations();
    @NotNull
    private static final Set<ClassId> SPECIAL_ANNOTATIONS;

    private SpecialJvmAnnotations() {
    }

    @NotNull
    public final Set<ClassId> getSPECIAL_ANNOTATIONS() {
        return SPECIAL_ANNOTATIONS;
    }

    static {
        FqName[] fqNameArr = {JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, JvmAnnotationNames.TARGET_ANNOTATION, JvmAnnotationNames.RETENTION_ANNOTATION, JvmAnnotationNames.DOCUMENTED_ANNOTATION};
        Collection linkedHashSet = new LinkedHashSet();
        for (FqName fqName : CollectionsKt.listOf(fqNameArr)) {
            linkedHashSet.add(ClassId.topLevel(fqName));
        }
        SPECIAL_ANNOTATIONS = (Set) linkedHashSet;
    }
}
