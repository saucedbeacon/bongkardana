package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ProtoContainer {
    @NotNull
    private final NameResolver nameResolver;
    @Nullable
    private final SourceElement source;
    @NotNull
    private final TypeTable typeTable;

    public /* synthetic */ ProtoContainer(NameResolver nameResolver2, TypeTable typeTable2, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver2, typeTable2, sourceElement);
    }

    @NotNull
    public abstract FqName debugFqName();

    private ProtoContainer(NameResolver nameResolver2, TypeTable typeTable2, SourceElement sourceElement) {
        this.nameResolver = nameResolver2;
        this.typeTable = typeTable2;
        this.source = sourceElement;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    @Nullable
    public final SourceElement getSource() {
        return this.source;
    }

    public static final class Class extends ProtoContainer {
        @NotNull
        private final ClassId classId;
        @NotNull
        private final ProtoBuf.Class classProto;
        private final boolean isInner;
        @NotNull
        private final ProtoBuf.Class.Kind kind;
        @Nullable
        private final Class outerClass;

        @NotNull
        public final ProtoBuf.Class getClassProto() {
            return this.classProto;
        }

        @Nullable
        public final Class getOuterClass() {
            return this.outerClass;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Class(@NotNull ProtoBuf.Class classR, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class classR2) {
            super(nameResolver, typeTable, sourceElement, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(classR, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.classProto = classR;
            this.outerClass = classR2;
            this.classId = NameResolverUtilKt.getClassId(nameResolver, classR.getFqName());
            ProtoBuf.Class.Kind kind2 = Flags.CLASS_KIND.get(this.classProto.getFlags());
            this.kind = kind2 == null ? ProtoBuf.Class.Kind.CLASS : kind2;
            Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "IS_INNER.get(classProto.flags)");
            this.isInner = bool.booleanValue();
        }

        @NotNull
        public final ClassId getClassId() {
            return this.classId;
        }

        @NotNull
        public final ProtoBuf.Class.Kind getKind() {
            return this.kind;
        }

        public final boolean isInner() {
            return this.isInner;
        }

        @NotNull
        public final FqName debugFqName() {
            FqName asSingleFqName = this.classId.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(asSingleFqName, "classId.asSingleFqName()");
            return asSingleFqName;
        }
    }

    public static final class Package extends ProtoContainer {
        @NotNull
        private final FqName fqName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Package(@NotNull FqName fqName2, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(fqName2, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.fqName = fqName2;
        }

        @NotNull
        public final FqName debugFqName() {
            return this.fqName;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(debugFqName());
        return sb.toString();
    }
}
