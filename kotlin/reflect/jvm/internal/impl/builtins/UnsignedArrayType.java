package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public enum UnsignedArrayType {
    UBYTEARRAY(r1),
    USHORTARRAY(r1),
    UINTARRAY(r1),
    ULONGARRAY(r1);
    
    @NotNull
    private final ClassId classId;
    @NotNull
    private final Name typeName;

    private UnsignedArrayType(ClassId classId2) {
        this.classId = classId2;
        Name shortClassName = classId2.getShortClassName();
        Intrinsics.checkNotNullExpressionValue(shortClassName, "classId.shortClassName");
        this.typeName = shortClassName;
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
