package com.alibaba.griver.image.impl;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.image.framework.api.GriverImageLoadExtension;
import com.alibaba.griver.image.framework.mode.GriverImageLoadRequest;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class GriverPicassoExtensionImpl implements GriverImageLoadExtension {
    public void init() {
    }

    public void loadImage(final GriverImageLoadRequest griverImageLoadRequest) {
        if (!ReflectUtils.classExist("com.squareup.picasso.Picasso")) {
            RVLogger.e("GriverPicassoServiceImpl", "Picasso lib is not exist");
        } else if (griverImageLoadRequest != null && griverImageLoadRequest.target != null && !TextUtils.isEmpty(griverImageLoadRequest.path)) {
            StringBuilder sb = new StringBuilder("loadImage == ");
            sb.append(griverImageLoadRequest.path);
            GriverLogger.d("GriverPicassoServiceImpl", sb.toString());
            if (griverImageLoadRequest.width <= 0 || griverImageLoadRequest.height <= 0) {
                Picasso.with(GriverEnv.getApplicationContext()).load(griverImageLoadRequest.path).placeholder(griverImageLoadRequest.defaultDrawable).tag(griverImageLoadRequest.tag).into(griverImageLoadRequest.target, new Callback() {
                    public void onSuccess() {
                        if (griverImageLoadRequest.callback != null) {
                            griverImageLoadRequest.callback.onSuccess();
                        }
                    }

                    public void onError() {
                        if (griverImageLoadRequest.callback != null) {
                            griverImageLoadRequest.callback.onError();
                        }
                    }
                });
            } else {
                Picasso.with(GriverEnv.getApplicationContext()).load(griverImageLoadRequest.path).resize(griverImageLoadRequest.width, griverImageLoadRequest.height).placeholder(griverImageLoadRequest.defaultDrawable).tag(griverImageLoadRequest.tag).into(griverImageLoadRequest.target, new Callback() {
                    public void onSuccess() {
                        if (griverImageLoadRequest.callback != null) {
                            griverImageLoadRequest.callback.onSuccess();
                        }
                    }

                    public void onError() {
                        if (griverImageLoadRequest.callback != null) {
                            griverImageLoadRequest.callback.onError();
                        }
                    }
                });
            }
        }
    }
}
