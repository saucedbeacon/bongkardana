package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthProviderOrBuilder extends MessageLiteOrBuilder {
    String getAudiences();

    ByteString getAudiencesBytes();

    String getAuthorizationUrl();

    ByteString getAuthorizationUrlBytes();

    String getId();

    ByteString getIdBytes();

    String getIssuer();

    ByteString getIssuerBytes();

    String getJwksUri();

    ByteString getJwksUriBytes();

    JwtLocation getJwtLocations(int i);

    int getJwtLocationsCount();

    List<JwtLocation> getJwtLocationsList();
}
