package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface HttpOrBuilder extends MessageLiteOrBuilder {
    boolean getFullyDecodeReservedExpansion();

    HttpRule getRules(int i);

    int getRulesCount();

    List<HttpRule> getRulesList();
}
