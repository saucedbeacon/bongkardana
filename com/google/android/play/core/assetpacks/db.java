package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.internal.ci;
import com.google.android.play.core.splitcompat.p;
import com.google.common.base.Ascii;
import id.dana.data.constant.BranchLinkConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipException;
import kotlin.text.Typography;

public final class db {

    /* renamed from: a  reason: collision with root package name */
    private static a f10907a = null;
    private static char[] getMax = {'U', 60379, 55128, 49792, 44548};
    private static int getMin = 1;
    private static int setMax;
    private static long setMin = -3023990675816322161L;

    static int a(byte[] bArr, int i) {
        int i2 = setMax + 77;
        getMin = i2 % 128;
        byte b = (i2 % 2 == 0 ? 1 : '/') != '/' ? (bArr[i * 3] & 29556) ^ ((((bArr[i] ^ 20432) + 96) & ((bArr[i >>> 1] | ImageFileType.HEAD_GIF_0) * Ascii.EM)) & ((bArr[i >> 5] & Ascii.DLE) - 94)) : (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
        int i3 = getMin + 87;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return b;
    }

    @Nullable
    static AssetLocation a(String str, String str2) throws IOException {
        Long l;
        int i;
        int i2;
        String str3 = str;
        String str4 = str2;
        char c = 0;
        try {
            av.a(str3 != null, (Object) "Attempted to get file location from a null apk path.");
            av.a(str4 != null, (Object) String.format("Attempted to get file location in apk %s with a null file path.", new Object[]{str3}));
            RandomAccessFile randomAccessFile = new RandomAccessFile(str3, BranchLinkConstant.PayloadKey.REFERRAL);
            byte[] bArr = new byte[22];
            randomAccessFile.seek(randomAccessFile.length() - 22);
            randomAccessFile.readFully(bArr);
            bj a2 = a(bArr, 0) == 1347093766 ? a(bArr) : null;
            byte b = 5;
            if ((a2 != null ? '0' : 23) != '0') {
                try {
                    long length = randomAccessFile.length() - 22;
                    long j = -65536 + length;
                    if ((j < 0 ? '.' : 14) != 14) {
                        j = 0;
                    }
                    int min = (int) Math.min(ConvertUtils.KB, randomAccessFile.length());
                    byte[] bArr2 = new byte[min];
                    byte[] bArr3 = new byte[22];
                    loop0:
                    do {
                        length = Math.max((length - ((long) min)) + 3, j);
                        randomAccessFile.seek(length);
                        randomAccessFile.readFully(bArr2);
                        int i3 = min - 4;
                        while (true) {
                            if (i3 >= 0) {
                                byte b2 = bArr2[i3];
                                if (b2 == b) {
                                    i = 2;
                                } else if (b2 == 6) {
                                    i = 3;
                                } else if (b2 != 75) {
                                    i = b2 != 80 ? -1 : 0;
                                } else {
                                    int i4 = setMax + 67;
                                    getMin = i4 % 128;
                                    int i5 = i4 % 2;
                                    i = 1;
                                }
                                if (i >= 0) {
                                    int i6 = setMax + 7;
                                    getMin = i6 % 128;
                                    if (!(i6 % 2 != 0)) {
                                        Object[] objArr = null;
                                        try {
                                            int length2 = objArr.length;
                                            i2 = 25;
                                            if (i3 < i) {
                                                continue;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } else {
                                        i2 = 25;
                                        if ((i3 >= i ? ' ' : 25) == 25) {
                                            continue;
                                        }
                                    }
                                    if (a(bArr2, i3 - i) == 1347093766) {
                                        int i7 = setMax + i2;
                                        getMin = i7 % 128;
                                        int i8 = i7 % 2;
                                        randomAccessFile.seek((length + ((long) i3)) - ((long) i));
                                        randomAccessFile.readFully(bArr3);
                                        a2 = a(bArr3);
                                        break loop0;
                                    }
                                }
                                i3 -= 4;
                                c = 0;
                                b = 5;
                            }
                        }
                    } while (length != j);
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = str3;
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", objArr2));
                } catch (Exception e) {
                    throw e;
                }
            }
            long j2 = a2.f10864a;
            byte[] bytes = str4.getBytes(getMax(TextUtils.indexOf("", "", 0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), View.getDefaultSize(0, 0) + 5).intern());
            byte[] bArr4 = new byte[46];
            byte[] bArr5 = new byte[str2.length()];
            int i9 = 0;
            while (true) {
                if (i9 >= a2.b) {
                    l = null;
                    break;
                }
                randomAccessFile.seek(j2);
                randomAccessFile.readFully(bArr4);
                int a3 = a(bArr4, 0);
                if (a3 == 1347092738) {
                    randomAccessFile.seek(28 + j2);
                    int c2 = c(bArr4, 28);
                    if (c2 == str2.length()) {
                        int i10 = setMax + 59;
                        getMin = i10 % 128;
                        if ((i10 % 2 == 0 ? 'Y' : '(') != 'Y') {
                            randomAccessFile.seek(46 + j2);
                            randomAccessFile.read(bArr5);
                            if ((Arrays.equals(bArr5, bytes) ? '-' : '*') != '*') {
                                break;
                            }
                        } else {
                            randomAccessFile.seek(46 + j2);
                            randomAccessFile.read(bArr5);
                            if (Arrays.equals(bArr5, bytes)) {
                                break;
                            }
                        }
                    }
                    j2 += (long) (c2 + 46 + c(bArr4, 30) + c(bArr4, 32));
                    i9++;
                } else {
                    throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", new Object[]{str4, str3, Integer.valueOf(i9), Integer.valueOf(a2.b), Integer.valueOf(a3), 1347092738}));
                }
            }
            l = Long.valueOf(b(bArr4, 42));
            if (l == null) {
                int i11 = setMax + 37;
                getMin = i11 % 128;
                int i12 = i11 % 2;
                return null;
            }
            long longValue = l.longValue();
            byte[] bArr6 = new byte[8];
            randomAccessFile.seek(22 + longValue);
            randomAccessFile.readFully(bArr6);
            return AssetLocation.a(str3, longValue + 30 + ((long) c(bArr6, 4)) + ((long) c(bArr6, 6)), b(bArr6, 0));
        } catch (Exception e2) {
            throw e2;
        }
    }

    static synchronized a a(Context context) {
        a aVar;
        synchronized (db.class) {
            try {
                int i = setMax + 63;
                getMin = i % 128;
                int i2 = i % 2;
                if (f10907a == null) {
                    bq bqVar = new bq((byte[]) null);
                    bqVar.a(new n(p.a(context)));
                    f10907a = bqVar.a();
                    int i3 = getMin + 1;
                    setMax = i3 % 128;
                    if (i3 % 2 != 0) {
                    }
                }
                aVar = f10907a;
            } catch (Exception e) {
                throw e;
            }
        }
        return aVar;
    }

    private static bj a(byte[] bArr) {
        int c = c(bArr, 10);
        b(bArr, 12);
        bj bjVar = new bj(b(bArr, 16), c);
        try {
            int i = getMin + 61;
            setMax = i % 128;
            int i2 = i % 2;
            return bjVar;
        } catch (Exception e) {
            throw e;
        }
    }

    static String a(List<File> list) throws NoSuchAlgorithmException, IOException {
        boolean z;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
                int i = getMin + 11;
                setMax = i % 128;
                int i2 = i % 2;
                do {
                    try {
                        int read = fileInputStream2.read(bArr);
                        z = false;
                        if ((read > 0 ? Typography.greater : 'H') == '>') {
                            instance.update(bArr, 0, read);
                        }
                        if (read == -1) {
                            z = true;
                            continue;
                        }
                    } catch (Throwable th) {
                        ci.a(th, th);
                    }
                } while (!z);
                fileInputStream2.close();
            } catch (Exception e) {
                throw e;
            }
        }
        String encodeToString = Base64.encodeToString(instance.digest(), 11);
        try {
            int i3 = getMin + 7;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            return encodeToString;
        } catch (Exception e2) {
            throw e2;
        }
        throw th;
    }

    public static boolean a(@AssetPackStatus int i) {
        if (!(i == 1)) {
            int i2 = setMax + 103;
            getMin = i2 % 128;
            if (i2 % 2 != 0 ? i != 7 : i != 119) {
                if (!(i == 2) && i != 3) {
                    int i3 = getMin + 107;
                    setMax = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        if (r8 == 8) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0085, code lost:
        if ((r8 == 8) != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r7, @com.google.android.play.core.assetpacks.model.AssetPackStatus int r8) {
        /*
            r0 = 5
            r1 = 1
            if (r7 != r0) goto L_0x0009
            if (r8 != r0) goto L_0x0008
            r7 = 5
            goto L_0x0009
        L_0x0008:
            return r1
        L_0x0009:
            r2 = 53
            r3 = 6
            if (r7 != r3) goto L_0x0011
            r4 = 53
            goto L_0x0013
        L_0x0011:
            r4 = 49
        L_0x0013:
            r5 = 2
            r6 = 0
            if (r4 == r2) goto L_0x0018
            goto L_0x002b
        L_0x0018:
            if (r8 == r3) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == r1) goto L_0x0020
            goto L_0x002b
        L_0x0020:
            int r2 = getMin
            int r2 = r2 + 15
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % r5
            if (r8 != r0) goto L_0x0092
        L_0x002b:
            r0 = 34
            r2 = 4
            if (r7 != r2) goto L_0x0033
            r3 = 14
            goto L_0x0035
        L_0x0033:
            r3 = 34
        L_0x0035:
            if (r3 == r0) goto L_0x0044
            int r0 = getMin
            int r0 = r0 + 95
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % r5
            if (r8 != r2) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            return r1
        L_0x0044:
            r0 = 3
            r2 = 35
            if (r7 != r0) goto L_0x004c
            r0 = 86
            goto L_0x004e
        L_0x004c:
            r0 = 35
        L_0x004e:
            r3 = 8
            if (r0 == r2) goto L_0x0071
            r0 = 56
            if (r8 == r5) goto L_0x0059
            r2 = 56
            goto L_0x005b
        L_0x0059:
            r2 = 89
        L_0x005b:
            if (r2 == r0) goto L_0x005e
            goto L_0x0070
        L_0x005e:
            r0 = 7
            if (r8 == r0) goto L_0x0070
            r0 = 28
            if (r8 == r1) goto L_0x0068
            r2 = 28
            goto L_0x006a
        L_0x0068:
            r2 = 84
        L_0x006a:
            if (r2 == r0) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            if (r8 == r3) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r1
        L_0x0071:
            if (r7 != r5) goto L_0x0075
            r7 = 1
            goto L_0x0076
        L_0x0075:
            r7 = 0
        L_0x0076:
            if (r7 == 0) goto L_0x0088
            if (r8 == r1) goto L_0x007c
            r7 = 1
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            if (r7 == r1) goto L_0x0080
            goto L_0x0087
        L_0x0080:
            if (r8 != r3) goto L_0x0084
            r7 = 1
            goto L_0x0085
        L_0x0084:
            r7 = 0
        L_0x0085:
            if (r7 == 0) goto L_0x0088
        L_0x0087:
            return r1
        L_0x0088:
            int r7 = getMin
            int r7 = r7 + 93
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % r5
            return r6
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.db.a(int, int):boolean");
    }

    static long b(byte[] bArr, int i) {
        int i2 = getMin + 7;
        setMax = i2 % 128;
        long c = (i2 % 2 != 0 ? 'Y' : ':') != ':' ? ((long) ((c(bArr, i % 4) >>> 19) & c(bArr, i))) * 4294967295L : ((long) ((c(bArr, i + 2) << 16) | c(bArr, i))) & 4294967295L;
        int i3 = getMin + 61;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if ((r4 != 6 ? (char) 7 : 8) != 7) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if ((r4 == 15) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(@com.google.android.play.core.assetpacks.model.AssetPackStatus int r4) {
        /*
            r0 = 5
            r1 = 1
            if (r4 == r0) goto L_0x0030
            int r0 = getMin
            int r0 = r0 + 35
            int r2 = r0 % 128
            setMax = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == r1) goto L_0x0021
            r0 = 6
            r3 = 7
            if (r4 == r0) goto L_0x001c
            r0 = 7
            goto L_0x001e
        L_0x001c:
            r0 = 8
        L_0x001e:
            if (r0 == r3) goto L_0x002b
            goto L_0x0030
        L_0x0021:
            r0 = 15
            if (r4 == r0) goto L_0x0027
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r0 = 4
            if (r4 != r0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            return r2
        L_0x0030:
            int r4 = setMax     // Catch:{ Exception -> 0x0042 }
            int r4 = r4 + 47
            int r0 = r4 % 128
            getMin = r0     // Catch:{ Exception -> 0x0042 }
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0041
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x003f }
            return r1
        L_0x003f:
            r4 = move-exception
            throw r4
        L_0x0041:
            return r1
        L_0x0042:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.db.b(int):boolean");
    }

    static int c(byte[] bArr, int i) {
        int i2 = setMax + 93;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        byte b = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i4 = setMax + 63;
        getMin = i4 % 128;
        if ((i4 % 2 == 0 ? '=' : '`') != '=') {
            return b;
        }
        int i5 = 59 / 0;
        return b;
    }

    public static boolean c(@AssetPackStatus int i) {
        int i2 = getMin + 115;
        setMax = i2 % 128;
        int i3 = i2 % 2;
        if (!(i == 2 || i == 7)) {
            int i4 = getMin + 81;
            setMax = i4 % 128;
            if ((i4 % 2 != 0 ? '#' : 'B') != '#') {
                if ((i == 3 ? 'L' : '1') == '1') {
                    return false;
                }
            } else {
                if ((i == 3 ? '8' : 25) == 25) {
                    return false;
                }
            }
        }
        try {
            int i5 = getMin + 39;
            setMax = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            super.hashCode();
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getMax(int i, char c, int i2) {
        int i3 = getMin + 89;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (true) {
            if (!(i5 < i2)) {
                return new String(cArr);
            }
            int i6 = setMax + 21;
            getMin = i6 % 128;
            int i7 = i6 % 2;
            cArr[i5] = (char) ((int) ((((long) getMax[i + i5]) ^ (((long) i5) * setMin)) ^ ((long) c)));
            i5++;
        }
    }
}
