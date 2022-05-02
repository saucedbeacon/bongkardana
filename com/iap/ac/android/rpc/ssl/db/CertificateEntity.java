package com.iap.ac.android.rpc.ssl.db;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.security.cert.Certificate;

@Entity(tableName = "certificate")
public class CertificateEntity {
    public Certificate certificateData;
    @NonNull
    @PrimaryKey
    public String certificateUrl;

    public CertificateEntity(@NonNull String str, Certificate certificate) {
        this.certificateUrl = str;
        this.certificateData = certificate;
    }
}
