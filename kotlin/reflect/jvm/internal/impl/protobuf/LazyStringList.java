package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    ByteString getByteString(int i);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
