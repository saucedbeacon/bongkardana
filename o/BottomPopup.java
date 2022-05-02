package o;

import android.graphics.Bitmap;
import android.view.ViewConfiguration;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import o.TitleBarRightButtonView;

public final class BottomPopup {
    private static int getMax = 0;
    private static int getMin = 0;
    private static int length = 1;
    private static long setMax = 0;
    private static char setMin = '儾';

    private static Bitmap length(String str, int i, int i2) {
        int i3;
        try {
            BitMatrix min = removeSubscription.setMin(str, BarcodeFormat.CODE_128, i, i2);
            int width = min.getWidth();
            int height = min.getHeight();
            int[] iArr = new int[(width * height)];
            int i4 = 0;
            while (true) {
                if ((i4 < height ? '(' : 4) != '(') {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                    return createBitmap;
                }
                int i5 = length + 125;
                getMax = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 * width;
                int i8 = 0;
                while (true) {
                    if ((i8 < width ? ']' : 'G') == 'G') {
                        break;
                    }
                    int i9 = i7 + i8;
                    if ((min.get(i8, i4) ? 'H' : 2) != 2) {
                        int i10 = length + 101;
                        getMax = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = -16777216;
                    } else {
                        i3 = -1;
                    }
                    iArr[i9] = i3;
                    i8++;
                }
                i4++;
            }
        } catch (WriterException unused) {
            return null;
        }
    }

    private static BitMatrix getMax(String str) {
        String intern = getMax(new char[]{23021, 31898, 23712, 1835}, -1602446758 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), new char[]{48226, 47838, 312, 47578, 52164}, new char[]{0, 0, 0, 0}, (char) (11100 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern();
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        enumMap.put(EncodeHintType.CHARACTER_SET, intern);
        enumMap.put(EncodeHintType.MARGIN, 0);
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(new String(str.getBytes(intern), intern), BarcodeFormat.QR_CODE, 500, 500, enumMap);
            int i = length + 93;
            getMax = i % 128;
            int i2 = i % 2;
        } catch (WriterException | UnsupportedEncodingException unused) {
        }
        int i3 = getMax + 71;
        length = i3 % 128;
        if (i3 % 2 != 0) {
            return bitMatrix;
        }
        int i4 = 39 / 0;
        return bitMatrix;
    }

    private static Bitmap setMin(String str) {
        Bitmap bitmap;
        int i;
        Bitmap bitmap2 = null;
        try {
            BitMatrix max = getMax(str);
            int width = max.getWidth();
            int height = max.getHeight();
            int[] iArr = new int[(width * height)];
            int i2 = 0;
            while (true) {
                if (!(i2 < height)) {
                    break;
                }
                int i3 = getMax + 107;
                length = i3 % 128;
                int i4 = i3 % 2 == 0 ? i2 << width : i2 * width;
                for (int i5 = 0; i5 < width; i5++) {
                    int i6 = i4 + i5;
                    if (max.get(i5, i2)) {
                        i = -16777216;
                    } else {
                        i = -1;
                        int i7 = getMax + 47;
                        length = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    iArr[i6] = i;
                }
                i2++;
            }
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            try {
                bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            bitmap = bitmap2;
        }
        int i9 = getMax + 105;
        length = i9 % 128;
        if (i9 % 2 != 0) {
            return bitmap;
        }
        super.hashCode();
        return bitmap;
    }

    public static TitleBarRightButtonView.AnonymousClass1<Bitmap> getMin(String str) {
        try {
            TitleBarRightButtonView.AnonymousClass1<Bitmap> subscribeOn = TitleBarRightButtonView.AnonymousClass1.fromCallable(new makeContentView(str)).observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin());
            int i = length + 115;
            getMax = i % 128;
            int i2 = i % 2;
            return subscribeOn;
        } catch (Exception e) {
            throw e;
        }
    }

    public static TitleBarRightButtonView.AnonymousClass1<Bitmap> setMin(String str, int i) {
        TitleBarRightButtonView.AnonymousClass1<Bitmap> subscribeOn = TitleBarRightButtonView.AnonymousClass1.fromCallable(new WheelPicker(str, i)).observeOn(hideProgress.length()).subscribeOn(getSecureSignatureComp.setMin());
        int i2 = length + 75;
        getMax = i2 % 128;
        if ((i2 % 2 != 0 ? 2 : 'Q') != 2) {
            return subscribeOn;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return subscribeOn;
    }

    static /* synthetic */ Bitmap getMin(String str, int i, int i2) {
        int i3 = length + 33;
        getMax = i3 % 128;
        boolean z = i3 % 2 != 0;
        Bitmap length2 = length(str, i, i2);
        if (z) {
            Object obj = null;
            super.hashCode();
        }
        return length2;
    }

    static /* synthetic */ Bitmap length(String str) {
        int i = getMax + 57;
        length = i % 128;
        int i2 = i % 2;
        Bitmap min = setMin(str);
        int i3 = getMax + 79;
        length = i3 % 128;
        int i4 = i3 % 2;
        return min;
    }

    private static String getMax(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        char[] cArr4 = (char[]) cArr.clone();
        char[] cArr5 = (char[]) cArr3.clone();
        cArr4[0] = (char) (c ^ cArr4[0]);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length2 = cArr2.length;
        char[] cArr6 = new char[length2];
        int i2 = 0;
        while (true) {
            if (!(i2 < length2)) {
                break;
            }
            try {
                OnLifecycleEvent.length(cArr4, cArr5, i2);
                try {
                    cArr6[i2] = (char) ((int) (((((long) (cArr2[i2] ^ cArr4[(i2 + 3) % 4])) ^ setMax) ^ ((long) getMin)) ^ ((long) setMin)));
                    i2++;
                    int i3 = getMax + 7;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        String str = new String(cArr6);
        int i5 = getMax + 79;
        length = i5 % 128;
        if ((i5 % 2 == 0 ? '4' : 21) == 21) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }
}
