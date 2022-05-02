package kotlin.reflect.jvm.internal.impl.types;

import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TypeAliasExpansionReportStrategy {
    void boundsViolationInSubstitution(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull KotlinType kotlinType3, @NotNull TypeParameterDescriptor typeParameterDescriptor);

    void conflictingProjection(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType);

    void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor);

    void repeatedAnnotation(@NotNull AnnotationDescriptor annotationDescriptor);

    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {
        @NotNull
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        public final void boundsViolationInSubstitution(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull KotlinType kotlinType3, @NotNull TypeParameterDescriptor typeParameterDescriptor) {
            Intrinsics.checkNotNullParameter(kotlinType, "bound");
            Intrinsics.checkNotNullParameter(kotlinType2, "unsubstitutedArgument");
            Intrinsics.checkNotNullParameter(kotlinType3, HummerConstants.ARGUMENT);
            Intrinsics.checkNotNullParameter(typeParameterDescriptor, "typeParameter");
        }

        public final void conflictingProjection(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAlias");
            Intrinsics.checkNotNullParameter(kotlinType, "substitutedArgument");
        }

        public final void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAlias");
        }

        public final void repeatedAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
            Intrinsics.checkNotNullParameter(annotationDescriptor, "annotation");
        }

        private DO_NOTHING() {
        }
    }
}
