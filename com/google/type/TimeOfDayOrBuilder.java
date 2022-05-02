package com.google.type;

import com.google.protobuf.MessageLiteOrBuilder;

public interface TimeOfDayOrBuilder extends MessageLiteOrBuilder {
    int getHours();

    int getMinutes();

    int getNanos();

    int getSeconds();
}
