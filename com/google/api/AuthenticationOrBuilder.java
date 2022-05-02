package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthenticationOrBuilder extends MessageLiteOrBuilder {
    AuthProvider getProviders(int i);

    int getProvidersCount();

    List<AuthProvider> getProvidersList();

    AuthenticationRule getRules(int i);

    int getRulesCount();

    List<AuthenticationRule> getRulesList();
}
