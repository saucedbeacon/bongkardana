package com.alipay.imobile.network.sslpinning.db;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.security.cert.Certificate;

@Entity(tableName = "certificate")
public class c {
    @NonNull
    @PrimaryKey

    /* renamed from: a  reason: collision with root package name */
    public String f9401a;
    public Certificate b;

    public c(@NonNull String str, Certificate certificate) {
        this.f9401a = str;
        this.b = certificate;
    }
}
