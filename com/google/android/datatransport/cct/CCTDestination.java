package com.google.android.datatransport.cct;

import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.text.Typography;

public final class CCTDestination implements EncodedDestination {
    private static final String DEFAULT_API_KEY = StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    static final String DEFAULT_END_POINT = StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    static final String DESTINATION_NAME = "cct";
    private static final String EXTRAS_DELIMITER = "\\";
    private static final String EXTRAS_VERSION_MARKER = "1$";
    public static final CCTDestination INSTANCE;
    static final String LEGACY_END_POINT = StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    public static final CCTDestination LEGACY_INSTANCE = new CCTDestination(LEGACY_END_POINT, DEFAULT_API_KEY);
    private static final Set<Encoding> SUPPORTED_ENCODINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[]{Encoding.of("proto"), Encoding.of("json")})));
    private static int getMax = 1;
    private static char[] length;
    private static int setMin;
    @Nullable
    private final String apiKey;
    @NonNull
    private final String endPoint;

    static void getMax() {
        length = new char[]{'h', 196, Typography.half, 209, 223};
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
    static {
        getMax();
        boolean z = false;
        ? r3 = 0;
        INSTANCE = new CCTDestination(DEFAULT_END_POINT, r3);
        int i = getMax + 91;
        setMin = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            int length2 = r3.length;
        }
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.endPoint = str;
        this.apiKey = str2;
    }

    @NonNull
    public final String getName() {
        int i = setMin + 87;
        getMax = i % 128;
        int i2 = i % 2;
        int i3 = setMin + 67;
        getMax = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return DESTINATION_NAME;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return DESTINATION_NAME;
    }

    @Nullable
    public final byte[] getExtras() {
        int i = getMax + 117;
        setMin = i % 128;
        int i2 = i % 2;
        byte[] asByteArray = asByteArray();
        int i3 = getMax + 63;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return asByteArray;
    }

    public final Set<Encoding> getSupportedEncodings() {
        int i = setMin + 119;
        getMax = i % 128;
        int i2 = i % 2;
        Set<Encoding> set = SUPPORTED_ENCODINGS;
        try {
            int i3 = getMax + 91;
            try {
                setMin = i3 % 128;
                if ((i3 % 2 != 0 ? 'R' : 'G') == 'G') {
                    return set;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return set;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Nullable
    public final String getAPIKey() {
        String str;
        int i = setMin + 81;
        getMax = i % 128;
        if ((i % 2 == 0 ? '6' : ')') != ')') {
            try {
                str = this.apiKey;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.apiKey;
        }
        int i2 = setMin + 23;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @NonNull
    public final String getEndPoint() {
        String str;
        int i = getMax + 19;
        setMin = i % 128;
        if ((i % 2 != 0 ? 21 : 'D') != 'D') {
            try {
                str = this.endPoint;
                int i2 = 60 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                str = this.endPoint;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i3 = setMin + 35;
        getMax = i3 % 128;
        if ((i3 % 2 == 0 ? '0' : '8') != '0') {
            return str;
        }
        int i4 = 68 / 0;
        return str;
    }

    @Nullable
    public final byte[] asByteArray() {
        int i = setMin + 43;
        getMax = i % 128;
        int i2 = i % 2;
        if (this.apiKey == null) {
            int i3 = setMin + 1;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            if ((this.endPoint == null ? Typography.dollar : '\'') == '$') {
                int i5 = getMax + 69;
                setMin = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }
        }
        Object[] objArr = new Object[4];
        objArr[0] = EXTRAS_VERSION_MARKER;
        objArr[1] = this.endPoint;
        objArr[2] = EXTRAS_DELIMITER;
        String str = this.apiKey;
        if (str == null) {
            str = "";
        } else {
            int i7 = getMax + 81;
            setMin = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(setMin(new int[]{0, 5, 139, 3}, new byte[]{1, 1, 1, 1, 1}, true ^ Process.supportsProcesses()).intern()));
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName(setMin(new int[]{0, 5, 139, 3}, new byte[]{1, 1, 1, 1, 1}, TextUtils.isGraphic("")).intern()));
        if (str.startsWith(EXTRAS_VERSION_MARKER)) {
            String[] split = str.substring(2).split(Pattern.quote(EXTRAS_DELIMITER), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                        int i = getMax + 41;
                        setMin = i % 128;
                        int i2 = i % 2;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @NonNull
    static byte[] encodeString(@NonNull String str) {
        int i = getMax + 35;
        setMin = i % 128;
        return str.getBytes(Charset.forName((!(i % 2 == 0) ? setMin(new int[]{0, 5, 139, 3}, new byte[]{1, 1, 1, 1, 1}, KeyEvent.metaStateHasModifiers(1, 0)) : setMin(new int[]{0, 5, 139, 3}, new byte[]{1, 1, 1, 1, 1}, true ^ KeyEvent.metaStateHasModifiers(0, 0))).intern()));
    }

    @NonNull
    static String decodeExtras(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName(setMin(new int[]{0, 5, 139, 3}, new byte[]{1, 1, 1, 1, 1}, !PhoneNumberUtils.isDialable('0')).intern()));
        int i = getMax + 85;
        setMin = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    private static String setMin(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(length, i, cArr, 0, i2);
        if (bArr != null) {
            try {
                int i5 = getMax + 57;
                setMin = i5 % 128;
                int i6 = i5 % 2;
                char[] cArr2 = new char[i2];
                char c = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    if ((bArr[i7] == 1 ? 0 : ']') != ']') {
                        cArr2[i7] = (char) (((cArr[i7] << 1) + 1) - c);
                    } else {
                        cArr2[i7] = (char) ((cArr[i7] << 1) - c);
                    }
                    c = cArr2[i7];
                }
                cArr = cArr2;
            } catch (Exception e) {
                throw e;
            }
        }
        if ((i4 > 0 ? 'R' : 7) != 7) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i8, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i8);
            int i9 = getMax + 77;
            setMin = i9 % 128;
            int i10 = i9 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            int i11 = 0;
            while (true) {
                if (!(i11 < i2)) {
                    break;
                }
                int i12 = getMax + 103;
                setMin = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[i11] = cArr[(i2 / i11) % 0];
                    i11 += 85;
                } else {
                    cArr4[i11] = cArr[(i2 - i11) - 1];
                    i11++;
                }
            }
            cArr = cArr4;
        }
        if (i3 > 0) {
            int i13 = getMax + 85;
            setMin = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < i2; i15++) {
                cArr[i15] = (char) (cArr[i15] - iArr[2]);
            }
        }
        return new String(cArr);
    }
}
