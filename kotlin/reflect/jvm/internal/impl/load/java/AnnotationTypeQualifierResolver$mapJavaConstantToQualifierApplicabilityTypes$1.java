package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import org.jetbrains.annotations.NotNull;

final class AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 extends Lambda implements Function2<EnumValue, AnnotationQualifierApplicabilityType, Boolean> {
    public static final AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1 INSTANCE = new AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1();

    AnnotationTypeQualifierResolver$mapJavaConstantToQualifierApplicabilityTypes$1() {
        super(2);
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((EnumValue) obj, (AnnotationQualifierApplicabilityType) obj2));
    }

    public final boolean invoke(@NotNull EnumValue enumValue, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        Intrinsics.checkNotNullParameter(enumValue, "<this>");
        Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "it");
        return Intrinsics.areEqual((Object) enumValue.getEnumEntryName().getIdentifier(), (Object) annotationQualifierApplicabilityType.getJavaTarget());
    }
}
