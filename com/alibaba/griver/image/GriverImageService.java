package com.alibaba.griver.image;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import android.widget.ImageView;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.griver.image.framework.api.APImageDownLoadCallback;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.image.framework.encode.APEncodeResult;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.meta.APImageLoadRequest;
import java.io.File;

public interface GriverImageService extends Proxiable {
    public static final String COMPOSITE_INT_KEY_COMPRESS_LEVEL = "compress";
    public static final int COMPOSITE_INT_VAL_COMPRESS_LEVEL_HIGH = 1;
    public static final int COMPOSITE_INT_VAL_COMPRESS_LEVEL_NORMAL = 0;
    public static final int COMPOSITE_INT_VAL_COMPRESS_LEVEL_ORIGINAL = 3;
    public static final String IMAGE_TAG = "GriverImage";

    APEncodeResult compress(File file, APEncodeOptions aPEncodeOptions);

    void loadImage(APImageLoadRequest aPImageLoadRequest, String str);

    void loadOriginalImage(String str, ImageView imageView, Drawable drawable, APImageDownLoadCallback aPImageDownLoadCallback, String str2);

    void optimizeView(AbsListView absListView, AbsListView.OnScrollListener onScrollListener);

    void optimizeView(AbsListView absListView, boolean z, boolean z2, AbsListView.OnScrollListener onScrollListener);

    APImageInfo parseImageInfo(String str);
}
