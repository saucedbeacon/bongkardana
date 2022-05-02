package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class JvmType {
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive BOOLEAN = new Primitive(JvmPrimitiveType.BOOLEAN);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive BYTE = new Primitive(JvmPrimitiveType.BYTE);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive CHAR = new Primitive(JvmPrimitiveType.CHAR);
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive DOUBLE = new Primitive(JvmPrimitiveType.DOUBLE);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive FLOAT = new Primitive(JvmPrimitiveType.FLOAT);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive INT = new Primitive(JvmPrimitiveType.INT);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive LONG = new Primitive(JvmPrimitiveType.LONG);
    /* access modifiers changed from: private */
    @NotNull
    public static final Primitive SHORT = new Primitive(JvmPrimitiveType.SHORT);

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JvmType() {
    }

    public static final class Primitive extends JvmType {
        @Nullable
        private final JvmPrimitiveType jvmPrimitiveType;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType2) {
            super((DefaultConstructorMarker) null);
            this.jvmPrimitiveType = jvmPrimitiveType2;
        }

        @Nullable
        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.jvmPrimitiveType;
        }
    }

    public static final class Object extends JvmType {
        @NotNull
        private final String internalName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Object(@NotNull String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "internalName");
            this.internalName = str;
        }

        @NotNull
        public final String getInternalName() {
            return this.internalName;
        }
    }

    public static final class Array extends JvmType {
        @NotNull
        private final JvmType elementType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType jvmType) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(jvmType, "elementType");
            this.elementType = jvmType;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.elementType;
        }
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.INSTANCE.toString(this);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.BOOLEAN;
        }

        @NotNull
        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.CHAR;
        }

        @NotNull
        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.BYTE;
        }

        @NotNull
        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.SHORT;
        }

        @NotNull
        public final Primitive getINT$descriptors_jvm() {
            return JvmType.INT;
        }

        @NotNull
        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.FLOAT;
        }

        @NotNull
        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.LONG;
        }

        @NotNull
        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.DOUBLE;
        }
    }
}
