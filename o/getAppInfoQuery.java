package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RawRes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

public final class getAppInfoQuery {
    private static int getMax = 12;
    private static boolean getMin = true;
    private static int isInside = 1;
    private static boolean length = true;
    private static char[] setMax = {'a', '`', 'R', '9', 'D'};
    private static int setMin;

    /* JADX WARNING: type inference failed for: r1v0, types: [int[], java.lang.Object, java.lang.String, char[]] */
    public static String jsonRawToString(Context context, @RawRes int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        ? r1 = 0;
        try {
            boolean z = false;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, length(new byte[]{-123, -124, -125, -126, -127}, TextUtils.indexOf("", '0', 0) + 128, r1, r1).intern()));
            int i2 = setMin + 105;
            isInside = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
            int i4 = isInside + 21;
            setMin = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
            if (!z) {
                return stringWriter.toString();
            }
            String obj = stringWriter.toString();
            super.hashCode();
            return obj;
        } catch (Exception unused) {
            return r1;
        }
    }

    private static String length(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = setMax;
        int i2 = getMax;
        int i3 = 0;
        if ((getMin ? ';' : '7') != '7') {
            try {
                int i4 = isInside + 7;
                try {
                    setMin = i4 % 128;
                    int i5 = i4 % 2;
                    int length2 = bArr.length;
                    char[] cArr3 = new char[length2];
                    while (i3 < length2) {
                        cArr3[i3] = (char) (cArr2[bArr[(length2 - 1) - i3] + i] - i2);
                        i3++;
                    }
                    return new String(cArr3);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            if (!(length)) {
                int length3 = iArr.length;
                char[] cArr4 = new char[length3];
                int i6 = setMin + 121;
                isInside = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (true) {
                    if (!(i8 < length3)) {
                        return new String(cArr4);
                    }
                    cArr4[i8] = (char) (cArr2[iArr[(length3 - 1) - i8] - i] - i2);
                    i8++;
                }
            } else {
                int i9 = setMin + 51;
                isInside = i9 % 128;
                int i10 = i9 % 2;
                int length4 = cArr.length;
                char[] cArr5 = new char[length4];
                while (i3 < length4) {
                    cArr5[i3] = (char) (cArr2[cArr[(length4 - 1) - i3] - i] - i2);
                    i3++;
                }
                return new String(cArr5);
            }
        }
    }
}
