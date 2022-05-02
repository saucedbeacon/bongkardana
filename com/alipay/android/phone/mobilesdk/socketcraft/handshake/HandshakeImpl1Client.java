package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
    private String resourceDescriptor = "*";

    public void setResourceDescriptor(String str) {
        if (str != null) {
            this.resourceDescriptor = str;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }

    public String getResourceDescriptor() {
        return this.resourceDescriptor;
    }
}
