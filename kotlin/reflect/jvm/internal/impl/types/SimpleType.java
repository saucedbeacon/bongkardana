package kotlin.reflect.jvm.internal.impl.types;

import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    @NotNull
    public abstract SimpleType makeNullableAsSpecified(boolean z);

    @NotNull
    public abstract SimpleType replaceAnnotations(@NotNull Annotations annotations);

    public SimpleType() {
        super((DefaultConstructorMarker) null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (AnnotationDescriptor renderAnnotation$default : getAnnotations()) {
            StringsKt.append(sb, "[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, renderAnnotation$default, (AnnotationUseSiteTarget) null, 2, (Object) null), "] ");
        }
        sb.append(getConstructor());
        if (!getArguments().isEmpty()) {
            CollectionsKt.joinTo$default(getArguments(), sb, ", ", SimpleComparison.LESS_THAN_OPERATION, SimpleComparison.GREATER_THAN_OPERATION, 0, (CharSequence) null, (Function1) null, 112, (Object) null);
        }
        if (isMarkedNullable()) {
            sb.append("?");
        }
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }
}
