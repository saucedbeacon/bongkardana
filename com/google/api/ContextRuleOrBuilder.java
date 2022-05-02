package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ContextRuleOrBuilder extends MessageLiteOrBuilder {
    String getAllowedRequestExtensions(int i);

    ByteString getAllowedRequestExtensionsBytes(int i);

    int getAllowedRequestExtensionsCount();

    List<String> getAllowedRequestExtensionsList();

    String getAllowedResponseExtensions(int i);

    ByteString getAllowedResponseExtensionsBytes(int i);

    int getAllowedResponseExtensionsCount();

    List<String> getAllowedResponseExtensionsList();

    String getProvided(int i);

    ByteString getProvidedBytes(int i);

    int getProvidedCount();

    List<String> getProvidedList();

    String getRequested(int i);

    ByteString getRequestedBytes(int i);

    int getRequestedCount();

    List<String> getRequestedList();

    String getSelector();

    ByteString getSelectorBytes();
}
