package com.alibaba.griver.image.framework.meta;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.alibaba.griver.image.framework.api.APImageDownLoadCallback;

public class APImageLoadRequest extends BaseReq {
    public static final int DEFAULT_LOAD_H = 240;
    public static final int DEFAULT_LOAD_W = 240;
    public static final int ORIGINAL_WH = Integer.MAX_VALUE;
    public static final int TYPE_ASSET = 4;
    public static final int TYPE_DATA = 2;
    public static final int TYPE_DJANGO = 1;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_ORIGINAL = 3;
    public Bundle bundle;
    public APImageDownLoadCallback callback;
    public String caller;
    public byte[] data;
    public Bitmap defaultBitmap;
    public Drawable defaultDrawable;
    public int height = 240;
    public int imageId;
    public Size imageSize;
    public ImageView imageView;
    @Deprecated
    public boolean isBackground;
    public int loadType;
    public String path;
    public String thumbPath;
    public int width = 240;
    public boolean withImageDataInCallback = false;
}
