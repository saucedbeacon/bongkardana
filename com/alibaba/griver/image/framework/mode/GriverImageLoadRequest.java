package com.alibaba.griver.image.framework.mode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.alibaba.griver.image.framework.api.GriverImageLoadCallback;
import java.io.Serializable;

public class GriverImageLoadRequest implements Serializable {
    public GriverImageLoadCallback callback;
    public Context context;
    public Drawable defaultDrawable;
    public int height;
    public String path;
    public String tag;
    public ImageView target;
    public int width;
}
