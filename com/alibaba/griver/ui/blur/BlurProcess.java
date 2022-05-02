package com.alibaba.griver.ui.blur;

import android.graphics.Bitmap;

interface BlurProcess {
    Bitmap blur(Bitmap bitmap, float f);
}
