package com.google.protobuf;

public interface OptionOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    Any getValue();

    boolean hasValue();
}
