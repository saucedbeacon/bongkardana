package com.google.geo.type;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.LatLng;

public interface ViewportOrBuilder extends MessageLiteOrBuilder {
    LatLng getHigh();

    LatLng getLow();

    boolean hasHigh();

    boolean hasLow();
}
