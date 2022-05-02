package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

public interface FirebaseRemoteConfigValue {
    boolean asBoolean() throws IllegalArgumentException;

    @NonNull
    byte[] asByteArray();

    double asDouble() throws IllegalArgumentException;

    long asLong() throws IllegalArgumentException;

    @NonNull
    String asString();

    int getSource();
}
