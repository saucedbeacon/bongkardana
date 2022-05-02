package com.alipay.imobile.network.sslpinning.db;

import androidx.room.TypeConverter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class d {
    @TypeConverter
    public static Certificate a(byte[] bArr) {
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

    @TypeConverter
    public static byte[] a(Certificate certificate) {
        try {
            return certificate.getEncoded();
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }
}
