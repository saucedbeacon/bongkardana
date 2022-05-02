package com.alibaba.griver.image.framework.encode;

import android.graphics.Bitmap;
import java.io.File;

public class ImageEncoder {
    public static APEncodeResult compress(File file, APEncodeOptions aPEncodeOptions) {
        return SystemImageEncoder.compress(file, aPEncodeOptions);
    }

    public static APEncodeResult compress(Bitmap bitmap, APEncodeOptions aPEncodeOptions) {
        return SystemImageEncoder.compress(bitmap, aPEncodeOptions);
    }
}
