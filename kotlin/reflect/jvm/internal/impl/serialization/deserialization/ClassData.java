package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassData {
    @NotNull
    private final ProtoBuf.Class classProto;
    @NotNull
    private final BinaryVersion metadataVersion;
    @NotNull
    private final NameResolver nameResolver;
    @NotNull
    private final SourceElement sourceElement;

    @NotNull
    public final NameResolver component1() {
        return this.nameResolver;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.classProto;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.metadataVersion;
    }

    @NotNull
    public final SourceElement component4() {
        return this.sourceElement;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.areEqual((Object) this.nameResolver, (Object) classData.nameResolver) && Intrinsics.areEqual((Object) this.classProto, (Object) classData.classProto) && Intrinsics.areEqual((Object) this.metadataVersion, (Object) classData.metadataVersion) && Intrinsics.areEqual((Object) this.sourceElement, (Object) classData.sourceElement);
    }

    public final int hashCode() {
        return (((((this.nameResolver.hashCode() * 31) + this.classProto.hashCode()) * 31) + this.metadataVersion.hashCode()) * 31) + this.sourceElement.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassData(nameResolver=");
        sb.append(this.nameResolver);
        sb.append(", classProto=");
        sb.append(this.classProto);
        sb.append(", metadataVersion=");
        sb.append(this.metadataVersion);
        sb.append(", sourceElement=");
        sb.append(this.sourceElement);
        sb.append(')');
        return sb.toString();
    }

    public ClassData(@NotNull NameResolver nameResolver2, @NotNull ProtoBuf.Class classR, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement2) {
        Intrinsics.checkNotNullParameter(nameResolver2, "nameResolver");
        Intrinsics.checkNotNullParameter(classR, "classProto");
        Intrinsics.checkNotNullParameter(binaryVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement2, "sourceElement");
        this.nameResolver = nameResolver2;
        this.classProto = classR;
        this.metadataVersion = binaryVersion;
        this.sourceElement = sourceElement2;
    }
}
