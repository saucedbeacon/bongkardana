package com.google.type;

import com.google.protobuf.MessageLiteOrBuilder;

public interface DateOrBuilder extends MessageLiteOrBuilder {
    int getDay();

    int getMonth();

    int getYear();
}
