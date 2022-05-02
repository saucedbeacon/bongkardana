package kotlin.reflect.jvm.internal.impl.types.checker;

import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;

public final class ClassicTypeCheckerContext$Companion$classicSubstitutionSupertypePolicy$2 extends AbstractTypeCheckerContext.SupertypesPolicy.DoCustomTransform {
    final /* synthetic */ TypeSubstitutor $substitutor;
    final /* synthetic */ ClassicTypeSystemContext $this_classicSubstitutionSupertypePolicy;

    ClassicTypeCheckerContext$Companion$classicSubstitutionSupertypePolicy$2(ClassicTypeSystemContext classicTypeSystemContext, TypeSubstitutor typeSubstitutor) {
        this.$this_classicSubstitutionSupertypePolicy = classicTypeSystemContext;
        this.$substitutor = typeSubstitutor;
    }

    @NotNull
    public final SimpleTypeMarker transformType(@NotNull AbstractTypeCheckerContext abstractTypeCheckerContext, @NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(abstractTypeCheckerContext, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "type");
        ClassicTypeSystemContext classicTypeSystemContext = this.$this_classicSubstitutionSupertypePolicy;
        KotlinType safeSubstitute = this.$substitutor.safeSubstitute((KotlinType) classicTypeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker), Variance.INVARIANT);
        Intrinsics.checkNotNullExpressionValue(safeSubstitute, "substitutor.safeSubstitute(\n                        type.lowerBoundIfFlexible() as KotlinType,\n                        Variance.INVARIANT\n                    )");
        SimpleTypeMarker asSimpleType = classicTypeSystemContext.asSimpleType(safeSubstitute);
        Intrinsics.checkNotNull(asSimpleType);
        return asSimpleType;
    }
}
