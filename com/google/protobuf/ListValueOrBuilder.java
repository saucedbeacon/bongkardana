package com.google.protobuf;

import java.util.List;

public interface ListValueOrBuilder extends MessageLiteOrBuilder {
    Value getValues(int i);

    int getValuesCount();

    List<Value> getValuesList();
}
