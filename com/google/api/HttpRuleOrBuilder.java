package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface HttpRuleOrBuilder extends MessageLiteOrBuilder {
    HttpRule getAdditionalBindings(int i);

    int getAdditionalBindingsCount();

    List<HttpRule> getAdditionalBindingsList();

    String getBody();

    ByteString getBodyBytes();

    CustomHttpPattern getCustom();

    String getDelete();

    ByteString getDeleteBytes();

    String getGet();

    ByteString getGetBytes();

    String getPatch();

    ByteString getPatchBytes();

    HttpRule.PatternCase getPatternCase();

    String getPost();

    ByteString getPostBytes();

    String getPut();

    ByteString getPutBytes();

    String getResponseBody();

    ByteString getResponseBodyBytes();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasCustom();
}
