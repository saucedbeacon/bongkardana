package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KotlinClassFinder extends KotlinMetadataFinder {
    @Nullable
    Result findKotlinClassOrContent(@NotNull JavaClass javaClass);

    @Nullable
    Result findKotlinClassOrContent(@NotNull ClassId classId);

    public static abstract class Result {
        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        @Nullable
        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass == null) {
                return null;
            }
            return kotlinClass.getKotlinJvmBinaryClass();
        }

        public static final class KotlinClass extends Result {
            @Nullable
            private final byte[] byteContent;
            @NotNull
            private final KotlinJvmBinaryClass kotlinJvmBinaryClass;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public KotlinClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass2, @Nullable byte[] bArr) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(kotlinJvmBinaryClass2, "kotlinJvmBinaryClass");
                this.kotlinJvmBinaryClass = kotlinJvmBinaryClass2;
                this.byteContent = bArr;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass2, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass2, (i & 2) != 0 ? null : bArr);
            }

            @NotNull
            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.kotlinJvmBinaryClass;
            }
        }

        public static final class ClassFileContent extends Result {
            @NotNull
            private final byte[] content;

            @NotNull
            public final byte[] getContent() {
                return this.content;
            }
        }
    }
}
