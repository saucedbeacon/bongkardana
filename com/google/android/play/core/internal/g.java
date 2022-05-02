package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

class g extends X509Certificate {

    /* renamed from: a  reason: collision with root package name */
    private final X509Certificate f9593a;

    public g(X509Certificate x509Certificate) {
        this.f9593a = x509Certificate;
    }

    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f9593a.checkValidity();
    }

    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f9593a.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f9593a.getBasicConstraints();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return this.f9593a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f9593a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f9593a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f9593a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f9593a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f9593a.getKeyUsage();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f9593a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f9593a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f9593a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f9593a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f9593a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f9593a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f9593a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f9593a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f9593a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f9593a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f9593a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f9593a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f9593a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f9593a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f9593a.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f9593a.verify(publicKey);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f9593a.verify(publicKey, str);
    }
}
