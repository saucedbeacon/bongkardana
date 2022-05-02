package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

final class CapturedTypeParameterDescriptor implements TypeParameterDescriptor {
    @NotNull
    private final DeclarationDescriptor declarationDescriptor;
    private final int declaredTypeParametersCount;
    @NotNull
    private final TypeParameterDescriptor originalDescriptor;

    public final <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return this.originalDescriptor.accept(declarationDescriptorVisitor, d);
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.originalDescriptor.getAnnotations();
    }

    @NotNull
    public final SimpleType getDefaultType() {
        return this.originalDescriptor.getDefaultType();
    }

    @NotNull
    public final Name getName() {
        return this.originalDescriptor.getName();
    }

    @NotNull
    public final SourceElement getSource() {
        return this.originalDescriptor.getSource();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.originalDescriptor.getStorageManager();
    }

    @NotNull
    public final TypeConstructor getTypeConstructor() {
        return this.originalDescriptor.getTypeConstructor();
    }

    @NotNull
    public final List<KotlinType> getUpperBounds() {
        return this.originalDescriptor.getUpperBounds();
    }

    @NotNull
    public final Variance getVariance() {
        return this.originalDescriptor.getVariance();
    }

    public final boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    public final boolean isReified() {
        return this.originalDescriptor.isReified();
    }

    public CapturedTypeParameterDescriptor(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2, int i) {
        Intrinsics.checkNotNullParameter(typeParameterDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor2, "declarationDescriptor");
        this.originalDescriptor = typeParameterDescriptor;
        this.declarationDescriptor = declarationDescriptor2;
        this.declaredTypeParametersCount = i;
    }

    @NotNull
    public final TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor original = this.originalDescriptor.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "originalDescriptor.original");
        return original;
    }

    @NotNull
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.declarationDescriptor;
    }

    public final int getIndex() {
        return this.declaredTypeParametersCount + this.originalDescriptor.getIndex();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.originalDescriptor);
        sb.append("[inner-copy]");
        return sb.toString();
    }
}
