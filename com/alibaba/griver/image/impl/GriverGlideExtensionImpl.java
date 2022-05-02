package com.alibaba.griver.image.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.image.framework.api.GriverImageLoadExtension;
import com.alibaba.griver.image.framework.mode.GriverImageLoadRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestOptions;
import o.dispatchApplyWindowInsetsToBehaviors;
import o.layoutChildWithAnchor;
import o.parseBehavior;

public class GriverGlideExtensionImpl implements GriverImageLoadExtension {
    public void init() {
    }

    public void loadImage(final GriverImageLoadRequest griverImageLoadRequest) {
        RequestOptions requestOptions;
        if (!ReflectUtils.classExist("com.bumptech.glide.Glide")) {
            RVLogger.e("GriverGlideService", "Glide lib is not exist");
        } else if (griverImageLoadRequest != null && griverImageLoadRequest.target != null && !TextUtils.isEmpty(griverImageLoadRequest.path)) {
            StringBuilder sb = new StringBuilder("loadImage == ");
            sb.append(griverImageLoadRequest.path);
            GriverLogger.d("GriverGlideService", sb.toString());
            if (griverImageLoadRequest.width <= 0 || griverImageLoadRequest.height <= 0) {
                requestOptions = new dispatchApplyWindowInsetsToBehaviors().placeholder(griverImageLoadRequest.defaultDrawable);
            } else {
                requestOptions = new dispatchApplyWindowInsetsToBehaviors().placeholder(griverImageLoadRequest.defaultDrawable).override(griverImageLoadRequest.width, griverImageLoadRequest.height);
            }
            Glide.getMax((Context) GriverEnv.getApplicationContext()).getMax(griverImageLoadRequest.path).apply(requestOptions).length(new parseBehavior<Drawable>() {
                public boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    if (griverImageLoadRequest.callback == null) {
                        return false;
                    }
                    griverImageLoadRequest.callback.onError();
                    return false;
                }

                public boolean onResourceReady(Drawable drawable, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, DataSource dataSource, boolean z) {
                    if (griverImageLoadRequest.callback == null) {
                        return false;
                    }
                    griverImageLoadRequest.callback.onSuccess();
                    return false;
                }
            }).length(griverImageLoadRequest.target);
        }
    }
}
