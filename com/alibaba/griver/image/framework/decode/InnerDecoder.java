package com.alibaba.griver.image.framework.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.decode.BitmapLock;
import com.alibaba.griver.image.framework.decode.DecodeOptions;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alibaba.griver.image.framework.meta.StaticOptions;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class InnerDecoder {

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<DecodeFilter> f10471a = new ArrayList<>();
    public static boolean bCheckDecodeOritation = false;
    public static boolean bSysImageDecoderByte = false;
    public static boolean bSysImageDecoderFile = false;
    public static int hevcDecodeThreadNum = 2;
    public static int hevcDecodeTimeout;

    public static DecodeResult decodeFile(File file, DecodeOptions decodeOptions, APImageInfo aPImageInfo) {
        DecodeResult decodeResult;
        long currentTimeMillis = System.currentTimeMillis();
        if (!decodeOptions.autoUseAshmem || Build.VERSION.SDK_INT >= 21) {
            DecodeResult decodeResult2 = new DecodeResult();
            decodeResult2.code = -1;
            a(file, (byte[]) null, decodeResult2, aPImageInfo, a(aPImageInfo, decodeOptions), decodeOptions != null ? decodeOptions.canUseJpgThumbnailData : StaticOptions.useThumbnailData);
            decodeResult = decodeResult2;
        } else {
            decodeResult = decodeByteArray(getBytes(file), aPImageInfo, decodeOptions);
        }
        StringBuilder sb = new StringBuilder("decodeFile file: ");
        sb.append(file);
        sb.append(", opts: ");
        sb.append(decodeOptions);
        sb.append(", result: ");
        sb.append(decodeResult);
        sb.append(", cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("InnerDecoder", sb.toString());
        return decodeResult;
    }

    private static void a(File file, byte[] bArr, DecodeResult decodeResult, APImageInfo aPImageInfo, BitmapFactory.Options options, boolean z) {
        boolean isJPEG = bArr != null ? ImageFileType.isJPEG(bArr) : ImageFileType.isJPEG(file);
        do {
            try {
                final File file2 = file;
                final byte[] bArr2 = bArr;
                final APImageInfo aPImageInfo2 = aPImageInfo;
                final BitmapFactory.Options options2 = options;
                final boolean z2 = z;
                final boolean z3 = isJPEG;
                Bitmap handleBitmap = BitmapLock.handleBitmap(new BitmapLock.ImageHandler() {
                    public final Bitmap handle() {
                        return InnerDecoder.a(file2, bArr2, aPImageInfo2, options2, z2, z3);
                    }
                });
                decodeResult.bitmap = handleBitmap;
                if (handleBitmap != null) {
                    decodeResult.code = 0;
                    return;
                }
                return;
            } catch (OutOfMemoryError unused) {
                if (!a(decodeResult, aPImageInfo, options, isJPEG)) {
                }
            } catch (Exception unused2) {
                return;
            }
        } while (!a(decodeResult, aPImageInfo, options, isJPEG));
    }

    /* access modifiers changed from: private */
    public static Bitmap a(File file, byte[] bArr, APImageInfo aPImageInfo, BitmapFactory.Options options, boolean z, boolean z2) {
        BitmapFactory.Options calcThumbnailOptions;
        if (bArr != null) {
            return a(bArr, options);
        }
        if (z2 && z && StaticOptions.useThumbnailData && (calcThumbnailOptions = calcThumbnailOptions(aPImageInfo, options)) != null) {
            return a(aPImageInfo.getThumbnailInfo().data, calcThumbnailOptions);
        }
        if (a(aPImageInfo)) {
            return null;
        }
        return a(file, options);
    }

    public static BitmapFactory.Options calcThumbnailOptions(APImageInfo aPImageInfo, BitmapFactory.Options options) {
        APImageInfo thumbnailInfo = aPImageInfo.getThumbnailInfo();
        if (thumbnailInfo == null) {
            return null;
        }
        int i = aPImageInfo.correctWidth / options.inSampleSize;
        int i2 = aPImageInfo.correctHeight / options.inSampleSize;
        if (i - StaticOptions.thumbnail_allow_delta >= thumbnailInfo.correctWidth || i2 - StaticOptions.thumbnail_allow_delta >= thumbnailInfo.correctHeight) {
            return null;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inDensity = options.inDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inMutable = options.inMutable;
        options2.inDither = options.inDither;
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inSampleSize = b(thumbnailInfo, Integer.valueOf(Math.max(i, i2)));
        return options2;
    }

    private static boolean a(DecodeResult decodeResult, APImageInfo aPImageInfo, BitmapFactory.Options options, boolean z) {
        if (options.inPreferredConfig == Bitmap.Config.ARGB_8888 && aPImageInfo.rotation == 0 && z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            decodeResult.extra = 1;
            return true;
        }
        int max = Math.max(aPImageInfo.width, aPImageInfo.height);
        if (max / options.inSampleSize <= 10000 || max <= 0) {
            return false;
        }
        do {
            options.inSampleSize <<= 1;
            if (options.inSampleSize == 0) {
                return false;
            }
        } while (max / options.inSampleSize > 10000);
        decodeResult.extra |= 2;
        return true;
    }

    public static DecodeResult decodeByteArray(byte[] bArr, APImageInfo aPImageInfo, DecodeOptions decodeOptions) {
        DecodeResult decodeResult = new DecodeResult();
        decodeResult.code = -1;
        long currentTimeMillis = System.currentTimeMillis();
        a((File) null, bArr, decodeResult, aPImageInfo, a(aPImageInfo, decodeOptions), decodeOptions != null ? decodeOptions.canUseJpgThumbnailData : StaticOptions.useThumbnailData);
        StringBuilder sb = new StringBuilder("decodeByteArray data: ");
        sb.append(bArr);
        sb.append(", opts: ");
        sb.append(decodeOptions);
        sb.append(", result: ");
        sb.append(decodeResult);
        sb.append(", cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("InnerDecoder", sb.toString());
        return decodeResult;
    }

    private static BitmapFactory.Options a(APImageInfo aPImageInfo, DecodeOptions decodeOptions) {
        int b = b(aPImageInfo, decodeOptions);
        BitmapFactory.Options options = decodeOptions.baseOptions == null ? new BitmapFactory.Options() : decodeOptions.baseOptions;
        options.inSampleSize = b;
        options.inPreferredConfig = decodeOptions.inPreferredConfig;
        options.inDither = true;
        options.inMutable = true;
        if (decodeOptions.autoUseAshmem && Build.VERSION.SDK_INT < 21) {
            options.inPurgeable = true;
            options.inInputShareable = true;
        }
        if (decodeOptions.inPreferQualityOverSpeed) {
            options.inPreferQualityOverSpeed = true;
        }
        return options;
    }

    private static int b(APImageInfo aPImageInfo, DecodeOptions decodeOptions) {
        if (aPImageInfo == null || aPImageInfo.width <= 0 || aPImageInfo.height <= 0 || decodeOptions.mode == null) {
            return 1;
        }
        int i = decodeOptions.mode.type;
        if (i != 1) {
            return i != 2 ? b(aPImageInfo, ((DecodeOptions.MaxLenMode) decodeOptions.mode).len) : a(aPImageInfo, (DecodeOptions.FitRectMode) decodeOptions.mode);
        }
        return a(aPImageInfo, ((DecodeOptions.MinLenMode) decodeOptions.mode).len);
    }

    private static int a(APImageInfo aPImageInfo, DecodeOptions.FitRectMode fitRectMode) {
        int i;
        int i2;
        float f;
        if (aPImageInfo == null) {
            i = 1;
        } else if ((fitRectMode.rectWidth < fitRectMode.rectHeight || aPImageInfo.width < aPImageInfo.height) && (fitRectMode.rectWidth > fitRectMode.rectHeight || aPImageInfo.width > aPImageInfo.height)) {
            if (fitRectMode.rectWidth > fitRectMode.rectHeight) {
                f = (float) fitRectMode.rectHeight;
                i2 = fitRectMode.rectWidth;
            } else {
                f = (float) fitRectMode.rectWidth;
                i2 = fitRectMode.rectHeight;
            }
            i = a(aPImageInfo, Integer.valueOf((int) (((float) Math.min(fitRectMode.rectWidth, fitRectMode.rectHeight)) * (f / ((float) i2)))));
        } else {
            i = b(aPImageInfo, Integer.valueOf(Math.max(fitRectMode.rectWidth, fitRectMode.rectHeight)));
        }
        StringBuilder sb = new StringBuilder("calcFitRectSampleSize info: ");
        sb.append(aPImageInfo);
        sb.append(", mode: ");
        sb.append(fitRectMode);
        sb.append(", sampleSize: ");
        sb.append(i);
        RVLogger.d("InnerDecoder", sb.toString());
        return i;
    }

    private static int a(APImageInfo aPImageInfo, Integer num) {
        int a2 = a(num, Math.min(aPImageInfo.width, aPImageInfo.height), num != null && num.intValue() > 10000);
        StringBuilder sb = new StringBuilder("calcMinLenSampleSize info: ");
        sb.append(aPImageInfo);
        sb.append(", len: ");
        sb.append(num);
        sb.append(", sampleSize: ");
        sb.append(a2);
        RVLogger.d("InnerDecoder", sb.toString());
        return a2;
    }

    private static int a(Integer num, int i, boolean z) {
        int i2 = 1;
        if (num != null && num.intValue() > 0 && i > num.intValue()) {
            int i3 = 2;
            int i4 = 1;
            while (i3 != 0 && i / i3 >= num.intValue()) {
                i4 = i3;
                i3 <<= 1;
            }
            if (!z || (i3 > 0 && Math.abs((i / i4) - num.intValue()) < Math.abs((i / i3) - num.intValue()))) {
                i3 = i4;
            }
            if (i3 > 0) {
                i2 = i3;
            }
        }
        StringBuilder sb = new StringBuilder("getSampleSize len: ");
        sb.append(num);
        sb.append(", side: ");
        sb.append(i);
        sb.append(", optimize: ");
        sb.append(z);
        sb.append(", sampleSize: ");
        sb.append(i2);
        RVLogger.d("InnerDecoder", sb.toString());
        return i2;
    }

    private static int b(APImageInfo aPImageInfo, Integer num) {
        int a2 = a(num, Math.max(aPImageInfo.width, aPImageInfo.height), num != null && num.intValue() > 10000);
        StringBuilder sb = new StringBuilder("calcMaxLenSampleSize info: ");
        sb.append(aPImageInfo);
        sb.append(", len: ");
        sb.append(num);
        sb.append(", sampleSize: ");
        sb.append(a2);
        RVLogger.d("InnerDecoder", sb.toString());
        return a2;
    }

    private static Bitmap a(File file, BitmapFactory.Options options) {
        if (useSystemImageDecoderFile()) {
            return DecodeWrapper.decodeByImageDecoder(file, options.inSampleSize);
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    private static Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        if (useSystemImageDecoderByte()) {
            return DecodeWrapper.decodeByImageDecoder(bArr, options.inSampleSize);
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static boolean useSystemImageDecoderFile() {
        return Build.VERSION.SDK_INT >= 28 && bSysImageDecoderFile;
    }

    public static boolean useSystemImageDecoderByte() {
        return Build.VERSION.SDK_INT >= 28 && bSysImageDecoderByte;
    }

    private static boolean a(APImageInfo aPImageInfo) {
        if (aPImageInfo == null) {
            return false;
        }
        synchronized (f10471a) {
            for (int i = 0; i < f10471a.size(); i++) {
                if (f10471a.get(i).checkFilter(aPImageInfo.format.intValue(), aPImageInfo.correctWidth, aPImageInfo.correctHeight)) {
                    RVLogger.d("InnerDecoder", "checkImageFileter true info: ".concat(String.valueOf(aPImageInfo)));
                    return true;
                }
            }
            return false;
        }
    }

    public static byte[] getBytes(File file) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        IOUtils.closeQuietly(fileInputStream2);
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                IOUtils.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(fileInputStream);
            throw th;
        }
    }
}
