package com.iap.ac.android.instance.b;

import androidx.annotation.Nullable;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.zip.Checksum;

public class a implements Checksum {
    public static final byte[] b = {0, 7, Ascii.SO, 9, Ascii.FS, Ascii.ESC, Ascii.DC2, Ascii.NAK, 56, 63, 54, Framer.STDOUT_FRAME_PREFIX, 36, 35, 42, Framer.STDIN_FRAME_PREFIX, 112, 119, 126, 121, 108, 107, 98, 101, ImageFileType.HEAD_HEVC_0, 79, 70, 65, 84, 83, 90, 93, -32, -25, -18, -23, -4, -5, -14, -11, -40, -33, -42, -47, -60, -61, -54, -51, -112, -105, -98, -103, -116, -117, -126, -123, -88, -81, -90, -95, -76, -77, -70, -67, -57, -64, -55, -50, -37, -36, -43, -46, -1, -8, -15, -10, -29, -28, -19, -22, -73, -80, -71, -66, -85, -84, -91, -94, -113, -120, -127, -122, -109, -108, -99, -102, 39, 32, 41, 46, 59, 60, 53, Framer.STDERR_FRAME_PREFIX, Ascii.US, Ascii.CAN, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, -119, -114, -121, Byte.MIN_VALUE, -107, -110, -101, -100, -79, -74, -65, -72, -83, -86, -93, -92, -7, -2, -9, -16, -27, -30, -21, -20, -63, -58, -49, -56, -35, -38, -45, -44, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, Framer.STDIN_REQUEST_FRAME_PREFIX, 88, 77, 74, 67, 68, Ascii.EM, Ascii.RS, Ascii.ETB, Ascii.DLE, 5, 2, Ascii.VT, Ascii.FF, Framer.ENTER_FRAME_PREFIX, 38, 47, 40, 61, 58, 51, 52, 78, 73, SignedBytes.MAX_POWER_OF_TWO, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_WEBP_0, 85, 92, 91, 118, 113, Framer.EXIT_FRAME_PREFIX, Byte.MAX_VALUE, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, Ascii.SI, Ascii.SUB, Ascii.GS, Ascii.DC4, 19, -82, -87, -96, -89, -78, -75, -68, -69, -106, -111, -104, -97, -118, -115, -124, -125, -34, -39, -48, -41, -62, -59, -52, -53, -26, -31, -24, -17, -6, -3, -12, -13};

    /* renamed from: a  reason: collision with root package name */
    public short f9719a = 0;

    public long getValue() {
        return (long) (this.f9719a & -1);
    }

    public void reset() {
        this.f9719a = 0;
    }

    public void update(int i) {
        this.f9719a = (short) b[(i ^ this.f9719a) & 255];
    }

    public void update(@Nullable byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int i3 = i2 + i;
            while (i < i3) {
                this.f9719a = (short) b[(this.f9719a ^ bArr[i]) & 255];
                i++;
            }
        }
    }
}
