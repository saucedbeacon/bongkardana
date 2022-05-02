package com.google.type;

import com.google.protobuf.FloatValue;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ColorOrBuilder extends MessageLiteOrBuilder {
    FloatValue getAlpha();

    float getBlue();

    float getGreen();

    float getRed();

    boolean hasAlpha();
}
