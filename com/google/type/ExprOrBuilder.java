package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ExprOrBuilder extends MessageLiteOrBuilder {
    String getDescription();

    ByteString getDescriptionBytes();

    String getExpression();

    ByteString getExpressionBytes();

    String getLocation();

    ByteString getLocationBytes();

    String getTitle();

    ByteString getTitleBytes();
}
