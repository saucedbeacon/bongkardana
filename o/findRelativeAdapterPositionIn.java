package o;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;

public final class findRelativeAdapterPositionIn {
    private static int getMax = 1;
    private static int getMin;
    private static int length;
    static final AtomicBoolean setMin;

    static void setMax() {
        getMin = 124;
    }

    static {
        try {
            setMax();
            boolean z = false;
            setMin = new AtomicBoolean(false);
            int i = getMax + 29;
            length = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r7.length == 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        throw new java.lang.IllegalArgumentException("Cannot parse aesKey:hmacKey");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r7.length == 2) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.findRelativeAdapterPositionIn.length setMin(java.lang.String r7) throws java.security.InvalidKeyException {
        /*
            int r0 = length
            int r0 = r0 + 109
            int r1 = r0 % 128
            getMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.String r4 = ":"
            if (r0 == r3) goto L_0x001f
            java.lang.String[] r7 = r7.split(r4)     // Catch:{ Exception -> 0x001d }
            int r0 = r7.length     // Catch:{ Exception -> 0x001d }
            if (r0 != r1) goto L_0x006b
            goto L_0x0026
        L_0x001d:
            r7 = move-exception
            goto L_0x006a
        L_0x001f:
            java.lang.String[] r7 = r7.split(r4)
            int r0 = r7.length
            if (r0 != r1) goto L_0x006b
        L_0x0026:
            r0 = r7[r2]
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x001d }
            int r4 = r0.length     // Catch:{ Exception -> 0x001d }
            r5 = 16
            if (r4 != r5) goto L_0x0062
            r7 = r7[r3]
            byte[] r7 = android.util.Base64.decode(r7, r1)
            int r3 = r7.length
            r4 = 32
            if (r3 != r4) goto L_0x005a
            o.findRelativeAdapterPositionIn$length r3 = new o.findRelativeAdapterPositionIn$length
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            int r5 = r0.length
            java.lang.String r6 = "AES"
            r4.<init>(r0, r2, r5, r6)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "HmacSHA256"
            r0.<init>(r7, r2)
            r3.<init>(r4, r0)
            int r7 = getMax
            int r7 = r7 + 97
            int r0 = r7 % 128
            length = r0
            int r7 = r7 % r1
            return r3
        L_0x005a:
            java.security.InvalidKeyException r7 = new java.security.InvalidKeyException
            java.lang.String r0 = "Base64 decoded key is not 256 bytes"
            r7.<init>(r0)
            throw r7
        L_0x0062:
            java.security.InvalidKeyException r7 = new java.security.InvalidKeyException
            java.lang.String r0 = "Base64 decoded key is not 128 bytes"
            r7.<init>(r0)
            throw r7
        L_0x006a:
            throw r7
        L_0x006b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot parse aesKey:hmacKey"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findRelativeAdapterPositionIn.setMin(java.lang.String):o.findRelativeAdapterPositionIn$length");
    }

    public static length getMin() throws GeneralSecurityException {
        getMax();
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        length length2 = new length(instance.generateKey(), new SecretKeySpec(setMax(32), getTabbarModel.HASHING_ALGORITHM));
        int i = length + 57;
        getMax = i % 128;
        int i2 = i % 2;
        return length2;
    }

    private static byte[] length() throws GeneralSecurityException {
        int i = getMax + 113;
        length = i % 128;
        int i2 = i % 2;
        try {
            byte[] max = setMax(16);
            int i3 = getMax + 119;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? '-' : 8) != '-') {
                return max;
            }
            int i4 = 41 / 0;
            return max;
        } catch (Exception e) {
            throw e;
        }
    }

    private static byte[] setMax(int i) throws GeneralSecurityException {
        byte[] bArr;
        int i2 = getMax + 5;
        length = i2 % 128;
        boolean z = false;
        if (!(i2 % 2 == 0)) {
            try {
                getMax();
                bArr = new byte[i];
                SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                int i3 = 93 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            getMax();
            bArr = new byte[i];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        }
        try {
            int i4 = length + 25;
            getMax = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
            if (z) {
                return bArr;
            }
            Object obj = null;
            super.hashCode();
            return bArr;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static getMin setMax(String str, length length2) throws UnsupportedEncodingException, GeneralSecurityException {
        byte[] bytes = str.getBytes(getMax(192 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 5, new char[]{65524, 65513, 2, 16, 17}, URLUtil.isHttpUrl("http://"), (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 4).intern());
        byte[] length3 = length();
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, length2.getMin, new IvParameterSpec(length3));
        byte[] iv = instance.getIV();
        byte[] doFinal = instance.doFinal(bytes);
        getMin getmin = new getMin(doFinal, iv, setMin(getMin.length(iv, doFinal), length2.setMin));
        int i = getMax + 111;
        length = i % 128;
        int i2 = i % 2;
        return getmin;
    }

    private static void getMax() {
        if (!setMin.get()) {
            synchronized (getMax.class) {
                if (!setMin.get()) {
                    getMax.length();
                    setMin.set(true);
                }
            }
        }
    }

    public static String length(getMin getmin, length length2) throws UnsupportedEncodingException, GeneralSecurityException {
        String str = new String(getMax(getmin, length2), getMax((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 191, 5 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65524, 65513, 2, 16, 17}, TextUtils.isEmpty(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5).intern());
        int i = length + 15;
        getMax = i % 128;
        if ((i % 2 == 0 ? 'b' : 'N') == 'N') {
            return str;
        }
        int i2 = 10 / 0;
        return str;
    }

    private static byte[] getMax(getMin getmin, length length2) throws GeneralSecurityException {
        int i = getMax + 117;
        length = i % 128;
        int i2 = i % 2;
        try {
            if (getMax(setMin(getMin.length(getmin.length(), getmin.getMax()), length2.setMin), getmin.getMin())) {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, length2.getMin, new IvParameterSpec(getmin.length()));
                byte[] doFinal = instance.doFinal(getmin.getMax());
                int i3 = length + 21;
                getMax = i3 % 128;
                if (i3 % 2 != 0) {
                    return doFinal;
                }
                Object[] objArr = null;
                int length3 = objArr.length;
                return doFinal;
            }
            throw new GeneralSecurityException("MAC stored in civ does not match computed MAC.");
        } catch (Exception e) {
            throw e;
        }
    }

    private static byte[] setMin(byte[] bArr, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException {
        int i = length + 113;
        getMax = i % 128;
        int i2 = i % 2;
        Mac instance = Mac.getInstance(getTabbarModel.HASHING_ALGORITHM);
        instance.init(secretKey);
        byte[] doFinal = instance.doFinal(bArr);
        int i3 = length + 85;
        getMax = i3 % 128;
        int i4 = i3 % 2;
        return doFinal;
    }

    public static class length {
        SecretKey getMin;
        SecretKey setMin;

        public length(SecretKey secretKey, SecretKey secretKey2) {
            this.getMin = secretKey;
            this.setMin = secretKey2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Base64.encodeToString(this.getMin.getEncoded(), 2));
            sb.append(":");
            sb.append(Base64.encodeToString(this.setMin.getEncoded(), 2));
            return sb.toString();
        }

        public final int hashCode() {
            return ((this.getMin.hashCode() + 31) * 31) + this.setMin.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            length length = (length) obj;
            return this.setMin.equals(length.setMin) && this.getMin.equals(length.getMin);
        }
    }

    private static boolean getMax(byte[] bArr, byte[] bArr2) {
        if ((bArr.length != bArr2.length ? '%' : '+') != '%') {
            int i = length + 65;
            getMax = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            byte b = 0;
            while (i3 < bArr.length) {
                b |= bArr[i3] ^ bArr2[i3];
                i3++;
                int i4 = length + 117;
                getMax = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!(b != 0)) {
                return true;
            }
        }
        return false;
    }

    public static class getMin {
        private final byte[] getMax;
        private final byte[] getMin;
        private final byte[] setMax;

        public final byte[] getMax() {
            return this.setMax;
        }

        public final byte[] length() {
            return this.getMin;
        }

        public final byte[] getMin() {
            return this.getMax;
        }

        public getMin(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length];
            this.setMax = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            byte[] bArr5 = new byte[bArr2.length];
            this.getMin = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            byte[] bArr6 = new byte[bArr3.length];
            this.getMax = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }

        public getMin(String str) {
            String[] split = str.split(":");
            if (split.length == 3) {
                this.getMin = Base64.decode(split[0], 2);
                this.getMax = Base64.decode(split[1], 2);
                this.setMax = Base64.decode(split[2], 2);
                return;
            }
            throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
        }

        public static byte[] length(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            return bArr3;
        }

        public final String toString() {
            String encodeToString = Base64.encodeToString(this.getMin, 2);
            String encodeToString2 = Base64.encodeToString(this.setMax, 2);
            String encodeToString3 = Base64.encodeToString(this.getMax, 2);
            StringBuilder sb = new StringBuilder();
            sb.append(encodeToString);
            sb.append(":");
            sb.append(encodeToString3);
            sb.append(":");
            sb.append(encodeToString2);
            return String.format(sb.toString(), new Object[0]);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.setMax) + 31) * 31) + Arrays.hashCode(this.getMin)) * 31) + Arrays.hashCode(this.getMax);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return Arrays.equals(this.setMax, getmin.setMax) && Arrays.equals(this.getMin, getmin.getMin) && Arrays.equals(this.getMax, getmin.getMax);
        }
    }

    private static byte[] setMin(byte[] bArr, int i, int i2) {
        int i3 = getMax + 51;
        length = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 - i;
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i, bArr2, 0, i5);
        try {
            int i6 = getMax + 25;
            try {
                length = i6 % 128;
                int i7 = i6 % 2;
                return bArr2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final class getMax {
        private static int equals = 1;
        private static int getMax;
        private static long getMin;
        private static char length;
        private static int setMax;
        private static final byte[] setMin = toIntRange();

        static void setMin() {
            length = 34404;
            getMin = 0;
            setMax = 0;
        }

        static /* synthetic */ byte[] setMax() {
            byte[] bArr;
            int i = getMax + 51;
            equals = i % 128;
            if ((i % 2 == 0 ? 15 : 'Z') != 15) {
                bArr = getMax();
            } else {
                bArr = getMax();
                Object obj = null;
                super.hashCode();
            }
            try {
                int i2 = getMax + 41;
                equals = i2 % 128;
                int i3 = i2 % 2;
                return bArr;
            } catch (Exception e) {
                throw e;
            }
        }

        static {
            setMin();
            int i = equals + 85;
            getMax = i % 128;
            if (i % 2 != 0) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        }

        private getMax() {
        }

        static class getMin extends Provider {
            public getMin() {
                super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
                put("SecureRandom.SHA1PRNG", C0042getMax.class.getName());
                put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
            }
        }

        /* renamed from: o.findRelativeAdapterPositionIn$getMax$getMax  reason: collision with other inner class name */
        public static class C0042getMax extends SecureRandomSpi {
            private static final File URANDOM_FILE = new File("/dev/urandom");
            private static final Object sLock = new Object();
            private static DataInputStream sUrandomIn;
            private static OutputStream sUrandomOut;
            private boolean mSeeded;

            /* access modifiers changed from: protected */
            public void engineSetSeed(byte[] bArr) {
                OutputStream urandomOutputStream;
                try {
                    synchronized (sLock) {
                        urandomOutputStream = getUrandomOutputStream();
                    }
                    urandomOutputStream.write(bArr);
                    urandomOutputStream.flush();
                    this.mSeeded = true;
                } catch (IOException unused) {
                    Class<getMax> cls = getMax.class;
                    this.mSeeded = true;
                } catch (Throwable th) {
                    this.mSeeded = true;
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
                r4 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0020, code lost:
                r1 = new java.lang.StringBuilder("Failed to read from ");
                r1.append(URANDOM_FILE);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0035, code lost:
                throw new java.lang.SecurityException(r1.toString(), r4);
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void engineNextBytes(byte[] r4) {
                /*
                    r3 = this;
                    boolean r0 = r3.mSeeded
                    if (r0 != 0) goto L_0x000b
                    byte[] r0 = o.findRelativeAdapterPositionIn.getMax.setMax()
                    r3.engineSetSeed(r0)
                L_0x000b:
                    java.lang.Object r0 = sLock     // Catch:{ IOException -> 0x001f }
                    monitor-enter(r0)     // Catch:{ IOException -> 0x001f }
                    java.io.DataInputStream r1 = r3.getUrandomInputStream()     // Catch:{ all -> 0x001c }
                    monitor-exit(r0)     // Catch:{ all -> 0x001c }
                    monitor-enter(r1)     // Catch:{ IOException -> 0x001f }
                    r1.readFully(r4)     // Catch:{ all -> 0x0019 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0019 }
                    return
                L_0x0019:
                    r4 = move-exception
                    monitor-exit(r1)     // Catch:{ IOException -> 0x001f }
                    throw r4     // Catch:{ IOException -> 0x001f }
                L_0x001c:
                    r4 = move-exception
                    monitor-exit(r0)     // Catch:{ IOException -> 0x001f }
                    throw r4     // Catch:{ IOException -> 0x001f }
                L_0x001f:
                    r4 = move-exception
                    java.lang.SecurityException r0 = new java.lang.SecurityException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Failed to read from "
                    r1.<init>(r2)
                    java.io.File r2 = URANDOM_FILE
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1, r4)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.findRelativeAdapterPositionIn.getMax.C0042getMax.engineNextBytes(byte[]):void");
            }

            /* access modifiers changed from: protected */
            public byte[] engineGenerateSeed(int i) {
                byte[] bArr = new byte[i];
                engineNextBytes(bArr);
                return bArr;
            }

            private DataInputStream getUrandomInputStream() {
                DataInputStream dataInputStream;
                synchronized (sLock) {
                    if (sUrandomIn == null) {
                        try {
                            sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder("Failed to open ");
                            sb.append(URANDOM_FILE);
                            sb.append(" for reading");
                            throw new SecurityException(sb.toString(), e);
                        }
                    }
                    dataInputStream = sUrandomIn;
                }
                return dataInputStream;
            }

            private OutputStream getUrandomOutputStream() throws IOException {
                OutputStream outputStream;
                synchronized (sLock) {
                    if (sUrandomOut == null) {
                        sUrandomOut = new FileOutputStream(URANDOM_FILE);
                    }
                    outputStream = sUrandomOut;
                }
                return outputStream;
            }
        }

        private static byte[] getMax() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(setMin);
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int i = equals + 47;
                getMax = i % 128;
                if (i % 2 == 0) {
                    return byteArray;
                }
                int i2 = 50 / 0;
                return byteArray;
            } catch (IOException e) {
                throw new SecurityException("Failed to generate seed", e);
            }
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, java.lang.String] */
        private static String getMin() {
            try {
                int i = equals + 39;
                getMax = i % 128;
                int i2 = i % 2;
                ? r0 = 0;
                try {
                    String str = (String) Build.class.getField("SERIAL").get(r0);
                    int i3 = equals + 49;
                    getMax = i3 % 128;
                    if (!(i3 % 2 != 0)) {
                        return str;
                    }
                    int length2 = r0.length;
                    return str;
                } catch (Exception unused) {
                    return r0;
                }
            } catch (Exception e) {
                throw e;
            }
        }

        private static byte[] toIntRange() {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if ((str != null ? Typography.quote : ';') == '\"') {
                int i = equals + 119;
                getMax = i % 128;
                int i2 = i % 2;
                sb.append(str);
                int i3 = equals + 85;
                getMax = i3 % 128;
                int i4 = i3 % 2;
            }
            String min = getMin();
            if ((min != null ? 'X' : 19) == 'X') {
                sb.append(min);
            }
            try {
                return sb.toString().getBytes(setMax(new char[]{22562, 31767, 37994, 44598}, (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 1786517335, new char[]{10528, 24158, 651, 25166, 63221}, new char[]{0, 0, 0, 0}, (char) ((Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 13971)).intern());
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("UTF-8 encoding not supported");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
            if (r0[0].getClass().getSimpleName().equals(o.findRelativeAdapterPositionIn.getMax.getMin.class.getSimpleName()) != false) goto L_0x00a8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void length() {
            /*
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 18
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 16
                if (r0 < r5) goto L_0x0078
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 <= r1) goto L_0x0010
                goto L_0x0078
            L_0x0010:
                java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.NativeCrypto"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x006f }
                java.lang.String r5 = "RAND_seed"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x006f }
                java.lang.Class<byte[]> r7 = byte[].class
                r6[r3] = r7     // Catch:{ Exception -> 0x006f }
                java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ Exception -> 0x006f }
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x006f }
                byte[] r6 = getMax()     // Catch:{ Exception -> 0x006f }
                r5[r3] = r6     // Catch:{ Exception -> 0x006f }
                r0.invoke(r2, r5)     // Catch:{ Exception -> 0x006f }
                java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.NativeCrypto"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x006f }
                java.lang.String r5 = "RAND_load_file"
                r6 = 2
                java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x006f }
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r7[r3] = r8     // Catch:{ Exception -> 0x006f }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x006f }
                r7[r4] = r8     // Catch:{ Exception -> 0x006f }
                java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch:{ Exception -> 0x006f }
                java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x006f }
                java.lang.String r6 = "/dev/urandom"
                r5[r3] = r6     // Catch:{ Exception -> 0x006f }
                r6 = 1024(0x400, float:1.435E-42)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x006f }
                r5[r4] = r7     // Catch:{ Exception -> 0x006f }
                java.lang.Object r0 = r0.invoke(r2, r5)     // Catch:{ Exception -> 0x006f }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x006f }
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x006f }
                if (r0 != r6) goto L_0x005f
                goto L_0x0078
            L_0x005f:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x006f }
                java.lang.String r2 = "Unexpected number of bytes read from Linux PRNG: "
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x006f }
                java.lang.String r0 = r2.concat(r0)     // Catch:{ Exception -> 0x006f }
                r1.<init>(r0)     // Catch:{ Exception -> 0x006f }
                throw r1     // Catch:{ Exception -> 0x006f }
            L_0x006f:
                r0 = move-exception
                java.lang.SecurityException r1 = new java.lang.SecurityException
                java.lang.String r2 = "Failed to seed OpenSSL PRNG"
                r1.<init>(r2, r0)
                throw r1
            L_0x0078:
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 > r1) goto L_0x0129
                java.lang.String r0 = "SecureRandom.SHA1PRNG"
                java.security.Provider[] r0 = java.security.Security.getProviders(r0)
                java.lang.Class<java.security.Security> r1 = java.security.Security.class
                monitor-enter(r1)
                if (r0 == 0) goto L_0x00a0
                int r5 = r0.length     // Catch:{ all -> 0x0126 }
                if (r5 <= 0) goto L_0x00a0
                r0 = r0[r3]     // Catch:{ all -> 0x0126 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0126 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x0126 }
                java.lang.Class<o.findRelativeAdapterPositionIn$getMax$getMin> r3 = o.findRelativeAdapterPositionIn.getMax.getMin.class
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0126 }
                boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0126 }
                if (r0 != 0) goto L_0x00a8
            L_0x00a0:
                o.findRelativeAdapterPositionIn$getMax$getMin r0 = new o.findRelativeAdapterPositionIn$getMax$getMin     // Catch:{ all -> 0x0126 }
                r0.<init>()     // Catch:{ all -> 0x0126 }
                java.security.Security.insertProviderAt(r0, r4)     // Catch:{ all -> 0x0126 }
            L_0x00a8:
                java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ all -> 0x0126 }
                r0.<init>()     // Catch:{ all -> 0x0126 }
                java.security.Provider r3 = r0.getProvider()     // Catch:{ all -> 0x0126 }
                java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x0126 }
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0126 }
                java.lang.Class<o.findRelativeAdapterPositionIn$getMax$getMin> r4 = o.findRelativeAdapterPositionIn.getMax.getMin.class
                java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x0126 }
                boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0126 }
                if (r3 == 0) goto L_0x010a
                java.lang.String r0 = "SHA1PRNG"
                java.security.SecureRandom r2 = java.security.SecureRandom.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00cc }
                goto L_0x00d4
            L_0x00cc:
                r0 = move-exception
                java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch:{ all -> 0x0126 }
                java.lang.String r4 = "SHA1PRNG not available"
                r3.<init>(r4, r0)     // Catch:{ all -> 0x0126 }
            L_0x00d4:
                java.security.Provider r0 = r2.getProvider()     // Catch:{ all -> 0x0126 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0126 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x0126 }
                java.lang.Class<o.findRelativeAdapterPositionIn$getMax$getMin> r3 = o.findRelativeAdapterPositionIn.getMax.getMin.class
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0126 }
                boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0126 }
                if (r0 == 0) goto L_0x00ee
                monitor-exit(r1)     // Catch:{ all -> 0x0126 }
                return
            L_0x00ee:
                java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x0126 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
                java.lang.String r4 = "SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: "
                r3.<init>(r4)     // Catch:{ all -> 0x0126 }
                java.security.Provider r2 = r2.getProvider()     // Catch:{ all -> 0x0126 }
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0126 }
                r3.append(r2)     // Catch:{ all -> 0x0126 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0126 }
                r0.<init>(r2)     // Catch:{ all -> 0x0126 }
                throw r0     // Catch:{ all -> 0x0126 }
            L_0x010a:
                java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ all -> 0x0126 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
                java.lang.String r4 = "new SecureRandom() backed by wrong Provider: "
                r3.<init>(r4)     // Catch:{ all -> 0x0126 }
                java.security.Provider r0 = r0.getProvider()     // Catch:{ all -> 0x0126 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0126 }
                r3.append(r0)     // Catch:{ all -> 0x0126 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0126 }
                r2.<init>(r0)     // Catch:{ all -> 0x0126 }
                throw r2     // Catch:{ all -> 0x0126 }
            L_0x0126:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0129:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.findRelativeAdapterPositionIn.getMax.length():void");
        }

        private static String setMax(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
            int i2 = getMax + 101;
            equals = i2 % 128;
            int i3 = i2 % 2;
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr3.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length2 = cArr2.length;
            char[] cArr6 = new char[length2];
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 >= length2) {
                    return new String(cArr6);
                }
                int i5 = getMax + 91;
                equals = i5 % 128;
                if (i5 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    try {
                        OnLifecycleEvent.length(cArr4, cArr5, i4);
                        cArr6[i4] = (char) ((int) (((((long) (cArr2[i4] ^ cArr4[(i4 + 3) % 4])) ^ getMin) ^ ((long) setMax)) ^ ((long) length)));
                        i4++;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    OnLifecycleEvent.length(cArr4, cArr5, i4);
                    cArr6[i4] = (char) ((int) (((((long) (cArr2[i4] & cArr4[(i4 + 4) + 5])) * getMin) / ((long) setMax)) * ((long) length)));
                    i4 += 50;
                }
            }
        }
    }

    public static length length(String str, byte[] bArr) throws GeneralSecurityException {
        getMax();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 10000, 384)).getEncoded();
        length length2 = new length(new SecretKeySpec(setMin(encoded, 0, 16), "AES"), new SecretKeySpec(setMin(encoded, 16, 48), getTabbarModel.HASHING_ALGORITHM));
        int i = length + 91;
        getMax = i % 128;
        if ((i % 2 == 0 ? '8' : 29) == 29) {
            return length2;
        }
        Object obj = null;
        super.hashCode();
        return length2;
    }

    private static String getMax(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 >= i3) {
                break;
            }
            try {
                int i5 = length + 79;
                getMax = i5 % 128;
                if (i5 % 2 == 0) {
                    z2 = false;
                }
                if (z2) {
                    cArr2[i4] = (char) (cArr[i4] + i);
                    cArr2[i4] = (char) (cArr2[i4] - getMin);
                    i4++;
                } else {
                    cArr2[i4] = (char) (cArr[i4] + i);
                    cArr2[i4] = (char) (cArr2[i4] / getMin);
                    i4 += 80;
                }
                try {
                    int i6 = getMax + 65;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i2 > 0) {
            int i8 = getMax + 63;
            length = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i10 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i10, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i10);
        }
        if ((z ? 'a' : 'I') == 'a') {
            char[] cArr4 = new char[i3];
            int i11 = 0;
            while (true) {
                if ((i11 < i3 ? '*' : 'W') == 'W') {
                    break;
                }
                int i12 = getMax + 111;
                length = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr4[i11] = cArr2[(i3 - i11) - 1];
                    i11++;
                } else {
                    cArr4[i11] = cArr2[(i3 / i11) >>> 1];
                    i11 += 42;
                }
            }
            int i13 = length + 85;
            getMax = i13 % 128;
            int i14 = i13 % 2;
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
