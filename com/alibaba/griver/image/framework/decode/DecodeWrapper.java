package com.alibaba.griver.image.framework.decode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.File;
import java.nio.ByteBuffer;

public class DecodeWrapper {

    /* renamed from: a  reason: collision with root package name */
    private static String f10470a = "DecodeWrapper";

    @TargetApi(28)
    public static Bitmap decodeByImageDecoder(File file, final int i) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new ImageDecoder.OnHeaderDecodedListener() {
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    imageDecoder.setTargetSampleSize(i);
                    imageDecoder.setMutableRequired(true);
                }
            });
        } catch (Throwable th) {
            String str = f10470a;
            StringBuilder sb = new StringBuilder("decodeFileByImageDecoder exp file=");
            sb.append(file);
            sb.append(" ;sampleSize=");
            sb.append(i);
            RVLogger.e(str, sb.toString(), th);
            return null;
        }
    }

    @TargetApi(28)
    public static Bitmap decodeByImageDecoder(byte[] bArr, final int i) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(ByteBuffer.wrap(bArr)), new ImageDecoder.OnHeaderDecodedListener() {
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    imageDecoder.setTargetSampleSize(i);
                    imageDecoder.setMutableRequired(true);
                }
            });
        } catch (Throwable th) {
            String str = f10470a;
            StringBuilder sb = new StringBuilder("decodeByImageDecoder exp data len=");
            sb.append(bArr != null ? bArr.length : 0);
            sb.append(" ;sampleSize=");
            sb.append(i);
            RVLogger.e(str, sb.toString(), th);
            return null;
        }
    }
}
