package com.alipay.zoloz.toyger.algorithm;

import android.content.Context;
import com.alipay.zoloz.toyger.IToygerDocDelegate;
import com.alipay.zoloz.toyger.doc.ToygerDocConfig;
import java.util.Map;

public class ToygerDoc {
    public static native void config(IToygerDocDelegate iToygerDocDelegate, ToygerDocConfig toygerDocConfig);

    public static native String getVersion();

    public static native boolean init(Context context, byte[] bArr, String str, String str2, Map map);

    public static native void processImage(TGFrame tGFrame);

    public static native void release();

    public static native void reset();

    static {
        System.loadLibrary("b29402");
    }
}
