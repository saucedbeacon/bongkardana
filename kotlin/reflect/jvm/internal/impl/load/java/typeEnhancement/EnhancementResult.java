package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class EnhancementResult<T> {
    @Nullable
    private final Annotations enhancementAnnotations;
    private final T result;

    public final T component1() {
        return this.result;
    }

    @Nullable
    public final Annotations component2() {
        return this.enhancementAnnotations;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnhancementResult)) {
            return false;
        }
        EnhancementResult enhancementResult = (EnhancementResult) obj;
        return Intrinsics.areEqual((Object) this.result, (Object) enhancementResult.result) && Intrinsics.areEqual((Object) this.enhancementAnnotations, (Object) enhancementResult.enhancementAnnotations);
    }

    public final int hashCode() {
        T t = this.result;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        Annotations annotations = this.enhancementAnnotations;
        if (annotations != null) {
            i = annotations.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EnhancementResult(result=");
        sb.append(this.result);
        sb.append(", enhancementAnnotations=");
        sb.append(this.enhancementAnnotations);
        sb.append(')');
        return sb.toString();
    }

    public EnhancementResult(T t, @Nullable Annotations annotations) {
        this.result = t;
        this.enhancementAnnotations = annotations;
    }
}
