package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ClassDeserializer$classes$1 extends Lambda implements Function1<ClassDeserializer.ClassKey, ClassDescriptor> {
    final /* synthetic */ ClassDeserializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        super(1);
        this.this$0 = classDeserializer;
    }

    @Nullable
    public final ClassDescriptor invoke(@NotNull ClassDeserializer.ClassKey classKey) {
        Intrinsics.checkNotNullParameter(classKey, "key");
        return this.this$0.createClass(classKey);
    }
}
