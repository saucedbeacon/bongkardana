package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f11030id;

    private DeliveryMechanism(int i) {
        this.f11030id = i;
    }

    public final int getId() {
        return this.f11030id;
    }

    public final String toString() {
        return Integer.toString(this.f11030id);
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
