package com.alibaba.griver.image.framework.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.alibaba.griver.image.framework.meta.StaticOptions;

public class BaseDecodeOptions {
    public static final int FORMAT_BITMAP = 0;
    public static final int FORMAT_YUV = 1;
    public boolean autoRotate;
    public boolean autoUseAshmem;
    public BitmapFactory.Options baseOptions;
    public boolean canUseJpgThumbnailData;
    public Integer forceRotate;
    public int frameIndex;
    public boolean inPreferQualityOverSpeed;
    public Bitmap.Config inPreferredConfig = Bitmap.Config.ARGB_8888;
    public boolean isForceUseSysDecode;
    public int resultFormat;

    BaseDecodeOptions() {
        boolean z = true;
        this.autoRotate = true;
        this.inPreferQualityOverSpeed = false;
        this.resultFormat = 0;
        this.autoUseAshmem = Build.VERSION.SDK_INT >= 21 ? false : z;
        this.frameIndex = 0;
        this.canUseJpgThumbnailData = StaticOptions.useThumbnailData;
        this.isForceUseSysDecode = false;
    }
}
