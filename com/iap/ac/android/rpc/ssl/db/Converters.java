package com.iap.ac.android.rpc.ssl.db;

import androidx.room.TypeConverter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class Converters {
    @TypeConverter
    public static byte[] certificateToByteArray(Certificate certificate) {
        try {
            return certificate.getEncoded();
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    @TypeConverter
    public static Certificate fromByteArray(byte[] bArr) {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Certificate generateCertificate = instance.generateCertificate(byteArrayInputStream);
            byteArrayInputStream.close();
            return generateCertificate;
        } catch (IOException | CertificateException unused) {
            return null;
        }
    }
}
