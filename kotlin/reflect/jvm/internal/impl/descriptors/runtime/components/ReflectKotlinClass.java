package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectKotlinClass implements KotlinJvmBinaryClass {
    @NotNull
    public static final Factory Factory = new Factory((DefaultConstructorMarker) null);
    @NotNull
    private final KotlinClassHeader classHeader;
    @NotNull
    private final Class<?> klass;

    public /* synthetic */ ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    private ReflectKotlinClass(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.klass = cls;
        this.classHeader = kotlinClassHeader;
    }

    @NotNull
    public final Class<?> getKlass() {
        return this.klass;
    }

    @NotNull
    public final KotlinClassHeader getClassHeader() {
        return this.classHeader;
    }

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        @Nullable
        public final ReflectKotlinClass create(@NotNull Class<?> cls) {
            Intrinsics.checkNotNullParameter(cls, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            ReflectClassStructure.INSTANCE.loadClassAnnotations(cls, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader createHeader = readKotlinClassHeaderAnnotationVisitor.createHeader();
            if (createHeader == null) {
                return null;
            }
            return new ReflectKotlinClass(cls, createHeader, (DefaultConstructorMarker) null);
        }
    }

    @NotNull
    public final String getLocation() {
        String name = this.klass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "klass.name");
        return Intrinsics.stringPlus(StringsKt.replace$default(name, '.', '/', false, 4, (Object) null), ".class");
    }

    @NotNull
    public final ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.klass);
    }

    public final void loadClassAnnotations(@NotNull KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(annotationVisitor, "visitor");
        ReflectClassStructure.INSTANCE.loadClassAnnotations(this.klass, annotationVisitor);
    }

    public final void visitMembers(@NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(memberVisitor, "visitor");
        ReflectClassStructure.INSTANCE.visitMembers(this.klass, memberVisitor);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectKotlinClass) && Intrinsics.areEqual((Object) this.klass, (Object) ((ReflectKotlinClass) obj).klass);
    }

    public final int hashCode() {
        return this.klass.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.klass);
        return sb.toString();
    }
}
