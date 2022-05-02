package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaClassFinder {
    @Nullable
    JavaClass findClass(@NotNull Request request);

    @Nullable
    JavaPackage findPackage(@NotNull FqName fqName);

    @Nullable
    Set<String> knownClassNamesInPackage(@NotNull FqName fqName);

    public static final class Request {
        @NotNull
        private final ClassId classId;
        @Nullable
        private final JavaClass outerClass;
        @Nullable
        private final byte[] previouslyFoundClassFileContent;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.areEqual((Object) this.classId, (Object) request.classId) && Intrinsics.areEqual((Object) this.previouslyFoundClassFileContent, (Object) request.previouslyFoundClassFileContent) && Intrinsics.areEqual((Object) this.outerClass, (Object) request.outerClass);
        }

        public final int hashCode() {
            int hashCode = this.classId.hashCode() * 31;
            byte[] bArr = this.previouslyFoundClassFileContent;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.outerClass;
            if (javaClass != null) {
                i = javaClass.hashCode();
            }
            return hashCode2 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Request(classId=");
            sb.append(this.classId);
            sb.append(", previouslyFoundClassFileContent=");
            sb.append(Arrays.toString(this.previouslyFoundClassFileContent));
            sb.append(", outerClass=");
            sb.append(this.outerClass);
            sb.append(')');
            return sb.toString();
        }

        public Request(@NotNull ClassId classId2, @Nullable byte[] bArr, @Nullable JavaClass javaClass) {
            Intrinsics.checkNotNullParameter(classId2, "classId");
            this.classId = classId2;
            this.previouslyFoundClassFileContent = bArr;
            this.outerClass = javaClass;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Request(ClassId classId2, byte[] bArr, JavaClass javaClass, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId2, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : javaClass);
        }

        @NotNull
        public final ClassId getClassId() {
            return this.classId;
        }
    }
}
