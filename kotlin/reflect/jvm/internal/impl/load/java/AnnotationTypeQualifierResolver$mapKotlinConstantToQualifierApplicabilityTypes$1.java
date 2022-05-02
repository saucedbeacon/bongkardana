package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import org.jetbrains.annotations.NotNull;

final class AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1 extends Lambda implements Function2<EnumValue, AnnotationQualifierApplicabilityType, Boolean> {
    final /* synthetic */ AnnotationTypeQualifierResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnnotationTypeQualifierResolver$mapKotlinConstantToQualifierApplicabilityTypes$1(AnnotationTypeQualifierResolver annotationTypeQualifierResolver) {
        super(2);
        this.this$0 = annotationTypeQualifierResolver;
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((EnumValue) obj, (AnnotationQualifierApplicabilityType) obj2));
    }

    public final boolean invoke(@NotNull EnumValue enumValue, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        Intrinsics.checkNotNullParameter(enumValue, "<this>");
        Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "it");
        return this.this$0.toKotlinTargetNames(annotationQualifierApplicabilityType.getJavaTarget()).contains(enumValue.getEnumEntryName().getIdentifier());
    }
}
