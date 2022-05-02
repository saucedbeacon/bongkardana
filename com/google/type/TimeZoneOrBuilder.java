package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface TimeZoneOrBuilder extends MessageLiteOrBuilder {
    String getId();

    ByteString getIdBytes();

    String getVersion();

    ByteString getVersionBytes();
}
