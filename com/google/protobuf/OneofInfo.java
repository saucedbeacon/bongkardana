package com.google.protobuf;

import java.lang.reflect.Field;

final class OneofInfo {
    private final Field caseField;

    /* renamed from: id  reason: collision with root package name */
    private final int f9672id;
    private final Field valueField;

    public OneofInfo(int i, Field field, Field field2) {
        this.f9672id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public final int getId() {
        return this.f9672id;
    }

    public final Field getCaseField() {
        return this.caseField;
    }

    public final Field getValueField() {
        return this.valueField;
    }
}
