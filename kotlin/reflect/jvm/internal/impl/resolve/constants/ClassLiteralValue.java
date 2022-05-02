package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassLiteralValue {
    private final int arrayNestedness;
    @NotNull
    private final ClassId classId;

    @NotNull
    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.areEqual((Object) this.classId, (Object) classLiteralValue.classId) && this.arrayNestedness == classLiteralValue.arrayNestedness;
    }

    public final int hashCode() {
        return (this.classId.hashCode() * 31) + this.arrayNestedness;
    }

    public ClassLiteralValue(@NotNull ClassId classId2, int i) {
        Intrinsics.checkNotNullParameter(classId2, "classId");
        this.classId = classId2;
        this.arrayNestedness = i;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.classId;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int arrayNestedness2 = getArrayNestedness();
        for (int i = 0; i < arrayNestedness2; i++) {
            sb.append("kotlin/Array<");
        }
        sb.append(getClassId());
        int arrayNestedness3 = getArrayNestedness();
        for (int i2 = 0; i2 < arrayNestedness3; i2++) {
            sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        }
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }
}
