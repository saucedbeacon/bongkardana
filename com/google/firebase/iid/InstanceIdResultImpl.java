package com.google.firebase.iid;

final class InstanceIdResultImpl implements InstanceIdResult {

    /* renamed from: id  reason: collision with root package name */
    private final String f9118id;
    private final String token;

    InstanceIdResultImpl(String str, String str2) {
        this.f9118id = str;
        this.token = str2;
    }

    public final String getId() {
        return this.f9118id;
    }

    public final String getToken() {
        return this.token;
    }
}
