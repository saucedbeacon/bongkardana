package com.alipay.zoloz.toyger.face;

import android.content.Context;
import com.alipay.zoloz.toyger.algorithm.TGFrame;

public abstract class FaceDetector {
    public abstract ToygerFaceAttr detect(TGFrame tGFrame);

    public abstract boolean init(Context context);

    public abstract void release();

    public abstract void reset();
}
