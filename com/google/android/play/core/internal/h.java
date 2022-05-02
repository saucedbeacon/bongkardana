package com.google.android.play.core.internal;

import android.util.Pair;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import id.dana.data.constant.BranchLinkConstant;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class h {
    private static int a(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    public static long a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 16);
    }

    private static long a(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> a2 = a(randomAccessFile, 0);
        return a2 != null ? a2 : a(randomAccessFile, 65535);
    }

    private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min((long) i, -22 + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - ((long) allocate.capacity());
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        c(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i3 = capacity2 - 22;
            int min = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= min) {
                    break;
                }
                i2 = i3 - i4;
                if (allocate.getInt(i2) == 101010256 && ((char) allocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        allocate.position(i2);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + ((long) i2)));
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public static String a(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }

    private static void a(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static void a(ByteBuffer byteBuffer, long j) {
        c(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j < 0 || j > 4294967295L) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("uint32 value of out range: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
        byteBuffer.putInt(byteBuffer.position() + position, (int) j);
    }

    private static void a(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            c cVar = new c(fileChannel, 0, j);
            c cVar2 = new c(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j4 = j;
            a(duplicate, j);
            a aVar = new a(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] a2 = a(iArr, new b[]{cVar, cVar2, aVar});
                while (i < size) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual(map.get(Integer.valueOf(i3)), a2[i])) {
                        i++;
                    } else {
                        throw new SecurityException(b(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r1 = android.util.Pair.create(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            java.nio.ByteBuffer r0 = d(r22)
            java.nio.ByteBuffer r1 = d(r22)
            byte[] r2 = e(r22)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -1
            r6 = 0
            r9 = r6
            r7 = -1
            r8 = 0
        L_0x0016:
            boolean r10 = r1.hasRemaining()
            r11 = 8
            r12 = 769(0x301, float:1.078E-42)
            r13 = 514(0x202, float:7.2E-43)
            r14 = 513(0x201, float:7.19E-43)
            r15 = 1
            if (r10 == 0) goto L_0x0080
            int r8 = r8 + 1
            java.nio.ByteBuffer r10 = d(r1)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            int r5 = r10.remaining()     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r5 < r11) goto L_0x005c
            int r5 = r10.getInt()     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            r3.add(r11)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r5 == r14) goto L_0x0046
            if (r5 == r13) goto L_0x0046
            if (r5 == r12) goto L_0x0046
            switch(r5) {
                case 257: goto L_0x0046;
                case 258: goto L_0x0046;
                case 259: goto L_0x0046;
                case 260: goto L_0x0046;
                default: goto L_0x0045;
            }     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
        L_0x0045:
            goto L_0x0016
        L_0x0046:
            if (r7 == r4) goto L_0x0055
            int r11 = a((int) r5)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            int r12 = a((int) r7)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r11 == r15) goto L_0x0016
            if (r12 == r15) goto L_0x0055
            goto L_0x0016
        L_0x0055:
            byte[] r7 = e(r10)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            r9 = r7
            r7 = r5
            goto L_0x0016
        L_0x005c:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            throw r0     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            goto L_0x0067
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 45
            r2.<init>(r3)
            java.lang.String r3 = "Failed to parse signature record #"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0080:
            if (r7 != r4) goto L_0x0092
            java.lang.SecurityException r0 = new java.lang.SecurityException
            if (r8 != 0) goto L_0x008c
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L_0x008c:
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L_0x0092:
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            if (r7 == r14) goto L_0x00c3
            if (r7 == r13) goto L_0x00c3
            if (r7 == r12) goto L_0x00c0
            switch(r7) {
                case 257: goto L_0x00bd;
                case 258: goto L_0x00bd;
                case 259: goto L_0x00bd;
                case 260: goto L_0x00bd;
                default: goto L_0x009d;
            }
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00b3
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00b9:
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            java.lang.String r4 = "RSA"
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r4 = "DSA"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r4 = "EC"
        L_0x00c5:
            if (r7 == r14) goto L_0x012a
            if (r7 == r13) goto L_0x0127
            if (r7 == r12) goto L_0x0124
            switch(r7) {
                case 257: goto L_0x010c;
                case 258: goto L_0x00f8;
                case 259: goto L_0x00f1;
                case 260: goto L_0x00ee;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00e4
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00ea:
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.String r1 = "SHA512withRSA"
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r1 = "SHA256withRSA"
        L_0x00f3:
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x012d
        L_0x00f8:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r19 = java.security.spec.MGF1ParameterSpec.SHA512
            r20 = 64
            r21 = 1
            java.lang.String r17 = "SHA-512"
            java.lang.String r18 = "MGF1"
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r5 = "SHA512withRSA/PSS"
            goto L_0x011f
        L_0x010c:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r19 = java.security.spec.MGF1ParameterSpec.SHA256
            r20 = 32
            r21 = 1
            java.lang.String r17 = "SHA-256"
            java.lang.String r18 = "MGF1"
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r5 = "SHA256withRSA/PSS"
        L_0x011f:
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            goto L_0x012d
        L_0x0124:
            java.lang.String r1 = "SHA256withDSA"
            goto L_0x00f3
        L_0x0127:
            java.lang.String r1 = "SHA512withECDSA"
            goto L_0x00f3
        L_0x012a:
            java.lang.String r1 = "SHA256withECDSA"
            goto L_0x00f3
        L_0x012d:
            java.lang.Object r5 = r1.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.second
            java.security.spec.AlgorithmParameterSpec r1 = (java.security.spec.AlgorithmParameterSpec) r1
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.spec.X509EncodedKeySpec r8 = new java.security.spec.X509EncodedKeySpec     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            r8.<init>(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.PublicKey r4 = r4.generatePublic(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.Signature r8 = java.security.Signature.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            r8.initVerify(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            if (r1 == 0) goto L_0x014e
            r8.setParameter(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
        L_0x014e:
            r8.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            boolean r1 = r8.verify(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            if (r1 == 0) goto L_0x025f
            r0.clear()
            java.nio.ByteBuffer r1 = d(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L_0x0164:
            boolean r8 = r1.hasRemaining()
            if (r8 == 0) goto L_0x01ab
            int r5 = r5 + r15
            java.nio.ByteBuffer r8 = d(r1)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            int r9 = r8.remaining()     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            if (r9 < r11) goto L_0x0187
            int r9 = r8.getInt()     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            r4.add(r10)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            if (r9 != r7) goto L_0x0164
            byte[] r6 = e(r8)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            goto L_0x0164
        L_0x0187:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            throw r0     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            goto L_0x0192
        L_0x0191:
            r0 = move-exception
        L_0x0192:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 42
            r2.<init>(r3)
            java.lang.String r3 = "Failed to parse digest record #"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x01ab:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x0257
            int r1 = a((int) r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r23
            java.lang.Object r3 = r4.put(r3, r6)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x01da
            boolean r3 = java.security.MessageDigest.isEqual(r3, r6)
            if (r3 == 0) goto L_0x01ca
            goto L_0x01da
        L_0x01ca:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = b((int) r1)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x01da:
            java.nio.ByteBuffer r0 = d(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x01e4:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L_0x021f
            int r3 = r3 + r15
            byte[] r4 = e(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0205 }
            r5.<init>(r4)     // Catch:{ CertificateException -> 0x0205 }
            r6 = r24
            java.security.cert.Certificate r5 = r6.generateCertificate(r5)     // Catch:{ CertificateException -> 0x0205 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x0205 }
            com.google.android.play.core.internal.f r7 = new com.google.android.play.core.internal.f
            r7.<init>(r5, r4)
            r1.add(r7)
            goto L_0x01e4
        L_0x0205:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 41
            r2.<init>(r4)
            java.lang.String r4 = "Failed to decode certificate #"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x021f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x024f
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x0247
            int r0 = r1.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        L_0x0247:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L_0x024f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L_0x0257:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L_0x025f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = " signature did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x026f:
            r0 = move-exception
            goto L_0x0278
        L_0x0271:
            r0 = move-exception
            goto L_0x0278
        L_0x0273:
            r0 = move-exception
            goto L_0x0278
        L_0x0275:
            r0 = move-exception
            goto L_0x0278
        L_0x0277:
            r0 = move-exception
        L_0x0278:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 27
            r3.<init>(r2)
            java.lang.String r2 = "Failed to verify "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = " signature"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            goto L_0x029f
        L_0x029e:
            throw r1
        L_0x029f:
            goto L_0x029e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.h.a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] a(int[] iArr, b[] bVarArr) throws DigestException {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = ConvertUtils.MB;
            if (i2 >= 3) {
                break;
            }
            j3 += (bVarArr[i2].a() + 1048575) / ConvertUtils.MB;
            i2++;
        }
        if (j3 < 2097151) {
            int i3 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i4 = 0;
            while (true) {
                length = iArr2.length;
                if (i4 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((c(iArr2[i4]) * i3) + 5)];
                bArr2[0] = 90;
                a(i3, bArr2);
                bArr[i4] = bArr2;
                i4++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i5 = 0;
            while (i5 < iArr2.length) {
                String b = b(iArr2[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(b);
                    i5++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(b.concat(" digest not supported"), e);
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i6 < i; i = 3) {
                b bVar = bVarArr[i6];
                long j4 = j2;
                int i9 = i6;
                long a2 = bVar.a();
                while (a2 > j2) {
                    int min = (int) Math.min(a2, j);
                    a(min, bArr3);
                    for (int i10 = 0; i10 < length; i10++) {
                        messageDigestArr[i10].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        bVar.a(messageDigestArr, j5, min);
                        int i11 = 0;
                        while (i11 < iArr2.length) {
                            int i12 = iArr2[i11];
                            b bVar2 = bVar;
                            byte[] bArr4 = bArr[i11];
                            int c = c(i12);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i11];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i7 * c) + 5, c);
                            if (digest == c) {
                                i11++;
                                bVar = bVar2;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        b bVar3 = bVar;
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j6 = (long) min;
                        long j7 = j5 + j6;
                        a2 -= j6;
                        i7++;
                        j2 = 0;
                        j = ConvertUtils.MB;
                        long j8 = j7;
                        bVar = bVar3;
                        j4 = j8;
                        bArr3 = bArr3;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i7);
                        sb2.append(" of section #");
                        sb2.append(i8);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                i8++;
                i6 = i9 + 1;
                j2 = 0;
                j = ConvertUtils.MB;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i13 = 0;
            while (i13 < iArr2.length) {
                int i14 = iArr2[i13];
                byte[] bArr8 = bArr[i13];
                String b2 = b(i14);
                try {
                    bArr7[i13] = MessageDigest.getInstance(b2).digest(bArr8);
                    i13++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(b2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    public static X509Certificate[][] a(String str) throws e, SecurityException, IOException {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, BranchLinkConstant.PayloadKey.REFERRAL);
        try {
            Pair<ByteBuffer, Long> a2 = a(randomAccessFile);
            if (a2 != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) a2.first;
                long longValue = ((Long) a2.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new e("ZIP64 APK not supported");
                    }
                }
                long a3 = a(byteBuffer2);
                if (a3 >= longValue) {
                    StringBuilder sb = new StringBuilder(122);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(a3);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new e(sb.toString());
                } else if (b(byteBuffer2) + a3 != longValue) {
                    throw new e("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (a3 >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile.seek(a3 - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    int i = 8;
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i2 = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new e(sb2.toString());
                        }
                        int i3 = (int) (8 + j2);
                        long j3 = a3 - ((long) i3);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i3);
                            allocate2.order(ByteOrder.LITTLE_ENDIAN);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i2++;
                                                if (slice.remaining() >= i) {
                                                    long j5 = slice.getLong();
                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                        StringBuilder sb3 = new StringBuilder(76);
                                                        sb3.append("APK Signing Block entry #");
                                                        sb3.append(i2);
                                                        sb3.append(" size out of range: ");
                                                        sb3.append(j5);
                                                        throw new e(sb3.toString());
                                                    }
                                                    int i4 = (int) j5;
                                                    int position2 = slice.position() + i4;
                                                    if (i4 > slice.remaining()) {
                                                        int remaining = slice.remaining();
                                                        StringBuilder sb4 = new StringBuilder(91);
                                                        sb4.append("APK Signing Block entry #");
                                                        sb4.append(i2);
                                                        sb4.append(" size out of range: ");
                                                        sb4.append(i4);
                                                        sb4.append(", available: ");
                                                        sb4.append(remaining);
                                                        throw new e(sb4.toString());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] a4 = a(randomAccessFile.getChannel(), new d(b(slice, i4 - 4), longValue2, a3, longValue, byteBuffer2));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return a4;
                                                    } else {
                                                        slice.position(position2);
                                                        i = 8;
                                                    }
                                                } else {
                                                    StringBuilder sb5 = new StringBuilder(70);
                                                    sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                    sb5.append(i2);
                                                    throw new e(sb5.toString());
                                                }
                                            }
                                            throw new e("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        StringBuilder sb6 = new StringBuilder(41);
                                        sb6.append("end > capacity: ");
                                        sb6.append(capacity);
                                        sb6.append(" > ");
                                        sb6.append(capacity2);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    StringBuilder sb7 = new StringBuilder(38);
                                    sb7.append("end < start: ");
                                    sb7.append(capacity);
                                    sb7.append(" < ");
                                    sb7.append(8);
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            StringBuilder sb8 = new StringBuilder(103);
                            sb8.append("APK Signing Block sizes in header and footer do not match: ");
                            sb8.append(j4);
                            sb8.append(" vs ");
                            sb8.append(j2);
                            throw new e(sb8.toString());
                        }
                        StringBuilder sb9 = new StringBuilder(59);
                        sb9.append("APK Signing Block offset out of range: ");
                        sb9.append(j3);
                        throw new e(sb9.toString());
                    }
                    throw new e("No APK Signing Block before ZIP Central Directory");
                } else {
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(a3);
                    throw new e(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new e(sb11.toString());
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static X509Certificate[][] a(FileChannel fileChannel, d dVar) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer d = d(dVar.f9591a);
                int i = 0;
                while (d.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(a(d(d), (Map<Integer, byte[]>) hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    a(hashMap, fileChannel, dVar.b, dVar.c, dVar.d, dVar.e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    public static long b(ByteBuffer byteBuffer) {
        c(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 12);
    }

    private static String b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static int c(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private static void c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer d(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return b(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    private static byte[] e(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }
}
