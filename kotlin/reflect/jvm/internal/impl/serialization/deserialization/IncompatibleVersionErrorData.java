package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;
    @NotNull
    private final ClassId classId;
    private final T expectedVersion;
    @NotNull
    private final String filePath;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual((Object) this.actualVersion, (Object) incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual((Object) this.expectedVersion, (Object) incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual((Object) this.filePath, (Object) incompatibleVersionErrorData.filePath) && Intrinsics.areEqual((Object) this.classId, (Object) incompatibleVersionErrorData.classId);
    }

    public final int hashCode() {
        T t = this.actualVersion;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.expectedVersion;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.filePath.hashCode()) * 31) + this.classId.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.actualVersion);
        sb.append(", expectedVersion=");
        sb.append(this.expectedVersion);
        sb.append(", filePath=");
        sb.append(this.filePath);
        sb.append(", classId=");
        sb.append(this.classId);
        sb.append(')');
        return sb.toString();
    }

    public IncompatibleVersionErrorData(T t, T t2, @NotNull String str, @NotNull ClassId classId2) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        Intrinsics.checkNotNullParameter(classId2, "classId");
        this.actualVersion = t;
        this.expectedVersion = t2;
        this.filePath = str;
        this.classId = classId2;
    }
}
