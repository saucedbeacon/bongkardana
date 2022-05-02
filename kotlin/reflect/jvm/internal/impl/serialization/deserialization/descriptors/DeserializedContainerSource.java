package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import org.jetbrains.annotations.NotNull;

public interface DeserializedContainerSource extends SourceElement {
    @NotNull
    String getPresentableString();
}
